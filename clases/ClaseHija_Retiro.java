package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta{

    @Override
    public void Transacciones(){
        int bandera = 0;
        do{
            System.out.println("¿Cuánto deseas retirar?");
            System.out.print("->");
            Retiro();
            if(retiro <= getSaldo()){
                if (retiro < 50 ){
                    System.out.println("------------------------------------");
                    System.out.println("Los retiros deben ser mayor y multiplos de $ 50.00, intenta de nuevo con otra cantidad");
                    System.out.println("------------------------------------");
                }else if(retiro > 10000){
                    System.out.println("------------------------------------");
                    System.out.println("No puedes retirar más de $ 10,000.00, intenta de nueva con otra cantidad");
                    System.out.println("------------------------------------");
                }else{
                    if(retiro%50 == 0){
                        transacciones = getSaldo();
                        setSaldo(transacciones - retiro);
                        System.out.println("------------------------------------");
                        System.out.println("Retiraste : $ "+ formato(retiro));
                        System.out.println("Tu Saldo Actual : $ " + formato(getSaldo()));
                        System.out.println("------------------------------------");
                        bandera = 1;
                    }else{
                        System.out.println("------------------------------------");
                        System.out.println("Solo puedes retirar en multiplos de $ 50.00, intenta de nueva con otra cantidad");
                        System.out.println("------------------------------------"); 
                    }
                }
            }else if(retiro >= getSaldo()){
                System.out.println("------------------------------------");
                System.out.println("Saldo Insuficiente");
                System.out.println("------------------------------------");
                bandera = 1;
            }
        }while(bandera == 0);
    }
}