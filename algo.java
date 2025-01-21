/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.econosky;

/**
 *
 * @author chris
 */


import java.util.*;
public class algo {
    
    public flightNet object;
    private String departure,arrival;
    public HashMap<String,String> airlinePath = new HashMap();
    public ArrayList<String> airlines = new ArrayList();
    public int newCost = 0;
    public List<String> path = new ArrayList();
    
    public algo(flightNet managa, String depName, String arrName)
    {
        this.object = managa;
        this.departure = depName;
        this.arrival = arrName;
        
        
        
    }
    
    public List<String> execute()
    {
        //list of unvisited cities
        List<String> unVisitedCities = this.object.getCities();
        //cheapest table
        HashMap<String,Integer> cheapest = new HashMap();
       //stores previosu cities
        HashMap<String,String> previous = new HashMap();
         PriorityQueue<cityCost> pq = new PriorityQueue<>();
        
       
        
        //sets all cities price to infinity
        for (String city : this.object.getCities()) {
           cheapest.put(city, Integer.MAX_VALUE);
        }
        
        //set current node to start node
        String currentNode = this.departure;
        //set current node price to 0 because free
        cheapest.replace(currentNode,0);
        
        //adds start city to priority queue
        pq.offer(new cityCost(currentNode,0));
        
        
        //while the priority queue is not empty
        while(!(pq.isEmpty()))
        {
            cityCost current = pq.poll();
            //setting currentcity to be whatever the city name is in cityCost class
            String currentCity = current.city;
            int currentCost = current.cost;
            
            //if current node is the arrival node, then we here, therefore stop loop
            if (currentCity.equals(this.arrival))
            {
                break;
                
                //get other neighbors and cost of current city
                
                
            }
            //create instance of city object to pull out the data
                
            City currentCityObject = this.object.getCity(currentCity);
             for (String neighbor : currentCityObject.getNeighbor().keySet()) {
                newCost = currentCost + currentCityObject.getCost(neighbor);
                
                // If path that is shorter is found
                if (newCost < cheapest.get(neighbor)) {
                    cheapest.put(neighbor, newCost);
                    previous.put(neighbor, currentCity);
                    pq.offer(new cityCost(neighbor, newCost));
                    
                }
            }
            
            
        }
        
        //rebuilding path from end to start
        
        String current = this.arrival;
            // Traverse back using the previousCities map to reconstruct the path
        while (current != null) {
            path.add(current);
            //we do this as once we get to start city, it has  no neighbor that leads to another path 
            current = previous.get(current);
        }
        
        
            // Reverse path so it not in wrong direction
        Collections.reverse(path);
              
        for (int k=0; k < (path.size() -1);k++)
        {
            String dep = path.get(k);
            String arr = path.get(k+1);
            String key = dep+"|"+arr;
            String airline = this.object.routes.get(key);
            airlines.add(airline);
            
        }
        
        return path;
        
        
               
    }
    
     private static class cityCost implements  Comparable<cityCost>
     {
         String city;
         int cost;
         
        cityCost(String city2, int cost2)
        {
            this.city = city2;
            this.cost = cost2;
        }
         
        
        @Override
        public int compareTo(cityCost other)
        {
             return Integer.compare(this.cost, other.cost);
        }
     }
       
        
    
}


