package aulaexe13;
import java.util.Scanner;

/**
 *Exercício 13
 * Data: 22/08/2023
 * @author: Layla Glicério
 * Disciplina: Linguagem de Programação
 * Matéria: Estruturas de Controle (EXERCÍCIO DE FIXAÇÃO)
 * Atividade: 2. Escreve um programa que leia um número e diga se esse número é par ou ímpar.
 */

public class Aula13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                int numero;
                
                System.out.println("Digite um numero inteiro:");
                numero = scanner.nextInt();
                
                numero = numero % 2;
                
                if (numero != 0){
                    System.out.println("Este número é impar!");
                }else{
                    System.out.println("Este número é par!");
                }
                }
}
