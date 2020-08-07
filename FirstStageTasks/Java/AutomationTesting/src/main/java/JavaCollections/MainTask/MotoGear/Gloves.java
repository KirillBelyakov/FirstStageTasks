package JavaCollections.MainTask.MotoGear;


import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;

public class Gloves extends MotoGear {
    private boolean havingFingers = true;

    public Gloves(int price, int weight, Brand brand, Gender gender, Material material, Size size, boolean havingFingers) {
        super(price, weight, brand, gender, material, size);
        this.havingFingers = havingFingers;
    }

    public boolean isHavingFingers() {
        return havingFingers;
    }

    public void setHavingFingers(boolean havingFingers) {
        this.havingFingers = havingFingers;
    }

    @Override
    public String toString() {
        return "Gloves{" + super.toString() +
                "havingFingers=" + havingFingers +
                '}';
    }

}
