//Ejercicio 49 de Java
import java.util.Scanner;
public class Ejercicio49 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);


        int[] notas = new int[10];
        int suspensos = 0;
        int aprobados = 0;
        int i = 0;

        while (i < 10) {

          System.out.print("Introduce una nota entre 0 y 10: ");
          int nota = teclado.nextInt();

          if (nota >= 0 && nota <= 10) {

           notas[i] = nota;

          if (nota < 5) {
           suspensos++;
          } else {
          aprobados++;
         }

         i++;

            } else {
        System.out.println("Nota incorrecta. Introduce una nota entre 0 y 10.");
            }
        }

        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Numero de aprobados: " + aprobados);
        }
        }
        

