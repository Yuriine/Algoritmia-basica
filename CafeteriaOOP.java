import java.util.Scanner;

public class CafeteriaOOP {
  
   int mprecio; String mcodigo;
   
   public Producto (String codigo, int precio) { 
    mcodigo = codigo; mprecio = precio; }
   
  public static void main(String Args[]) {
    boolean s = true;
    while (s == true) {
      Scanner scn = new Scanner(System.in);

      Producto tortas = new Producto(A1, 20.00);

      System.out.println("\nCafeterìa “La Sabrosita”\n" + "\nLista de alimentos con su respectivo codigo\n"
          + "       1.	Alimentos\n" + "\n           Codig   Nombre       Precio\n"
          + "                A1.  Tortas …………….S/20.00\n" + "                A2.  Panes …………………S/9.00\n"
          + "                A3.  Pasteles …………S/9.00\n" + "                A4.  Bocaditos ………S/20.00\n\n"
          + "      2.	Bebidas\n" + "\n           Codig   Nombre         Precio\n"
          + "                B1.  Coca Cola ……………S/5.00\n" + "                B2.  Inca Cola ……………S/5.00\n"
          + "                B3.  Agua con gas ……S/4.00\n" + "                B4.  Agua sin gas ……S/4.00");

      System.out.println("\nConsumo de la sección de alimentos");
      System.out.println(tortas)
/*
      boolean consumo = true;
      if (consumo == true) {
        System.out.println("\nIndique el codigo del produto.");
        //
        System.out.println("Ingrese la cantidad que consumió");
        //
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el codigo del produto.");
      char codalim2 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int alimcant2 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el codigo del produto.");
      char codalim3 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int alimcant3 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el cdigo del produto.");
      char codalim4 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int alimcant4 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      
      consumo = true;
      System.out.println("\nConsumo de la sección de bebidas");

      if (consumo == true) {
        System.out.println("\nIndique el código del producto.");
      char codbebid1 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant1 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el código del producto.");
      char codbebid2 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant2 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el código del producto.");
      char codbebid3 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant3 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      if (consumo == true) {
        System.out.println("\nIndique el código del producto.");
      char codbebid4 = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant4 = scn.nextInt();
        boolean quest = true;
        while (quest == true) {
          System.out.println("onsumio otro alimento?\n SI: 1; NO: 2");
          int w = scn.nextInt();
          if (w == 1)
            quest = false;
          else if (w == 2) {
            consumo = false;
            quest = false;
          } else
            System.out.println("Respuesta no admitida");
        }
      }
      

      // -----------Proceso-------------//
      int alimConsu = 0;
      if (codalim1 == '1' | codalim1 == '4' | codalim1 == '2' | codalim1 == '3') {
        if (codalim1 == '1' | codalim1 == '4')
          alimConsu += alimcant1 * 20;
        if (codalim1 == '2' | codalim1 == '3')
          alimConsu += alimcant1 * 9;
      }
      if (codalim2 == '1' | codalim2 == '4' | codalim2 == '2' | codalim2 == '3') {
        if (codalim2 == '1' | codalim2 == '4')
          alimConsu += alimcant2 * 20;
        if (codalim2 == '2' | codalim2 == '3')
          alimConsu += alimcant2 * 9;
      }
      if (codalim3 == '1' | codalim3 == '4' | codalim3 == '2' | codalim3 == '3') {
        if (codalim3 == '1' | codalim3 == '4')
          alimConsu += alimcant3 * 20;
        if (codalim3 == '2' | codalim3 == '3')
          alimConsu += alimcant3 * 9;
      }
      if (codalim4 == '1' | codalim4 == '4' | codalim4 == '2' | codalim4 == '3') {
        if (codalim4 == '1' | codalim4 == '4')
          alimConsu += alimcant4 * 20;
        if (codalim4 == '2' | codalim4 == '3')
          alimConsu += alimcant4 * 9;
      }

      int bebidConsu = 0;
      if (codbebid1 == '1' | codbebid1 == '2' | codbebid1 == '3' | codbebid1 == '4') {
        if (codbebid1 == '1' | codbebid1 == '2')
          bebidConsu = bebidcant1 * 5;
        if (codbebid1 == '3' | codbebid1 == '4')
          bebidConsu = bebidcant1 * 4;
      }
      if (codbebid2 == '1' | codbebid2 == '2' | codbebid2 == '3' | codbebid2 == '4') {
        if (codbebid2 == '1' | codbebid2 == '2')
          bebidConsu += bebidcant2 * 5;
        if (codbebid2 == '3' | codbebid2 == '4')
          bebidConsu += bebidcant2 * 4;
      }
      if (codbebid3 == '1' | codbebid3 == '2' | codbebid3 == '3' | codbebid3 == '4') {
        if (codbebid3 == '1' | codbebid3 == '2')
          bebidConsu += bebidcant3 * 5;
        if (codbebid3 == '3' | codbebid3 == '4')
          bebidConsu += bebidcant3 * 4;
      }
      if (codbebid4 == '1' | codbebid4 == '2' | codbebid4 == '3' | codbebid4 == '4') {
        if (codbebid4 == '1' | codbebid4 == '2')
          bebidConsu += bebidcant4 * 5;
        if (codbebid4 == '3' | codbebid4 == '4')
          bebidConsu += bebidcant4 * 4;
      }

      int totalConsu = alimConsu + bebidConsu;
      // ----------Fin Proceso------------/*/

      // ------------Salida-------------//
      System.out.println("\nConsumo del cliente:\nCantidad de alimentos: $" + alimConsu + "\nCantidad de bebidas: $"
          + bebidConsu + "\nConsumo total del cliente: $" + totalConsu);
      // -----------Fin Salida-----------//

      // -----------Consulta-------------//
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
      // --------Fin Consulta------------//
    }
  }
}