package org.example.Tda;

public class Tda_PixBit_GodoyCarreno_25100345 extends Tda_Pixel_GodoyCarreno_25100345{

    private int bit;

    public Tda_PixBit_GodoyCarreno_25100345(int x, int y, int depth, int bit) {
        super(x, y, depth);
        this.bit = bit;
    }

    @Override
    void flipV() {
    }

    @Override
    void flipH() {
    }

    @Override
    void rotate90(){

    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    @Override
    public String toString() {
        return "Tda_PixBit_GodoyCarreno_25100345{" +
                 " x=" + getX()+ ", y=" +getY() + ", bit=" + bit + ", depth=" +getDepth()+
                '}';
    }
}
