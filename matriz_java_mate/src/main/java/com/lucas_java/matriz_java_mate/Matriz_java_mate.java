

package com.lucas_java.matriz_java_mate;

public class Matriz_java_mate {

    public static void main(String[] args) {
        int matrizA[][] = new int[2][3];
            int matrizB[][] = new int [3][2];
            int matrizC[][] = new int [2][2];

            matrizA[0][0] = 3;
            matrizA[0][1] = 1;
            matrizA[0][2] = 3;
            matrizA[1][0] = 6;
            matrizA[1][1] = 5;
            matrizA[1][2] = 5;

            matrizB[0][0] = 100;
            matrizB[0][1] = 50;
            matrizB[1][0] = 50;
            matrizB[1][1] = 100;
            matrizB[2][0] = 50;
            matrizB[2][1] = 50;
           
            matrizC[0][0] = (matrizB[0][0] * matrizA[0][0]) +  (matrizB[1][0]*matrizA[0][1]) + (matrizB[2][0] *  matrizA[0][2]);
            matrizC[0][1] = (matrizB[0][1] * matrizA[0][0] ) + ( matrizB[1][1] * matrizA[0][1] ) + (matrizB[2][1] *  matrizA[0][2]);
            matrizC[1][0] = ( matrizB[1][1] *matrizA[1][0] ) + (matrizB[2][0]* matrizA[1][1]) + (matrizB[2][1] *  matrizA[1][2]);
            matrizC[1][1] = (matrizB[0][1]* matrizA[1][0]) + (matrizB[1][1] *  matrizA[1][1]) + (matrizB[2][1] * matrizA[1][2] );
           
           
           
            System.out.println("");
             System.out.println("");
            System.out.println("Matriz A");
       

            for (int i = 0; i < 2; i++) {
                System.out.println(" ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + matrizA[i][j]);
                }
            }
            System.out.println("");
             System.out.println("");
            System.out.println("Matriz B");
       
            for (int i = 0; i < 3; i++) {
                System.out.println(" ");
               
                for (int j = 0; j < 2; j++) {
                    System.out.print(" " + matrizB[i][j]);
                }

            }
           
            System.out.println("");
            System.out.println("");
            System.out.println("Matriz C Resultante");
           
            for (int i = 0; i < 2; i++) {
                System.out.println(" ");
               
                for (int j = 0; j < 2; j++) {
                    System.out.print(" " + matrizC[i][j]);
                }

            }
           
    }
    }

