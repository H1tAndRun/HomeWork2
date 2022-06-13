package com.company;

public class Employee  {
    private int SmashInfo;


    public void SmashVodka(int x,Stock stock){
        stock.setProduct(stock.GetProduct()-x);
        SmashInfo+=x;
        System.out.println("Ура я разбил водку в колличестве "+x+" штук");


    }

    public int getSmashInfo(){
       return SmashInfo;

    }


}
