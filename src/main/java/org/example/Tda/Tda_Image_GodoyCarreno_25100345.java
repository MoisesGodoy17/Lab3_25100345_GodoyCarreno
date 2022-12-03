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

    /***
     * Descripcion: Metodo que determina si la imagen dada es un Bitmap.
     * Funcion iterativa.
     * La funcion recibe uan imagen de la cual se extrae la lista de pixeles.
     * @return la función retornará un mensaje afirmando o negando el tipo de imagen.
     *
     */
    @Override
    public int isBitmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){ // recorre la lista de pixeles
            if (bit.tipoPixel() == 0){ // pregunta si el bit del pixel corresponde a un Pixbit
                System.out.println("//---La imagen consultada no es un Bitmap---//\n");
                return 0; // caso en que la imagen no cumple con la condicion.
            }
        }
        System.out.println(("//---La imagen corresponde a un Bitmap---///"));
        return 1;
    }

    /***
     * Descripcion: Metodo que determina si la imagen dada es un Pixmap.
     * Funcion iterativa.
     * La funcion recibe uan imagen de la cual se extrae la lista de pixeles.
     * @return la función retornará un mensaje afirmando o negando el tipo de imagen.
     *
     */
    @Override
    public int isPixmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.tipoPixel() == 0){ // pregunta si el pixel corresponde a un Pixrgb
                System.out.println("//---La imagen consultada no es un Pixmap---//\n");
                return 0;
            }
        }
        System.out.println(("//---La imagen corresponde a un Pixmap---///"));
        return 1;
    }

    /***
     * Descripcion: Metodo que determina si la imagen dada es un Pixhex.
     * Funcion iterativa.
     * La funcion recibe uan imagen de la cual se extrae la lista de pixeles.
     * @return la función retornará un mensaje afirmando o negando el tipo de imagen.
     *
     */
    @Override
    public int isHexmap() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.tipoPixel() == 0){
                System.out.println("//---La imagen consultada no es un Pixhex---//\n");
                return 0;
            }
        }
        System.out.println(("//---La imagen corresponde a un Pixhex---///"));
        return 1;
    }

    /***
     * Descripcion: Metodo que determina si la imagen dada ha sido comprimida.
     * Funcion iterativa.
     * La funcion recibe uan imagen de la cual se extrae la lista de pixeles para asi contar sus elementos.
     * @return se retorna un mensaje por pantalla el cual confirma o niega si la imagen fue comprimida.
     *
     */
    @Override
    public int isCompressed() {
        int acc = 0;
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            acc++; // suma 1 al acumulador mientras se reocrre la image
        }
        if (getLargo()*getAncho() < acc){
            System.out.println("//---La imagen esta comprimida---//\n");
            return 1; // si la cantidad de pixeles es inferior a los que se deben de generar con sus dimensiones, entonces fue comprimida
        }
        System.out.println("//---La imagen no ha sido comprimida---//\n");
        return 0; // caso contrario
    }

    /***
     * Descripcion: Metodo que modifica la posicion de los pixeles para que queden rotados horizontalmente
     * Funcion iterativa.
     * @param ancho Ancho de la imagen.
     * Modifica la imagen para que los pixeles esten volteada Horizontalmente.
     *
     */
    @Override
    public void flipH(int ancho) {
        // recorre la lista de pixeles aplicando el metodo flipH a cada pixel de la imagen
        pixeles.forEach(Tda_PixBit_GodoyCarreno_25100345->Tda_PixBit_GodoyCarreno_25100345.flipH(getAncho()));
    }

    /***
     * Descripcion: Metodo que modifica la posicion de los pixeles para que queden rotados verticalmente.
     * Funcion iterativa.
     * @param largo largo de la imagen.
     * Modifica la imagen para que los pixeles esten volteada verticalmente.
     *
     */
    @Override
    public void flipV(int largo) {
        pixeles.forEach(Tda_PixBit_GodoyCarreno_25100345->Tda_PixBit_GodoyCarreno_25100345.flipV(getLargo()));
    }

    /***
     * Descripcion: Metodo que rocorta un segmento de la imagen, recibiendo 2 puntos de la imagen,
     * la nueva imagen estara formada por el area entre los 2 puntos.
     * Funcion iterativa.
     * @param  x1 posicion del primer punto de recorte en el eje x
     * @param  y1 posicion del primer punto de recorte en el eje y
     * @param  x2 posicion del segundo punto de recorte en el eje x
     * @param  y2 posicion del segundo punto de recorte en el eje y
     * Crea una imagen recortada basandose en el area formada por 2 puntos ingresados por el usuario.
     *
     */
    @Override
    public void crop(int x1, int y1, int x2, int y2){
        List<Tda_Pixel_GodoyCarreno_25100345> filterP =
                pixeles.stream() // filtra los pixeles. Para que formen parte de la nueva imagen deben de estar dentro del area formada por los 2 puntos
                        .filter(pixel->pixel.getX() >= x1 && pixel.getX() <= x2 && pixel.getY() >= y1 &&
                        pixel.getY() <= y2)
                        .collect(Collectors.toList());
        this.pixeles = filterP; // construye una nueva lista de pixeles con los elementos filtrados.
        // X1 =< X , X =< X2 , Y1 =< Y , Y =< Y2
    }

    /***
     * Descripcion: Metodo que transforma los pixeles pixrgb a pixeles pixhex.
     * Funcion iterativa.
     * Modifica una imagen del tipo hexmap, donde los pixrgb pasan a ser pixhex
     *
     */
    @Override
    public void imageToHex() {
        List<Tda_Pixel_GodoyCarreno_25100345> rgbHex = new ArrayList<>(); // lista auxiliar
        for (Tda_Pixel_GodoyCarreno_25100345 rgb : pixeles){ // recorre los pixeles
            Tda_PixHex_GodoyCarreno_25100345 pixHex = new Tda_PixHex_GodoyCarreno_25100345(rgb.getX(), rgb.getY(), rgb.getDepth(), rgb.rgbTohex());
            // transforma los pixeles rgb a hexadecimal, a su vez construye pixeles pixhex en la lista aux
            rgbHex.add(pixHex);
        }
        setPixeles(rgbHex);// cambia la lista original de pixrgb por una lista de pixeles formada por pixhex.
    }


    /***
     * Descripcion: Metodo que permite generar el histograma de una imagen, contando la cantidad de apariciones de un bit.
     * Funcion iterativa.
     * La funcion recibe una imagen de la cual se toma la lista de pixeles para asi construir un histograma.
     * @return la función retorna una lista formada por una nueva clase, los objetos estaran constituidos por un pixel y su numero de apariciones.
     *
     */
    @Override
    public List<Tda_Par_GodoyCarreno_25100345> histogram() {
        List<String> bits = new ArrayList<>(); // lista auxiliar
        List<String> btiUnico = new ArrayList<>(); // lista con bit no repetidos
        List<Tda_Par_GodoyCarreno_25100345> listHistogram = new ArrayList<>();
        for (Tda_Pixel_GodoyCarreno_25100345 pixel : pixeles){
            bits.add(pixel.getColors());// lista de bits
            if (!btiUnico.contains(pixel.getColors())){ // agrega un bit si este no esta repetido en la lista bits
                btiUnico.add(pixel.getColors());// lista de bits no repetidos
            }
        }
        for (String color : btiUnico){
            long acc = bits.stream().filter(aux-> aux.equals(color)).count(); // cuenta la cantidad de apariciones de un bit
            Tda_Par_GodoyCarreno_25100345 histograma = new Tda_Par_GodoyCarreno_25100345(color, acc); // crea un objeto en la lista
            // el objeto se compone de la cantidad de veces en que se repite un color y el bit.
            listHistogram.add(histograma);
        }
        return  listHistogram; // retorna el histograma
    }


    /***
     * Descripcion: Metodo que permite rotar una imagen 90 grados a la derecha, midificando las posiciones de los pixeles.
     * Funcion iterativa.
     * @param ancho Ancho de la imagen
     * @param largo Largo de l imagen
     * @param acum La posicion x del bit tomara ese valor
     * @param temp La posicion y del bit tomara ese valor
     * La funcion modifica una imagen rotada 90 grados a la derecha.
     * Warning: La funcion solo puede rotar una misma imagen 1 vez, despues de eso dara el mismo resultado.
     *
     */
    @Override
    public void rotate90(int ancho, int largo, int acum, int temp){
        for (Tda_Pixel_GodoyCarreno_25100345 pixel : pixeles){
            if (acum == ancho) { // si acum es igual a ancho se resetea y temp se le resta uno
                acum = 0;
                temp = temp - 1;
            }
            pixel.rotate90(acum, temp);// metodo que modifica los bits con los datos actuales de acum y temp
            acum ++;
        }
    }

    /***
     * Descripcion: Metodo que recive un objeto tipo pixel y lo reemplaza en la imagen, el pixel reemplaza a uno de la imagen
     * que tenga la misma posicion.
     * Funcion iterativa.
     * @param NewPixel Pixel que sera agrega a la imagen.
     * La función modifica una imagen con el pixel nuevo dentro de la imagen, este sustituira a un pixel
     * que comparta la misma posicion.
     *
     */
    @Override
    public void changePixel(Tda_Pixel_GodoyCarreno_25100345 NewPixel) {
        List<Tda_Pixel_GodoyCarreno_25100345> pixelessAux = new ArrayList<>(); // lista auxiliar
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            if (bit.getX() == NewPixel.getX() && bit.getY() == NewPixel.getX()){ // si el pixel actual posee la misma
                // posicion que el nuevo, entonces se agrega a la lista o el antiguo se salta.
                pixelessAux.add(NewPixel);
            }
            else {
                pixelessAux.add(bit);
            }
        }
        setPixeles(pixelessAux);// sustituye la anterior lista de pixeles por la nueva, la cual contiene el pixel nuevo
    }

    /***
     * Descripcion: Metodo que invierte los pixeles de una imagen Bitmap
     * Funcion iterativa.
     * La funcion recive la imagen del tipo Pximap.
     * La funcion modifica la imagen para que tenga los pixeles invertidos de simetricamente.
     *
     */
    @Override
    public void invertColorBit() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            bit.invertColorBit(); // llama al metodo que invierte los pixeles
        }
    }

    /***
     * Descripcion: Metodo que invierte los pixeles de una imagen Pixmap
     * Funcion iterativa.
     * La funcion recive la imagen del tipo Pixmap.
     * La funcion modifica la imagen para que tenga los pixeles invertidos de simetricamente.
     *
     */
    @Override
    public void invertColorRgb() {
        for (Tda_Pixel_GodoyCarreno_25100345 bit : pixeles){
            bit.invertRgb(); // llama al metodo que invierte los pixeles
        }
    }

    /***
     * Descripcion: Metodo que convierte la imagen a un String
     * Funcion iterativa.
     * La funcion recive una imagen.
     * @return La funcion retorna un String, donde los pixeles tienen saltos de linea y de espacio
     * para lograr una representacion mas sencilla.
     *
     */
    @Override
    public String imagenString() {
        int accA = 1;
        String newImage;
        String auxImagen;
        String temp = "";
        for (Tda_Pixel_GodoyCarreno_25100345 bits : pixeles){
            if (accA == getAncho()){ // si accA es igual al ancho, entonces agrega un salto de linea
                auxImagen = bits.getColors();
                newImage = "\t" + auxImagen +  "\n";
                temp = temp + newImage;
                accA = 1;
            }
            else { // si no, entoces al agregar un bit a la var String solo lo hace con un espacio o tabulacion
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
