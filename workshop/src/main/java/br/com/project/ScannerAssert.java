package br.com.project;

import java.util.Scanner;

public class ScannerAssert {

    public static void main(String[] args) {
        /**
         * Classe Scanner permite que o usuário leia valores de diferentes tipos de dados.
         * É utilizada para fazer a leitura de entrada de dados do usuário
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forneça um número inteiro maior que nove: ");
        int valor = scanner.nextInt(); // realiza a leitura do valor inteiro fornecido pelo usuário

        /**
         * assert é uma forma de fazer testes de validação da lógica do código,
         * sem precisar usar estruturas como if/else ou lançar exceções
         * Utilizar as 'asserções' possibilita indicar uma situação que não pode ocorrer
         * sintaxe: assert <condicao> [: expressao];
         */
        assert valor > 9; // esperado o valor maior que nove
        int soma = 0;
        for (int i = 1; i < valor; i++) {
            soma += i;
            assert soma < 99 : "soma (" + soma + ") >= 99"; // espera soma < 99
        }

        System.out.println("soma [1 ... " + valor + "] = " + soma);
        scanner.close();

    }

}