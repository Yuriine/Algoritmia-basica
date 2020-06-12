
import java.util.Scanner;

 

public class Learning {
    public static void main(String[] args){
        Scanner ent=new Scanner(System.in);
        System.out.println("Elija su plan de telefonía fija \nA \nB \nC");
        String plan=ent.nextLine();
        System.out.println("¿Cuántos minutos fue los que uso?");
        int min=ent.nextInt();
        int m;
        if(plan.equalsIgnoreCase("A")==true){
            if(min>=300){
                double pago=(min-300)*0.1;
            System.out.println("El plan "+plan+" cuenta con 300 min. libres");
            System.out.println("Minutos totales usados: "+min);
            System.out.println("Pago por minutos adicionales: "+pago+" soles \nUsted no posee descuento");
            }
            else {
            m=300-min;
            System.out.println("El plan "+plan+" cuenta con 300 min. libres");
            System.out.println("Aún cuenta con "+m+" minutos"); 
            }
        }
        else if(plan.equalsIgnoreCase("B")==true){
            if(min>=200){
                double pago=(min-200)*0.08;
                double desc=pago*0.95;
            System.out.println("El plan "+plan+" cuenta con 300 min. libres");
            System.out.println("Minutos totales usados: "+min);
            System.out.println("Pago por minutos adicionales: "+pago+" soles \nUsted posee un descuento del 5%");
            System.out.println("Total a pagar: "+desc+" soles");
            }
            else {
            m=200-min;
            System.out.println("El plan "+plan+" cuenta con 200 min. libres");
            System.out.println("Aún cuenta con "+m+" minutos"); 
            }
        }    
        else if(plan.equalsIgnoreCase("C")==true){
            if(min>=100){
                double pago=(min-100)*0.05;
                double desc=pago*0.9;
            System.out.println("El plan "+plan+" cuenta con 100 min. libres");
            System.out.println("Minutos totales usados: "+min);
            System.out.println("Pago por minutos adicionales: "+pago+" soles \nUsted posee un descuento del 10%");
            System.out.println("Total a pagar: "+desc+" soles");
            }
            else {
            m=100-min;
            System.out.println("El plan "+plan+" cuenta con 100 min. libres");
            System.out.println("Aún cuenta con "+m+" minutos"); 
            }
                }        
        else 
            System.out.println("Usted no lo eligió ninguno de los tres planes");
    }
}
