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

    @Override
    public String getColors(){
        String color = "" + hex;
        return color;
    }

    @Override
    int tipoPixel() {
        if (getHex().length() <= 7){
            return 1;
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
        return "Tda_PixHex_GodoyCarreno_25100345{" +
                " x=" + getX() + ", y=" + getY() + ", hex=" + hex + ", depth=" + getDepth() +
                '}';
    }
}
