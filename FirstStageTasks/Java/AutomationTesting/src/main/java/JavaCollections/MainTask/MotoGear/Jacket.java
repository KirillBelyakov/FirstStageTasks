package JavaCollections.MainTask.MotoGear;

import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;

public class Jacket extends MotoGear {
    private String patternOnABack;

    public Jacket(int price, int weight, Brand brand, Gender gender, Material material, Size size, String patternOnABack) {
        super(price, weight, brand, gender, material, size);
        this.patternOnABack = patternOnABack;
    }

    public String getPatternOnABack() {
        return patternOnABack;
    }

    public void setPatternOnABack(String patternOnABack) {
        this.patternOnABack = patternOnABack;
    }

    @Override
    public String toString() {
        return "Jacket{" + super.toString() +
                "patternOnABack='" + patternOnABack +
                '}';
    }
}
