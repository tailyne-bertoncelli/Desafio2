package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoas> pessoasList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            List<Endereco> enderecoList = new ArrayList<>();
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            for (int j = 0; j < 2; j++) {
                System.out.print("Endereço " + j +": ");
                String logradouro = sc.next();

                System.out.print("Numero: " + j +": ");
                int num = sc.nextInt();

                Endereco endereco = new Endereco(logradouro, num);
                enderecoList.add(endereco);
            }
            pessoasList.add(new Pessoas(nome, idade, enderecoList));
            System.out.println("-----------------------");
        }

        for (Pessoas p: pessoasList) {
            System.out.println("Nome: "+ p.getNome());
            System.out.println("Idade: "+ p.getIdade());

            int i = 0;
            for (Endereco e: p.getEnderecos()) {
                i++;
                System.out.println("Logradouro " + i +": " + e.getLogradouro());
                System.out.println("Numero " + i + ": "+ e.getNumero());
            }
            System.out.println("------------------------");
        }

        sc.close();
    }
}