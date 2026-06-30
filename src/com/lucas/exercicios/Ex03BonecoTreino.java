package com.lucas.exercicios;

import java.util.Scanner;

public class Ex03BonecoTreino {

    public static void main(String[] args) {

        int vidaBoneco = 100;
        Scanner sc = new Scanner(System.in);


        while (vidaBoneco > 0){
            System.out.println("Quanto de dano você deu no boneco?");
           int golpe = sc.nextInt();

           vidaBoneco = vidaBoneco - golpe;


            System.out.println("Você deu " + golpe + " de dano, restam " + vidaBoneco + " de vida do boneco");
        }
        System.out.println("O boneco de treino foi destruído!");

    }

}
