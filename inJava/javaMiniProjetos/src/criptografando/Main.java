package criptografando;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String criptografando(String texto) {
        StringBuilder sb = new StringBuilder();
        for(char c : texto.toCharArray()) { // percorre cada letra
            if(Character.isLetter(c)) { // verifica se é uma letra
                c = (char) (c + 3);
            }
            sb.append(c); // adiciona no stringbuilder
        }
        String stringBtoString = sb.toString(); // converte o stringbuilder pra string
        String invertendo = new StringBuilder(stringBtoString).reverse().toString();
        // inverte a string usando stringbuilder

        int metade = invertendo.length() / 2;
        sb = new StringBuilder(invertendo);
        for(int i = metade; i < invertendo.length(); i++) {
            char c = sb.charAt(i); // obtem o caractere na posição atual
            c = (char) (c - 1); // descola um caractere pra esquerda
            sb.setCharAt(i, c); // atualiza o caractere na string
        }
        String stringBtoString2 = sb.toString();
        return stringBtoString2;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); // entrada do texto
        int numeroLinhas = in.nextInt(); // le o numero de linhas que serao processadas
        in.nextLine(); // consome a nova linha apos o numero inteiro?

        for(int i = 0; i < numeroLinhas; i++) { // loop pra cada linha
            String linha = in.nextLine(); // linha atual
            String criptografada = criptografando(linha); // chama a funcao

            System.out.println(criptografada); // imprime o texto criptografado
        }
    }
}

// exemplo de entrada:
// 1
//Texto #3