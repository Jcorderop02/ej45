/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 25/10/21
 */
package aplicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*try {
            System.out.println("Introduzca dos numeros:");
            Scanner sc = new Scanner(System.in);
            Integer numero = sc.nextInt();
            Integer numero2 = sc.nextInt();
            int suma = numero + numero2;
            System.out.println("El total de la suma es: " + suma);
            sc.close();
        }catch (InputMismatchException exception){
            System.out.println("Ha introducido una letra");
        }*/

        //Intentando hacer lo de arriba con un bucle

        boolean verdadero = true;
        while(verdadero){
            //for(boolean verdadero = true ;verdadero;) {
                //int x = 0;
            try {
                Scanner sc2 = new Scanner(System.in);
                int suma = 0;

                for (int i = 0; i < 2; i++) {
                    System.out.println("Introduzca un numero entero");
                    suma += sc2.nextInt();
                }
                System.out.println("La suma total es: " + suma);
                verdadero = false;
                //x++;
            } catch (InputMismatchException exception) {
                System.out.println("Ha introducido una letra");
                verdadero = true;
            }
        }
    }
}