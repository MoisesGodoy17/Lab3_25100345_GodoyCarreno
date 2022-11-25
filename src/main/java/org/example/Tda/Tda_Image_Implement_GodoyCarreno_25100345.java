package org.example.Tda;

import java.util.List;

public interface Tda_Image_Implement_GodoyCarreno_25100345 {

    void flipH(int ancho);
    void flipV(int largo);

    void crop(int x1, int y1, int x2, int y2);

    void rotate90(int ancho, int largo, int acum, int temp);

    List<Tda_Par_GodoyCarreno_25100345> histogram();

}
