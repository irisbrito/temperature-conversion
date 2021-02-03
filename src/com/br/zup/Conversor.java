package com.br.zup;

public class Conversor {
    double C;


    public double calcularFahrenheit(){
       return C * 1.8 + 32;
    }

    public double calcularKelvin(){
        return C + 273.15;
    }

    public double calcularReaumur(){
        return C * 0.8;
    }

    public double calcularRankine(){
        return C * 1.8 + 32 + 459.67;
    }
}
