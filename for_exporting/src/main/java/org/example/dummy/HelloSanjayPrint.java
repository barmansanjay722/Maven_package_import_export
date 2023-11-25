package org.example.dummy;

public class HelloSanjayPrint {

    public String hello() {
        return "Hello from another package";
    }

    protected String helloAnother() {
        return "hello from not access";
    }

    public static void main(String[] args) {
        HelloSanjayPrint helloSanjayPrint = new HelloSanjayPrint();
        helloSanjayPrint.helloAnother();
        helloSanjayPrint.hello();


    }
}
