import java.util.Scanner;
class DanielOrts506 {
    public static void main(String[] args) {
        /** definimos constante de longitud */
        final int LONG = 6;
        /**Introducimos las variables*/
        int[] myList = new int[LONG];
        /** hacemos un bucle for para generar numeros random en la lista */
        for( int i = 0; i < LONG; i++)
        {
            myList[i] = (int) ((Math.random()* 49) + 1);
        }
        /** este for es para mostrar los numeros */
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf("%d ", myList[i]);
        }
    }
}