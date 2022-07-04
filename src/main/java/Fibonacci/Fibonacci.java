package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número para verificar se é pertencente a sequência de fibonacci ou não: ");
        System.out.println(fibonacci(sc.nextInt()));

    }

    // método que retorna a sequência de Fibonacci e verifica se o número dado pertence a mesma
    public static String fibonacci(int clientValue) {
        if (clientValue == 0) return "Esse número pertence a sequência de Fibonacci na posição: 0";
        if (clientValue == 1) return "Esse número pertence a sequência de Fibonacci na posição: 1 e 2";
        if (clientValue == 2) return "Esse número pertence a sequência de Fibonacci na posição: 3";

        // RETORNA A SEQUÊNCIA
        int a = 0;
        int b = 1;

        int soma = 0;
        for (int i = 0; i < 20; i ++) {
            soma = a + b;
            if (i == 0) {
                System.out.print(a + " " + b + " " + soma + " ");
            }
            a = b;
            b = soma;
            if (i > 0){
                System.out.print(soma + " ");
            }

        }
        System.out.println();

        // VERIFICA SE O NÚMERO DADO PERTENCE À SEQUÊNCIA
        a = 1;
        b = 2;
        soma = 0;

        for (int i = 3; i <= clientValue; ++i) {
            soma = a + b;
            a = b;
            b = soma;

            if (clientValue == soma) return "Esse número pertence a sequência de Fibonacci na posição: " + (i + 1);
        }
        return "Esse número NÃO pertence a sequência de Fibonacci";
    }
}
