package br.com.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) {
        System.out.print("Escreva um número de 0 a 10: ");

        try(var reader = new BufferedReader(new InputStreamReader(System.in))){

            var input = reader.readLine();
            var valueInput = Integer.valueOf(input);

            validateInput(valueInput);

            System.out.println("O número que você colocou é: " + valueInput);

        }catch (NumberFormatException | IOException e){
            throw new RuntimeException("Erro na leitura");
        }
    }

    private static void validateInput(Integer value){
        if(value > 10 || value < 0){
            throw new RuntimeException("O valor que você colocou é maior que 10 ou menor que 0");
        }
    }
}
