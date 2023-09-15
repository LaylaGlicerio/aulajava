package aulaexe17;
import java.util.Scanner;

/**
 *Exercício 17
 * Data: 05/09/2023
 * Disciplina: Linguagem de Programação
 * @author: Layla Glicério
 * Exercício: Faça um programa que construa a seguinte sequência: 2, 4, 6, 8, 10...
 */
public class Aula17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite um valor inteiro:");
        n = ler.nextInt();
        
        for (int i = 2; i<n; i+= 2){
            System.out.println(i);
        }
    }
}
