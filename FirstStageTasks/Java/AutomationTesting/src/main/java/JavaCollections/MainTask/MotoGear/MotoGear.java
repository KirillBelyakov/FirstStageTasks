package JavaCollections.MainTask.MotoGear;

import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;


public class MotoGear {
    private int price;
    private int weight;
    private Brand brand;
    private Gender gender;
    private Material material;
    private Size size;

    public MotoGear(int price, int weight, Brand brand, Gender gender, Material material, Size size) {
        this.price = price;
        this.weight = weight;
        this.brand = brand;
        this.gender = gender;
        this.material = material;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MotoGear{" +
                "price=" + price +
                ", weight=" + weight +
                ", brand=" + brand +
                ", gender=" + gender +
                ", material=" + material +
                ", size=" + size +
                '}';
    }
}
