package br.com;

import br.com.lucad.OpcoesCalculo;
import br.com.lucad.utils.Utils;
import br.com.lucad.views.Menu;

import java.util.Scanner;

public class Validacoes extends Utils {

    public void checkNumber2IsZeroOrCalculate(int number1, int number2) {
        if (number2 <= 0) System.out.println("Nao pode dividir por 0");
        else printResultado((number1 / number2), OpcoesCalculo.DIVISAO);
    }

    public int checkIsANumber(Scanner userInput) {
        System.out.println("digite um numero: ");
        if (userInput.hasNextInt()) {
            return userInput.nextInt();
        } else {
            System.out.println("Digite Apenas Numeros!!!");
            Menu menu = new Menu();
            menu.menuInit();
            return 6;
        }

    }

}
