//Exercicio 10
import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    Scanner leitor = novo Scanner (System.in);
    
    duplo funcao = 0,0;

    System.out.println ("Informe o valor de x:");
    duplo x = leitor.nextDuplo ();
    System.out.println ("Informe o valor de y:");
    double y = leitor.nextDouble ();

    if (x <-32 || x> 32) {
      System.out.println ("O valor de x precisa estar entre -32 a 32!");
    } else if (y <-32 || y> 32) {
      System.out.println ("O valor de y precisa estar entre -32 a 32!");
    } senão {
      funcao = -200 * Math.pow (Math.E, -0,2 * Math.sqrt (Math.pow (x, 2) + Math.pow (y, 2))) + Math.pow ((5 * Math.E ), Math.cos (3 * x) + Math.sin (3 * y));

      System.out.println ("O cálculo da função obtida o valor:" + função);
    }
  }
}
