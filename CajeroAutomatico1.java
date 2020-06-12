import java.util.Scanner;

public class CajeroAutomatico1 {
  public static void main(String[] args) {
    int clave = 123;
    int saldo = 500000;
    int valor_aretirar;
    int clave_leida;
    int opcion = 0;
    int cantidadAtransferir = 0;
    int cuentaAtransferir;

    Scanner lector = new Scanner(System.in);

    System.out.print("ingrese la clave: ");
    clave_leida = Integer.parseInt(lector.next());
    if (clave == clave_leida) {

      do {
        System.out.println("*****************************************");
        System.out.println("******** Bienvenido al cajero ATSteven ********");
        System.out.println("     ****** Seleccione una opcion ******     ");
        System.out.println("*****************************************");
        System.out.println("1. Retirar efectivo");
        System.out.println("2. Cambiar clave");
        System.out.println("3. Realizar transferencia");
        System.out.println("4. Ver ultimos movimientos");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Salir ");

        opcion = lector.nextInt();
        switch (opcion) {
          case 1:
            System.out.println("Por favor ingres la cantidad a retirar");
            valor_aretirar = lector.nextInt();
            if (valor_aretirar <= saldo) {
              saldo = saldo - valor_aretirar;
              System.out.println("Su nuevo saldo es: " + saldo);
            } else {
              System.out.println("Fondos Insuficientes, su saldo es: " + saldo);
            }
            break;
          case 2:
            System.out.println(" Por favor ingrese su nueva clave");
            clave = lector.nextInt();
            System.out.println(" Su clave ha sido modificada con exito");
            break;
          case 3:
            System.out.println("Por favor ingrese la cantidad a tranferir");
            cantidadAtransferir = lector.nextInt();
            if (cantidadAtransferir <= saldo) {
              System.out.println("Por favor ingrese el numero de cuenta donde va a transferir el dinero");
              cuentaAtransferir = lector.nextInt();
              saldo = saldo - cantidadAtransferir;
              System.out.println("Transferencia satisfactoria por valor de : " + cantidadAtransferir);
              System.out.println("Su nuevo saldo es: " + saldo);
            }
            break;
          case 4:
            System.out.println("No tiene movimeintos en la ultima semana");
            break;
          case 5:
            System.out.println("Su saldo Actual es: " + saldo);
            break;
          case 6:
            System.out.println("Gracias por usar nuestro cajero...");

            System.exit(0);
            break;

        }
        System.out.println("Para seguir digite 0, para salir digite 6");
        opcion = lector.nextInt();
      } while (opcion != 6);
      System.out.println("Gracias por usar nuestro cajero...");
    } else {
      System.out.println(" La Clave es incorrecta");
    }

  }
}