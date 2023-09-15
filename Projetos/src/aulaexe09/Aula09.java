package aulaexe09;
import java.util.Scanner;

/**
 *Exercício 08
 * Data: 15/08/2023
 * @author: Layla Glicério
 * Disciplina: Linguagem de Programação
 * Matéria: Operadores Relacionais, Lógicos e Estruturas Condicionais
 * Atividade: Peça um valor inteiro e fale se é positivo, negativo ou igual a 0. 
 */
public class Aula09 {
  public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = ler.nextInt();
        
        if (num>0){
            System.out.println("Este número é positivo!");
        }
        else if(num<0)
        {
            System.out.println(" Este número é negativo!");
        }
        else if (num==0)
                {
        System.out.println("O número é igual a zero!");
  
        }
        
    }  
}
