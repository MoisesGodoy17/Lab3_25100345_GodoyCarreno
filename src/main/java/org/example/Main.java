package org.example;

import org.example.Tda.Tda_Image_GodoyCarreno_25100345;
import org.example.Tda.Tda_PixBit_GodoyCarreno_25100345;
import org.example.Tda.Tda_PixRgb_GodoyCarreno_25100345;
import org.example.Tda.Tda_Pixel_GodoyCarreno_25100345;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Tda_Pixel_GodoyCarreno_25100345 P1 = new Tda_PixBit_GodoyCarreno_25100345(0, 0, 90, 1);
        //Tda_Pixel_GodoyCarreno_25100345 P2 = new Tda_PixBit_GodoyCarreno_25100345(0, 1, 180, 1);
        //Tda_Pixel_GodoyCarreno_25100345 P3 = new Tda_PixBit_GodoyCarreno_25100345(1, 0, 270, 1);
        //Tda_Pixel_GodoyCarreno_25100345 P4 = new Tda_PixBit_GodoyCarreno_25100345(1, 1, 360, 0);

        Tda_Pixel_GodoyCarreno_25100345 P1 = new Tda_PixRgb_GodoyCarreno_25100345(0, 0, 90, 222,1,1);
        Tda_Pixel_GodoyCarreno_25100345 P2 = new Tda_PixRgb_GodoyCarreno_25100345(0, 1, 180, 1,0,0);
        Tda_Pixel_GodoyCarreno_25100345 P3 = new Tda_PixRgb_GodoyCarreno_25100345(1, 0, 270, 1,1,1);
        Tda_Pixel_GodoyCarreno_25100345 P4 = new Tda_PixRgb_GodoyCarreno_25100345(1, 1, 360, 0,0,0);

        Tda_PixRgb_GodoyCarreno_25100345 P5 = new Tda_PixRgb_GodoyCarreno_25100345(0,0,0, 255, 111, 200);

        List<Tda_Pixel_GodoyCarreno_25100345> pixeles = Arrays.asList(P1, P2, P3, P4);

        Tda_Image_GodoyCarreno_25100345 myImage = new Tda_Image_GodoyCarreno_25100345(2, 2, pixeles);

        System.out.println(myImage);

        //myImage.crop(0,1,1,1);
        //myImage.histogram();
        //System.out.println(myImage.histogram());

        //myImage.flipH(myImage.getAncho());

        //myImage.imageToHex();
        //System.out.println(myImage);

        //myImage.histogram();
        //System.out.println(myImage.histogram());

        myImage.changePixel(P5);
        System.out.println(myImage);

        myImage.invertColorRgb();
        System.out.println(myImage);


        //System.out.println(myImage.histogram());
        //myImage.muestraPixeles();

    }
}