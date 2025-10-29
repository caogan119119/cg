package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 创建并初始化第一个列表
        List<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Banana");
        list4.add("Cherry");

        // 创建第二个列表
        List<String> list5 = new ArrayList<>();

        // 使用addAll()方法从list1拷贝到list2
        list5.addAll(list4);
        list4.add("55");


        // 打印结果以验证拷贝
        System.out.println(list5); // 输出: [Apple, Banana, Cherry]

        List<Integer> list1 = Arrays.asList(1,6);

        List<Integer> list = new ArrayList<>(list1);

        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(4));
        list.add(Integer.valueOf(5));
        System.out.println("sss");
        List<Integer> aa = list.stream().filter(a-> a.compareTo(4) >0).collect(Collectors.toList());
        aa.forEach(s -> {
            System.out.println(s);
        });

        List<Integer> collect = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        List<Integer> collect1 = IntStream.range(10, 20).boxed().collect(Collectors.toList());

        List<Integer> lists = new ArrayList<>();
       /* List<List<Integer>> lists = new ArrayList<>();
        lists.add(collect);
        lists.add(collect1);
        ArrayList<Integer> collect2 = lists.stream().collect(ArrayList::new, ArrayList::addAll, ArrayList::addAll);
        System.out.println(collect2);*/
        lists.addAll(collect);
        lists.addAll(collect1);
        lists.forEach(s -> {
            System.out.println(s);
        });

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).filter(string -> "bc".equals(string) || "abc".equals(string)).collect(Collectors.toList());

        System.out.println("筛选列表2: " + filtered2);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);

        List<String> list2= Arrays.asList("a", "b", "c", "d");
        List<String> collect2 =list2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect2); //[A, B, C, D]
        List<String> collect3 =list2.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect3); //[A, B, C, D]

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        List<String> list3 = Arrays.asList("123","456","789","1101","212121121","asdaa","asdaa","2321eew");
        Set<String> ss = list3.stream().collect(Collectors.toSet());
        ss.forEach(s -> System.out.println(s));

    }

}
