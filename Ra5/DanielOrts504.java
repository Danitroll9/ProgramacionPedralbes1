import java.util.Scanner;
class DanielOrts504 {
    public static void main(String[] args) {
        /** definimos constante de longitud */
        final int LONG = 10;
        /**Introducimos las variables, en este caso primero declaramos un vector con 10 elementos de valores*/
        int[] myList = new int[LONG];
        int suma;
        suma = 0;
        /** hacemos un bucle for para que genere 10 valores dentro del vector */
        for( int i = 0; i < LONG; i++)
        {
            myList[i] = (int) ((Math.random()*10) + 1);
            /**ponemos un if para que solo pille los multiples de 3 y los sume */
            if(i % 3 == 0)
            {
                suma += myList[i];
            }
        }
        /** Le decimos al usuario la suma de los valores y los valores usados para sumar */
        System.out.printf("La suma de los valores aleatorios en las posiciones multiples de 3 es: ", suma);
        System.out.printf("Los valores utilizados en la suma son: \n");
        for (int i = 0; i < LONG; i++) 
        {
            if(i % 3 == 0)
            {
            System.out.printf(" %d\n ", i);
            }
        }
    }
}