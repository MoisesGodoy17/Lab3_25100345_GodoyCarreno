package org.example.Tda;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Tda_PixBit_GodoyCarreno_25100345 extends Tda_Pixel_GodoyCarreno_25100345{

    int bit;
    List<Integer> listaBits = new ArrayList<>();

    public Tda_PixBit_GodoyCarreno_25100345(int x, int y, int depth, int bit) {
        super(x, y, depth);
        this.bit = bit;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }


    /***
     * Descripcion: Metodo que obtiene los bits de un pixel, puede ser llamar desde la clase imagen.
     * Recive un bit y lo agrega a una lista de bits.
     *
     */
    @Override
    void getBits() {
        listaBits.add(bit);
        for (Integer bit : listaBits){
            System.out.println(bit);
        }
    }

    /***
     * Descripcion: Metodo que obtiene el bit de un pixel, puede ser llamar desde la clase imagen.
     * Recive un pixel.
     * @return Retorna el pixel en formato String.
     *
     */
    @Override
    public String getColors(){
        String color = " " + bit;
        return color;
    }

    /***
     * Descripcion: Verifica se un pixel es o no un Pixbit
     * Recive un pixel.
     * @return Retorna un int el cual determina si cumple o no con la condicion
     *
     */
    @Override
    int tipoPixel() {
        if (getBit() == 1){
            return 1;
        }
        if (getBit() == 0){
            return 1;
        }
        return 0; // no es un pixbit, retorna 0
    }

    @Override
    String rgbTohex() {
        return null;
    }

    /***
     * Descripcion: Invierte un bit, si es 0 pasa a ser 1.
     * Recive un pixel.
     * Modifica el bit del pixel que llama el metodo.
     *
     */
    @Override
    void invertColorBit() {
        if (bit == 0){
            bit = 1;// si el pixel tiene un bit 0 este pasa a ser 1
        }
        else {
            bit = 0;
        }
    }

    @Override
    void invertRgb() {

    }

    @Override
    public String toString() {
        return "Tda_PixBit_GodoyCarreno_25100345{" +
                 " x=" + getX()+ ", y=" +getY() + ", bit=" + bit + ", depth=" +getDepth()+
                '}';
    }

}
