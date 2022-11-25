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
    void flipV() {
    }

    @Override
    void flipH() {
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
        String color = "" + bit;
        return color;
    }

    @Override
    public String toString() {
        return "Tda_PixBit_GodoyCarreno_25100345{" +
                 " x=" + getX()+ ", y=" +getY() + ", bit=" + bit + ", depth=" +getDepth()+
                '}';
    }

}
