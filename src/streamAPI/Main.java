package streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static streamAPI.Person.personComparator;

public class Main {
    public static void main(String[] args){
        System.out.println("----------Task 1----------");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(22);
        numberList.add(0);
        numberList.add(-36);
        numberList.add(15);
        numberList.add(-11);
        findMinMax(numberList.stream(),numberComparator,minMaxConsumer);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan",22));
        personList.add(new Person("Petr",18));
        personList.add(new Person("Oleg",36));
        personList.add(new Person("Maksim",19));
        personList.add(new Person("Aleksandr",40));
        findMinMax(personList.stream(),personComparator,minMaxConsumer);
        List<Integer> numberList2 = new ArrayList<>();
        findMinMax(numberList2.stream(),numberComparator,minMaxConsumer);

        System.out.println("\n----------Task 2----------");
        printNumberOfEvenNumbers(numberList);
        printNumberOfEvenNumbers(numberList2);

    }
    public static <T> void findMinMax(Stream <? extends T> stream,
                                  Comparator <? super T> order,
                                  BiConsumer <? super T, ? super T> minMaxConsumer){
        ArrayList<? extends T> sortedArray = stream.sorted(order)
                .collect(Collectors.toCollection(ArrayList::new));
        if (sortedArray.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            T min = sortedArray.get(0);
            T max = sortedArray.get(sortedArray.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }
    public static Comparator<Integer> numberComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            }
            return 0;
        }
    };

    public static BiConsumer<Object,Object> minMaxConsumer = (x,y) -> System.out.println("Min = " + x + ", Max = " + y);

    public static Predicate<Integer> predicateEvenNumbers = n -> n%2 == 0;

    public static void printNumberOfEvenNumbers(List<Integer> listInt){
        System.out.println("Number of even numbers - " +
                listInt.stream()
                .filter(predicateEvenNumbers)
                .count());
    }
}
