package com.InheritanceExamples;

public class ABdriver {
    public static void main(String[] args){
        A o1 = new A();
        o1.x = 4;
        //System.out.println(o1.x);
        System.out.println(o1.add(2));

        B o2 = new B();
        o2.x = 5;
        o2.y = 6;
        //System.out.println(o2.x+" "+o2.y);
        System.out.println(o2.add(2));

        B oss = new B();
        A os = oss;
        A osx = new B();
        os.x = 6;
        //System.out.println(os.x);
        System.out.println(os.add(2));
        System.out.println(osx.add(2));
    }
}
