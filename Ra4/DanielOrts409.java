import java.util.Scanner;

class DanielOrts409 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int num, i, suma;
        System.out.printf(" Escribe un numero: ");
        num = input.nextInt();
        /** Les damos valor a las variables, que en este caso sera 1 para la suma, ya que si ponemos 0
         * va a quedarse siempre un numero antes, y para la i ponemos 1 para empezar a multiplicar los numeros desde el primer numero puesto,
         * sino el primer numero que se pusiera no contaria para la suma
          */
        i = 1;
        suma = 1;
        /** Ponemos un bucle while que repita la accion de ir sumando el numero hasta que " i " sea el numero dado por el usuario,
         * el cual se va sumando cada vez que se hace el bucle         */
        while( i < num)
        {  
            i++;
            if(i % 2 != 0)
            {
            suma = suma + i;
            }
        }
        System.out.printf(" La suma de todos los impares es: %d ", suma);
        
    }
}