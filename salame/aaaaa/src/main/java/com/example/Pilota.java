package com.example;

public class Pilota extends Thread
{
  private Spogliatoio s1;
  private Pista p1;
  private int contagiri = 0;
  
public Pilota(Spogliatoio s1, Pista p1)
{
    this.s1=s1;
    this.p1=p1;

}

@Override
public void run() {
   String nome = Thread.currentThread().getName();

    try {

        s1.entra();
        System.out.println("il pilota: " + nome + " sta indossando la tuta");
    Thread.sleep((int) (Math.random()*1000));
    s1.esci();
    System.out.println("il pilota: " + nome + "sta uscendo dallo spogliatoio");
    Thread.sleep((int) (Math.random()*1000));
    p1.entrap();
    System.out.println("il pilota: " + nome + "sta entrando nella pista");
    while (contagiri < 6) {
    Thread.sleep((int) (Math.random()*1000)+1000); 
    
    System.out.println("il pilota: " + nome + " ha fatto: "+ contagiri + "giri");
    contagiri++;
    }
    
    p1.escip();
    System.out.println("il pilota: " + nome + " è uscito dalla pista");


    s1.entra();
    System.out.println("il pilota: "+ nome+ " è entrato nello spogliatoio e si toglie la tuta");

    Thread.sleep((int) (Math.random()*1000));
    s1.esci();
    System.out.println("il pilota: "+ nome+ " è uscito dallo spogliatoio");
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}


}

