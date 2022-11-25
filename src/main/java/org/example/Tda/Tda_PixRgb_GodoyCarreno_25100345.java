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
    public String toString() {
        return "Tda_PixRgb_GodoyCarreno_25100345{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
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
        String color = "" + r + "" + g + "" + b;
        return color;
    }

    @Override
    void flipV() {

    }

    @Override
    void flipH() {

    }
}
