import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        //with stream without stream
        //create a list and filter all even number from list
        List<Integer> list1 = List.of(2, 4, 6, 13, 45);
        //List<Integer> list2 = new ArrayList<>();
        //List<Integer> list3 = Arrays.asList(23, 45, 12, 34, 2);
        System.out.println(list1);

        //without stream
        List<Integer> even = new ArrayList<>();
        for(Integer i: list1) {
            if(i%2==0) {
                even.add(i);
            }
        }
        //System.out.println(even);

        //with stream
//        Stream<Integer> stream =list1.stream();
//        List<Integer> res = stream.filter(i-> i%2==0).collect(Collectors.toList());
//        System.out.println(res);
        //System.out.println(list1.stream().filter(i-> i%2==0).collect(Collectors.toList()));

        //System.out.println(list1.stream().filter(i-> i>10).collect(Collectors.toList()));


        //how to create stream object or get stream object
        //1- blank stream
        Stream<Object> emptyStream = Stream.empty();
//        emptyStream.forEach(e -> {
//            System.out.println(e);
//        });

        //2 - array, object, collection
        String[] names = {"Kaju", "Karan", "Ram", "Vaishu"};
        Stream<String> stream1 =  Stream.of(names);
//        stream1.forEach(e -> {
//            System.out.println(e);
//        });

        //3
        //tream<Object> streamBuilder = Stream.builder().build();

        //4
//        Stream stream2 =(Stream) Arrays.stream(new int[]{1, 2, 3, 4});
//        stream2.forEach(e-> {
//            System.out.println(e);
//        });


        // IMP methods
        //1) filter(Predicate) => filter method predicate as a aregument leta hai
        //Predicate - boolean valued function, it is interface
        List<String> str = List.of("Kaju", "Ram", "Vaishu", "Ajay", "Rdra");
        List<String> newStr = str.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newStr);

        //2) map(Function) => each element pe koi operation perform kar sakate hai. ex., square each number
        List<Integer> nums = list1.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(nums);

        //3) collect => collect the element


        //forEach => help to traverse element
        str.stream().forEach(e-> {
            System.out.println(e);
        });
        //or
        str.stream().forEach(System.out::println);

        //sorted
        list1.stream().sorted().forEach(System.out::println);

        //min
        Integer min = list1.stream().min((x, y)-> x.compareTo(y)).get();
        System.out.println(min);

        //max
        Integer max = list1.stream().max((x, y)-> x.compareTo(y)).get();
        System.out.println(max);
    }
}
