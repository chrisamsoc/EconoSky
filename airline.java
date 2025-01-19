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
public class airline {
    
    private String name;
    private String hub;
    private String alliance;
    public double premium;
    
    public ArrayList<String> destinations = new ArrayList();
    
    //array list containing departures 
    public ArrayList<String> validPairs = new ArrayList();
    
       //array list containing arrivals
    public ArrayList<String> validPairs2 = new ArrayList();
    //premiumFactor influences base cost of flights
    public airline(String name, String hub, String alliance, double premiumFactor)
    {
        this.name=name;
        this.hub=hub;
        this.alliance=alliance;
        this.premium = premiumFactor;
    }
    
    public void addDestination(String destination)
    {
        destinations.add(destination);
    }
    
    public String getAlliance()
    {
        return this.alliance;
    }
    
    public String getHub()
    {
        return this.hub;
    }
    
    public String getName()
    {
        return this.name;
    }
  
    
}
