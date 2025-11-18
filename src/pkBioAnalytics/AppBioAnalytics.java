package pkBioAnalytics;

import pkBioAnalytics.pkHumano.*;
import pkBioAnalytics.pkReinoViviente.pkProtista.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppBioAnalytics {
    private String nombreLab;

    public void inciarLaboratorio() {

        MicroBiologo microBio = new MicroBiologo(
                "Juan",
                "Perez",
                "1743782691",
                "juan",
                "123",
                "Microbiología Molecular"
        );

        Scanner input = new Scanner(System.in);

        System.out.println("Laboratorio de Biologia BioAnalytics");
        System.out.println("Autenticarse en el Laboratorio");

        boolean acceso = false;
        int intentos = 0;

        while (!acceso && intentos < 3) {
            System.out.print("Ingrese su usuario: ");
            String username = input.nextLine().trim();

            System.out.print("Ingrese su password: ");
            String password = input.nextLine();

            acceso = microBio.login(username, password);

            if (acceso) {
                System.out.println("\nAcceso permitido.\n");
                microBio.showInfo();
            } else {
                intentos++;
                System.out.println("Acceso denegado. Intento " + intentos + " de 3.");
                if (intentos == 3) {
                    System.out.println("Número máximo de intentos alcanzado.");
                }
            }
        }

        input.close();

        if (acceso) {

            // ----------- Protozoos ya existentes -------------
            Ameba ameba1 = new Ameba("Amebina", 25, 20);
            Heliozoo heliozoo1 = new Heliozoo("Heliozon", 40, 12);
            Dinidium dinidium = new Dinidium("DinidiumSt", 6.0, 5, true, 20, true);
            Paramecium paramecium = new Paramecium("ParameciumSt", 6.0, 4, true);

            Esporozoo esporozooA = new Esporozoo("Cepa A (Plasmodium)", 1500);
            Esporozoo esporozooB = new Esporozoo("Cepa B (Toxoplasma)", 1200);

            // -------------- NUEVOS: Flagelados ----------------
            Tripanosoma tripano = new Tripanosoma("TrypoX", 12.5, 1, "Infección hemática");
            Euglenoide eugle = new Euglenoide("EuglenaVerde", 15.0, 1, "Verde intenso", true);

            System.out.println("\nRegistro de protozoos en el sistema\n");

            List<Protozoo> protozoos = Arrays.asList(
                    ameba1, heliozoo1,
                    esporozooA, esporozooB,
                    dinidium, paramecium,
                    tripano, eugle
            );

            registrar(protozoos);
            System.out.println();

            // ---------------- R1 ---------------------
            System.out.println("Simulación de interacciones entre protozoos...\n");
            microBio.observar();

            // Movimientos de ejemplo:
            ameba1.mover();
            ameba1.dividir();
            heliozoo1.mover();
            heliozoo1.descansar(2);

            // ---------------- R2 ---------------------
            System.out.println("\n== Caso de uso: REQ 02 ==");
            heliozoo1.cazar(ameba1);
            ameba1.cazar(heliozoo1);
            System.out.println();

            // ---------------- R4 (FLAGELADOS) ---------------------
            System.out.println("\n== Caso de uso: REQ 04 ==");
            System.out.println("Competencia entre Tripanosoma y Euglenoide\n");

            tripano.mover();
            eugle.mover();

            tripano.parasitar(eugle);
            eugle.fotosintetizar();

            // ---------------- R5 (FLAGELADOS) ---------------------
            System.out.println("\n== Caso de uso: REQ 05 ==");
            System.out.println("El Euglenoide busca luz y muestra comportamiento fototáctico\n");

            eugle.mover();
            eugle.fotosintetizar();

            // ---------------- R3 ---------------------
            System.out.println("\n== Caso de uso: REQ 03 ==");
            Dinidium dinidiumEncontrada = dinidium;
            Paramecium parameciumEncontrado = paramecium;

            dinidium.localizar(parameciumEncontrado);
            dinidium.inmovilizar(true);
            dinidium.cazar(parameciumEncontrado);
            dinidium.ingerir(parameciumEncontrado);
            dinidium.crecer(6);

            parameciumEncontrado.crecer(0.25);
            parameciumEncontrado.serAtacado(dinidiumEncontrada);

            System.out.println();

            // ---------------- R1 (Analizar) ---------------------
            System.out.println("\n== Caso de uso: REQ 01 ==");
            microBio.analizar();
        }
    }

    public void registrar(List<Protozoo> protozoos) {
        if (!protozoos.isEmpty()) {
            for (Protozoo protozoo : protozoos) {
                if (protozoo != null) {
                    System.out.println("Protozoo del tipo " + protozoo.getClass().getSimpleName() + " registrado.");
                } else {
                    System.out.println("Debe ingresar un protozoo");
                }
            }
        }
    }

    public String getNombreLab() {
        return this.nombreLab;
    }
}
