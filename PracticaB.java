import java.util.Scanner;

public class PracticaB {
  public static void main(String Args[]){
    boolean s = true;
    while (s == true) {

      Scanner scn = new Scanner(System.in);

      System.out.println("\nHOTEL\n" +
      "     1. Habitación                    2.Permanencia\n" +
      "          Tipo       Costo                 Días           Descuento\n" +
      "           A         $120                  1-3              2%\n" +
      "           B         $80                   4-7              10%\n" +
      "           C         $50                   8 a más          18%");
      
      //-----------Entrada-------------//
      System.out.println("\nTipo  de habitación" + 
      "\nIndique el tipo de habitación en el que se hospedará."+
      "\nEjemplos: A, B o C");
      char tipo = scn.next().charAt(0);
      
      System.out.println(tipo);

      System.out.println("\nTiempo de permanencia"+ 
      "\nIndique el tiempo de estadia en el hotel"+
      "\nEjemplos: 3 días, 5 días o 10 días");
      String tdias = scn.nextLine();
      int dias = Integer.parseInt(tdias);
      //---------Fin Entrada-----------//
      System.out.println(dias + " " + tdias);
      //-------------Proceso-------------//
      int costo = 1;
      if (tipo == 'A' | tipo == 'B' | tipo == 'C') {
        switch (tipo) {
          case 'A':
            costo = 120 * días;
            break;
          case 'B':
            costo = 80 * días;
            break;
          case 'C':
            costo = 50 * días;
            break;
        }
      }

      float descuento = 1;
      if (días > 0) {
        if (días > 0 && días <= 3) 
          descuento = costo * 98 / 100;
        else if (días > 3 & días <= 7) 
          descuento = costo * 90 / 100;
        else 
          descuento = costo * 82 / 100;
        }
      //----------Fin Proceso------------//

      //-------------Salida--------------//
      System.out.println("\nConsumo del cliente:"+
      "\nEl monto por su estadía en el hotel es: " + descuento);
      //------------Fin Salida-----------//

      //------------Consulta-------------//
      boolean quest = true;
      while (quest == true) {
        System.out.println("\n¿Desea probar con otro numero? \n SI: 1; NO: 2");
        int z = scn.nextInt();
        if (z == 1) 
          quest = false;
        else if (z == 2) {
          s = false;
          quest = false;
        } else
          System.out.println("Respuesta no admitida");
      }
      //--------Fin Consulta------------//
    }
  }
}