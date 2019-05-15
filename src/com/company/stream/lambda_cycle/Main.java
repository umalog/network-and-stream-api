package com.company.stream.lambda_cycle;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        numbers.forEach(value -> System.out.println(value));
        MyNum myNum = n -> (n % 2) == 0;

        System.out.println(myNum.test(22));
    }

    interface MyNum {
        Boolean test(Integer n);
    }
}
