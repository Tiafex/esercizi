package com.example;

public class Main {
    public static void main(String[] args) {
        Spogliatoio s = new Spogliatoio();
        Pista p = new Pista();

        for(int i =0; i < 8; i++)
        {
            Pilota t1 = new Pilota(s, p);
            t1.start();
        }
        
    }
}