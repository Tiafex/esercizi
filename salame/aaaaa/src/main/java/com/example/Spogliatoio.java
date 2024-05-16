package com.example;

public class Spogliatoio
{
private int posti=1;

public Spogliatoio()
{

    this.posti=posti;
}

public synchronized void entra() 
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

public synchronized void esci()
{
  posti++; 
  notifyAll();
    
}




}

