package aulaexe08;
/**
 *Exercício 08
 * Data: 15/08/2023
 * Disciplina: Linguagem de Programação
 * Matéria: Operadores Relacionais, Lógicos e Estruturas Condicionais
 * @author: Layla Glicério 
 */
public class Aula08 {
     public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
        
        System.out.println (a>b && a<b);
        
        if (a>b){
            System.out.println("Maior");    
        } else if(a<b){
            System.out.println("Menor");
        } else{
            System.out.println("Igual");
        }
         
    }
}
