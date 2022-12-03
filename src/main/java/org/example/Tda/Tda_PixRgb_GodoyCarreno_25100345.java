package org.example.Tda;

import java.util.ArrayList;
import java.util.List;

public class Tda_PixRgb_GodoyCarreno_25100345 extends Tda_Pixel_GodoyCarreno_25100345 {

    int r;
    int g;
    int b;

    List<String> listRgb = new ArrayList<>();

    public Tda_PixRgb_GodoyCarreno_25100345(int x, int y, int depth, int r, int g, int b) {
        super(x, y, depth);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    /***
     * Descripcion: Metodo que obtiene los bits de un pixel, puede ser llamar desde la clase imagen.
     * Recive un Rgb y lo agrega a una lista de colores rgb.
     *
     */
    @Override
    void getBits() {
        listRgb.add(getColors());
        for (String rgb : listRgb){
            System.out.println(rgb);
        }
    }

    /***
     * Descripcion: Metodo que obtiene el bit de un pixel rgb, puede ser llamar desde la clase imagen.
     * Recive un pixel.
     * @return Retorna el pixel rgb en formato String.
     *
     */
    @Override
    public String getColors(){
        String color = "" + r + " " + g + " " + b;
        return color;
    }

    /***
     * Descripcion: Metodo que determina si un bit es un pixrgb.
     * Recive un pixel cualquiera.
     * @return Retorna un int el cual puede ser 1 o 0.
     *
     */
    @Override
    int tipoPixel() {
        if ((getR() >= 0 || 255 >= getR()) || (getG() >= 0 || 255 >= getG()) || (getB() >= 0 || 255 >= getB())) {
            return 1; // si las componentes del rgb se encuentran en este rango entonces retorna 1, si es un pixrgb
        }
        return 0; // no es un pixrgb
    }

    /***
     * Descripcion: Metodo que transforma un bit rgb a una representacion hexadecimal.
     * Recive un pixel rgb.
     * @return Retorna un string el cual representa todas las components concatenadas del pixel rgb en formato hex.
     *
     */
    String rgbTohex(){
        //System.out.println("Hex string is " + Integer.toHexString(l));
        String hexR = Integer.toHexString(getR());//transforma una componente del rgb a hex
        String hexG = Integer.toHexString(getG());
        String hexB = Integer.toHexString(getG());
        String numHex = "#" + hexR + "" + hexG + "" + hexB; // concatena todas las componentes
        return numHex;
    }

    @Override
    void invertColorBit() {

    }

    /***
     * Descripcion: Invierte un pixel rgb, si es 255 pasa a ser 0, lo hace de forma simetrica.
     * Recive un pixel.
     * Invierte el pixel que llama al metodo.
     *
     */
    @Override
    void invertRgb() {
        r = 255 - r; // la componente se le resta 255 para obtener invertirlo de forma simetrica
        g = 255 - g;
        b = 255 - b;
    }

    @Override
    public String toString() {
        return "Tda_PixRgb_GodoyCarreno_25100345{" +
                " x=" + getX()+
                ", y=" + getY()+
                ", r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }

}
