package org.example.Tda;

import java.util.List;

public abstract class Tda_Pixel_GodoyCarreno_25100345 {
    private int x;
    private int y;
    private int depth;

    public Tda_Pixel_GodoyCarreno_25100345(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDepth() {
        return depth;
    }

    abstract void getBits();

    abstract String getColors();

    abstract String rgbTohex();

    abstract int tipoPixel();

    /***
     * Descripcion: Metodo llamado por flipH el cual permite modificar la posicion de los pixeles
     * @param ancho Nueva posicion de la var Y
     * Modifica la posicion de los bits para que queden rotados
     *
     */
    public void flipH(int ancho){
        y =  (y - (ancho- 1)) * (-1);
    }

    /***
     * Descripcion: Metodo llamado por flipV el cual permite modificar la posicion de los pixeles
     * @param largo Nueva posicion de la var X
     * Modifica la posicion de los bits para que queden rotados
     *
     */
    public void flipV(int largo){
        x =  (x - (largo- 1)) * (-1);
    }

    /***
     * Descripcion: Metodo llamado por rotate90 el cual permite modificar la posicion de los pixeles
     * @param temp Nueva posicion de la var Y
     * @param acum Nueva posicion de la var X
     * Modifica la posicion de los bits
     *
     */
    public  void rotate90(int acum, int temp){
        x = acum;
        y = temp;
    }

    abstract void  invertColorBit();

    abstract void invertRgb();

    //abstract void changePixel(Tda_Pixel_GodoyCarreno_25100345 NewPixel);

    @Override
    public String toString() {
        return "Tda_Pixel_GodoyCarreno_25100345{" +
                "x=" + x +
                ", y=" + y +
                ", depth=" + depth +
                '}';
    }

    //List<Tda_Pixel_GodoyCarreno_25100345> pixeles


}
