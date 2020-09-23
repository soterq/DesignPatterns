package streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(Integer.parseInt("11",16));
//        IntStream.range(0, 10)
//                .limit(5)
//                .skip(3)
//                .forEach(System.out::println);
//        IntStream.concat(
//                IntStream.range(2, 5),
//                IntStream.range(0, 4))
//                .distinct()
//                .forEach(System.out::println);

//        int product = IntStream.range(0, 10)
//                .filter(x -> x++ % 4 == 0)
//                .reduce((acc, x) -> acc * x)
//                .getAsInt();
//
//        System.out.println(product);

//        IntStream.range(5, 30)
//                .limit(12)
//                .skip(3)
//                .limit(6)
//                .skip(2)
//                .forEach(System.out::println);

//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("Jane",102));
//        personList.add(new Person("Bill",101));
//        personList.add(new Person("Anny",23));
//        personList.add(new Person("Mary",106));
//        personList.add(new Person("Jim",85));
//
//        List<Person> collect = personList.stream().filter(c -> c.getValue() > 100).
//                sorted(Comparator.comparing(p->p.name)).collect(Collectors.toList());

//        List<Person> collect1 = personList.stream().sorted(Comparator.comparing(p -> p.name))
//                .collect(Collectors.toList());

//        collect.forEach( p -> System.out.println(p.getName()));
//        collect1.forEach( p -> System.out.println(p.getName()));
    }

   static class Person{
        String name;
        int value;

        public Person(String name, int value) {
            this.name = name;
            this.value = value;
        }

       public String getName() {
           return name;
       }

       public int getValue() {
           return value;
       }
   }
}