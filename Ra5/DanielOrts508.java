import java.util.Scanner;
class DanielOrts508 {
    public static void main(String[] args) {
        /** definimos constante de longitud */
        final int LONG = 10;
        /**Introducimos las variables*/
        int[] myList = new int[LONG];
        int numRandom;
        boolean repe;
        /**Le decimos al usuario lo que va a hacer el programa */
        System.out.printf("El programa va a generar 10 numeros que no se van a repetir ninguno y se van a imprimir en orden ascendente del 1 al 10000.\n");
        /** Creamos un bucle for para que haga la recorra toda la lista */
        for( int i = 0; i < LONG; i++)
        {
            /**Dentro hacemos un do while, el cual va a generar un numero random entre 1 y 10000 dejando espacios para los numeros que faltan por poner en la lista y va a poner que el boleano esta en false */
            do
            {
                numRandom = (int) (Math.random()* 10000 + 1 - (LONG - 1 - i));
                repe = false;
                /**creamos otro for dentro de este para que nos compruebe los numeros generados  */
                for( int j = 0; j < i; j++)
                {
                    /**con el if comprobamos que si el numero es menor que el ultimo introducido en la lista, en caso de que sea mayor o igual, el boleano pasa a true y se repite el do while, sino saldremos del do while y se agregara el numero random a la lista */
                    if (numRandom <= myList[j])
                    {
                        repe = true;
                    }
                }
            }
            while (repe);
         /** una vez comprobado que el numero no se repite, se pone en la lista */  
            myList[i] = numRandom;
        }
        /**Aqui le decimos al usuario que numeros se han generado */
        System.out.printf("Los numeros generados son: \n");
        /** este for es para mostrar los numeros */
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf("%d ", myList[i]);
        }
    }
}