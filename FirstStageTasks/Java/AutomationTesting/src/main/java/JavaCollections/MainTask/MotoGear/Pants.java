package JavaCollections.MainTask.MotoGear;

import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;

public class Pants extends MotoGear {
    private int pocketsQuantity;
    private boolean kneeGuards = true;

    public Pants(int price, int weight, Brand brand, Gender gender, Material material, Size size, int pocketsQuantity, boolean kneeGuards) {
        super(price, weight, brand, gender, material, size);
        this.pocketsQuantity = pocketsQuantity;
        this.kneeGuards = kneeGuards;
    }

    public int getPocketsQuantity() {
        return pocketsQuantity;
    }

    public void setPocketsQuantity(int pocketsQuantity) {
        this.pocketsQuantity = pocketsQuantity;
    }

    public boolean isKneeGuards() {
        return kneeGuards;
    }

    public void setKneeGuards(boolean kneeGuards) {
        this.kneeGuards = kneeGuards;
    }


    @Override
    public String toString() {
        return "Pants{" + super.toString() +
                "pocketsQuantity=" + pocketsQuantity +
                ", kneeGuards=" + kneeGuards +
                '}';
    }
}
