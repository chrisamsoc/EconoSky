/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.econosky;

import java.time.YearMonth;
import java.util.HashMap;
/**
 *
 * essentially what this class does is first determines an airline's alliance and adds it to its respective hashmap based on alliance
 * @author chris
 */

import java.util.*;      
public class flightManager {
    //airline name and airline class instance
    public HashMap<String,airline> starAlliance = new HashMap();
    public HashMap<String,airline> oneWorld = new HashMap();
    public HashMap<String,airline> skyTeam = new HashMap();
    private HashMap<String, HashMap> team = new HashMap();
    
    
    //tier list 
    public HashMap<String,Integer> tiers = new HashMap();        
    
    public flightManager(){
    this.team.put("Star Alliance",starAlliance);
    this.team.put("Sky Team",skyTeam);
    this.team.put("One World",oneWorld);
    this.destinations();
    }
    public void destinations()
    {
        //tier 1
        tiers.put("Frankfurt",1);
        tiers.put("Tokyo",1);
        tiers.put("Atlanta",1);
        tiers.put("Paris",1);
        tiers.put("London",1);
        tiers.put("New York",1);
        
        //tier 2
        tiers.put("Munich",2);
        tiers.put("Singapore",2);
        tiers.put("Toronto",2);
        tiers.put("Zurich",2);
        tiers.put("Seoul",2);
        tiers.put("Amsterdam",2);
        tiers.put("Shanghai",2);
        tiers.put("Hong Kong",2);
        
        //tier 3
        tiers.put("Montreal",3);
        tiers.put("Beijing",3);
        tiers.put("Vancouver",3);
        tiers.put("Dallas",3);
        tiers.put("Jedha",3);
        tiers.put("Madrid",3);
        tiers.put("Manilla",3);
        tiers.put("Helsinki",3);
        tiers.put("Chicago",3);
        tiers.put("Rome",3);
        
        //tier 4
        tiers.put("Edmonton",4);
        tiers.put("Calgary",4);
        tiers.put("Regina",4);
        tiers.put("St John",4);
        
        
    }
    
    public void addAirline(airline company)      
    {
        if ((company.getAlliance()).equals("Star Alliance"))
        {
            starAlliance.put(company.getName(),company);
        }
        else if ((company.getAlliance()).equals("One World"))
        {
            oneWorld.put(company.getName(),company);
        }
        
        else if ((company.getAlliance()).equals("Sky team"))
        {
            skyTeam.put(company.getName(),company);
        }
        
        
   
        
    }
    
    
    //tier 1 to tier 1-2 | 2 a day
        //tier 1 to tier 3 | 1 a day
        // tier 1 to tier 4 | once every 2 days
        //tier 2 to tier 2-3 | 1 a day
        //tier 2 to tier 4 | once every 2 days
        //tier 3 to tier 3 | once every 2 days
        //tier 3 to tier 4| once every 3 days
        //tier 4 to tier 4 | once every 3 days
    
    //we use a sine function to determine avaibillity 
    // a period shall represent 4 quarters of a day, 
    
    
    // flights to be represented within 1 day are to be deterined by periodic functions
    //for every flight in one direction, there is a return flight the next day
    
    public void flightSchedule(String alliance,int depMonth, int depDay)
    {
        
        
         //create class instance for month of departure
        YearMonth yearMonth =  YearMonth.of(2025,depMonth);
        double monthDays = yearMonth.lengthOfMonth();
        
         // retrieve  the annoying  HashMap of airlines for the specified alliance
        HashMap<String, airline> allianceAirlines = team.get(alliance);
        //loop for each airline attempt
        for(String key:allianceAirlines.keySet())
       {
           System.out.printf("Now servicing %s\n",key);
           System.out.println("=====");
           String hub = allianceAirlines.get(key).getHub();
           int hubTier = tiers.get(hub);
           System.out.printf("hub:%s : tier: %d\n",hub,hubTier);
           allianceAirlines.get(key).validPairs.clear();
           
           
           for(int i=0; i < (allianceAirlines.get(key)).destinations.size();i++)
           {
               String arr = (allianceAirlines.get(key)).destinations.get(i);
               
               int arrTier =  tiers.get(arr);
               System.out.printf("arr:%s : tier: %d\n",arr,arrTier);
               double p = period(hubTier,arrTier,monthDays,depDay);
               double c= (2*Math.PI)/p;
               System.out.printf("period:%f| c:%f\n",p,c);
               
               //we check to points (i.125 and i.625 to see if flights occur)
               double point1 = Math.sin(c*(depDay+0.125));
               double point2 = Math.sin(c*(depDay+0.625));
               System.out.printf("point1:%f| point2:%f\n",point1,point2);
               if (point1 > 0 || point2 > 0)
               {
                   System.out.println("valid flight "+ arr);
                   (allianceAirlines.get(key)).validPairs.add(hub);
                   
                   (allianceAirlines.get(key)).validPairs2.add(arr);
               }
               
               //check for return flight
               //done by checking to see if a departure flight existed the day prior, if so then on this day its arrival flight must occur
               double point3 = Math.sin(c*(depDay+0.125-1));
               double point4 = Math.sin(c*(depDay+0.625-1));
               
               if (point3 > 0 || point4 > 0)
               {
                   System.out.println("valid flight "+ arr);
                   (allianceAirlines.get(key)).validPairs.add(arr);
                   
                   (allianceAirlines.get(key)).validPairs2.add(hub);
               }

           }
       }
        
        
        
        
    }
    
    
    //this function figures out the frequency of a specific flight based on tiers
    //function spits out period for sin function to work with
    public double period(int tierDep,int  tierArr, double monthDays, int depDay)
    {
        
        double period = 0;
      switch(tierDep){
          case 1:
              if(tierArr == 1 || tierArr == 2)
              {
                  //2 a day
                  period = 0.5;
              }
              else if (tierArr == 3)
              {
                  //1 a day
                  period = 1;
              }
              else if (tierArr == 4)
              {
                  //once every 2 days
                  period = 2;
              }
              break; 
          case 2:
              if (tierArr ==1)
              {
                  //2 a day
                  period = 0.5;
              }
              else if (tierArr ==2 || tierArr == 3)
              {
                  //1 a day
                  period = 1;
              }
              else if (tierArr ==4)
              {
                  //once every 2 days
                  period = 2;
              }
              break;
          case 3:
              if (tierArr ==1 || tierArr == 2)
              {
                  // 1 a day
                  period =1;
              }
              else if (tierArr ==3)
              {
                  //once every 2 days
                  period = 2;
              }
              else if (tierArr == 4)
              {
                  //once every 3 days
                  period = 3;
              }
              break;
          case 4:
              if (tierArr ==1 || tierArr == 2)
              {
                  //once every 2 days
                  period = 2;
              }
              else if (tierArr == 3 || tierArr == 4)
              {
                //once every 3 days
                 period = 3;
              }
              break;
              
              
            
        
                  
              
        
      }
        
        
      return period;  
    }
    
    
}
