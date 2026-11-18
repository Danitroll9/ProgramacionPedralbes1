import java.util.Scanner;

class DanielOrts408 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int num, i, mult;
        System.out.printf(" Escribe un numero: ");
        num = input.nextInt();
        /** Les damos valor a las variables, que en este caso sera 1 para el producto, ya que si ponemos 0
         * no se multiplicara, darian 0, y para la i ponemos 1 para empezar a multiplicar los numeros desde el primer numero puesto,
         * sino el primer numero que se pusiera no contaria para el producto
          */
        i = 1;
        mult = 1;
        /** Ponemos un bucle do-while que repita la accion de ir multiplicando el numero hasta que " i " sea el numero dado por el usuario,
         * el cual se va sumando cada vez que se hace el bucle         */
        do{
            mult = mult * i;
            i++;

        } while( i <= num);
        System.out.printf(" El producto es: %d ", mult);
        
    }
}