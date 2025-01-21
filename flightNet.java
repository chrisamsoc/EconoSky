/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.econosky;

/**
 *
 * @author chris
 */

 import java.util.HashMap; 
 import java.util.ArrayList;
import java.util.Set;
public class flightNet {
    
    
    
    public HashMap<String,String> routes = new HashMap();
    
    
    private HashMap<String,City> cities;
    public int teer;
    
    public flightNet()
    {
        cities = new HashMap();
        
    }
    
    
    public void addCity(String cName)
    {
        //org part
        System.out.println(cName);
        cities.putIfAbsent(cName, new City(cName));
        
        
        
    }
    
    
    
    public void addFlight(String depName, String arrName,int cost,String airline)
    {
        //use Integer instead of int to deal with null stuff
        Integer exists = (cities.get(depName)).neighbor.get(arrName);
        
        
        if (depName.equals(arrName))
        {
            return;
        }
        else if (exists != null && exists > cost)
        {
             
            cities.get(depName).neighbor.remove(arrName);
           
        cities.get(depName).add(arrName,cost);
        String specialKey = depName+"|"+arrName;
        routes.put(specialKey, airline);

        }
        else if (exists!= null && exists < cost)
        {
            return;
        }
        else {
            
           
            cities.get(depName).add(arrName,cost);
            String specialKey = depName+"|"+arrName;
            routes.put(specialKey, airline);

        }
                
        
        
        
    }
    
    public void printCityNeighbors(String cityName) {
    City city = cities.get(cityName);
    if (city != null) {
       
    }
}
    
    public City getCity(String cName)
    {
        return cities.get(cName);
    }
    
    public ArrayList<String> getCities()
    {
        Set<String> keys2 = cities.keySet(); 
        ArrayList<String> keys = new ArrayList(keys2);
        return keys;
    }
    
    
    
}
