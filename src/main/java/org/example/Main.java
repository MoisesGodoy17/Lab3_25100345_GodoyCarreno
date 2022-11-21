package org.example;

import org.example.Tda.Tda_Image_GodoyCarreno_25100345;
import org.example.Tda.Tda_PixBit_GodoyCarreno_25100345;
import org.example.Tda.Tda_Pixel_GodoyCarreno_25100345;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tda_Pixel_GodoyCarreno_25100345 P1 = new Tda_PixBit_GodoyCarreno_25100345(0, 0, 90, 1);
        Tda_Pixel_GodoyCarreno_25100345 P2 = new Tda_PixBit_GodoyCarreno_25100345(0, 1, 180, 0);
        Tda_Pixel_GodoyCarreno_25100345 P3 = new Tda_PixBit_GodoyCarreno_25100345(1, 0, 270, 1);
        Tda_Pixel_GodoyCarreno_25100345 P4 = new Tda_PixBit_GodoyCarreno_25100345(1, 1, 360, 0);

        List<Tda_Pixel_GodoyCarreno_25100345> pixeles = Arrays.asList(P1, P2, P3, P4);

        Tda_Image_GodoyCarreno_25100345 myImage = new Tda_Image_GodoyCarreno_25100345(2, 2, pixeles);

        System.out.println(myImage); // flip que invierte las coordenadas de ancho
        myImage.flipH(myImage.getAncho());

        System.out.println(myImage);
        myImage.flipV(myImage.getLargo()); // flip que invierte la altura de un pixel

        System.out.println(myImage);

    }
}