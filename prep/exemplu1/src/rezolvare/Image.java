package rezolvare;

import java.util.*;
public class Image {
    private String modCodificare;
    private List<Pixel> pixels;

    public Image() {
        this.modCodificare = "jpg";
        this.pixels = new ArrayList<>();
    }

    public Image(String modCodificare, List<Pixel> pixels) {
        this.modCodificare = modCodificare;
        this.pixels = pixels;
    }

    public String getModCodificare() {
        return modCodificare;
    }

    public void setModCodificare(String modCodificare) {
        this.modCodificare = modCodificare;
    }

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    @Override
    public String toString() {
        return "Image{" +
                "modCodificare='" + modCodificare + '\'' +
                ", pixels=" + pixels +
                '}';
    }
    public int calcAvgLightness(){
        int sum = 0;
        for(Pixel pixel : pixels){
            sum += pixel.calcLightness();
        }
        return sum / pixels.size();
    }
    public int calcAvgLuminosity(){
        int sum = 0;
        for(Pixel pixel : pixels){
            sum += pixel.calcLuminosity();
        }
        return sum / pixels.size();
    }
}
