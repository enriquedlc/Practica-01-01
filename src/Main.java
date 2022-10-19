import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        System.out.println("Tiempo inicio " + inicio);

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("notepad.exe");
        Process miProceso = null;
        ArrayList<Process> listaProcesos = new ArrayList<>();

        try {
            int timesToOpen;
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduzca el numero de ventanas que quiere abrir: ");
            timesToOpen = scan.nextInt();

            for (int i = 0; i < timesToOpen; i++) {
                miProceso = processBuilder.start();
                listaProcesos.add(miProceso);
            }

            for (int i = 0; i < listaProcesos.size(); i++) {
                Process proceso = listaProcesos.get(i);
                while (proceso.isAlive());
            }
            miProceso.waitFor();

        } catch (IOException | InterruptedException error) {
            error.printStackTrace();
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo final: " + tiempoFinal);
        System.out.println("Tiempo de ejecucion: " + (tiempoFinal-inicio));
    }
}