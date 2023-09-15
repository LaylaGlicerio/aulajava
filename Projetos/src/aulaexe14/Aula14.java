package aulaexe14;
import java.util.Scanner;

/**
 *Exercício 13
 * Data: 22/08/2023
 * @author: Layla Glicério
 * Disciplina: Linguagem de Programação
 * Matéria: Estruturas de Controle (EXERCÍCIO DE FIXAÇÃO)
 * Atividade: 3. O cardápio de uma lanchonete é dado abaixo. Prepare um programa que o código correspondente ao item da
lanchonete e mostre a descrição do ítem e seu valor..
1 - Hambúrguer............... R$ 30,00
2 - Cheeseburger.............. R$ 35,50
3 - Fritas............................ R$ 20,50
4 - Refrigerante................. R$ 10,00
5 - Milkshake..................... R$ 30,00
 */

public class Aula14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
            int pedido;
   
                do{
            System.out.println("MENU");
            System.out.println("1. Hambúrguer................ R$ 30,00");
            System.out.println("2. Cheeseburger.............. R$ 35,50");
            System.out.println("3. Fritas.................... R$ 20,50");
            System.out.println("4. Refrigerante.............. R$ 10,00");
            System.out.println("5. Milkshake................. R$ 30,00");
            System.out.println("0. Sair");
            
            System.out.println("Digite um numero do pedido escolhido:");
                pedido = scanner.nextInt();
            
            
            switch (pedido){
                case 1:
                    System.out.println("Você escolheu Hambúrguer e o valor é de R$ 30,00");
                    break;
                case 2:
                    System.out.println("Você escolheu Cheeseburger e o valor é de R$ 35,50");
                    break;
                case 3:
                    System.out.println("Você escolheu Fritas e o valor é de R$ 20,50");
                    break;
                case 4:
                    System.out.println("Você escolheu Refrigerante e o valor é de R$ 10,00");
                    break;
                case 5:
                    System.out.println("Você escolheu Milkshake e o valor é de R$ 30,00");
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }         
            System.out.println();
        } while (pedido != 0);
        
                
    }
}
