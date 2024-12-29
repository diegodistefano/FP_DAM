import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Determino las variables del programa
        int nuss = 0;
        byte sintoma = 0;
        byte exploracion = 0;
        byte nivelPrioridad = 0;
        byte temperaturaActual = 0;

        String txtSintoma = "";
        String txtExploracion = "";

        // Solicito el ingreso de datos nuss
        System.out.print("NUSS?: ");
        Scanner entradaNuss = new Scanner(System.in);
        nuss = entradaNuss.nextInt();

        // Solicito el ingreso de sintomas
        System.out.println("¿Sintoma?: ");
        System.out.println(
                "Dolor (0)\n" +
                "Lesión traumática (1)\n" +
                "Fiebre alta (2)\n" +
                "Confusión o desorientación (3)");

        Scanner entradaSintoma = new Scanner(System.in);
        sintoma = entradaSintoma.nextByte();

        // Solicito el ingreso de Exploracion
        System.out.println("¿Exploracion?: ");
        System.out.println(
                "Fractura ósea (0)\n" +
                "Herida de bala (1)\n" +
                "Quemadura (2)\n" +
                "Lesión cerebral traumática (3)"
        );

        Scanner entradaExploracion = new Scanner(System.in);
        exploracion = entradaExploracion.nextByte();


        // Solicito el ingreso de Prioridad
        System.out.println("¿Nivel de Prioridad?: ");

        Scanner entradaPrioridad = new Scanner(System.in);
        nivelPrioridad = entradaPrioridad.nextByte();

        // Solicito el ingreso de Temperatura
        System.out.println("¿Temperatura actual?: ");

        Scanner entradaTemperatura = new Scanner(System.in);
        temperaturaActual = entradaTemperatura.nextByte();



        switch (sintoma) {
            case 0:
                txtSintoma = "Dolor";
                break;
            case 1:
                txtSintoma = "Lesión traumática";
                break;
            case 2:
                txtSintoma = "Fiebre alta";
                break;
            case 3:
                txtSintoma = "Confusión o desorientación";
                break;
            default:
                txtSintoma = "Ingrese un valor válido";
                break;
        }

        switch (exploracion) {
            case 0:
                txtExploracion = "Fractura ósea";
                break;
            case 1:
                txtExploracion = "Herida de bala";
                break;
            case 2:
                txtExploracion = "Quemadura";
                break;
            case 3:
                txtExploracion = "Lesión cerebral traumática";
                break;
            default:
                txtExploracion = "Ingrese un valor válido";
                break;
        }

        //Impresion por pantalla usando un Formato
        System.out.printf("%-10s %-25s  %-25s  %-20s %-20s%n", "Nuss", "Sintoma", "Exploracion","nivel de prioridad","Temperatura actual");
        System.out.printf("%-10d %-25s  %-25s  %-20d %-20d%n",nuss, txtSintoma, txtExploracion, nivelPrioridad,temperaturaActual);
    }
}
