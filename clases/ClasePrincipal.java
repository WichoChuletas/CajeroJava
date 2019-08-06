package clases;
public class ClasePrincipal{
    public static void main(String[] args) {
        ClasePadre_Abstracta nuevaOperacion = new ClaseHija_Consulta();
        nuevaOperacion.setSaldo(1000);
        nuevaOperacion.Operaciones(); 
    }
}