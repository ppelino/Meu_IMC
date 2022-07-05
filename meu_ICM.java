package primeiro_project;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
    //Índice de Massa Corporal (peso dividido pelo quadrado da altura)
    Scanner leitor = new Scanner(System.in);
    String nome = "Edson";
    System.out.println("Insira o seu peso: ");
    double peso = leitor.nextDouble();
    System.out.println("Insira a sua altura: ");
    double altura = leitor.nextDouble();
    double imc;
    imc = peso / (altura * altura);
    System.out.println("O imc de " + nome + " e de " + imc); 
    
    // Como o resultado do IMC é um número real, considerar apenas os dois números após os zeros. 
    // Por exemplo "0.002493", considerar apenas o 24,93
    

    }
}