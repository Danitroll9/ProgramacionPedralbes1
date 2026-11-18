import java.util.Scanner;

class DanielOrtsJocMonedas {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int monedas, numUser, numProg, turno;
        /**Aqui declaramos que tenemos 15 monedas y que no ha empezado, por lo que el turno es 0 */
        monedas = 15;
        turno = 0;
        /** le decimos al usuario de lo que trata el juego  */
        System.out.printf(" Ahora jugaras contra la maquina al juego de las 15 monedas, puedes pillar minimo 1 y maximo 3, quien pille la ultima pierde.\n");
        /**Aqui decimos que se repita el bucle mientras el numero de monedas sea mayor a 0 */
        while (monedas > 0)
        {
            /**Aqui decimos al usuario cuantas monedas quedan todavia */
            System.out.printf("\nQuedan %d monedas: ", monedas);
            do
            {
                /**Le preguntamos al usuario cuantas monedas quiere retirar con un bucle do while, que se repite si el numero de monedas es mayor al de monedas que hay, si es menor a 1 o mayor a 3 */
                System.out.printf("\n Cuantas monedas quieres retirar? ");
                numUser = input.nextInt();

            }while (numUser < 1 || numUser > 3 || numUser > monedas );
            /**Aqui hacemos que se resten la cantidad de monedas introducida por el usuario y le decimos cuantas quedan, ademas sumamos 1 turno */
            monedas = monedas - numUser;
            System.out.printf("\nHas retirado %d monedas", numUser);
            System.out.printf("\nQuedan %d monedas", monedas);
            turno++;
            /**Aqui ponemos un if que en caso de que queden monedas, sera el turno de la maquina */
            if (monedas > 0)
            {
                System.out.printf("\nAhora le toca a la maquina");
                /**Hacemos un bucle do while que se repita mientras sea un numero mayor al de monedas existentes */
                do
                {
                    numProg= (int) (Math.random() * 3 + 1);

                }while (numProg > monedas);
                /**restamos la cantidad generada y decimos cuantas monedas ha retirado, ademas sumamos 1 turno */
                monedas = monedas - numProg;
                System.out.printf("\nLa maquina ha retirado %d monedas", numProg);
                turno++;
            }
        }
        /**hacemos un if para que en caso de que el ultimo turno sea par, significa que el ultimo turno ha sido de la maquina, por lo que ha perdido la maquina y decimos al usuario que él ha ganado, y en caso contrario pues le decimos que ha ganado la maquina */
        if (turno % 2 == 0)
        {
            System.out.printf("\n El ganador eres tu!");
        }
        else 
        {
            System.out.printf("\n Te ha ganado la maquina!");
        }
    }
}