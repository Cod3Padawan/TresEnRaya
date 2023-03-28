import java.util.Scanner;

/**
 *

 Hacer el juego del tres en raya para dos jugadores.

 El tablero será un array de 9 posiciones.
 El método showTablero(String [] tablero); imprimirá el tablero, con las fichas “X” y “O” dónde correspondan.
 El juego tendrá un método juegaPlayer(String ficha, String [] tablero) que recibirá como parámetro de entrada el identificador del jugador («X» o «O»)
 y dónde se le solicitará al jugador el número correspondiente a la posición dónde quiere mover su ficha («X» o «O»).
 Después de cada tirada, se comprobará si alguien ha ganado, llamando al método evaluateWin(String [] tablero);
 El método evaluateWin(String [] tablero) comprobará, mediante sucesivos if, todas las posibilidades de que un jugador gane.
 Utilizaremos la consola de java para ver el tablero.

 */
public class Main {
    public static void main(String[] args) {
        String [] tablero = {"_","_","_","_","_","_","_","_","_"};
        int tiradas = 0;
        boolean alguienGano = false;

        do {
            showTablero1(tablero);
            String ficha = tiradas%2 ==0? "X" : "O";
            juegaPlayer(ficha,tablero);


            alguienGano = evaluateWin(tablero);
            if (alguienGano) System.out.println("Enhorabuena, jugador " + ficha + " has ganado");
            tiradas ++;


        }while(!alguienGano);

    }

     static void showTablero1(String [] tablero){
        System.out.println(tablero[0]+ " |" + tablero[1] + "| " + tablero[2]);
        System.out.println(tablero[3]+ " |" + tablero[4] + "| " + tablero[5]);
        System.out.println(tablero[6]+ " |" + tablero[7] + "| " + tablero[8]);
    }

     static void juegaPlayer(String ficha, String []tablero){
         Scanner sc = new Scanner(System.in);
         boolean posicionValida = false;
         int posicion;

         do {
             System.out.println("Donde quieres mover, jugador " + ficha + "?");
             posicion = sc.nextInt();

             if (posicion < 0 || posicion > 8) { // comprobamos si la posición es inválida
                 System.out.println("Número incorrecto, elige una casilla válida (0-8)");
             } else if (!tablero[posicion].equals("_")) { // comprobamos si la casilla está ocupada
                 System.out.println("La casilla está ocupada, elige otra casilla");
                 posicion = -1; // marcamos la posición como inválida para solicitar otra posición
             }
         } while (posicion < 0 || posicion > 8); // repetimos mientras la posición sea inválida

         tablero[posicion] = ficha;
     }

     static boolean evaluateWin ( String tablero[]){
        if (tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")){
            return true;
         } else if (tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {

        } else if (tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {

        } else if (tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {

        } else if (tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {

        } else if ((tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_"))) {

        } else if (tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {

        } else if ((tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_"))) {

        }
         return false;
     }




}