package JavaCollections.MainTask.MotoGear;

import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;

public class Helmet extends MotoGear {
    private String visorColour;

    public Helmet(int price, int weight, Brand brand, Gender gender, Material material, Size size, String visorColour) {
        super(price, weight, brand, gender, material, size);
        this.visorColour = visorColour;
    }

    public String getVisorColour() {
        return visorColour;
    }

    public void setVisorColour(String visorColour) {
        this.visorColour = visorColour;
    }

    @Override
    public String toString() {
        return "Helmet{" + super.toString() +
                "visorColour='" + visorColour +
                '}';
    }
}
