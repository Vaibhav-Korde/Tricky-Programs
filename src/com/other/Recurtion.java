package com.other;

class Recurtion{

    static int n = 1;
    public static void Simple(){
 
        if(n <= 100){
            System.out.println(n);
            n ++;
            Simple();
        }
       
        
    }
    
    SortingArray sortingArray;

    public static void main(String[] args){
      
        Simple();
    
    }
}