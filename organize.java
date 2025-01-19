/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.econosky;

/**
 *
 * @author chris
 * 
 * star alliance airlines with hubs
 * Air Canada (Toronto)
 * Lufthansa (Frankfurt)
 * Swiss Airlines (Zurich)
 * Singapore Airlines (Singapore)
 * United Airlines (Chicago)
 * ANA (Tokyo)
 * Phillipines Airlines (Manilla)
 * Air China (Beijing)
 * 
 * Skyteam alliance airlines with hubs
 * KLM (Amsterdam)
 * Air France (Paris)
 * Delta Airlines (Atlanta)
 * Korean Airlines (Seoul)
 * China Eastern (Shanghai)
 * Saudi (Jeddha)
 * ITA (Rome)
 * 
 * OneWorld alliance airlines with hubs
 * British Airways (London)
 * Iberia (Madrid)
 * Finnair (Helskinki)
 * Cathay Pacific (Hong Kong)
 * American Airlines (New York)
 * Japan Airlines (Tokyo)
 * 
 */

import java.time.YearMonth;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
public class organize {
    
    flightManager manage = new flightManager();
    flightNet net = new flightNet();
    airline AC = new airline("Air Canada","Toronto","Star Alliance",1.2);
    airline LH = new airline("Lufthansa","Frankfurt","Star Alliance",0.5);
   airline SW = new airline("Swiss Airlines","Zurich","Star Alliance",1.3);
    airline SN = new airline("Singapore Airlines","Singapore","Star Alliance",1.3);
    airline UA = new airline("United Airlines","Chicago","Star Alliance",0.9);
    airline ANA = new airline("ANA","Tokyo","Star Alliance",1.25);
    airline PA = new airline("Phillipine Airlines","Manilla","Star Alliance",0.8);
    airline ACh = new airline("Air China","Beijing","Star Alliance",0.7);
    airline KLM = new airline("KLM","Amsterdam","Sky team",1.2);
    airline AF = new airline("Air France","Paris","Sky team",1.2);
    airline DAL = new airline("Delta Airlines","Atlanta","Sky team",0.9);
    airline KAL = new airline("Korean Airlines","Seoul","Sky team",1.25);
    airline CE = new airline("China Eastern Airlines","Shanghai","Sky team",1);
    airline SA = new airline("Saudi Airlines","Jedha","Sky team",0.8);
    airline ITA = new airline("ITA","Rome","Sky team",1);
    airline BA = new airline("British Airways","London","One World",1.3);
    airline IB = new airline("Iberia Airlines","Madrid","One World",0.9);
    airline FN = new airline("Finnair","Helsinki","One World",1);
    airline CP = new airline("Cathay Pacific","Hong Kong","One World",1.15);
      airline AA = new airline("American Airlines","New York","One World",0.8);
        airline JAL = new airline("Japan Airlines","Tokyo","One World",1.3); 
    public organize()
    {
        //add cities to network
       for(String key: manage.tiers.keySet())
       {
           net.addCity(key);
       }
        
        //begin with star alliance
        
        manage.addAirline(AC);
        
        manage.addAirline(LH);
        
        manage.addAirline(SW);
      
        manage.addAirline(SN);
       
        manage.addAirline(UA);
        
        manage.addAirline(ANA);
       
        manage.addAirline(PA);
        
        manage.addAirline(ACh);
        
        //sky team alliance
       
        manage.addAirline(KLM);
     
        manage.addAirline(AF);
        
        manage.addAirline(DAL);
        
        manage.addAirline(KAL);
        
        manage.addAirline(CE);
        
        manage.addAirline(SA);
        
        manage.addAirline(ITA);
        
        //one world alliance
        
        manage.addAirline(BA);
        
        manage.addAirline(IB);
        
        manage.addAirline(FN);
        
       manage.addAirline(CP);
      
        manage.addAirline(AA);
      
        manage.addAirline(JAL);
        
        
        
     
           
        
        
        
        AC.addDestination("Frankfurt");
AC.addDestination("Paris");
AC.addDestination("London");
AC.addDestination("New York");
AC.addDestination("Munich");
AC.addDestination("Seoul");
AC.addDestination("Montreal");
AC.addDestination("Vancouver");

AC.addDestination("Chicago");
AC.addDestination("Edmonton");
AC.addDestination("Calgary");
AC.addDestination("Regina");
AC.addDestination("St John");

LH.addDestination("Tokyo");
LH.addDestination("Rome");
LH.addDestination("Atlanta");
LH.addDestination("Paris");
LH.addDestination("London");
LH.addDestination("New York");
LH.addDestination("Chicago");
LH.addDestination("Toronto");
LH.addDestination("Zurich");
LH.addDestination("Amsterdam");
LH.addDestination("Hong Kong");
LH.addDestination("Madrid");
LH.addDestination("Jedha");
LH.addDestination("Helsinki");

SW.addDestination("New York");
SW.addDestination("Paris");
SW.addDestination("Dallas");
SW.addDestination("Chicago");
SW.addDestination("Rome");
SW.addDestination("Toronto");

SN.addDestination("Tokyo");
SN.addDestination("Atlanta");
SN.addDestination("New York");
SN.addDestination("Munich");
SN.addDestination("Seoul");
SN.addDestination("Shanghai");
SN.addDestination("Hong Kong");
SN.addDestination("Beijing");
SN.addDestination("Jedha");
SN.addDestination("Manilla");
SN.addDestination("Paris");
SN.addDestination("Chicago");
SN.addDestination("Frankfurt");



UA.addDestination("New York");
UA.addDestination("Atlanta");
UA.addDestination("Dallas");
UA.addDestination("Toronto");
UA.addDestination("Rome");
UA.addDestination("Shanghai");
UA.addDestination("London");
UA.addDestination("Frankfurt");

ANA.addDestination("Shanghai");
ANA.addDestination("Hong Kong");
ANA.addDestination("Singapore");
ANA.addDestination("Seoul");
ANA.addDestination("Jedha");
ANA.addDestination("Chicago");
ANA.addDestination("Toronto");
ANA.addDestination("Montreal");
ANA.addDestination("London");

PA.addDestination("Shanghai");
PA.addDestination("Hong Kong");
PA.addDestination("Singapore");
PA.addDestination("Seoul");
PA.addDestination("Jedha");
PA.addDestination("Chicago");
PA.addDestination("Zurich");
PA.addDestination("Frankfurt");

ACh.addDestination("Shanghai");
ACh.addDestination("Hong Kong");
ACh.addDestination("Seoul");
ACh.addDestination("Singapore");
ACh.addDestination("Paris");
ACh.addDestination("Amsterdam");
ACh.addDestination("Vancouver");


KLM.addDestination("Paris");
KLM.addDestination("Toronto");
KLM.addDestination("Vancouver");
KLM.addDestination("Montreal");
KLM.addDestination("Calgary");
KLM.addDestination("Atlanta");
KLM.addDestination("Shanghai");
KLM.addDestination("New York");
KLM.addDestination("Frankfurt");
KLM.addDestination("Munich");
KLM.addDestination("Seoul");

AF.addDestination("Amsterdam");
AF.addDestination("Frankfurt");
AF.addDestination("Munich");
AF.addDestination("Zurich");
AF.addDestination("New York");
AF.addDestination("Atlanta");
AF.addDestination("London");
AF.addDestination("Hong Kong");
AF.addDestination("Montreal");
AF.addDestination("Helsinki");
AF.addDestination("Rome");
AF.addDestination("Dallas");
AF.addDestination("Tokyo");

DAL.addDestination("Paris");
DAL.addDestination("Amsterdam");
DAL.addDestination("Jedha");
DAL.addDestination("Edmonton");
DAL.addDestination("Calgary");
DAL.addDestination("Regina");
DAL.addDestination("St John");
DAL.addDestination("Munich");
DAL.addDestination("Seoul");
DAL.addDestination("Dallas");
DAL.addDestination("Chicago");
DAL.addDestination("Toronto");

KAL.addDestination("Tokyo");
KAL.addDestination("Shanghai");
KAL.addDestination("Singapore");
KAL.addDestination("Hong Kong");
KAL.addDestination("Jedha");
KAL.addDestination("Manilla");
KAL.addDestination("Calgary");
KAL.addDestination("Amsterdam");
KAL.addDestination("London");
KAL.addDestination("Atlanta");

CE.addDestination("Beijing");
CE.addDestination("Seoul");
CE.addDestination("Singapore");
CE.addDestination("Jedha");
CE.addDestination("Hong Kong");
CE.addDestination("Manilla");
CE.addDestination("Frankfurt");
CE.addDestination("Chicago");
CE.addDestination("Atlanta");
CE.addDestination("Paris");
CE.addDestination("Amsterdam");

SA.addDestination("Amsterdam");
SA.addDestination("Seoul");
SA.addDestination("Atlanta");
SA.addDestination("Toronto");
SA.addDestination("Singapore");

ITA.addDestination("Frankfurt");
ITA.addDestination("New York");
ITA.addDestination("Munich");
ITA.addDestination("Zurich");
ITA.addDestination("Amsterdam");
ITA.addDestination("Paris");
ITA.addDestination("London");
ITA.addDestination("Madrid");
ITA.addDestination("Atlanta");
ITA.addDestination("Seoul");


BA.addDestination("Madrid");
BA.addDestination("Amsterdam");
BA.addDestination("Dallas");
BA.addDestination("Hong Kong");
BA.addDestination("Tokyo");
BA.addDestination("Frankfurt");
BA.addDestination("Munich");
BA.addDestination("Zurich");
BA.addDestination("Calgary");
BA.addDestination("Dallas");
BA.addDestination("New York");
BA.addDestination("Helsinki");
BA.addDestination("Rome");
BA.addDestination("Edmonton");

IB.addDestination("London");
IB.addDestination("Paris");
IB.addDestination("Amsterdam");
IB.addDestination("Tokyo");
IB.addDestination("Zurich");
IB.addDestination("Toronto");
IB.addDestination("Montreal");
IB.addDestination("New York");
IB.addDestination("Shanghai");
IB.addDestination("Hong Kong");
IB.addDestination("Tokyo");

FN.addDestination("London");
FN.addDestination("Paris");
FN.addDestination("Amsterdam");
FN.addDestination("Toronto");
FN.addDestination("New York");
FN.addDestination("Jedha");
FN.addDestination("Munich");
FN.addDestination("Frankfurt");
FN.addDestination("Zurich");
FN.addDestination("Seoul");
FN.addDestination("Rome");

CP.addDestination("Seoul");
CP.addDestination("Shanghai");
CP.addDestination("Beijing");
CP.addDestination("Singapore");
CP.addDestination("Manilla");
CP.addDestination("Tokyo");
CP.addDestination("Vancouver");
CP.addDestination("Toronto");
CP.addDestination("Frankfurt");
CP.addDestination("London");
CP.addDestination("New York");
CP.addDestination("Paris");

AA.addDestination("Atlanta");
AA.addDestination("Chicago");
AA.addDestination("Toronto");
AA.addDestination("Montreal");
AA.addDestination("Vancouver");
AA.addDestination("Dallas");
AA.addDestination("Edmonton");
AA.addDestination("Calgary");
AA.addDestination("Regina");
AA.addDestination("St John");
AA.addDestination("Paris");
AA.addDestination("London");
AA.addDestination("Tokyo");
AA.addDestination("Hong Kong");

JAL.addDestination("Singapore");
JAL.addDestination("Beijing");
JAL.addDestination("Shanghai");
JAL.addDestination("Seoul");
JAL.addDestination("Hong Kong");
JAL.addDestination("Jedha");

     
        
    }
    
    
    public void check(){
        
        
              
        LocalDate currentDate = LocalDate.now();
               
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();  
        
        Scanner reader = new Scanner(System.in);
                 //create class instance for month of departure
 
        System.out.println("Welcome to Econosky:");
        System.out.println("====================");
        System.out.println("Please input  a departure date (yyyy-mm-dd):");
        String departureDate = reader.nextLine();
        if (isValidDate(departureDate) == false)
        {
            System.out.println("date is not valid, please try again");
            check();
            return;
        }
        int depMonth = Integer.parseInt(departureDate.substring(5,7));
        int depYear = Integer.parseInt(departureDate.substring(0,4));
        int depDay = Integer.parseInt(departureDate.substring(8,10));
         // Create LocalDate object for the input date
        LocalDate inputDate = LocalDate.of(depYear, depMonth, depDay);
        
        // Get the current date
        LocalDate currentDay = LocalDate.now();
        
        //6 months from now date
        LocalDate sixMonthsLater = currentDay.plusMonths(6);
        
         // Check if the input date is within 6 months from now
        if (!inputDate.isBefore(currentDate) && !inputDate.isAfter(sixMonthsLater)) {
            System.out.println("Valid dates");
        } else {
            System.out.println("Date must be in the future and/or within 6 months of booking");
            check();
            return;   
        }
        
        
       System.out.println("How many passengers?:");
       int passengers = reader.nextInt();
       
        
        System.out.println("Please select booking class, 1 for economy, 2 for premium economy, 3 for buisness");
        int bookingClass = reader.nextInt();

 
  
     
        System.out.println("Select Package");
        switch(bookingClass){
        case 1: 
        System.out.println("9-Basic: A no-frills option with minimal amenities. No cancellation or changes allowed. Base Price:300");
        System.out.println("8-Flex:Includes flexible cancellation and date changes with some additional legroom. Base Price:360");
        System.out.println("7-Plus: Includes a bit more comfort, such as extra legroom, priority boarding, and flexibility with changes.Base Price:420");
        break;
        case 2:
        System.out.println("6-Basic: Standard premium economy seat, priority boarding, and enhanced meal options. No cancellations allowed.Base Price:500 ");
        System.out.println("5-F1ex: Includes seat upgrades, more flexible cancellation and changes, priority check-in.Base Price:642");
        System.out.println("4-Plus: Offers extra legroom, lounge access, additional baggage allowance, and priority boarding with full flexibility for cancellations and changes.Base Price:784");
        break;
        case 3:
        System.out.println("3-Basic: Standard business class seat with in-flight meals and entertainment. Limited flexibility with cancellations.Base Price:1100");
        System.out.println("2- Flex: More flexible with cancellations, additional baggage, access to airport lounges, and more premium meal options.Base Price:1400");
        System.out.println("1- Premium: Includes full access to airport lounges, priority check-in, wider seating, exclusive meal options, and greater flexibility with cancellations and changes.Base Price:1700");
        break;
        
        
        
    }bookingClass = reader.nextInt();
        reader.nextLine();
        System.out.println("Please select departure:");
        String dep = reader.nextLine();
        
        
        if (manage.tiers.get(dep) == null)
        {
            System.out.println("invalid departure");
            check();
            return;
        }
        
        System.out.println("Please select destination:");
        String arr = reader.nextLine();
        if (manage.tiers.get(arr) == null)
        {
            System.out.println("invalid destination");
            check();
            return;
        }
        
        
        price charge = new price(bookingClass);
        //begin checking to see what flights occur on the dates
        manage.flightSchedule("Star Alliance",depMonth,depDay);
        manage.flightSchedule("Sky Team",depMonth,depDay);
        manage.flightSchedule("One World",depMonth,depDay);
        
        //loop through every airline in star alliance
        //key is current airline
        flightNet netStar = net;
        flightNet netSky = net;
        flightNet netOne = net;
        for(String key: manage.starAlliance.keySet())
        {
            for (int i = 0; i < (manage.starAlliance.get(key)).validPairs.size();i++)
            {
                String dep2 = (manage.starAlliance.get(key)).validPairs.get(i);
                String arr2 = (manage.starAlliance.get(key)).validPairs2.get(i);
                System.out.printf("Departure:%s | Arrival %s\n",dep2,arr2);
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                double premium = (manage.starAlliance.get(key)).premium;
                System.out.println("premium\\\\\\\\\\\\\\\\\\\\ "+premium);
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                netStar.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
        
         algo starAlliance = new algo(netStar,dep,arr);
         List<String> shortestPathStar = starAlliance.execute();
         List<String> airlinesStar = starAlliance.airlines;
         int starCost = starAlliance.newCost;
          //loop through every airline in sky team
        //key is current airline
       for(String key: manage.skyTeam.keySet())
        {
            for (int i = 0; i < (manage.skyTeam.get(key)).validPairs.size();i++)
            {
                String dep2 = (manage.skyTeam.get(key)).validPairs.get(i);
                String arr2 = (manage.skyTeam.get(key)).validPairs2.get(i);
                System.out.printf("Departure:%s | Arrival %s\n",dep2,arr2);
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                double premium = (manage.skyTeam.get(key)).premium;
                System.out.println("premium\\\\\\\\\\\\\\\\\\\\ "+premium);
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                netSky.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
        
         algo skyTeam = new algo(netSky,dep,arr);
         List<String> shortestPathSky = skyTeam.execute();
         List<String> airlinesSky = skyTeam.airlines;
         int skyCost = skyTeam.newCost;
         
                   //loop through every airline in one world
        //key is current airline
       for(String key: manage.oneWorld.keySet())
        {
            for (int i = 0; i < (manage.oneWorld.get(key)).validPairs.size();i++)
            {
                String dep2 = (manage.oneWorld.get(key)).validPairs.get(i);
                String arr2 = (manage.oneWorld.get(key)).validPairs2.get(i);
                System.out.printf("Departure:%s | Arrival %s\n",dep2,arr2);
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                double premium = (manage.oneWorld.get(key)).premium;
                System.out.println("premium\\\\\\\\\\\\\\\\\\\\ "+premium);
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                netOne.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
        
         algo oneWorld = new algo(netOne,dep,arr);
         List<String> shortestPathOne = oneWorld.execute();
         List<String> airlinesOne = oneWorld.airlines;
         int oneCost = oneWorld.newCost;
         if(shortestPathStar.size() ==0 && shortestPathSky.size() ==0 && shortestPathOne.size() ==0 )
         {
             System.out.println("The selected dates and destinations have no possible combination, please try again");
             return;
         }
         
         List<String> newPath = null;
         List<String> airlinePath = null;
         Integer cost = null;
         //priorities star alliance over other carriers
         if (starAlliance.newCost >= skyTeam.newCost && starAlliance.newCost >= oneWorld.newCost)
         {
             newPath = shortestPathStar;
             airlinePath = airlinesStar;
             cost = starCost;
         }
         else if (skyTeam.newCost >= starAlliance.newCost && skyTeam.newCost >= oneWorld.newCost)
         {
             newPath = shortestPathSky;
             airlinePath = airlinesSky;
             cost=skyCost;
         }
         else if (oneWorld.newCost >= skyTeam.newCost && oneWorld.newCost >= skyTeam.newCost)
         {
          newPath = shortestPathOne;
          airlinePath = airlinesOne;
          cost = oneCost;
         }
         System.out.println("================================");
         System.out.println("Intenary Details");
         System.out.println(newPath.get(0));
         for (int i = 0; i < airlinePath.size();i++)
         {
             System.out.printf("Through %s\n",airlinePath.get(i));
             System.out.println(newPath.get(i+1));
             
         }
         
         System.out.printf("Total cost is:%d\n",(cost*passengers));
         
         
    }
    
    
    
    
     
    public static boolean isValidDate(String dateStr) {
        try {
            
            LocalDate.parse(dateStr);
            return true;  
        } catch (DateTimeParseException e) {
           
            return false;
        }
    }

    
    
  
}

