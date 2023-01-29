// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .contains() verificar se em uma determinada String tem um determinado caractere ou um conjunto deles

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        // TODO: Crie a condição necessária para verificar o formato do arquivo de
        // entrada

        if (arquivoDoPc.contains(".mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}