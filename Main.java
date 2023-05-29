package exercicioWhile;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome, sexo, maisAlto;
		double altura, peso, pesoMedio, somaPeso,maior,percentHomem;
	    double alturaMedia;
		
	    System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		
		int contHomem = 0;
		int totalPessoas = 0;
		int contMulheres = 0;
		double sAlturaMulheres = 0;
		somaPeso = 0;
		maior = 0;
		
		maisAlto = "";
		
		for (int i=1; i<=n; i++) {
			 System.out.println("Digite os dados do atleta numero "+i);
			 sc.nextLine();
			 System.out.print("Nome: ");
			 nome = sc.nextLine();
			 
			 
			 System.out.print("Sexo: ");
			 sexo = sc.next();
			 while (!sexo.equals("f") && !sexo.equals("m")) {
				 System.out.print("Valor invalido! Favor digitar F ou M:");
				 sexo = sc.next();
			 }
			 if (sexo.equals("m")){
				 contHomem += 1;
			 }else {
				 contMulheres += 1;
			 }
			 
			 System.out.print("Altura: ");
			 altura = sc.nextDouble();
			 while (altura <= 0) {
				 System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				 altura = sc.nextDouble();
			 }
			 if (altura > maior) {
				 
				 maior = altura;
				 maisAlto = nome;
				 
			 }
				 
			 if (sexo.equals("f")) {
				 sAlturaMulheres += altura;
			 }
			 System.out.print("Peso: ");
			 peso = sc.nextDouble();
			 while (peso <= 0) {
				 System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				 peso = sc.nextDouble();
			 }
			 somaPeso += peso;
			 totalPessoas += 1;
		}
		
		percentHomem =(double) contHomem * 100 / totalPessoas;
		pesoMedio = somaPeso / n;
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n",pesoMedio);
		System.out.printf("Atleta mais alto: %s%n",maisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n",percentHomem);
		if (contMulheres > 0) {
			alturaMedia = sAlturaMulheres / contMulheres;
			System.out.printf("Altura média das mulheres: %.2f%n", alturaMedia);
		}else {
			System.out.println("Não há mulheres cadastradas");
		}
		
		
		
	    
		sc.close();

	}

}
