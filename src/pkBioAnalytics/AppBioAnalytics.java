package pkBioAnalytics;

import pkBioAnalytics.pkHumano.*;
import java.util.Scanner;

public class AppBioAnalytics {
	public void iniciarMundoProtista() {
        MicroBiologo microBio = new MicroBiologo(
            "Juan",
            "Perez", 
            "1743782691", 
            "juan123", 
            "password123", 
            "Microbiología Molecular"
        );

        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Laboratorio de Biologia");
        System.out.println("Autenticarse en el Laboratorio");

        System.out.print("Ingrese su usuario: ");
        String username = input.nextLine().trim();

        System.out.print("Ingrese su password: ");
        String password = input.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        microBio.login(username, password);
    }
}
