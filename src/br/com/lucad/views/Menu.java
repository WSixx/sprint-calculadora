package br.com.lucad.views;

import java.util.Scanner;

public class Menu {
	 

    public static void main(String [] args) {
    	
			
	}

	public void menuInit(){
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("1-SOMA\n2-SUBTRACAO\n3-MULTIPLICACAO\n4-DIVISAO\n5-Sair");
            String menu = userInput.nextLine();
            switch (menu) {
                case "1": {
                    //TODO: SOMA
                    break;
                }
                case "2": {
                    //TODO: SUBTRAÇÃO
                    break;
                }
                case "3": {
                    //TODO: MULTIPLICAÇÃO
                    break;
                }
                case "4": {
                    //TODO: DIVISÃO
                    break;
                }
                case "5": {
                    System.exit(0);
                }
            }
        }
    }

}
