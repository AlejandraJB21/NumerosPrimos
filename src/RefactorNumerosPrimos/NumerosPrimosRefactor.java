package RefactorNumerosPrimos;

/** Clase para probar el algoritmo de la criba de Eratóstenes 
 *  para generar números primos.
 *
 * @author Alejandra Jarillo Blanco
 */

public class NumerosPrimosRefactor {   
    
    public static void main(String[] args) {
       int[] centArray = CribaEratostenesRefactor.generarPrimos(100); // Probamos a generar los primos entre 1 y 100
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]); // Los mostramos
            
        }
    
    }
}
    
    
 

