package com.company;
import java.util.Random;

public class Model {
    private int minNumber=1;
    private int maxNumber=100;
    private int number;
    private int unknownNumber;

    public int getUnknownNumber() {
        return unknownNumber;
    }

    public void setUnknownNumber(int unknownNumber) {
        this.unknownNumber = unknownNumber;
    }

    private  Random randNumber=new Random();

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void rand(){
        unknownNumber=minNumber+randNumber.nextInt(maxNumber-minNumber-1);
        System.out.println(unknownNumber);
    }

    public boolean compare(){
        boolean result=false;
        if(unknownNumber==number){
            result=true;
        }
        return result;
    }
    public  boolean isHigher(){
        boolean result=false;
        if(unknownNumber>number){
            result=true;
        }
        return result;
    }
    public  boolean isOnInterval(){
        boolean result=false;
        if(number<maxNumber && number>minNumber){
            result=true;
        }

        return result;
    }
}
