package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Paramecium extends Ciliado {

public Paramecium() {
      super ();
    }

    public Paramecium(String nombre, Double tamanioMicrom, Integer numCilios, Boolean tieneCitostoma) {
        super.setNombre(nombre);
        super.setNumCilios(numCilios);
        super.setTamanioMicrom(tamanioMicrom);
        super.setTieneCitostoma(tieneCitostoma);
}
 @Override
public void crecer (double incrementoMicrom){ 
        if (this.getEstaVivo()){
            setTamanioMicrom(this.getTamanioMicrom() + incrementoMicrom);
            System.out.println( "El ciliado " + this.getNombre() + " ha crecido. Nuevo tamaño: " + this.getTamanioMicrom() + "µm.");
        } else {
            System.out.println("El ciliado está muerto y no puede crecer.");
        }
    }
   
public void serAtacado (Dinidium cazador){
    if(cazador.getTamanioMicrom()>this.getTamanioMicrom()){
        this.setEstaVivo(false);
      System.out.println("El Dinidium " + cazador.getNombre() + " ha cazado y digerido al Paramecium " + this.getNombre());  
        } else {
            System.out.println("El Paramecium " + this.getNombre() + " escapó del ataque del " + cazador.getNombre());
        }  
      
    }
}

