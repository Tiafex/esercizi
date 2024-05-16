package com.example;

public class Pista
{
    private int posti=4;
    

    public Pista()
    {
    
        this.posti=posti;
    }
    
    public synchronized void entrap() 
    {
      while (posti < 1 ) {
       try {
        wait();
       } catch (Exception e) {
        e.printStackTrace();
       }
    
      } 
      posti--; 
        
    }
    
    public synchronized void escip()
    {
      posti++; 
      notifyAll();
        
    }
    
    
    

}