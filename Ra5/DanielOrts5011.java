import java.util.Scanner;
class DanielOrts5011 {
    public static void main(String[] args) {
        /**Ponemos el Scanner para que el usuario pueda escribir cuando se necesite */
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int LONG = 6;
        /**Introducimos las variables*/
        int[] myList = new int[LONG];
        int[]listaUser = new int[LONG];
        int numRandom, numUser;
        boolean repe;
        /**Le decimos al usuario lo que va a hacer el programa */
        System.out.printf("El programa va a generar 6 numeros aleatorios entre 1 y 49. \n");
        /** Creamos un bucle for para que recorra toda la lista */
        for( int i = 0; i < LONG; i++)
        {
            /**Dentro hacemos un do while, el cual va a generar un numero random y va a poner que el boleano esta en false */
            do
            {
                numRandom = (int) (Math.random()* 49 + 1);
                repe = false;
                /**creamos otro for dentro de este para que nos compruebe los numeros generados  */
                for( int j = 0; j < i; j++)
                {
                    /**con el if comprobamos que si el numero repetido esta repetido, en caso de que se repita, el boleano pasa a true y se repite el do while, sino saldremos del do while y se agregara el numero random a la lista */
                    if (numRandom == myList[j])
                    {
                        repe = true;
                    }
                }
            }
            while (repe);
            /**Se guarda el numero random en la primera lista */
            myList[i] = numRandom;
        }
            /** una vez comprobado que el numero no se repite, se pone en la lista */
        
        for( int i = 0; i < LONG; i++)
        {
            /**Dentro hacemos un do while, el cual va a pedir al usuario un numero y va a poner que el boleano esta en false */
            do
            {
                System.out.printf("Escribe un numero para poner en la lista que no se repita entre 1 y 49");
                numUser = input.nextInt();
                /**Comprobamos que el usuario ha puesto un numero dentro del intervalo */
                if(numUser < 1 || numUser > 49)
                {
                    System.out.printf("Ese numero no esta entre los parametros dichos, escribe otro porfavor: \n");
                    repe = true;
                }
                repe = false;
                /**creamos otro for dentro de este para que nos compruebe los numeros puestos  */
                for( int j = 0; j < i; j++)
                {
                    /**con el if comprobamos que si el numero repetido esta repetido, en caso de que se repita, el boleano pasa a true y se repite el do while, sino saldremos del do while y se agregara el numero del usuario a la lista */
                    if (numUser == listaUser[j])
                    {   
                        System.out.printf("El numero se repite, prueba otra vez\n");
                        repe = true;
                    }
                }
            }
            while (repe);
            /**Se guarda el numero en la lista del usuario */
            listaUser[i] = numUser;
        }
        /**Se enseña al usuario los numeros generados por el programa y luego los suyos para comparar usando bucle for */
        System.out.printf("Los numeros generados por el programa: \n");
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf("%d ", myList[i]);
        }
        System.out.printf("Tus numeros\n");
        for (int i = 0; i < LONG; i++) 
        {
            System.out.printf(" %d ", listaUser[i]);
        }
    }
}