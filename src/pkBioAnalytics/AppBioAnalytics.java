package pkBioAnalytics;
import pkBioAnalytics.pkHumano.*;
import pkBioAnalytics.pkReinoViviente.pkProtista.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppBioAnalytics {
    private String nombreLab;
    private Scanner input = new Scanner(System.in);
    
    public void inciarLaboratorio() {
        MicroBiologo microBio = new MicroBiologo(
            "Juan",
            "Perez",
            "1743782691",
            "juan",
            "123",
            "Microbiología Molecular"
        );

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

        if (acceso) {
            Ameba ameba1 = new Ameba("Amebina", 25.0, 20);
            Heliozoo heliozoo1 = new Heliozoo("Heliozon", 40.0, 15);
            Dinidium dinidium = new Dinidium("DinidiumSt", 6.0, 5, true, 20, true);
            Paramecium paramecium = new Paramecium("ParameciumSt", 6.0, 4, true);

            Esporozoo esporozooA = new Esporozoo("Cepa A (Plasmodium)", 1500);
            Esporozoo esporozooB = new Esporozoo("Cepa B (Toxoplasma)", 1200);

            Euglenoide euglenoide1 = new Euglenoide("EuglenoideX", 35.0, 2, "clorofila");
            Tripanosoma tripanosoma1 = new Tripanosoma("TripanosomaY", 50.0, 3, "rojo");

            System.out.println("\nRegistro de protozoos en el sistema\n");

            List<Protozoo> protozoos = Arrays.asList(ameba1, heliozoo1, esporozooA, esporozooB, dinidium, paramecium, euglenoide1, tripanosoma1
            );

            registrar(protozoos);
            System.out.println();

            System.out.println("===Simulacion de interacciones entre protozoos...===\n");
            System.out.println();

            ameba1.mover();
            ameba1.dividir();
            heliozoo1.mover();
            heliozoo1.descansar(2);

            System.out.println("\n== Caso de uso: REQ 02 ==");
            heliozoo1.cazar(ameba1);
            ameba1.cazar(heliozoo1);
            System.out.println();

            System.out.println("\n== Caso de uso: REQ 04 ==");
            System.out.println("Simulando infección competitiva entre " + esporozooA.getNombre() + " y " + esporozooB.getNombre());

            esporozooA.infectar();
            esporozooB.infectar();

            if (esporozooA.getNumEsporozoitos() > esporozooB.getNumEsporozoitos()) {
                System.out.println(esporozooA.getNombre() + " es más virulento y gana la infección del huésped.");
            } else if (esporozooB.getNumEsporozoitos() > esporozooA.getNumEsporozoitos()) {
                System.out.println(esporozooB.getNombre() + " es más virulento y gana la infección del huésped.");
            } else {
                System.out.println("Ambas cepas son igualmente virulentas; la infección es mixta.");
            }

            esporozooA.dividirse();
            System.out.println("Nuevo conteo de " + esporozooA.getNombre() + ": " + esporozooA.getNumEsporozoitos());
            esporozooB.mover();

            System.out.println();
            System.out.println("\n== Caso de uso: REQ 03 ==\n");

            dinidium.localizar(paramecium);
            dinidium.inmovilizar(true);
            dinidium.cazar(paramecium);
            dinidium.ingerir(paramecium);
            dinidium.crecer(6);
            paramecium.crecer(0.25);
            paramecium.serAtacado(dinidium);

            dinidium.cazar(paramecium);
            paramecium.serAtacado(dinidium);

            System.out.println();
            System.out.println("\n== Caso de uso: REQ 05 ==");
            euglenoide1.fotosintetizar();
            tripanosoma1.parasitar(euglenoide1);

            System.out.println("\n==caso de uso: REQ 01==\n");
            registrarObservacionesYAnalisis();
            input.close();
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

    public void registrarObservacionesYAnalisis() {
        System.out.println("La sesión de observación ha sido completada, por favor, a continuación escribe los datos más significativos y su análisis: ");
        System.out.println("Presiona enter para finalizar...");
        System.out.print("Escribe aquí: ");
        String datosObservados = input.nextLine();
        System.out.println("\nGuardando registro...");
        System.out.println("\nDatos registrados: " + datosObservados);
        System.out.println("\n===Observaciones de esta sesión registradas exitosamente. Hasta luego!===");
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public String getNombreLab() {
        return this.nombreLab;
    }
}

