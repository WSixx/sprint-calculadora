package br.com.dani.calculo;

import br.com.lucad.Operacoes;
import br.com.lucad.utils.Utils;

public class Calculos extends Utils implements Operacoes  {
    
	public void Calculos() {
	
	}
   
	
	@Override
	public int soma(int number1, int number2) {
		printLn ("Soma:  " +(number1+number2));
		return number1+number2;
	}

	@Override
	public int subtracao(int number1, int number2) {
		printLn ("Subtra��o:  " +(number1-number2));
		return number1-number2;
	}

	@Override
	public int multiplicacao(int number1, int number2) {
		printLn ("Multiplica��o:  " +(number1*number2));
		return number1*number2;
	}

	@Override
	public int divisao(int number1, int number2) {
		printLn ("Divis�o:  " +(number1/number2));
		return number1/number2;
	}

}
