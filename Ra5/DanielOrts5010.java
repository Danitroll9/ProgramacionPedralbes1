import java.util.Scanner;
class DanielOrts5010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int LONG = 50;
        /**Introducimos las variables*/
        long[] myList = new long[LONG];
        long suma, numUser;
        suma = 1;
        boolean encontrado;
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
            /** Una vez hecho lo del if se guarda el numero en la lista */
            myList[i] = suma;
        }
        /**Hacemos que el usuario pondra un numero, el que quiera */
        System.out.printf("Ahora tendras que escribir un numero y se te dira si esta dentro de los 50 primeros numeros de Fibonacci o no:\n");
        numUser = input.nextLong();
        /**Definimos que encontrado es false */
        encontrado = false;
        /**Bucle for para comprobar si el numero del usuario esta dentro de Fibonacci, en ese caso ponemos que la boleana encontrado es true y le decimos al usuario */
        for (int i = 0; i < LONG; i++) 
        {
            if( numUser == myList[i])
            {
                System.out.printf("Tu numero esta dentro de Fibonacci\n");
                encontrado = true;
            }
        }
        /**En caso de que el numero del usuario no este dentro de Fibonacci, hacemos un if para que detecte que no se ha encontrado y se lo diga al usuario */
        if(!encontrado)
        {
            System.out.printf("Tu numero no esta dentro de Fibonacci\n");
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