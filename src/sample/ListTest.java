package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static <list> void main(String[] args) {
        List<Person> original = new ArrayList<>(Arrays.asList(
                new Person("Alice", "25"),
                new Person("Bob", "30")
        ));
//        List<Person> copy1 = new ArrayList<>(original);
        List<Person> copy1 = new ArrayList<>();
        copy1.addAll(original);
        copy1.stream().forEach(a->{
            System.out.println(a.getName() +":::" +a.getAge());
        });
        original.get(0).setAge("50");
        copy1.stream().forEach(a->{
            System.out.println(a.getName() +"::" +a.getAge());
        });

        // 深拷贝测试
       List<Person> ss = deepCopy(original);
        original.get(0).setAge("60");
        original.stream().forEach(a->{
            System.out.println(a.getName() +"====::" +a.getAge());
        });
        ss.stream().forEach(a->{
            System.out.println(a.getName() +"::" +a.getAge());
        });

    }


     private static <T> List<T> deepCopy(List<T> src) {
        try {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(src);

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);

            return (List<T>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("深拷贝失败", e);
        }
    }

}
