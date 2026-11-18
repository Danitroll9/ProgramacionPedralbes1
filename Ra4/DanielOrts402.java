import java.util.Scanner;

class DanielOrts402 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim la variable */
        int numNeg;
        System.out.printf(" Escribe un numero: ");
        numNeg = input.nextInt();
        /**Fem el bucle per a que si l'usuari introdueix un valor que no sigui negatiu, li pregunti un altre vegada fins que sigui negatiu */
        while(numNeg >= 0){
            System.out.printf(" Prueba otro valor: ");
            numNeg = input.nextInt();
        }
        System.out.printf(" Bien hecho, has puesto un valor negativo :) ");
    }
}