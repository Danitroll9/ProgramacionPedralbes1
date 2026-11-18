import java.util.Scanner;

class DanielOrtsJoc3Bien {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int valor1, valor2, resta, numUser, aciertos, errores, i, respuesta;
        long inici, fin, tiempo;
        /**Aqui decimos que tenemos numero 0 de restas que se han hecho "i" por hacer y que empezamos con 0 aciertos y 0 errores antes de empezar el bucle que se repetira las veces que el usuario quiera        */
        aciertos = 0;
        errores = 0;
        i = 0;
        /**iniciamos el temporizador y entramos en el bucle que seguira mientras el usuario no elija la opcion de acabar el programa*/    
        inici = System.currentTimeMillis() / 1000;
        do
        {   
            /**en este bucle generamos 2 numeros aleatorios con los que hacer las restas y declaramos el resultado y mientras el numero 1 y el 2 sean iguales o el 1 sea menor que el segundo se repetira el bucle hasta conseguir los valores que queremos */
            do 
            {
                valor1 = (int) (Math.random() * 10);
                valor2 = (int) (Math.random() * 10);

                valor1++;
                valor2++;
                resta = valor1 - valor2;
            
            } while (valor1 == valor2 || valor1 < valor2 );
            /** Le preguntamos al usuario la respuesta a la resta generada */
            System.out.printf("\nCual es la respuesta a la resta de " +valor1 +" - " + valor2 +"?\n");
            numUser =input.nextInt();
            /** Si el usuario falla, le decimos que ha fallado, restamos una resta y sumamos 1 error */
            if ( numUser != resta)
            {
                System.out.printf("\n No es el resultado correcto!");
                errores++;
            }
            else 
            /**Si acierta la resta, se lo decimos, restamos una resta y le sumamos 1 acierto */
            {
                System.out.printf("\n Has acertado!");
                aciertos++;
            }
            i++;
            System.out.printf("\n Presiona 1 para hacer otra resta, presiona 2 para acabar: ");
            respuesta = input.nextInt();
            if (respuesta == 1)
            {
                valor1 = (int) (Math.random() * 10);
                valor2 = (int) (Math.random() * 10);

                valor1++;
                valor2++;
                resta = valor1 - valor2;
            }
            /**si la respuesta no esta dentro de los parametros se le dira que no es una respuesta valida y que vuelva a elegir  */
            else if (respuesta > 3 || respuesta < 1)
            {
                System.out.printf("\nEsa no es una opcion valida, vuelve a intentarlo\n");
            }
            /**si elige 1, el usuario tendra que responder la resta que ha elegido */
        }while (respuesta != 2);
        /** Aqui declaramos el final del temporizador, y calculamos el tiempo total */
        fin = System.currentTimeMillis() / 1000;
        tiempo = fin - inici;
        /**Aqui le decimos al usuario en cuanto tiempo ha hecho las restas, los aciertos, los errores totales y la cantidad de restas propuestas por el programa*/
        System.out.printf( "\nHas terminado en %d segundos con %d aciertos, %d errores y el programa te ha propuesto %d restas", tiempo, aciertos, errores, i);
    }
}