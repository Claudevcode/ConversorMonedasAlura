import divisas.conversionDivisas;
import divisas.divisasDesdeApi;
import modelo.Divisa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entradaDeDatos = new Scanner(System.in);
        while(true){
            mostrarMensajes();

            try {

                int opcion=Integer.valueOf(entradaDeDatos.next());
                if(opcion == 11){
                    break;
                }
                String abreviaturaDivisa;
                divisasDesdeApi buscarDivisa = new divisasDesdeApi();
                conversionDivisas calcularDivisa = new conversionDivisas();
                Divisa divisaBuscada;
                switch (opcion) {

                    case 1:
                        abreviaturaDivisa="MXN";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularDeDolaresADivisas(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 2:
                        abreviaturaDivisa="MXN";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularEnDolares(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 3:
                        abreviaturaDivisa="ARS";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularDeDolaresADivisas(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 4:
                        abreviaturaDivisa="ARS";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularEnDolares(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 5:
                        abreviaturaDivisa="BRL";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularDeDolaresADivisas(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 6:
                        abreviaturaDivisa="BRL";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularEnDolares(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 7:
                        abreviaturaDivisa="COP";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularDeDolaresADivisas(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 8:
                        abreviaturaDivisa="COP";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularEnDolares(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 9:
                        abreviaturaDivisa="PEN";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularDeDolaresADivisas(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    case 10:
                        abreviaturaDivisa="PEN";
                        divisaBuscada = buscarDivisa.buscar(abreviaturaDivisa);
                        calcularDivisa.calcularEnDolares(divisaBuscada.getValor(),abreviaturaDivisa);
                        break;
                    default:
                        System.out.println("Opción no valida");
                        break;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("═════════════════════════════════════════════════════════════════════════════════════");
        }
    }
   public static void mostrarMensajes(){
        System.out.println("»»»»»»»»» Escriba el número correspondiente a la divisa que desea convertir «««««««««\n");
        System.out.println(""" 
                               ╔═══════════════════════════════════════════════════════════════════════════════════╗
                               ║                          01 = Dolar ═════> Peso mexicano                          ║
                               ║                          02 = Peso mexicano ═════> Dolar                          ║
                               ║                          03 = Dolar ════> Peso argentino                          ║
                               ║                          04 = Peso argentino ════> Dolar                          ║
                               ║                          05 = Dolar ════> Real brasileño                          ║
                               ║                          06 = Real brasileño ════> Dolar                          ║
                               ║                          07 = Dolar ═══> Peso colombiano                          ║
                               ║                          08 = Peso colombiano ═══> Dolar                          ║
                               ║                          09 = Dolar ═══════> Sol peruano                          ║
                               ║                          10 = Sol peruano ═══════> Dolar                          ║                            
                               ║                          11 = »»»»»»»»» Salir ««««««««««                          ║
                               ╚═══════════════════════════════════════════════════════════════════════════════════╝                          
                               """);



    }
}
