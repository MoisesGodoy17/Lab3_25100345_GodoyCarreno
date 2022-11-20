package org.example.Tda;

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

    @Override
    public String toString() {
        return "Tda_Pixel_GodoyCarreno_25100345{" +
                "x=" + x +
                ", y=" + y +
                ", depth=" + depth +
                '}';
    }

    public void flipH(){
        System.out.println("flipH");
    }

    abstract void flipV();

}
