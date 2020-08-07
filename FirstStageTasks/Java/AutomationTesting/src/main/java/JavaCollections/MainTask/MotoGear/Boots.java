package JavaCollections.MainTask.MotoGear;


import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;

public class Boots extends MotoGear {
    private int footSize;

    public Boots(int price, int weight, Brand brand, Gender gender, Material material, Size size, int footSize) {
        super(price, weight, brand, gender, material, size);
        this.footSize = footSize;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Boots{" + super.toString() +
                "footSize= " + footSize +
                '}';
    }
}

