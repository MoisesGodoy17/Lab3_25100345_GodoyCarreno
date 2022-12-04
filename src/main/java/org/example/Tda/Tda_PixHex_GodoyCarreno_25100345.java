package org.example.Tda;

import java.util.ArrayList;
import java.util.List;

public class Tda_PixHex_GodoyCarreno_25100345 extends Tda_Pixel_GodoyCarreno_25100345{
    String hex;

    List<String> listHex = new ArrayList<>();

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public Tda_PixHex_GodoyCarreno_25100345(int x, int y, int depth, String hex) {
        super(x, y, depth);
        this.hex = hex;
    }


    @Override
    void getBits() {

    }

    /***
     * Descripcion: Metodo que obtiene el bit de un pixhex, puede ser llamar desde la clase imagen.
     * Recive un pixel.
     * @return Retorna un pixhex.
     *
     */
    @Override
    public String getColors(){
        String color = "" + hex;
        return color;
    }

    /***
     * Descripcion: Metodo que determina si un pixel es un pixhex, determina el largo y el tipo de dato.
     * Recive un pixel cualquiera.
     * @return Retorna un int el cual puede ser 1 o 0.
     *
     */
    @Override
    int tipoPixel() {
        if (getHex().length() <= 7){
            return 1; // si el largo corresponde entonces es un pixhex.
        }
        return 0;
    }

    @Override
    String rgbTohex() {
        return null;
    }

    @Override
    void invertColorBit() {

    }

    @Override
    void invertRgb() {

    }

    @Override
    public String toString() {
        return "[" +
                " x=" + getX() + ", y=" + getY() + ", hex=" + hex + ", depth=" + getDepth() +
                "]";
    }
}
