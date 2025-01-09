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
        
      /**
        flightNet manage = new flightNet();
        
        manage.addCity("New_York");
        manage.addCity("Seattle");
        manage.addCity("Toronto");
        manage.addCity("Montreal");
        manage.addCity("London");
        manage.addCity("Dallas");
        manage.addCity("Miami");
        
        manage.addFlight("Toronto","Dallas",500);
        manage.addFlight("Toronto","London",1200);
        manage.addFlight("Toronto","Montreal",200);
        
        //montreal
        manage.addFlight("Montreal","New_York",350);
        manage.addFlight("Montreal","Seattle",500);
        
        
        
        manage.addFlight("London", "NewYork", 1500);
        
        
        manage.addFlight("Dallas","Seattle",800);
        
        
        manage.addFlight("Seattle","Miami", 650);
        
        manage.addFlight("New_York","Toronto",750);
        manage.addFlight("New_York","Dallas",325);
        manage.addFlight("New_York","Miami",500);
        
        manage.addFlight("Miami","Montreal",600);
        */
         flightNet manage = new flightNet();
        
        // Add cities to the network
        manage.addCity("New York");
        manage.addCity("Los Angeles");
        manage.addCity("Chicago");
        manage.addCity("San Francisco");
        
        // Add flights between cities (costs)
        manage.addFlight("New York", "Los Angeles", 300);
        manage.addFlight("Los Angeles", "Chicago", 150);
        manage.addFlight("Chicago", "San Francisco", 200);
        manage.addFlight("New York", "San Francisco", 90000); // Direct flight
        algo lah = new algo(manage,"New York","San Francisco");
         // Find the shortest path from New York to San Francisco
        List<String> shortestPath = lah.execute();
        
        // Print the shortest path
        System.out.println("Shortest path from New York to San Francisco:");
        for (String city : shortestPath) {
            System.out.print(city + " ");
        }
        
    }
}
