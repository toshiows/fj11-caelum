package br.com.caelum.contas.main;

public class TesteString {

	public static void main(String[] args) {
		//String aula = new String("Aula Caelum Venancio"); //Syntax sugar
		
		//se forçar o new e comparar com == sao 2 enderecos de memoria diferentes
		
		String aula = "Aula Caelum Venancio";
		String aula2 = "Aula Caelum Venancio";

		
		if(aula == aula2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferente");
		}
		
		System.out.println(aula2);
		System.out.println(aula);
		
		String x = aula.toUpperCase();
		System.out.println("Caixa alta: " +  x);

	}

}
