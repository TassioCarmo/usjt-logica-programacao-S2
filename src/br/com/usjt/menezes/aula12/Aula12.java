package br.com.usjt.menezes.aula12;

import java.util.Scanner;

public class Aula12 {
    Scanner scanner = new Scanner(System.in);

    public void exercicio41() {
        double[] distancias = new double[26];
        double[] precos = new double[26];
        double soma = 0;


        for (int i = 0; i < distancias.length; i++) {
            distancias[i] = scanner.nextDouble();
            precos[i] = scanner.nextDouble();
            soma += (precos[i] * 2);
        }

        System.out.println(soma);
    }

    public void exercicio42() {
        int[] andares = new int[39];
        int soma = 0;
        int media;
        int maisUsado = andares[0];
        for (int i = 0; i < andares.length; i++) {
            andares[i] = scanner.nextInt();
            soma += andares[i];
            if (andares[i]>maisUsado){
                maisUsado = andares[i];
            }
        }
        media = soma/40;

        System.out.println(media);
        System.out.println(maisUsado);

    }

    public void exercicio43(){

        int[] numeros = new int [350];
        int quantiadeMultiplos11 = 0;
        int quantiadeMultiplos2 = 0;
        int soma = 0;


        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = scanner.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i]%11==0) {

                quantiadeMultiplos11++;

            }

            if(numeros[i]%2==0) {

                quantiadeMultiplos2++;

            }

            if(numeros[i]%2==0) {

                quantiadeMultiplos2++;

            }

            if(numeros[i]%5==0) {

                soma =+numeros[i];

            }
        }

    }
}

