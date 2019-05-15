package com.company.stream.method_reference;

public class Main {
    public static void main(String[] args) {
        Greeter sayHi = new GreeterImpl()::sayHiBrightly;
        sayHi.sayHi();

        sayHi = GreeterImpl::sayHi;
        sayHi.sayHi();

        Greeter greeter = System.out::println;
        greeter.sayHi();
    }
}
