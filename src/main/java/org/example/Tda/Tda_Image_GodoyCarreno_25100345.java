package org.example.Tda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tda_Image_GodoyCarreno_25100345 implements Tda_Image_Implement_GodoyCarreno_25100345{
    private int largo;
    private int ancho;

    private List<Tda_Pixel_GodoyCarreno_25100345> pixeles;

    public Tda_Image_GodoyCarreno_25100345(int largo, int ancho, List<Tda_Pixel_GodoyCarreno_25100345> pixeles) {
        this.largo = largo;
        this.ancho = ancho;
        this.pixeles = pixeles;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public List<Tda_Pixel_GodoyCarreno_25100345> getPixeles() {
        return pixeles;
    }

    public void setPixeles(List<Tda_Pixel_GodoyCarreno_25100345> pixeles) {
        this.pixeles = pixeles;
    }

    @Override
    public int isBitmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.tipoPixel() == 0){
                System.out.println("//---Tipo de imagen no coincide hola---//\n");
                return 0;
            }
        }
        System.out.println(("//---La imagen es un bitmap---///"));
        return 1;
    }

    @Override
    public int isPixmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.tipoPixel() == 0){
                System.out.println("//---Tipo de imagen no coincide---//\n");
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int isHexmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.tipoPixel() == 0){
                System.out.println("//---Tipo de imagen no coincide---//\n");
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int isCompressed() {
        int acc = 0;
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            acc = ++acc;
        }
        if (getLargo()*getAncho() < acc){
            System.out.println("//---La imagen esta comprimida---//\n");
            return 1;
        }
        System.out.println("//---La imagen no ha sido comprimida---//\n");
        return 0;
    }

    @Override
    public void flipH(int ancho) {
        pixeles.forEach(Tda_PixBit_GodoyCarreno_25100345->Tda_PixBit_GodoyCarreno_25100345.flipH(getAncho()));
    }

    @Override
    public void flipV(int largo) {
        pixeles.forEach(Tda_PixBit_GodoyCarreno_25100345->Tda_PixBit_GodoyCarreno_25100345.flipV(getLargo()));
    }
    @Override
    public void crop(int x1, int y1, int x2, int y2){
        List<Tda_Pixel_GodoyCarreno_25100345> filterP =
                pixeles.stream()
                        .filter(pixel->pixel.getX() >= x1 && pixel.getX() <= x2 && pixel.getY() >= y1 &&
                        pixel.getY() <= y2)
                        .collect(Collectors.toList());
        this.pixeles = filterP;
        // X1 =< X , X =< X2 , Y1 =< Y , Y =< Y2
    }

    @Override
    public void imageToHex() {
        List<Tda_Pixel_GodoyCarreno_25100345> rgbHex = new ArrayList<>();
        for (Tda_Pixel_GodoyCarreno_25100345 rgb : pixeles){
            Tda_PixHex_GodoyCarreno_25100345 pixHex = new Tda_PixHex_GodoyCarreno_25100345(rgb.getX(), rgb.getY(), rgb.getDepth(), rgb.rgbTohex());
            rgbHex.add(pixHex);
        }
        setPixeles(rgbHex);
    }


    @Override
    public List<Tda_Par_GodoyCarreno_25100345> histogram() {
        List<String> bits = new ArrayList<>();
        List<String> btiUnico = new ArrayList<>();
        List<Tda_Par_GodoyCarreno_25100345> listHistogram = new ArrayList<>();
        for (Tda_Pixel_GodoyCarreno_25100345 pixel : pixeles){
            bits.add(pixel.getColors());
            if (!btiUnico.contains(pixel.getColors())){
                btiUnico.add(pixel.getColors());
            }
        }
        for (String color : btiUnico){
            long acc = bits.stream().filter(aux-> aux.equals(color)).count();
            Tda_Par_GodoyCarreno_25100345 histograma = new Tda_Par_GodoyCarreno_25100345(color, acc);
            listHistogram.add(histograma);
        }
        return  listHistogram;
    }

    @Override
    public void rotate90(int ancho, int largo, int acum, int temp){
        for (Tda_Pixel_GodoyCarreno_25100345 pixel : pixeles){
            if (acum == ancho) {
                acum = 0;
                temp = temp - 1;
            }
            pixel.rotate90(acum, temp);
            acum ++;
        }
    }

    @Override
    public void changePixel(Tda_Pixel_GodoyCarreno_25100345 NewPixel) {
        List<Tda_Pixel_GodoyCarreno_25100345> pixelessAux = new ArrayList<>();
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.getX() == NewPixel.getX() && bit.getY() == NewPixel.getX()){
                pixelessAux.add(NewPixel);
            }
            pixelessAux.add(bit);
        }
        setPixeles(pixelessAux);
    }

    @Override
    public void invertColorBit() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            bit.invertColorBit();
        }
    }

    @Override
    public void invertColorRgb() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            bit.invertRgb();
        }
    }

    @Override
    public String imagenString() {
        int accA = 1;
        String newImage = "";
        String auxImagen = "";
        String temp = "";
        for (Tda_Pixel_GodoyCarreno_25100345 bits : pixeles){
            if (accA == getAncho()){
                auxImagen = bits.getColors();
                newImage = "\t" + auxImagen +  "\n";
                temp = temp + newImage;
                accA = 1;
            }
            else {
                auxImagen = bits.getColors();
                newImage = auxImagen + "\t";
                temp = temp + newImage;
                accA ++;
            }
        }
        return  temp;
    }

    @Override
    public void muestraPixeles() {
        List<String> bitsSout = new ArrayList<>();
        for (Tda_Pixel_GodoyCarreno_25100345 pixel : pixeles){
            bitsSout.add(pixel.getColors());
        }
        System.out.println(bitsSout);
    }

    @Override
    public String toString() {
        return "Tda_Image_GodoyCarreno_25100345{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", pixeles=" + pixeles +
                '}';
    }
}
