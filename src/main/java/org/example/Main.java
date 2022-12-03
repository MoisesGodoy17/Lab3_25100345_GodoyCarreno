package org.example;
import java.util.Scanner;


import org.example.Tda.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;
        int choiceImage = 0;
        int choiceModifica = 0;
        int choice;
        do {
            printMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---// Ingrese el ancho de la imagen: //---\n");
                    var largueBit = input.nextInt();
                    System.out.println("---// Ingrese el largo de la imagen: //---\n");
                    var anchBit = input.nextInt();
                    List<Tda_Pixel_GodoyCarreno_25100345> ListBit = new ArrayList<>();
                    for (int i = 0; i < largueBit * anchBit; i++) {
                        System.out.println("---// Ingrese la posición X: //---\n");
                        var xBit = input.nextInt();
                        System.out.println("---// Ingrese la posición Y: //---\n");
                        var yBit = input.nextInt();
                        System.out.println("---// Ingrese el bit: //---\n");
                        var bit = input.nextInt();
                        System.out.println("---// Ingrese la profundidad: //---\n");
                        var depthBit = input.nextInt();
                        Tda_Pixel_GodoyCarreno_25100345 Pixel = new Tda_PixBit_GodoyCarreno_25100345(xBit, yBit, depthBit, bit);
                        ListBit.add(Pixel);
                    }
                    Tda_Image_GodoyCarreno_25100345 bitmap = new Tda_Image_GodoyCarreno_25100345(largueBit, anchBit, ListBit);
                    System.out.println(bitmap);
                    System.out.println("---// La imagen Bitmap fue creada con éxito. //---");
                    do {
                        printMenuImage();
                        choiceImage = input.nextInt();
                        switch (choiceImage){
                            case 1:
                                do {
                                    printMenuOperationBit();
                                    choiceModifica = input.nextInt();
                                    switch (choiceModifica){
                                        case 1:
                                            bitmap.isBitmap();
                                            System.out.println(bitmap);
                                            break;
                                        case 2:
                                            bitmap.isHexmap();
                                            System.out.println(bitmap);
                                            break;
                                        case 3:
                                            bitmap.isPixmap();
                                            System.out.println(bitmap);
                                            break;
                                        case 4:
                                            System.out.println("--- // Ingrese una posición x1: //---");
                                            var x1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y1: //---");
                                            var y1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición x2: //---");
                                            var x2 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y2: //---");
                                            var y2 = input.nextInt();
                                            bitmap.crop(x1, y1, x2, y2);
                                            System.out.println(bitmap);
                                            break;
                                        case 5:
                                            System.out.println(bitmap.histogram());
                                            break;
                                        case 6:
                                            bitmap.rotate90(anchBit, largueBit-1, 0, anchBit-1);
                                            System.out.println(bitmap);
                                            break;
                                        case 7:
                                            System.out.println("--- // Ingrese la posición X: //---");
                                            var xNbit = input.nextInt();
                                            System.out.println("--- // Ingrese la posición /: //---");
                                            var yNbit = input.nextInt();
                                            System.out.println("--- // Ingrese el bit: //---");
                                            var nBit = input.nextInt();
                                            System.out.println("--- // Ingrese la profundidad: //---");
                                            var dNbit = input.nextInt();
                                            Tda_Pixel_GodoyCarreno_25100345 NewPixel = new Tda_PixBit_GodoyCarreno_25100345(xNbit, yNbit, dNbit, nBit);
                                            bitmap.changePixel(NewPixel);
                                            System.out.println(bitmap);
                                            break;
                                        case 8:
                                            bitmap.invertColorBit();
                                            System.out.println(bitmap);
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println(choiceModifica + " Esta no es una opción valida.");
                                    }
                                }while (choiceModifica != 0);
                                break;
                            case 2:
                                System.out.println(bitmap.imagenString());
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println(choiceImage + " Esta no es una opción valida.");
                        }
                    }while (choiceImage != 0);
                    break;
                case 2:
                    System.out.println("---// Ingrese el ancho de la imagen: //---\n");
                    var largueRgb = input.nextInt();
                    System.out.println("---// Ingrese el largo de la imagen: //---\n");
                    var anchRgb = input.nextInt();
                    List<Tda_Pixel_GodoyCarreno_25100345> ListRgb = new ArrayList<>();
                    for (int i = 0; i < largueRgb * anchRgb; i++) {
                        System.out.println("---// Ingrese la posición X: //---\n");
                        var xRgb = input.nextInt();
                        System.out.println("---// Ingrese la posición Y: //---\n");
                        var yRgb = input.nextInt();
                        System.out.println("---// Ingrese un componente R: //---\n");
                        var r = input.nextInt();
                        System.out.println("---// Ingrese un componente G: //---\n");
                        var g = input.nextInt();
                        System.out.println("---// Ingrese un componente B: //---\n");
                        var b = input.nextInt();
                        System.out.println("---// Ingrese la profundidad: //---\n");
                        var depthRgb = input.nextInt();
                        Tda_Pixel_GodoyCarreno_25100345 Pixel = new Tda_PixRgb_GodoyCarreno_25100345(xRgb, yRgb, depthRgb, r, g, b);
                        ListRgb.add(Pixel);
                    }
                    Tda_Image_GodoyCarreno_25100345 pixmap = new Tda_Image_GodoyCarreno_25100345(largueRgb, anchRgb, ListRgb);
                    System.out.println("---// La imagen Pixmap fue creada con éxito. //---");
                    do {
                        printMenuImage();
                        choiceImage = input.nextInt();
                        switch (choiceImage){
                            case 1:
                                do {
                                    printMenuOperationRgb();
                                    choiceModifica = input.nextInt();
                                    switch (choiceModifica){
                                        case 1:
                                            pixmap.isBitmap();
                                            System.out.println(pixmap);
                                            break;
                                        case 2:
                                            pixmap.isHexmap();
                                            System.out.println(pixmap);
                                            break;
                                        case 3:
                                            pixmap.isPixmap();
                                            System.out.println(pixmap);
                                            break;
                                        case 4:
                                            System.out.println("--- // Ingrese una posición x1: //---");
                                            var x1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y1: //---");
                                            var y1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición x2: //---");
                                            var x2 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y2: //---");
                                            var y2 = input.nextInt();
                                            pixmap.crop(x1, y1, x2, y2);
                                            System.out.println(pixmap);
                                            break;
                                        case 5:
                                            pixmap.imageToHex();
                                            System.out.println(" ---// Imagen transformada con éxito. //---");
                                            System.out.println(pixmap);
                                            break;
                                        case 6:
                                            System.out.println(pixmap.histogram());
                                            break;
                                        case 7:
                                            pixmap.rotate90(anchRgb, largueRgb-1, 0, anchRgb-1);
                                            System.out.println(pixmap);
                                            break;
                                        case 8:
                                            System.out.println("--- // Ingrese la posición X: //---");
                                            var xNbit = input.nextInt();
                                            System.out.println("--- // Ingrese la posición /: //---");
                                            var yNbit = input.nextInt();
                                            System.out.println("--- // Ingrese el bit: //---");
                                            var nBit = input.nextInt();
                                            System.out.println("--- // Ingrese la profundidad: //---");
                                            var dNbit = input.nextInt();
                                            Tda_Pixel_GodoyCarreno_25100345 NewPixel = new Tda_PixBit_GodoyCarreno_25100345(xNbit, yNbit, dNbit, nBit);
                                            pixmap.changePixel(NewPixel);
                                            System.out.println(pixmap);
                                            break;
                                        case 9:
                                            pixmap.invertColorRgb();
                                            System.out.println(pixmap);
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println(choiceModifica + "Esta no es una opción valida.");
                                    }
                                }while (choiceModifica != 0);
                                break;
                            case 2:
                                System.out.println(pixmap.imagenString());
                                break;
                            case 0:
                                System.out.println("Hasta la próxima.\n");
                                break;
                            default:
                                System.out.println(choiceImage + "Esta no es una opción valida.");
                        }
                    }while (choiceImage != 0);
                    break;
                case 3:
                    System.out.println("---// Ingrese el ancho de la imagen: //---\n");
                    var largueHex = input.nextInt();
                    System.out.println("---// Ingrese el largo de la imagen: //---\n");
                    var anchHex = input.nextInt();
                    List<Tda_Pixel_GodoyCarreno_25100345> ListHex = new ArrayList<>();
                    for (int i = 0; i < largueHex * anchHex; i++) {
                        System.out.println("---// Ingrese la posición X: //---\n");
                        var xHex = input.nextInt();
                        System.out.println("---// Ingrese la posición Y: //---\n");
                        var yHex = input.nextInt();
                        System.out.println("---// Ingrese el color en formato Hexadecimal://---\n");
                        System.out.println("---// Ejemplo: #00AA00//---\n");
                        var hex = input.next();
                        System.out.println("---// Ingrese la profundidad: //---\n");
                        var depthHex = input.nextInt();
                        Tda_Pixel_GodoyCarreno_25100345 Pixel = new Tda_PixHex_GodoyCarreno_25100345(xHex, yHex, depthHex, hex);
                        ListHex.add(Pixel);
                    }
                    Tda_Image_GodoyCarreno_25100345 hexmap = new Tda_Image_GodoyCarreno_25100345(largueHex, anchHex, ListHex);
                    System.out.println(hexmap);
                    System.out.println("---// La imagen Hexmap fue creada con éxito. //---");
                    do {
                        printMenuImage();
                        choiceImage = input.nextInt();
                        switch (choiceImage){
                            case 1:
                                do {
                                    printMenuOperationHex();
                                    choiceModifica = input.nextInt();
                                    switch (choiceModifica){
                                        case 1:
                                            hexmap.isBitmap();
                                            System.out.println(hexmap);
                                            break;
                                        case 2:
                                            hexmap.isHexmap();
                                            System.out.println(hexmap);
                                            break;
                                        case 3:
                                            hexmap.isPixmap();
                                            System.out.println(hexmap);
                                            break;
                                        case 4:
                                            System.out.println("--- // Ingrese una posición x1: //---");
                                            var x1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y1: //---");
                                            var y1 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición x2: //---");
                                            var x2 = input.nextInt();
                                            System.out.println("--- // Ingrese una posición y2: //---");
                                            var y2 = input.nextInt();
                                            hexmap.crop(x1, y1, x2, y2);
                                            System.out.println(hexmap);
                                            break;
                                        case 5:
                                            System.out.println(hexmap.histogram());
                                            break;
                                        case 6:
                                            hexmap.rotate90(anchHex, largueHex-1, 0, anchHex-1);
                                            System.out.println(hexmap);
                                            break;
                                        case 7:
                                            System.out.println("--- // Ingrese la posición X: //---");
                                            var xNbit = input.nextInt();
                                            System.out.println("--- // Ingrese la posición /: //---");
                                            var yNbit = input.nextInt();
                                            System.out.println("--- // Ingrese el bit: //---");
                                            var nBit = input.nextInt();
                                            System.out.println("--- // Ingrese la profundidad: //---");
                                            var dNbit = input.nextInt();
                                            Tda_Pixel_GodoyCarreno_25100345 NewPixel = new Tda_PixBit_GodoyCarreno_25100345(xNbit, yNbit, dNbit, nBit);
                                            hexmap.changePixel(NewPixel);
                                            System.out.println(hexmap);
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println(choiceModifica + " Esta no es una opción valida.");
                                    }
                                }while (choiceModifica != 0);
                                break;
                            case 2:
                                System.out.println(hexmap.imagenString());
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println(choiceImage + " Esta no es una opción valida.");
                        }
                    }while (choiceImage != 0);
                    break;
                case 0:
                    System.out.println("Hasta la próxima");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " Esta no es una opción valida.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        //System.out.println("Main Menu.\n");
        System.out.println("Main de creación.\n");
        System.out.print("1. Crear un Bitmap. \n");
        System.out.print("2. Crear un Pixmap.\n");
        System.out.print("3. Crear un Hexmap.\n");
        System.out.print("0. Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }

    private static void printMenuImage(){
        System.out.println("\nMenu de operaciones.\n");
        System.out.print("1. Modificar imagen.\n");
        System.out.print("2. Mostar imagen en formato String.\n");
        System.out.print("0. Volver.\n");
        System.out.print("\nIngrese su opción:\n");
    }

    private static void printMenuOperationBit(){
        System.out.println("\nMenu de operaciones\n");
        System.out.print("1. Determinar si la imagen es un Bitmap.\n");
        System.out.print("2. Determinar si la imagen es un Hexmap.\n");
        System.out.print("3. Determinar si la imagen es un Pixmap.\n");
        System.out.print("4. Recorta una imagen.\n");
        System.out.print("5. Obtiene el histograma de una imagen.\n");
        System.out.print("6. Rota 90 grados a la derecha la imagen imagen.\n");
        System.out.print("7. Cambia un pixel Pixbit por otro.\n");
        System.out.print("8. Invierte los bits.\n");
        System.out.print("0. Volver.");
        System.out.print("\nIngrese la operación a realizar: \n");
    }

    private static void printMenuOperationRgb(){
        System.out.println("\nMenu de operaciones\n");
        System.out.print("1. Determinar si la imagen es un Bitmap.\n");
        System.out.print("2. Determinar si la imagen es un Hexmap.\n");
        System.out.print("3. Determinar si la imagen es un Pixmap.\n");
        System.out.print("4. Recorta una imagen.\n");
        System.out.print("5. Transforma una imagen Pixamp a Hexmap.\n");
        System.out.print("6. Obtiene el histograma de una imagen.\n");
        System.out.print("7. Rota 90 grados a la derecha la imagen imagen.\n");
        System.out.print("8. Cambia un pixel Pixrgb por otro.\n");
        System.out.print("9. Invierte Pixeles RGB.\n");
        System.out.print("0. Volver.");
        System.out.print("\nIngrese la operación a realizar: \n");
    }

    private static void printMenuOperationHex(){
        System.out.println("\nMenu de operaciones\n");
        System.out.print("1. Determinar si la imagen es un Bitmap.\n");
        System.out.print("2. Determinar si la imagen es un Hexmap.\n");
        System.out.print("3. Determinar si la imagen es un Pixmap.\n");
        System.out.print("4. Recorta una imagen.\n");
        System.out.print("5. Obtiene el histograma de una imagen.\n");
        System.out.print("6. Rota 90 grados a la derecha la imagen imagen.\n");
        System.out.print("7. Cambia un pixel Pixhex por otro.\n");
        System.out.print("0. Volver.");
        System.out.print("\nIngrese la operación a realizar: \n");
    }
}