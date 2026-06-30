package com.lucas.exercicios;

public class Ex01UpgradePC {

    public static void main(String[] args) {

        String tipoMemoria = "DDR4";
        int quantidadeRam = 16;


        if (tipoMemoria.equals("DDR4") && quantidadeRam <= 64) {
            System.out.println("Upgrade realizado com sucesso!");
        }
        else if (!tipoMemoria.equals("DDR4")) {
            System.out.println("Erro: A placa-mãe só aceita DDR4.");
        }
        else if (quantidadeRam > 64) {
            System.out.println("Erro: A placa-mãe só suporta até 64GB.");
        }

    }

}
