package com.company;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
      /*  Exercise1();
        Exercise2();
        Exercise3();*/
        Exercise4();

    }



    public static void Exercise1(){
        double increment=0.01123;
        double result=0;
        double x=0;

        if (increment<0){
            System.out.println("Число отрицаительное");
        }else {
            while (x<1000000){
                x+=increment;
                result++;
            }
            System.out.println((int)result);
        }
    }

    public static void Exercise2(){
        int arr[]={1,1,1,1,1};
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Exercise3(){
        boolean hasFuel = false;
        boolean hasElectricsProblem =false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
       double price=0;
        int BreakdownCounter=0;
        if (!hasFuel&&!hasElectricsProblem&&!hasMotorProblem&&!hasTransmissionProblem&&!hasWheelsProblem) {
            price = +1000;
            System.out.println("ничего не сломано, забирайте манину");
        }

         if (hasMotorProblem){
            price+=10000;
            System.out.println("У вас проблемы с двигателем");
            BreakdownCounter++;

        }
         if (hasElectricsProblem){
             price+=5000;
             System.out.println("У вас проблемы с электрикой");
             BreakdownCounter++;
         }
         if (hasTransmissionProblem){
             price+=4000;
             System.out.println("У вас проблемы с коробкой передач");
             BreakdownCounter++;

         }
         if (hasWheelsProblem){
             System.out.println("У вас проблемы с колесами");
             price+=2000;
             BreakdownCounter++;

         }

         if (hasTransmissionProblem&&(hasElectricsProblem||hasMotorProblem)){
             System.out.println("У вас сломана коробка и электрика или двигатель, скидка 20%");
             price=price-(price/100*20);
         }else if (BreakdownCounter==2){
             System.out.println("У вас сломано 2 детали, на общую сумму действует скидка 10%");
             price=price-(price/100*10);
         }

        System.out.println("C ваc "+price);

    }

    public static void Exercise4(){
        Stock stock=new Stock();
        Employee employee1=new Employee();
        employee1.SmashVodka(5,stock);
        System.out.println("Работник 1 разбил "+employee1.getSmashInfo()+ "штук");
        System.out.println("На складе "+stock.GetProduct()+"\n");


        Employee employee2=new Employee();
        employee2.SmashVodka(10,stock);
        System.out.println("Работник 2 разбил "+employee2.getSmashInfo()+ "штук");
        System.out.println("На складе "+stock.GetProduct()+"\n");


        Employee employee3=new Employee();
        employee3.SmashVodka(1000,stock);
        System.out.println("Работник 3 разбил "+employee3.getSmashInfo()+ "штук");
        System.out.println("На складе "+stock.GetProduct()+"\n");




    }

























}
