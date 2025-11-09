package sample;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {


      List<Rpt> list = new ArrayList<>();

      list.add(new Rpt("2025-03","SANY","SANY-1",
              new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("6"),new BigDecimal("12")));
        list.add(new Rpt("2025-04","SANY","SANY-1",
                new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("8"),new BigDecimal("20")));

        list.add(new Rpt("2025-03","Huawei","Huawei-1",
                new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("5"),new BigDecimal("14")));
        list.add(new Rpt("2025-04","Huawei","Huawei-1",
                new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("9"),new BigDecimal("40")));

        list.add(new Rpt("2025-03","lenovo","lenovo-1",
                new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("4"),new BigDecimal("15")));
        list.add(new Rpt("2025-04","lenovo","lenovo-1",
                new BigDecimal("1.2"),new BigDecimal("1.1"),new BigDecimal("10"),new BigDecimal("30")));
        Map<String,List<Rpt>> map2 = new HashMap<>();
        Map<String,List<Rpt>> map =list.stream().collect(Collectors.groupingBy(Rpt::getBucket));
        for (Map.Entry<String,List<Rpt>> entry: map.entrySet()){
            System.out.println("yeeeee: " + entry.getKey());
            List<Rpt> rptList = entry.getValue();
            Collections.sort(rptList, new Comparator<Rpt>() {
                @Override
                public int compare(Rpt p1, Rpt p2) {
                    int diff = p2.getCapQty().subtract(p2.getResourceQty().multiply(p2.getBaseLine()))
                            .compareTo(p1.getCapQty().subtract(p1.getResourceQty().multiply(p1.getBaseLine())) ); // 注意这里是降序排序，所以用p2减p1而不是p1减p2
                    if (diff >0) return 1;
                    if (diff <0) return -1;
                    return 0; // 如果乘积相同，保持原顺序（实际上在这个例子中不太可能）
                }
            });
            List<Rpt> list2 = new ArrayList<>();
            for (Rpt product : rptList) {
                System.out.println("Price: " + product.getCapQty().subtract(product.getResourceQty().multiply(product.getBaseLine())) +
                        ", Quantity: " + product.getSupplierName());
                Rpt r = new Rpt();
                r.setResult(product.getCapQty().subtract(product.getResourceQty().multiply(product.getBaseLine())));
                r.setSupplierName(product.getSupplierName());
                list2.add(r);
                map2.put( entry.getKey(),list2);
            }
        }
        BigDecimal sum = BigDecimal.ZERO;
        Map<String,BigDecimal> reMap = new LinkedHashMap<>();
        List<Rpt> list3 = map2.get("2025-04");
        for(Rpt r1 : list3){
            BigDecimal r3= r1.getResult().min(new BigDecimal("20").subtract(sum));
            sum= sum.add(r3);
            if(r3.compareTo(BigDecimal.ZERO) >0) {
                reMap.put(r1.getSupplierName(), r3);
            }
        }
        for(String key : reMap.keySet()){
            System.out.println("工厂: " + key +
                    ", 调配: " + reMap.get(key));
        }


    }

}
