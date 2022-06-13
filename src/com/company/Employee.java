package com.company;

public class Employee extends Stock {
    private int SmashInfo;


    public void SmashVodka(int x){
        CountProduct(x);
        SmashInfo+=x;
        System.out.println("Ура я разбил водку в колличестве "+x+" штук");


    }

    public int getSmashInfo(){
       return SmashInfo;

    }


}
