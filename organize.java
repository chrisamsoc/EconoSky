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
    
    
    //define flight manager class to deal with schedules of airlines
    flightManager manage = new flightManager();
    //create instances of flightNetworks for each alliance, storing city locations
    flightNet netStar = new flightNet();
    flightNet netSky = new flightNet();
    flightNet netOne = new flightNet();
    //create instances of airline class for each airline
    airline AC = new airline("Air Canada","Toronto","Star Alliance",1.2);
    airline LH = new airline("Lufthansa","Frankfurt","Star Alliance",0.9);
   airline SW = new airline("Swiss Airlines","Zurich","Star Alliance",1.3);
    airline SN = new airline("Singapore Airlines","Singapore","Star Alliance",1.3);
    airline UA = new airline("United Airlines","Chicago","Star Alliance",0.9);
    airline ANA = new airline("ANA","Tokyo","Star Alliance",1.25);
    airline PA = new airline("Phillipine Airlines","Manilla","Star Alliance",0.8);
    airline ACh = new airline("Air China","Beijing","Star Alliance",0.7);
    airline KLM = new airline("KLM","Amsterdam","Sky team",035);
    airline AF = new airline("Air France","Paris","Sky team",1.2);
    airline DAL = new airline("Delta Airlines","Atlanta","Sky team",0.9);
    airline KAL = new airline("Korean Airlines","Seoul","Sky team",1.25);
    airline CE = new airline("China Eastern Airlines","Shanghai","Sky team",1);
    airline SA = new airline("Saudi Airlines","Jedha","Sky team",0.8);
    airline ITA = new airline("ITA","Rome","Sky team",1);
    airline BA = new airline("British Airways","London","One World",0.7);
    airline IB = new airline("Iberia Airlines","Madrid","One World",0.9);
    airline FN = new airline("Finnair","Helsinki","One World",1);
    airline CP = new airline("Cathay Pacific","Hong Kong","One World",1.1);
      airline AA = new airline("American Airlines","New York","One World",0.8);
        airline JAL = new airline("Japan Airlines","Tokyo","One World",1.2); 
        
        //constructor
    public organize()
    {
        //add cities to network
       for(String key: manage.tiers.keySet())
       {
           netStar.addCity(key);
           netSky.addCity(key);
           netOne.addCity(key);
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
        
        
        
     
           
        
        
        //adds destinations for each airline, respecively based on location and prestige of airline
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
        
        gui player = new gui();
        
         //instance of LocalDate class used to pull curent time
        LocalDate currentDate = LocalDate.now();
          //get currentyear and current month for calculations of date and time, useful to determine if to increase price or not
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();  
        //instance of scanner class
        Scanner reader = new Scanner(System.in);
                 //create class instance for month of departure
          //try and except loop to deal with bad errors
         try{        
             //welcomes user and asks for departure date
         gui create = new gui();
         
        String[] output = create.start("please input date yyyy-mm-dd","Please enter number of passengers (Maximum of 9)","Welcome to Econosky");
        
       
        String departureDate = output[0];
        //cehecks if it is a possible departure date
        if (isValidDate(departureDate) == false)
        {
            create.message("date is not valid, please try again");
            
            check();
            return;
        }
        //takes string and splices it 
        int depMonth = Integer.parseInt(departureDate.substring(5,7));
        int depYear = Integer.parseInt(departureDate.substring(0,4));
        int depDay = Integer.parseInt(departureDate.substring(8,10));
         // Create LocalDate object for the input date
        LocalDate inputDate = LocalDate.of(depYear, depMonth, depDay);
        
        // current day 
        LocalDate currentDay = LocalDate.now();
        
        //6 months from now date
        LocalDate sixMonthsLater = currentDay.plusMonths(6);
       
        
         // Check if the input date is within 6 months from now
        if (!inputDate.isBefore(currentDate) && !inputDate.isAfter(sixMonthsLater)) {
            
        } else {
            create.message("Date invalid, must be at a maximum of 6 months in the future");
            check();
            return;   
        }
        
        //asks for passengers 
       System.out.println("How many passengers?:");
       int passengers = Integer.parseInt(output[1]);
       //checks to see if more passengers then allowed
       if (passengers > 9)
       {
           
           create.message("There may not be more than 9 passengers");
           check();
           return;
       }
        
       //asks for booking class
        System.out.println("Please select booking class, 1 for economy, 2 for premium economy, 3 for buisness");
        
        int bookingClass = Integer.parseInt(create.start("Please select booking class, 1 for economy, 2 for premium economy, 3 for buisness","Select a seat class"));
        if (bookingClass !=1 && bookingClass != 2 && bookingClass != 3)
        {
            
            create.message("you have not selected a proper booking class, as punishment restart the booking proccess");
            check();
            return;
        }
 
        //asks user to input desire package option, uses switch cases to do so
     
        System.out.println("Select Package");
        
        switch(bookingClass){
        case 1: 
            
        bookingClass = Integer.parseInt(create.start("9-Basic,8-Flex,7-Plus","Select a booking Package"));
        
        break;
        case 2:
        bookingClass = Integer.parseInt(create.start("6-Basic,5-Flex,4-Plus","Select a booking Package"));
        break;
        case 3:
        bookingClass = Integer.parseInt(create.start("3-Basic,2-Flex,1-Premium","Select a booking Package"));
        break;
        
        
        
    }
       
   
        
        //checks for valid input
       if (bookingClass > 9 || bookingClass <1) 
       {
           
           create.message("you have not selected a proper package, as punishment restart the booking proccess");
           check();
           return;
       }
        //informs users of serviced cities
       
        ArrayList<String> locations = new ArrayList();
       
        for (String key : manage.tiers.keySet())
        {
            locations.add(key);
        }
        //asks for depature and checks if valid 
        System.out.println("Please select departure:");
        String dep = create.select(locations,"Select Departure location" );
        
        
        if (manage.tiers.get(dep) == null)
        {
            System.out.println("invalid departure");
            check();
            return;
        }
       //asks for desitnation and checks if is valid
        System.out.println("==========================");
        System.out.println("Please select destination:");
        String arr = create.select(locations,"Select Destination location" );
        
        if (manage.tiers.get(arr) == null)
        {
            create.message("invalid destination");
            check();
            return;
        }
       
        //creates instance of price class to determine price for flights
        price charge = new price(bookingClass);
        //begin checking to see what flights occur on the dates
        //checks for each alliance as they have seperate networks
        manage.flightSchedule("Star Alliance",depMonth,depDay);
        manage.flightSchedule("Sky Team",depMonth,depDay);
        manage.flightSchedule("One World",depMonth,depDay);
        
        //loop through every airline in star alliance
        //key is current airline
      
        
        for(String key: manage.starAlliance.keySet())
        {
            //for each airline loop through possible flights and add to network 
            for (int i = 0; i < (manage.starAlliance.get(key)).validPairs.size();i++)
            {
                
                String dep2 = (manage.starAlliance.get(key)).validPairs.get(i);
                String arr2 = (manage.starAlliance.get(key)).validPairs2.get(i);
                
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                //calculates premium based on inputed information of airline
                double premium = (manage.starAlliance.get(key)).premium;
                //calculates ticket cost using price class, takes into acount date and tier levels
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                //adds flight to network 
                netStar.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
        //creates instance of algo class to search through star alliance's network 
         algo starAlliance = new algo(netStar,dep,arr);
         //creates arrays for the shortest path and airlines throughout the proccess
         List<String> shortestPathStar = starAlliance.execute();
         List<String> airlinesStar = starAlliance.airlines;
         //gets cost of itenary
         int starCost = starAlliance.newCost;
          //loop through every airline in sky team
        //key is current airline
       for(String key: manage.skyTeam.keySet())
        {
            //for each airline loop through possible flights and add to network 
            for (int i = 0; i < (manage.skyTeam.get(key)).validPairs.size();i++)
            {
                
                String dep2 = (manage.skyTeam.get(key)).validPairs.get(i);
                String arr2 = (manage.skyTeam.get(key)).validPairs2.get(i);
                
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                //calculates premium based on inputed information of airline
                double premium = (manage.skyTeam.get(key)).premium;
                 //calculates ticket cost using price class, takes into acount date and tier levels
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                  //adds flight to network 
                netSky.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
           //creates instance of algo class to search through sky team network 
         algo skyTeam = new algo(netSky,dep,arr);
          //creates arrays for the shortest path and airlines throughout the proccess
         List<String> shortestPathSky = skyTeam.execute();
         //creates arrays for the shortest path and airlines throughout the proccess
         List<String> airlinesSky = skyTeam.airlines;
          //gets cost of itenary
         int skyCost = skyTeam.newCost;
         
                   //loop through every airline in one world
        //key is current airline
       for(String key: manage.oneWorld.keySet())
        {
             //for each airline loop through possible flights and add to network 
            for (int i = 0; i < (manage.oneWorld.get(key)).validPairs.size();i++)
            {
                String dep2 = (manage.oneWorld.get(key)).validPairs.get(i);
                String arr2 = (manage.oneWorld.get(key)).validPairs2.get(i);
                
                int tierDep = manage.tiers.get(dep2);
                int tierArr = manage.tiers.get(arr2);
                   //calculates premium based on inputed information of airline
                double premium = (manage.oneWorld.get(key)).premium;
                //calculates ticket cost using price class, takes into acount date and tier levels
                int ticketCost = charge.determine(currentMonth, depMonth,currentDay,depDay, tierDep, tierArr,premium );
                //add flight to respective network
                netOne.addFlight(dep2,arr2,ticketCost,key);
                

                

            }
        }
          //creates instance of algo class to search through one world network 
         algo oneWorld = new algo(netOne,dep,arr);
          //creates arrays for the shortest path and airlines throughout the proccess
         List<String> shortestPathOne = oneWorld.execute();
         //creates arrays for the shortest path and airlines throughout the proccess
         List<String> airlinesOne = oneWorld.airlines;
             //gets cost of itenary
         int oneCost = oneWorld.newCost;
         if(shortestPathStar.size() ==0 && shortestPathSky.size() ==0 && shortestPathOne.size() ==0 )
         {
            
             create.message("The selected dates and destinations have no possible combination, please try again");
             return;
         }
         
         //creates instance of algo class to search through sky team network 
         List<String> newPath = null;
               //creates arrays for the shortest path and airlines throughout the proccess
         List<String> airlinePath = null;
                //creates arrays for the shortest path and airlines throughout the proccess
         
       //output itenary details 
         System.out.println("================================");
         System.out.println("Intenary Details Star Alliance");
         System.out.println(shortestPathStar.get(0));
         //outputs for star alliance
         ArrayList<String> pathFound1 = new ArrayList();
         pathFound1.add("Star Alliance");
         for (int i = 0; i < airlinesStar.size();i++)
         {
             System.out.printf("Through %s\n",airlinesStar.get(i));
             pathFound1.add("Through " + airlinesStar.get(i));
             System.out.println(shortestPathStar.get(i+1));
             pathFound1.add(shortestPathStar.get(i+1));
             
         }
         
         System.out.printf("Total cost is:%d\n",(starCost*passengers));
         String mes1 = Integer.toString(starCost*passengers);
                  System.out.println("================================");
                  //outputs for sky team
         System.out.println("Intenary Details SkyTeam");
         System.out.println(shortestPathSky.get(0));
         
         ArrayList<String> pathFound2 = new ArrayList();
         pathFound2.add("Sky Team");
         for (int i = 0; i < airlinesSky.size();i++)
         {
             System.out.printf("Through %s\n",airlinesSky.get(i));
             pathFound2.add("Through " + airlinesSky.get(i));
             System.out.println(shortestPathSky.get(i+1));
             pathFound2.add(shortestPathSky.get(i+1));
         }
         
         String mes2 =  Integer.toString(skyCost*passengers);
         int skyteamCost = skyCost*passengers;
         if (skyCost*passengers > 15000){  mes2 = Integer.toString(skyCost*passengers/10);
         skyteamCost = skyCost*passengers/10;
         
         }
             
                 
         
         
          System.out.println("================================");
           //outputs for one world
         System.out.println("Intenary Details oneWorld");
         System.out.println(shortestPathOne.get(0));
         
         ArrayList<String> pathFound3 = new ArrayList();
         pathFound3.add("One World");
         for (int i = 0; i < airlinesOne.size();i++)
         {
             System.out.printf("Through %s\n",airlinesOne.get(i));
             pathFound3.add("Through  " + airlinesOne.get(i));
             System.out.println(shortestPathOne.get(i+1));
             pathFound3.add(shortestPathOne.get(i+1));
             
         }
         
         
         System.out.printf("Total cost is:%d\n",(oneCost*passengers));
         String mes3 = Integer.toString(oneCost*passengers);
         //asks user to select an option they like
         System.out.println("Please select an option: \n1-Star Alliance\n2-SkyTeam\n3-OneWorld");
        
         int choice = Integer.parseInt(create.tell(pathFound1,mes1,pathFound2,mes2,pathFound3,mes3));
         //calculates total cost including tax, uses switch statements
         String cost = "";
         switch(choice){
             case 1:
              System.out.println("You have selected Star Alliance");
              System.out.printf("Your total cost including tax is $%.2f",starCost*1.13*passengers);
              cost = String.format("Your total cost including tax is $%.2f",starCost*1.13*passengers);
              create.message("You have selected Star Alliance "+ cost);
             break;
              case 2:
              System.out.println("You have selected Sky Team");
              System.out.printf("Your total cost including tax is $%.2f",skyteamCost * 1.13);
               cost = String.format("Your total cost including tax is $%.2f",starCost*1.13*passengers);
              create.message("You have selected Sky Team "+ cost);
             break;
              case 3:
              System.out.println("You have selected One World");
              System.out.printf("Your total cost including tax is $%.2f",oneCost*1.13*passengers);
              System.out.printf("Your total cost including tax is $%.2f",skyteamCost * 1.13);
               cost = String.format("Your total cost including tax is $%.2f",starCost*1.13*passengers);
              create.message("You have selected One World "+ cost);
             break;
         }
         //checks for valid input
         
         
         if (choice > 3 || choice < 1)
         {
             create.message("You have not seleted a proper itenary, as such you get to restart the booking proccess :) as punishment");
             
             check();
             return;
             
         }
         //exception ccatcher to deal with errors
           }catch(Exception e)
         {
             
             check();
             return;
         }
             
    }
    
    
    
    
     //checks to see if date is not random gibirsh or if date is in teh past
    public static boolean isValidDate(String dateStr) {
        try {
            
            LocalDate.parse(dateStr);
            return true;  
        } catch (DateTimeParseException e) {
           
            return false;
        }
    }

    
    
  
}
