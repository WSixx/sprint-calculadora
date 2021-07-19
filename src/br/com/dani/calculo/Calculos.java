package br.com.dani.calculo;

import br.com.Validacoes;
import br.com.lucad.OpcoesCalculo;
import br.com.lucad.Operacoes;
import br.com.lucad.utils.Utils;

public class Calculos extends Utils implements Operacoes {

    public void Calculos() {
    }


    @Override
    public void soma(int number1, int number2) {
        printResultado((number1 + number2), OpcoesCalculo.SOMA);
    }

    @Override
    public void subtracao(int number1, int number2) {
        printResultado((number1 - number2), OpcoesCalculo.SUBTRACAO);
    }

    @Override
    public void multiplicacao(int number1, int number2) {
        printResultado((number1 * number2), OpcoesCalculo.MULTILICACAO);
    }

    @Override
    public void divisao(int number1, int number2) {
        Validacoes validacoes = new Validacoes();
        validacoes.checkNumber2IsZeroOrCalculate(number1, number2);
        printResultado((number1/number2), OpcoesCalculo.DIVISAO);
    }

    @Override
    public void areaDoQuadrado(int base, int altura) {
        printResultado((base * altura), OpcoesCalculo.BASE_QUADRADO);
    }


	@Override
	public void porcentagem(int number1, int number2) {
		printResultado((number1/number2 *100), OpcoesCalculo.PORCENTAGEM);
		
	}
}
