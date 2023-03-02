

import numerosprimos.CribaEratostenes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alejandra Jarillo Blanco
 */
public class TestNumerosPrimos {
    
    public TestNumerosPrimos() {
        
    }
    @Test
    public void generaPrimo1() {
        int[] centArray = CribaEratostenes.generarPrimos(0);
        System.out.println("Los primos de max 0 son los siguientes: ");
        if (centArray.length > 0) {
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 0.");
        }

    }
    @Test
    public void generaPrimo2() {
        int[] centArray = CribaEratostenes.generarPrimos(2);
        if (centArray.length > 0) {
            System.out.println("Los primos de max 2 son los siguientes: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 2.");
        }
    }

    @Test
    public void generaPrimo3() {
        int[] centArray = CribaEratostenes.generarPrimos(3);
        if (centArray.length > 0) {
            System.out.println("Los primos de max 3 son los siguientes: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 3.");
        }
    }

    @Test
    public void generaPrimo4() {
        int[] centArray = CribaEratostenes.generarPrimos(100);
        if (centArray.length > 0) {
            System.out.println("Los primos de max 100 son los siguientes: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 100.");
        }
    }
}
