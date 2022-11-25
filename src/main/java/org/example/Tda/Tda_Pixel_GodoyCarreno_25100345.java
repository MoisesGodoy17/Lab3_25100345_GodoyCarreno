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

    @Override
    public String toString() {
        return "Tda_Pixel_GodoyCarreno_25100345{" +
                "x=" + x +
                ", y=" + y +
                ", depth=" + depth +
                '}';
    }

    public void flipH(int ancho){
        y =  (y - (ancho- 1)) * (-1);
    }
    public void flipV(int largo){
        x =  (x - (largo- 1)) * (-1);
    }

    public  void rotate90(int acum, int temp){
        x = acum;
        y = temp;
    }

    abstract void flipV();

    abstract  void flipH();

    //List<Tda_Pixel_GodoyCarreno_25100345> pixeles


}
