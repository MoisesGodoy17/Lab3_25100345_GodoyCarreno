package org.example.Tda;

public class Tda_Par_GodoyCarreno_25100345 {

    String symbol;

    long cantidad;


    public Tda_Par_GodoyCarreno_25100345(String symbol, long cantidad) {
        this.symbol = symbol;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "[" +
                "Color='" + symbol + '\'' +
                ", Cantidad=" + cantidad +
                ']';
    }
}
