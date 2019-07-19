/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Juego {


    public void m1() {
        char tablero[][] = new char[3][3];
        char x = 'x';
        char o = 'o';
        char vacio = ' ';
        int ganadorx = 0;
        int ganadoro = 0;
        String dec = "";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("| " + (i + 1) + "-" + (j + 1) + " | ");

            }
            System.out.println(" ");

        }
        int f, c, turno = 0;
        for (int k = 0; k < vacio; k++) {
            Scanner dato = new Scanner(System.in);
            System.out.println("Ingrese fila");

            f = dato.nextInt() - 1;

            System.out.println("Ingrese columna");
            c = dato.nextInt() - 1;
            turno++;
            System.out.println("el turno es " + turno);
            System.out.println(f);
            System.out.println(c);
            if (f + 1 > 3 || f + 1 <= 0 || c + 1 > 3 || c + 1 <= 0) {
                System.out.println("POSICION INVALIDA");
                System.out.println("Ingrese fila");

                f = dato.nextInt() - 1;

                System.out.println("Ingrese columna");
                c = dato.nextInt() - 1;

            }
            for (int i = 0; i < tablero.length; i++) {
                if (tablero[f][c] != vacio) {

                    for (int j = 0; j < tablero[i].length; j++) {
                        if (turno % 2 != 0) {
                            tablero[f][c] = x;
                        } else {
                            tablero[f][c] = o;
                        }

                        System.out.print("| " + tablero[i][j] + " | ");

                    }
                } else {
                    System.out.println("ya esta ocuado");
                }

                System.out.println(" ");

            }
            if (tablero[0][0] == x && tablero[1][1] == x && tablero[2][2] == x
                    || tablero[0][0] == x && tablero[1][0] == x && tablero[2][0] == x
                    || tablero[0][1] == x && tablero[1][1] == x && tablero[2][1] == x
                    || tablero[0][2] == x && tablero[1][2] == x && tablero[2][2] == x
                    || tablero[0][0] == x && tablero[0][1] == x && tablero[0][2] == x
                    || tablero[1][0] == x && tablero[1][1] == x && tablero[1][2] == x
                    || tablero[2][0] == x && tablero[2][1] == x && tablero[2][2] == x
                    || tablero[0][2] == x && tablero[1][1] == x && tablero[2][0] == x) {
                System.out.println("El ganador es X");
                ganadorx++;
               
                break;

            } else if (tablero[0][0] == o && tablero[1][1] == o && tablero[2][2] == o
                    || tablero[0][0] == o && tablero[1][0] == o && tablero[2][0] == o
                    || tablero[0][1] == o && tablero[1][1] == o && tablero[2][1] == o
                    || tablero[0][2] == o && tablero[1][2] == o && tablero[2][2] == o
                    || tablero[0][0] == o && tablero[0][1] == o && tablero[0][2] == o
                    || tablero[1][0] == o && tablero[1][1] == o && tablero[1][2] == o
                    || tablero[2][0] == o && tablero[2][1] == o && tablero[2][2] == o
                    || tablero[0][2] == o && tablero[1][1] == o && tablero[2][0] == o) {
                System.out.println("El ganador es O");
                ganadoro += 1;
                break;

            }

        }
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Quiere jugar de nuevo ?");

        dec = dato2.nextLine();
        if (dec.contains("si")) {
            System.out.print("Puntuacion X : " + ganadorx + "Puntuacion O : " + ganadoro + "\n");
int resultado=ganadorx;
            m1();
           int resultado2=resultado;
            System.out.println("asi vamos"+resultado2);
           
            

        } else {

            if (ganadoro < ganadorx) {
                System.out.println("El ganador del juego fue X con una puntuacion de " + ganadorx);
            } else if (ganadoro > ganadorx) {
                System.out.println("El ganador del juego fue O con una puntuacion de " + ganadoro);
            } else {
                System.out.println("FUE UN EMPATE");
            }
        }
    }
}
