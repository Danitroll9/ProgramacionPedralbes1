import java.util.Scanner;

class DanielOrts407_1 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int num, menor;
        System.out.printf(" Escribe un numero: ");
        num = input.nextInt();
        /** Li donem valor a la variable  */
        menor = num;
        /*Posem la condicio que si el valor es mayor a 0 que sigui fent la compte enrere fins que arribi a 0 */
        do
        {  
            System.out.printf(" %d ", menor );
            menor --;
        }while( menor > 0);
        
    }
}