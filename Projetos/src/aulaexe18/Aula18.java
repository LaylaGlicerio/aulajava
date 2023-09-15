package aulaexe18;
/**
 *Exercício 18
 * Data: 05/09/2023
 * Disciplina: Linguagem de Programação
 * @author: Layla Glicério
 * Exercício: Faça um programa que construa a seguinte sequência: 
 */
public class Aula18 {
    public static void main(String[] args) {
        
        int incr = 1;
        int decr = 15;
        
        for(int i = 0; i<16; i++){
            System.out.println(incr + "/" + decr);
            
            incr++;
            decr--;
            
        }
    }
}
