package com.br.zup;

public class Main {
    /* Escreva um programa que, com base em uma temperatura em graus celsius,
	 a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
	 seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        IO entradaESaida = new IO();
        conversor.C = entradaESaida.pedirUmDado("Digite uma temperatura em Celsius").nextDouble();
        entradaESaida.saidaDeDados("A temperatura " + conversor.C + " convertida para Fahrenheit é " + conversor.calcularFahrenheit());
        entradaESaida.saidaDeDados("A temperatura " + conversor.C + " convertida para Kelvin é " + conversor.calcularKelvin());
        entradaESaida.saidaDeDados("A temperatura " + conversor.C + " convertida para Réaumur é " + conversor.calcularReaumur());
        entradaESaida.saidaDeDados("A temperatura " + conversor.C + " convertida para Rankine é " + conversor.calcularRankine());

    }
}
