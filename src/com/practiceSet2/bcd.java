package com.practiceSet2;

public class bcd extends abc {
    String hi;
    public bcd(String hi, String hello){
        super(hello);
        this.hi = hi;
    }

    public static void main(String[] args){
        bcd v = new bcd("Hi", "Hello");
        System.out.println(v.hello);
        System.out.println(v.hi);

        v.sayHello();
    }
}
