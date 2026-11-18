import java.util.Scanner;
class DanielOrts505 {
    public static void main(String[] args) {
        /** definimos constante de longitud */
        final int LONG = 100;
        /**Introducimos las variables*/
        int[] myList = new int[LONG];
        /** hacemos un bucle for para calcular si ese numero de la lista es par o impar */
        for( int i = 0; i < LONG; i++)
        {
            myList[i] = i % 2;
        }
        /** este for es para mostrar los numeros */
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf("%d ", myList[i]);
        }
    }
}