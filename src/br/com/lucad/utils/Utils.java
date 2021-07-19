package br.com.lucad.utils;

import br.com.lucad.OpcoesCalculo;

public abstract class Utils {

    public void printResultado(int message, OpcoesCalculo types) {
        switch (types) {
            case SOMA -> System.out.println("\n" + "Soma: " + message + "\n");
            case SUBTRACAO -> System.out.println("\n" + "Subtracao: " + message + "\n");
            case DIVISAO -> System.out.println("\n" + "Dividao: " + message + "\n");
            case MULTILICACAO -> System.out.println("\n" + "Multiplicacao: " + message + "\n");
            case BASE_QUADRADO -> System.out.println("\n" + "Area quadrado: " + message + "\n");
        }

    }

}
