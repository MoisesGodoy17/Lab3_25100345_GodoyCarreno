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



    @Override
    void getBits() {
        listRgb.add(getColors());
        for (String rgb : listRgb){
            System.out.println(rgb);
        }
    }

    @Override
    public String getColors(){
        String color = "" + r + " " + g + " " + b;
        return color;
    }

    @Override
    int tipoPixel() {
        if ((getR() >= 0 || 255 >= getR()) && (getG() >= 0 || 255 >= getG()) && (getB() >= 0 || 255 >= getB())) {
            return 1;
        }
        return 0;
    }

    String rgbTohex(){
        //System.out.println("Hex string is " + Integer.toHexString(l));
        String hexR = Integer.toHexString(getR());
        String hexG = Integer.toHexString(getG());
        String hexB = Integer.toHexString(getG());
        String numHex = "#" + hexR + "" + hexG + "" + hexB;
        return numHex;
    }

    @Override
    void invertColorBit() {

    }

    @Override
    void invertRgb() {
        r = 255 - r;
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
