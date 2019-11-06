import java.util.Scanner;
public class HolaMundo{
 public static void main (String args []){
  System.out.println("Hola Mundo");

  int numero1, numero2, resultado;
  Scanner entrada = new Scanner(System.in);

  System.out.print("Ingresa un número: ");
  numero1 = entrada.nextInt();
  System.out.print("Ingresa otro número: ");
  numero2 = entrada.nextInt();

  resultado = numero1 + numero2;
  System.out.println("La Suma de los números que ingresaste es: " + resultado);

  if (resultado > 20){
   System.out.println("El resultado es mayor a 20");
  } else {
   System.out.println("El resultado no es mayor a 20");
  }
 }
}
