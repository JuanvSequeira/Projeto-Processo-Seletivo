package Candidatura;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scan.nextInt();

        verificarNumero(numero1, numero2);
    }

    static void verificarNumero(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("Erro: o número 1 não pode ser maior que o número 2.");
            return;
        }
        for (int i = numero1+1 ; i <= numero2; i++) {  
        
          System.out.println("Impressão: " + i );
        
        }
    }
}