import java.util.Scanner;
class DanielOrts502 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introducimos las variables, en este caso primero declaramos un vector con 10 elementos de valores*/
        int[] myList = new int[10];
        /**Aqui ponemos las variable */
        int numUser;

        boolean encontrado;
        /**Decimos al usuario lo que va a tener que hacer */
        System.out.printf("Ahora el programa va a generar 10 numeros aleatorios de 1 al 10. Tendrás que escribir uno y luego se te informara si concuerda con uno de los valores generados o no\n");
        /**Empezamos el bucle for, el cual ponemos que nos genere un numero aleatorio cada vez que se hace el bucle, que van a ser 10 veces*/
        for (int i = 0; i < myList.length ; i++) {

            myList[i] = (int) (Math.random()*10+1);
        }
        /**Hacemos un do while para preguntarle por el numero al usuario y en caso de que no lo responda correctamente se repetira la pregunta hasta que lo haga */
        do
        {
            System.out.printf("Escribe un numero del 1 al 10: \n");
            numUser = input.nextInt();
        } while(numUser > 10 || numUser < 1);
        /**definimos que la variable booleana es falsa */
        encontrado = false;
        /**se hace un bucle for para comprobar si el numero dado por el usuario se encuentra en la lista y en que posicion o posiciones se encuentra/n si el numero esta en la lista y la booleana se vuelve true */
        for (int i = 0; i < 10; i++)
        {
            if (numUser == myList[i])
            {
                System.out.printf("El numero concuerda con el numero " + (i+1) + " de la lista \n", i);
                encontrado = true;
            }
        }
        /**si no ha encontrado el numero del usuario en la lista, se cumple la condicion del if y se le dice al usuario que no esta en la lista */
        if (!encontrado)
        {
            System.out.printf("El numero no concuerda con ninguno de la lista\n");
        }
        System.out.printf("Los valores enteros dentro del vector son: \n");
        /**Este for es para imprimir los numeros introducidos y que los pueda ver el usuario a modo de lista */
        for (int i = 0; i < 10; i++) 
        {
            System.out.printf("%d\n", myList[i]);
        }
    }
}