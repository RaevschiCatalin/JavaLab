package rezolvare;

import java.util.*;


public class Main {
    public static void sortImagini(List<Image> imagini){
        imagini.sort(Comparator.comparingInt(Image::calcAvgLightness).thenComparing(Image::calcAvgLuminosity));
        System.out.println(imagini);
    }
    public static void afisareCodificare(List<Image> imagini){
        HashMap<String, Integer> codificari = new HashMap<>();
        for(Image image : imagini){
            if(codificari.containsKey(image.getModCodificare())){
                codificari.put(image.getModCodificare(), codificari.get(image.getModCodificare()) + 1);
            }
            else{
                codificari.put(image.getModCodificare(), 1);
            }
        }
        System.out.println(codificari);
    }
    public static void afisarePixeli(String[] args, List<Image> imagini){
        for(Image image : imagini){
            for(Pixel pixel : image.getPixels()){
                if(Integer.parseInt(args[0])==pixel.getX() && Integer.parseInt(args[1])==pixel.getY()){
                    System.out.println(pixel);
                }
            }
        }
    }
    public static void main(String[] args){
        Pixel pixel1 = new Pixel(255, 255, 255, 0, 0);
//        System.out.println(pixel1);
        Pixel pixel2 = new Pixel(223, 224, 225, 0, 0);
        Pixel pixel3 = new Pixel(103, 20, 130, 2, 2);
        Pixel pixel4 = new Pixel(0, 0, 0, 3, 3);
        Pixel pixel5 = new Pixel(255, 255, 255, 4, 4);
        Pixel pixel6 = new Pixel(255, 255, 255, 5, 5);
        Pixel pixel7 = new Pixel(255, 255, 255, 6, 6);
        Pixel pixel8 = new Pixel(255, 255, 255, 7, 7);
        Pixel pixel9 = new Pixel(255, 255, 255, 8, 8);
        Pixel pixel10 = new Pixel(255, 255, 255, 0, 0);
        ArrayList<Pixel> pixeli = new ArrayList<>();
        pixeli.add(pixel1);
        pixeli.add(pixel2);
        pixeli.add(pixel3);
        pixeli.add(pixel4);
        pixeli.add(pixel5);
        pixeli.add(pixel6);
        pixeli.add(pixel7);
        pixeli.add(pixel8);
        pixeli.add(pixel9);
        pixeli.add(pixel10);
        Image image = new Image("jpg", pixeli);
//        System.out.println(image);
        Pixel pixel11 = new Pixel(23, 45, 67, 10, 10);
        Pixel pixel12 = new Pixel(57, 32, 12, 1, 10);
        Pixel pixel13 = new Pixel(255, 255, 255, 2, 10);
        ArrayList<Pixel> pixeli2 = new ArrayList<>();
        pixeli2.add(pixel11);
        pixeli2.add(pixel12);
        pixeli2.add(pixel13);
        Image image2 = new Image("png", pixeli2);
        List<Image> imagini = new ArrayList<>();
        imagini.add(image);
        imagini.add(image2);
//        System.out.println(imagini);
        System.out.println(image.calcAvgLightness());
        System.out.println(image2.calcAvgLightness());
        sortImagini(imagini);
        afisareCodificare(imagini);
        afisarePixeli(args, imagini);
    }
}
