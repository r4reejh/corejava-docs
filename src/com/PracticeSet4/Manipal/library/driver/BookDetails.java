package com.PracticeSet4.Manipal.library.driver;

import com.PracticeSet4.Manipal.library.EngineeringBook;

public class BookDetails {
    public static void main(String[] args){
        EngineeringBook engbk = new EngineeringBook();

        engbk.setCategory("Engineering");
        engbk.setAuthor("Reejh Ghosh");
        engbk.setBookNo(123);
        engbk.setPrice(9696.96f);
        engbk.setTitle("Advanced String Theory");

        System.out.println(engbk);
    }
}
