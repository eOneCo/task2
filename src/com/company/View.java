package com.company;
public class View {
    public void printRequest1(){
        System.out.println("Write lower number");
    }
    public void printRequest2(){
        System.out.println("Write higher number");
    }
    public void printRequest3(){
        System.out.println("Write your number");
    }

    public void printError(){
        System.out.println("Wrong number");
    }
    public void wrongHigher(){
        System.out.println("Higher");
    }
    public void wrongLower(){
        System.out.println("Lower");

    }
    public void youWin(){
        System.out.println("Congrats you are winner");
    }
    public void notInInterval(){
        System.out.println("Your number not in interval");
    }
}
