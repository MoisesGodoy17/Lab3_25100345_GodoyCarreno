package org.example;
import java.util.Scanner;


import org.example.Tda.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tda_Pixel_GodoyCarreno_25100345 P1 = new Tda_PixBit_GodoyCarreno_25100345(0, 0, 10, 1);
        Tda_Pixel_GodoyCarreno_25100345 P2 = new Tda_PixBit_GodoyCarreno_25100345(0, 1, 20, 2);
        Tda_Pixel_GodoyCarreno_25100345 P3 = new Tda_PixBit_GodoyCarreno_25100345(0, 2, 30, 3);
        Tda_Pixel_GodoyCarreno_25100345 P4 = new Tda_PixBit_GodoyCarreno_25100345(1, 0, 40, 4);
        Tda_Pixel_GodoyCarreno_25100345 P5 = new Tda_PixBit_GodoyCarreno_25100345(1, 1, 50, 5);
        Tda_Pixel_GodoyCarreno_25100345 P6 = new Tda_PixBit_GodoyCarreno_25100345(1, 2, 60, 6);



        List<Tda_Pixel_GodoyCarreno_25100345> pixeles = Arrays.asList(P1, P2, P3, P4, P5, P6);

        Tda_Image_GodoyCarreno_25100345 myImage = new Tda_Image_GodoyCarreno_25100345(2, 3, pixeles);

        System.out.println(myImage);

        myImage.rotate90(myImage.getAncho(), myImage.getLargo(), 0, myImage.getLargo()-1);

        myImage.crop(0,1,1,2);
        System.out.println(myImage);

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
                    for (int i = 0; i <= largueBit * anchBit; i++) {
                        System.out.println("---// Ingrese la posicion X: //---\n");
                        var xBit = input.nextInt();
                        System.out.println("---// Ingrese la posicion Y: //---\n");
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
                    System.out.println("---// La imagen Bitmap fue creada con exito //---");
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
                                            System.out.println("--- // Ingrese una posicion x1: //---");
                                            var x1Bit = input.nextInt();
                                            System.out.println("--- // Ingrese una posicion y1: //---");
                                            var y1Bit = input.nextInt();
                                            System.out.println("--- // Ingrese una posicion x2: //---");
                                            var x2Bit = input.nextInt();
                                            System.out.println("--- // Ingrese una posicion y2: //---");
                                            var y2Bit = input.nextInt();
                                            bitmap.crop(x1Bit, y1Bit, x2Bit, y2Bit);
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
                                            System.out.println("--- // Ingrese la posicion X: //---");
                                            var xNbit = input.nextInt();
                                            System.out.println("--- // Ingrese la posicion /: //---");
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
                                    }
                                }while (choiceModifica != 0);
                            break;
                        }
                    }while (choiceImage != 0);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " Esta no es una opcion valida.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("Main Menu.\n");
        System.out.print("1. Crear un Bitmap. \n");
        System.out.print("2. Crear un Pixmap.\n");
        System.out.print("3. Crear un Hexmap.\n");
        System.out.print("0. Exit\n");
        System.out.print("\nEnter your choice: ");
    }

    private static void printMenuImage(){
        System.out.println("\nMenu de creacion\n");
        System.out.print("1. Modificar imagen\n");
        System.out.print("2. Mostar imagen en formato String\n");
        System.out.print("0. Volver\n");
        System.out.print("Ingrese su opcion:\n");
    }

    private static void printMenuOperationBit(){
        System.out.println("\nMenu de creacion\n");
        System.out.print("1. Determinar si la imagen es un Bitmap\n");
        System.out.print("2. Determinar si la imagen es un Hexmap\n");
        System.out.print("3. Determinar si la imagen es un Pixmap\n");
        System.out.print("4. Recorta una imagen\n");
        System.out.print("5. Obtiene el histograma de una imagen\n");
        System.out.print("6. Rota 90 grados a la derecha la imagen imagen\n");
        System.out.print("7. Cambia un pixel por otro\n");
        System.out.print("8. invierte los bits\n");
    }
}