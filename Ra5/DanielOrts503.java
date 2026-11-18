import java.util.Scanner;
class DanielOrts503 {
    public static void main(String[] args) {
        final int LONG = 10;
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introducimos las variables, en este caso primero declaramos un vector con 10 elementos de valores*/
        int[] myList = new int[LONG];
        int numUser;
        /**Decimos al usuario lo que va a tener que hacer */
        System.out.printf("Ahora el programa va a generar 10 numeros aleatorios de 1 al 10. Tendrás que escribir uno y luego se te informara de los numeros que son mas pequeños que el que has dado y cuales son mas grandes\n");
        /**Empezamos el bucle for, el cual ponemos que nos genere un numero aleatorio cada vez que se hace el bucle, que van a ser 10 veces*/
        for( int i = 0; i < LONG; i++)
        {
            myList[i] = (int) ((Math.random()*10) + 1);
        }
        /**Hacemos un do while para preguntarle por el numero al usuario y en caso de que no lo responda correctamente se repetira la pregunta hasta que lo haga */
        do
        {
            System.out.printf("Escribe un numero del 1 al 10: \n"); 
            numUser = input.nextInt();
        } while(numUser > LONG || numUser < 1);
        /**se hace un bucle for para comprobar cuales numeros son mas grandes que el numero dado por el usuario y cuales son menores  */
        for( int i = 0; i < LONG; i++)
        {
            if (numUser > myList[i])
            {
                System.out.printf("Es mas grande que: %d \n", myList[i]);
            }
            else if (numUser < myList[i])
            {
                System.out.printf("Es menor que: %d \n", myList[i]);
            }
        }
        System.out.printf("Los valores enteros dentro del vector son: \n");
        /**Este while es para imprimir los numeros introducidos y que los pueda ver el usuario a modo de lista, antes de eso definimos la "i" como 0 */
        for( int i = 0; i < LONG; i++)
        {
            System.out.printf("%d\n", myList[i]);
        }
    }
}