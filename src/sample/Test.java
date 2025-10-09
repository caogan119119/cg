package sample;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Test {
    public  static  int a =1;
    public static void main(String[] args) {
        Map<String, Integer> orderedMap = new TreeMap<>();

        orderedMap.put("Banana", 2);
        orderedMap.put("Apple", 1);
        orderedMap.put("Mango", 3);

        for (Map.Entry<String, Integer> entry : orderedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("杀杀杀111");
        List<String> list = new ArrayList<String>();
        list.add("的");
        System.out.println(list.isEmpty());
        int i;
        for(i=2;i<=10;i++){
            System.out.println(i);
        }
        int x =-5;
        int y= -12;
        System.out.println(y%x);
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        int a =10;
        a++;
        Test.a++;
        System.out.println("guLLL::"+a);
        System.out.println((new Test()).a);

        System.out.println(6+6 +"(Result)");

        System.out.println(val());


         int x1=4;
        System.out.println((x>4?99.9:9));


    }

    public  static  int val(){
        int  num =5;
        try {
            num =num/0;
        }
        catch (Exception e){
            num =10;
        }
        finally {
            num =15;
        }
        return  num;
    }
}
