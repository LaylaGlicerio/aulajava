package aulaexe12;
import java.util.Scanner;

/**
 *Exercício 12
 * Data: 21/08/2023
 * @author: Layla Glicério
 * Disciplina: Linguagem de Programação
 * Matéria: Estruturas de Controle (EXERCÍCIO DE FIXAÇÃO)
 * Atividade: 1. Escreva um programa para ler a idade de uma pessoa e mostrar se a pessoa é ou não maior de idade. A maioridade se
estabelece ao alcançar 18 anos.
 */

public class Aula12 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        
        if (idade > 18){
            System.out.println("Uau! Você é maior de idade!");
        }
        else if(idade < 18)
        {
            System.out.println("Que pena! Você ainda é menor de idade.");
        }   
    }
}
