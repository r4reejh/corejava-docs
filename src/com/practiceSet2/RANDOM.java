package com.practiceSet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RANDOM {
    public static void main(String[] Args){
        /*String[] names = {"Cristiano Ronaldo", "Mohammad Salah", "Jadon Sancho", "Paul Pogba",
                "Zinedine Zidane", "Ngolo Kante", "Luke Shaw",
                "Victor Lindelof", "Virgil Van Djik", "Aaron Wan Bissaka", "David De Gea"
        };

        ArrayList<String> names2 = new ArrayList<String>(Arrays.asList(names));

        System.out.println("STARTING LINEUP:");
        for(String x: names){
            System.out.println(x);
        }

        System.out.println(names2);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Select which: \n1.Square\n2.Rectangle");
        int x = Integer.parseInt(sc.nextLine());
        switch(x){
            case 1:
                System.out.println(AreaCalc.area(2));
                break;
            case 2:
                System.out.println(AreaCalc.area(2, 3));
                break;
            default:
                System.out.println("invalid");
        }
    }
}

class AreaCalc{
    static double area(int a){
        return a*a;
    }

    static double area(int l, int b){
        return l*b;
    }

    static double area(double r, double h){
        return 2*Math.PI*r*(r+h);
    }

    static double area(int h, double b){
        return 0.5*b*h;
    }
}
