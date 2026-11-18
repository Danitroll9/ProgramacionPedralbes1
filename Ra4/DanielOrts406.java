import java.util.Scanner;

class DanielOrts406 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int num, menor;
        System.out.printf(" Escribe un numero: ");
        num = input.nextInt();
        /** Li donem valor a la variable  */
        menor = 0;
        /*Posem la condicio i que escrigui tots el valors fins que arribi al valor posat per l'usuari*/
        while( menor < num)
        {      
           menor ++;
           System.out.printf(" %d ", menor );
        }
        
    }
}