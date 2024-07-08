package divisas;

import java.util.Scanner;

public class conversionDivisas {
    private double conversionDivisas;
    private double cantidadQueSeConvertira;

    public double getConversionDivisas(){
        return conversionDivisas;

    }
    Scanner entradaDeDatos = new Scanner(System.in);
    public void calcularDeDolaresADivisas(double valorMoneda, String abreviatura){
        cantidadQueSeConvertira = ingresarCantidadQueSeConvertira();
        conversionDivisas = valorMoneda* cantidadQueSeConvertira;
        System.out.println("▒▒▒La cantidad: " + cantidadQueSeConvertira + " [USD], es equivalente a la cantidad: " + conversionDivisas + "["+abreviatura+"]");
    }
    public void calcularEnDolares(double valorMoneda, String abreviatura){
        double cantidadQueSeConvertira = ingresarCantidadQueSeConvertira();

        conversionDivisas = cantidadQueSeConvertira/valorMoneda;
        System.out.println("▒▒▒La cantidad: " +cantidadQueSeConvertira+ "["+abreviatura+"], es equivalente a la cantidad: " + conversionDivisas +"[USD] \n");
    }

    public double ingresarCantidadQueSeConvertira(){
        try {
            System.out.println("Escriba la cantidad que desea convertir: ");
            cantidadQueSeConvertira = Double.valueOf(entradaDeDatos.next());

        }catch (NumberFormatException n){
            System.out.println("Ocurrió un error: " + n.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrió un error : "+e.getMessage());
        }
        return cantidadQueSeConvertira;
    }

}