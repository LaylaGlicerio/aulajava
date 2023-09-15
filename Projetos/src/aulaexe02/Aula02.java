package aulaexe02;
/**
 *Exercício 02
 * Aula: 01/08/2023
 * Disciplina: Linguagem de Programação
 * @author Layla Glicério
 * Matéria: Manipulação de String
 * A concatenação de strings é o processo de combinar duas 
 * ou mais strings. Em Java, você pode usar o operador de
 * adição (+) ou concat() para realizar essa operação.
 */
public class Aula02 {
    public static void main(String[] args) {
        //Concatenação de String
        String msg1 = "Ola";
        String msg2 = "Layla";
        String mensagem = msg1 + ", "+ msg2 + "!";
        System.out.println(mensagem);
        
        //Tamanho de uma string
        String texto = "Hello, World!";
        int tamanho = texto.length();
        System.out.println(tamanho);
        
        //Transformação de String em letras maiúsculas ou minúsculas
        String txt = "Hello, World!";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    
}
}
