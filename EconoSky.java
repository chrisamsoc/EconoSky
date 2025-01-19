/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.econosky;

/**
 *
 * @author chris
 */

import java.util.*;
public class EconoSky {

    public static void main(String[] args) {
        
    
         flightNet manage = new flightNet();
        
        // Add cities to the network
        manage.addCity("YYZ");
        manage.addCity("YUL");
        manage.addCity("YVR");
        manage.addCity("STC");
        manage.addCity("SFO");
        manage.addCity("JFK");
        manage.addCity("MIA");
       
      
        manage.addFlight("YYZ","YVR",200,"Air Canada");
        manage.addFlight("YYZ","MIA",100,"Air Canada");
         manage.addFlight("YUL","YYZ",5,"asff");
        manage.addFlight("YUL","YYZ",2,"Lufthansa");
       
        manage.addFlight("YUL","JFK",10000,"Lufthansa");
        manage.addFlight("YVR","STC",10,"BA");
        manage.addFlight("STC","SFO",1,"BA");
        manage.addFlight("SFO","JFK",300,"AA");
        manage.addFlight("MIA","JFK", 5000,"AA");
        
        
        algo lah = new algo(manage,"YUL","MIA");
         // Find the shortest path from New York to San Francisco
        List<String> shortestPath = lah.execute();
        
        // Print the shortest path
        
        
          for (int k=0; k < (shortestPath.size() -1);k++)
        {
            String dep = shortestPath.get(k);
            String arr = shortestPath.get(k+1);
            String key = dep+"|"+arr;
            String airline = lah.object.routes.get(key);
            System.out.println(dep+" "+arr);
            System.out.println("Airline:"+airline);
        }
          
        System.out.println(" ");
        
        System.out.println("");
    
        
        
        
        
        
        System.out.println("=========================================================");
        
        flightManager lyh = new flightManager();
        
        airline AC = new airline("Air Canada","Edmonton","Star Alliance",1.2);
        AC.addDestination("Regina");
        AC.addDestination("London");
        
        
        organize aa = new organize();
        aa.check();
        
       
      
    }
}