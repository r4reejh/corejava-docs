package com.PracticeSet4.Manipal.library;

public class EngineeringBook extends Book {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString(){
        String x = "Category: "+category+"\n";
        x+="Book No: "+getBookNo()+"\n";
        x+="Title: "+getTitle()+"\n";
        x+="Author: "+getAuthor()+"\n";
        x+="Price: "+getPrice()+"\n";
        return x;
    }
}
