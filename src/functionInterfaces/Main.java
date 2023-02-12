package functionInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args){
        System.out.println("----------Task 1----------");
        List<Double> numberList = new ArrayList<>();
        numberList.add(2.2);
        numberList.add(0.0);
        numberList.add(-3.6);
        numberList.add(-0.1);
        numberList.add(5.5);
        Predicate<Double> predicate = new Predicate<Double>() {
            @Override
            public boolean test(Double number) {
                return number > 0;
            }
        };
        for (Double number: numberList){
            if (predicate.test(number)){
                System.out.println(number + " - positive number");
            } else {
                System.out.println(number + " - not positive number");
            }
        }
        System.out.println();
        Predicate<Double> predicateL = n -> n >0;
        for (Double number: numberList){
            if (predicateL.test(number)){
                System.out.println(number + " - positive number");
            } else {
                System.out.println(number + " - not positive number");
            }
        }

        System.out.println("\n----------Task 2----------");
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s + "!");
            }
        };
        consumer.accept("Sveta");
        Consumer<String> consumerL = s -> System.out.println("Hello, " + s + "!");
        consumerL.accept("Ivan");

        System.out.println("\n----------Task 3----------");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        for (Double number: numberList){
            System.out.print(function.apply(number) + " ");
        }
        System.out.println();
        Function<Double, Long> functionL = num -> Math.round(num);
        for (Double number: numberList) {
            System.out.print(functionL.apply(number) + " ");
        }
        System.out.println();

        System.out.println("\n----------Task 4----------");
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random()*100);
            }
        };
        System.out.println(supplier.get());
        Supplier<Integer> supplierL = () -> (int)(Math.random()*100);
        System.out.println(supplierL.get());

        System.out.println("\n----------Task 5----------");
        Function<Double, Double> function1 = num -> num*2;
        Function<Double, Double> function2 = num -> num*(-2);
        double testX = 1.0;
        double testY = -2.5;
        System.out.println(ternaryOperator(predicate,function1,function2).apply(testX));
        System.out.println(ternaryOperator(predicate,function1,function2).apply(testY));
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
}
