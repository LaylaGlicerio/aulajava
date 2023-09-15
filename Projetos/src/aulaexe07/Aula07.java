package aulaexe07;
import java.util.Scanner;

/**
 **Exercício 07
 * Data: 15/08/2023
 * Disciplina: Linguagem de Programação
 * Matéria: Entrada de Dados
 *  @author: Layla Glicério
 * Atividade: Faça um programa para tirar a média de 4 notas de um aluno (COM ENTRADA DE DADOS) 
 */
public class Aula07 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual nome o nome do aluno?");
        String nome = ler.next();
        
        System.out.println("Qual a prinmeira nota?");
        float nota1 = ler.nextFloat();
        System.out.println("Qual a segunda nota?");
        float nota2 = ler.nextFloat();
        System.out.println("Qual a terceira nota?");
        float nota3 = ler.nextFloat();
        System.out.println("Qual a quarta nota?");
        float nota4 = ler.nextFloat();      
        
        float soma, media = 0;
         soma = nota1 + nota2 + nota3 + nota4;
         media = soma / 4;
        
         System.out.println ("A soma das notas do aluno é: "+ soma);
         System.out.println ("A média do aluno é: "+ media);
        
        
        
    }
}
