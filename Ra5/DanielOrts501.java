import java.util.Scanner;
class DanielOrts501 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introducimos las variables, en este caso primero declaramos un vector con 10 elementos de valores*/
        int[] myList = new int[10];
        /**Aqui ponemos la variable del numero del usuario */
        int numUser;
        /**Decimos al usuario lo que va a tener que hacer */
        System.out.printf("Ahora tendras que escribir 10 numeros para la lista del 0 al 20\n");
        /**Empezamos el bucle for, el cual ponemos que nos lo repita 10 veces */
        for (int i = 0; i < 10 ; i++) {
            /**Le decimos al usuario que escriba un numero del 0 al 20 */
            System.out.printf("Di un numero del 0 al 20: ");
            numUser = input.nextInt();
            /**En caso de no hacernos caso entrara en un bucle que le dira que vuelva a poner un numero, que sea valido  */
            while (numUser > 20 || numUser < 0)
            {
                System.out.println("\n El numero introducido no es valido, vuelve a intentarlo:");
                numUser = input.nextInt();
            }
            /**Se guarda el numero correcto introducido en la lista en su posicion correspondiente */
            myList[i] = numUser;
        } 
        /**Este for es para imprimir los numeros introducidos y que los pueda ver el usuario a modo de lista */
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\n", myList[i]);
        }
    }
}