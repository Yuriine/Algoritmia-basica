import java.util.Scanner;

public class Practica{
  public static void main(String Args[]){
    int z = 0;
    do{
      Scanner scn = new Scanner(System.in);
      System.out.println("\nCafeterìa “La Sabrosita”\n" + 
      "\nLista de alimentos con su respectivo codigo" +
      "\n" +
      "       1.	Alimentos\n" +
      "\n           Codig   Nombre       Precio\n" +
      "                A1.  Tortas …………….S/20.00\n" +
      "                A2.  Panes …………………S/9.00\n" +
      "                A3.  Pasteles …………S/9.00\n" +
      "                A4.  Bocaditos ………S/20.00\n" +
      "       2.	Bebidas\n" +
      "\n           Codig   Nombre         Precio\n" +
      "                B1.  Coca Cola ……………S/5.00\n" +
      "                B2.  Inca Cola ……………S/5.00\n" +
      "                B3.  Agua con gas ……S/4.00\n" +
      "                B4.  Agua sin gas ……S/4.00");
      

      System.out.println("\nConsumo de la sección de alimentos"+ 
      "\nIndicarlo con el codigo. \nEjemplo: Si consumió Panes coloque A2");
      char codalim = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int alimcant = scn.nextInt();

      System.out.println("\nConsumo de la sección de bebidas"+ 
      "\nIndicarlo con el codigo. \nEjemplo: Si consumió Agua con gas coloque B3");
      char codbebid = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant = scn.nextInt();
      
      //-----------Proceso-------------//
      int alimConsu = 0; 
      if (codalim == '1' | codalim == '4')
        alimConsu = alimcant * 20;
      if (codalim == '2' | codalim == '3')
        alimConsu = alimcant * 9;

      
      int bebidConsu = 0;
      if (codbebid == '1' | codbebid == '2')
        bebidConsu = bebidcant * 5;

      if (codbebid == '3' | codbebid == '4')
        bebidConsu = bebidcant * 4;
      
      int totalConsu = alimConsu + bebidConsu;
      //----------Fin Proceso------------//

      //-------------Salida--------------//
      System.out.println("\nConsumo del cliente:"+
      "\nCantidad de alimentos: $" + alimConsu + 
      "\nCantidad de bebidas: $" + bebidConsu + 
      "\nConsumo total del cliente: $" + totalConsu);
      //------------Fin Salida-----------//

      //------------Consulta-------------//
      boolean quest = true;
    while (quest == true) {
        System.out.println("\n¿Desea probar con otro numero? \n SI: 1; NO: 2");
        z = scn.nextInt();
        if (z == 1 | z == 2)
        quest = false;
        else
          System.out.println("Respuesta no admitida");
      }
      //--------Fin Consulta------------//
    } while (z != 2);
    System.out.println("Gracias por preferir la cafetería...");
    }
  }  