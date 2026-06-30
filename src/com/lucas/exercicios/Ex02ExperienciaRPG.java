package com.lucas.exercicios;

import java.util.Scanner;

public class Ex02ExperienciaRPG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nível:");
        int nivel = sc.nextInt();

        System.out.println("Quanto xp foi ganho nessa missão?");
        int xpGanho = sc.nextInt();

        if (xpGanho >= 1000) {
            System.out.println("Parabéns! Você subiu de nível!");
        } else {
            int xpRestante = 1000 - xpGanho;
            System.out.println("XP insuficiente para subir de nível. Faltam " + xpRestante + " de XP");
        }

        sc.close();

    }

}
