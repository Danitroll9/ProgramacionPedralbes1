import java.util.Scanner;
class DanielOrts509 {
    public static void main(String[] args) {
        /** definimos constante de longitud */
        final int LONG = 50;
        /**Introducimos las variables*/
        long[] myList = new long[LONG];
        long suma;
        suma = 1;
        /**Le decimos al usuario lo que va a hacer el programa */
        System.out.printf("El programa va a generar 50 numeros de la secuencia de Fibonacci.\n");
        /** Creamos un bucle for para que recorra toda la lista */
        for( int i = 0; i < LONG; i++)
        {
            /** Ponemos que si la i es menor que  no empiece ya que no empiece para que no nos grabe el 0 y para que luego pille bien los numeroes para ir sumando los anteriores */
            if ( i > 1)
            {
                suma = myList[i - 1] + myList[i - 2];
                
            }
            myList[i] = suma;
        }
        /**Aqui le decimos al usuario que numeros se han generado */
        System.out.printf("Los numeros de Fibonacci generados son: \n");
        /** este for es para mostrar los numeros */
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf("%d ", myList[i]);
        }
    }
}