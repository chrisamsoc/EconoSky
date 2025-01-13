/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.econosky;

/**
 *
 * @author chris
 */


import java.time.*;

public class price {
    
    private int bookingClass;
    private int baseCost;
    public price(int bookingClass)
    {
        System.out.println("run");
    
        //if between 7-9
    if((bookingClass-6) >0 )
    {
        System.out.println("economy");
        this.baseCost = 380;
        for(int i = 0; i < (bookingClass-6);i++)
        {
            this.baseCost +=60;
        }
    }
    //if between 4-6
    else if ((bookingClass-3) >0 ){
         System.out.println("premium economy");
        this.baseCost = 680;
        for(int i = 3; (bookingClass-3) < i ;i--)
        {
            this.baseCost +=142;
        }
     
    }
    //if between 1-3
    else
    {
         System.out.println("buisness");
        this.baseCost = 1200;
        for(int i = 3; bookingClass < i ;i--)
        {
            this.baseCost +=300;
        }
    }
    
    }
    //month when booked, month at departure, day in month of booking, day in month of departure, depature tier, arrival tier
    
    public double determine(int bookMonth,int depMonth,int bookDay, int depDay, int tierDep, int tierArr)
    {
        //determine the default price between the cities first
        
        //use increments by decimals to determine how much more it costs based off of pure starting price of 400
        double increments =2.02;
        for (int i = 1; i <=tierDep; i++)
        {
            increments -= 0.085;
            System.out.println(i);
          
        }
        
       
        for (int i = 1; i <=tierArr; i++)
        {
            increments -= 0.085;
            System.out.println(i);
          
        }
        
        double costStuff= increments*this.baseCost;
        System.out.println(increments);
        System.out.println(this.baseCost);
        
        //now we calculate the values for the sine function
        //number of days in month
        
        //create class instance for month of departure
        YearMonth yearMonth =  YearMonth.of(2025,depMonth);
        double period = yearMonth.lengthOfMonth();
        
        double cVal = (2*(Math.PI))/period;
        
        //minimum value
        double minimum = costStuff;
        
        //how many months away is departure
        if(depMonth < bookMonth)
        {
            depMonth +=12;
        }
        int monthAway = depMonth-bookMonth;
        
        //calculate monthAwayFee by incremenitng by 0.15 each time and by adding 0.1 by  i each time
        double monthFee = 1;
        for(int i = 6; monthAway < i ;i--)
        {
            monthFee += (0.15)+(0.1)*i;
        }
        
        double maximum = minimum*monthFee;
        
        //determine if month is a special one, as if it is june,july, december, january
        if(depMonth ==1 || depMonth == 6||depMonth ==7 || depMonth ==12)
        {
            minimum = minimum*1.2; 
            maximum = maximum *1.1;
        }
        
        
        
        
        return costStuff;
    }
    
    
}
