package org.example.Tda;
import java.util.List;

public class Tda_Image_GodoyCarreno_25100345 implements Tda_Image_Implement_GodoyCarreno_25100345{
    private int largo;
    private int ancho;

    private List<Tda_Pixel_GodoyCarreno_25100345> pixeles;

    public Tda_Image_GodoyCarreno_25100345(int largo, int ancho, List<Tda_Pixel_GodoyCarreno_25100345> pixeles) {
        this.largo = largo;
        this.ancho = ancho;
        this.pixeles = pixeles;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public List<Tda_Pixel_GodoyCarreno_25100345> getPixeles() {
        return pixeles;
    }

    public void setPixeles(List<Tda_Pixel_GodoyCarreno_25100345> pixeles) {
        this.pixeles = pixeles;
    }

    @Override
    public void flipH(int ancho) {
        pixeles.forEach(Tda_Pixel_GodoyCarreno_25100345-> Tda_Pixel_GodoyCarreno_25100345.flipH(getAncho()));
    }

    @Override
    public void flipV(int largo) {
        pixeles.forEach(Tda_Pixel_GodoyCarreno_25100345-> Tda_Pixel_GodoyCarreno_25100345.flipV(getLargo()));
    }

    @Override
    public String toString() {
        return "Tda_Image_GodoyCarreno_25100345{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", pixeles=" + pixeles +
                '}';
    }
}
