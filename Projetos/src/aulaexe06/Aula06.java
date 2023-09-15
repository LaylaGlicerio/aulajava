package aulaexe06;
/**
 **Exercício 06
 * Data: 15/08/2023
 * Disciplina: Linguagem de Programação
 *  @author: Layla Glicério
 * Atividade: Faça um programa para tirar a média de 4 notas de um aluno 
 **/
public class Aula06 {
   public static void main(String[] args) {
        
        float nota1 = 33;
        float nota2 = 15;
        float nota3 = 25;
        float nota4 = 30;
        
        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;
           
        
         System.out.println ("A soma das notas do aluno é: "+ soma);
         System.out.println ("A média do aluno é: "+ media);
              
    } 
}
