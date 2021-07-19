package br.com.lucad.views;

import br.com.Validacoes;
import br.com.dani.calculo.Calculos;
import br.com.lucad.utils.Utils;

import java.util.Scanner;

public class Menu extends Utils {

    public void menuInit() {
        Scanner userInput = new Scanner(System.in);
        Calculos calculos = new Calculos();
        Validacoes validacoes = new Validacoes();
        menuEscolha(userInput, calculos, validacoes);
    }

    private void menuEscolha(Scanner userInput, Calculos calculos, Validacoes validacoes) {
        while (true) {
            printMenuOpcoes();
            int menu = validacoes.checkIsANumber(userInput);
            switch (menu) {
                case 1 -> calculos.soma(validacoes.checkIsANumber(userInput), validacoes.checkIsANumber(userInput));
                case 2 -> calculos.subtracao(validacoes.checkIsANumber(userInput), validacoes.checkIsANumber(userInput));
                case 3 -> calculos.multiplicacao(validacoes.checkIsANumber(userInput), validacoes.checkIsANumber(userInput));
                case 4 -> calculos.divisao(validacoes.checkIsANumber(userInput), validacoes.checkIsANumber(userInput));
                case 5 -> calculos.areaDoQuadrado(validacoes.checkIsANumber(userInput), validacoes.checkIsANumber(userInput));
                case 6 -> {
                    userInput.close();
                    System.exit(0);
                }
                default -> System.out.println("Entrada errada");
            }
        }
    }

    private void printMenuOpcoes() {
        System.out.println("1-SOMA\n2-SUBTRACAO\n3-MULTIPLICACAO\n4-DIVISAO\n5-Area Quadrado\n6-Sair");
    }

}
