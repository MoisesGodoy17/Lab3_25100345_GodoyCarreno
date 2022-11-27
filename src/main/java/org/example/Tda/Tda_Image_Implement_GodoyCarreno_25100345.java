package org.example.Tda;

import java.util.List;

public interface Tda_Image_Implement_GodoyCarreno_25100345 {

    int isBitmap();

    int isPixmap();

    int isHexmap();

    int isCompressed();

    void flipH(int ancho);
    void flipV(int largo);

    void crop(int x1, int y1, int x2, int y2);

    void imageToHex();

    List<Tda_Par_GodoyCarreno_25100345> histogram();

    void rotate90(int ancho, int largo, int acum, int temp);

    void changePixel(Tda_Pixel_GodoyCarreno_25100345 NewPixel);

    void invertColorBit();

    void invertColorRgb();

    void muestraPixeles();

}
