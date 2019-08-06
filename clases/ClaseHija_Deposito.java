package clases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta{

    @Override
    public void Transacciones(){
        int bandera = 0;
        do{
            System.out.println("¿Cuánto deseas depositar?");
            System.out.print("->");
            Deposito();
            if(deposito > 10000){
                System.out.println("------------------------------------");
                System.out.println("No puedes depositar más de $10,000.00, intenta de nuevo con otra cantidad");
                System.out.println("------------------------------------");
            }else if(deposito < 50){
                System.out.println("------------------------------------");
                System.out.println("No puedes depositar menos de $50.00, intenta de nuevo con otra cantidad");
                System.out.println("------------------------------------");
            }else{
                transacciones = getSaldo();
                setSaldo(transacciones + deposito);
                System.out.println("------------------------------------");
                System.out.println("Depositaste : $ " + formato(deposito));
                System.out.println("Tu Saldo Actual : $ " + formato(getSaldo()));
                System.out.println("------------------------------------");
                bandera = 1;
            }
        }while(bandera == 0);
    }
}