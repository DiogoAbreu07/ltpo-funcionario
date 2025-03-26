package com.company;
public class Main {

    public static void main(String[] args) {
        // Criando funcionários manualmente
        Funcionario[] Funcionario = {
                new Funcionario("Ana", 3000.0, 170),
                new Funcionario("Carlos", 2800.0, 160),
                new Funcionario("Mariana", 3500.0, 180),
                new Funcionario("João", 2500.0, 155)
        };

        //Exibição do relatório
        System.out.println("\nRelatório de Funcionários:");
        for (Funcionario Funcionario1 : Funcionario) {
            Funcionario1.exibirDados();
        }
    }
}