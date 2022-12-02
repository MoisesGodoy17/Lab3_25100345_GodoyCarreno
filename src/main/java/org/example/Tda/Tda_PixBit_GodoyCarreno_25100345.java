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


    @Override
    void getBits() {
        listaBits.add(bit);
        for (Integer bit : listaBits){
            System.out.println(bit);
        }
    }

    @Override
    public String getColors(){
        String color = " " + bit;
        return color;
    }

    @Override
    int tipoPixel() {
        if (getBit() == 1){
            return 1;
        }
        if (getBit() == 0){
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
        if (bit == 0){
            bit = 1;
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
