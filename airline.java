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
    
    
    public ArrayList<String> destinations = new ArrayList();
    
    //hashmap contains valid destination pairs
    public HashMap<String,String> validPairs = new HashMap();
    
    public airline(String name, String hub, String alliance)
    {
        this.name=name;
        this.hub=hub;
        this.alliance=alliance;
        
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
