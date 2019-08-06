package clases;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta{

    protected float transacciones, retiro, deposito;
    private static float saldo;

    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do{
            do{

                System.out.println("Selecciona una opción");
                System.out.println("    1. Consulta de Saldo");
                System.out.println("    2. Retiro de Efectivo");
                System.out.println("    3. Deposito de Efectivo");
                System.out.println("    4. Salir");
                System.out.print("->");
                seleccion = entrada.nextInt();
            
                if(seleccion >= 1 && seleccion <= 4){
                    bandera = 1;
                }else{
                    System.out.println("-----------------------");
                    System.out.println("Opción Invalida");
                    System.out.println("-----------------------");
                }

            }while(bandera == 0);

            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            }else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            }else if(seleccion == 4){
                System.out.println("-----------------------");
                System.out.println("¡Gracias!, vuelve pronto");
                System.out.println("-----------------------");
                bandera = 2;
            }
        }while(bandera !=  2);    
    }

    //Método para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }

    //Método para solicitar cantidad de deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }

    //Método abstracto para realizar transacciones
    public abstract void Transacciones();

    //Métodos Setter and Getter para saldo
    public static float getSaldo(){
        return saldo;
    }

    public static void setSaldo(float consultaSaldo){
        saldo = consultaSaldo;
    }

    public StringBuilder formato(float cantidad){
        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        StringBuilder formato = new StringBuilder(dosDecimales.format(cantidad));
        if(formato.length() > 8){
            formato.insert(3, ",");
        }else if(formato.length() > 7){
            formato.insert(2, ",");
        }else if(formato.length() > 6){
            formato.insert(1, ",");
        }
        return formato;
    }
}