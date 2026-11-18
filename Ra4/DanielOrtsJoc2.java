import java.util.Scanner;

class DanielOrtsJoc2 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int valor1, valor2, resta, numUser, aciertos, errores, i;
        long inici, fin, tiempo;
        /**Aqui decimos que tenemos 5 restar por hacer y que empezamos con 0 aciertos y 0 errores antes de empezar el bucle que se repetira mientras no hayamos hecho las 5 restas         */
        i = 5;
        aciertos = 0;
        errores = 0;
        do
        {   
            /**iniciamos el temporizador y entramos en el bucle que seguira mientras el numero de restas restantes sea mayor a 0 */    
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
                    i--;
                    errores++;
                }
                else 
                /**Si acierta la resta, se lo decimos, restamos una resta y le sumamos 1 acierto */
                {
                    System.out.printf("\n Has acertado!");
                    i--;
                    aciertos++;
                }
            }while ( i > 0);
            /** Aqui declaramos el final del temporizador, y calculamos el tiempo total */
            fin = System.currentTimeMillis() / 1000;
            tiempo = fin - inici;

        }while (i != 0);
        /**Aqui le decimos al usuario en cuanto tiempo ha hecho las restas, los aciertos y los errores totales */
        System.out.printf( "\nHas terminado en %d segundos con %d aciertos y %d errores", tiempo, aciertos, errores);
    }
}