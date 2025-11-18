import pkBioAnalytics.*;

public class App {
    public static void main(String[] args) {
        AppBioAnalytics laboratorio = new AppBioAnalytics();
        System.out.println("=== INICIO DEL SISTEMA DE LABORATORIO "+laboratorio.getNombreLab()+" ===");

        laboratorio.inciarLaboratorio();

        System.out.println("\n=== FIN DE LA SESION ===");
    }
}
