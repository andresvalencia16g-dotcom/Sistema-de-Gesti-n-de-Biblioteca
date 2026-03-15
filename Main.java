import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MaterialBibliografico> lista = new ArrayList<>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== BIBLIOTECA - MENU PRINCIPAL ===");
            System.out.println("1. Agregar material");
            System.out.println("2. Listar materiales");
            System.out.println("3. Simular multa");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Que va a llevar? 1.Libro 2.Revista 3.Pelicula");
                int tipo = sc.nextInt();
                sc.nextLine();
                System.out.print("Titulo: "); String t = sc.nextLine();
                System.out.print("Codigo: "); String c = sc.nextLine();

                if (tipo == 1) {
                    System.out.print("Autor: "); String a = sc.nextLine();
                    System.out.print("Paginas: "); int p = sc.nextInt();
                    lista.add(new Libro(t, c, a, p));
                } else if (tipo == 2) {
                    System.out.print("Edicion: "); int ed = sc.nextInt();
                    lista.add(new Revista(t, c, "Mensual", ed));
                } else if (tipo == 3) {
                    System.out.print("Director: "); String dir = sc.nextLine();
                    System.out.print("Duracion: "); int dur = sc.nextInt();
                    lista.add(new Pelicula(t, c, dir, dur));
                }

            } else if (opcion == 2) {
                System.out.println("\n--- Listado disponible ---");
                for (MaterialBibliografico m : lista) {
                    m.mostrarInformacion();
                }

            } else if (opcion == 3) {
                System.out.print("odigo: ");
                String buscar = sc.nextLine();
                System.out.print("dias de retraso? ");
                int dias = sc.nextInt();

                for (MaterialBibliografico m : lista) {
                    if (m.getCodigo().equals(buscar)) {
                        System.out.println("La multa es: $" + m.calcularMulta(dias));
                    }
                }
            }
        }
    
    }
}