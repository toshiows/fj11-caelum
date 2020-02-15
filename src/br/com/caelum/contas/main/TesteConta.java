package br.com.caelum.contas.main;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

class TesteConta {
	public static void main(String[] args) {
		/*Conta c1 = new Conta("Marcos");
		c1.setTitular("Lucas");
		c1.setNumero(12542);
		c1.setAgencia("121-01");
		c1.depositar(1500.00);
		// c1.titular = "Lopes";

		// Data dt = new Data();

		c1.setDataAbertura(new Data());
		c1.getDataAbertura().dia = 05;
		c1.getDataAbertura().mes = 05;
		c1.getDataAbertura().ano = 2010;

		c1.sacar(200.00);
		c1.depositar(50.00);

		System.out.println(c1.recuperaDadosParaImpressao());

		System.out.println();
		Conta c2 = new Conta();

		System.out.println();
		Conta c3 = new Conta("Jose", 145874, 300.00);
		c3.setDataAbertura(new Data());
		c3.getDataAbertura().dia = 21;
		c3.getDataAbertura().mes = 01;
		c3.getDataAbertura().ano = 1998;

		System.out.println(c3.recuperaDadosParaImpressao());
		*/
		
		Conta [] contas = new Conta[10];
		double soma = 0.0;
		
		for(int i = 0 ; i < contas.length; i ++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
			contas[i] = conta;
			soma += contas[i].getSaldo();
		}
		//System.out.println(contas[9].getSaldo());
		double media = soma / contas.length;
		System.out.println(media);
		
		System.out.println("-------------------------");
		
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String [] palavras = frase.split(" ");
		System.out.println(palavras.length);
		
		for(int i= palavras.length -1 ; i >= 0 ; i--) {
			System.out.print(palavras[i] +" ");
		}
		
		long t;
        t = Calendar.getInstance().getTimeInMillis();
        System.out.println("Tempo : " + (Calendar.getInstance().getTimeInMillis() - t));
        
        System.out.println("---------------------------------------");
        
        
        List<String> lista = new ArrayList<>();
        lista.add("Sergio");
        lista.add("Paulo");
        lista.add("Ana");
        lista.add("Guilherme");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println("---------------------------------------");
        
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        
        int total = 30000;
        
        for(int i = 0; i < total; i++) {
        	teste.add(i);
        }
        
        for(int i = 0; i < total; i++) {
        	teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
	}
}