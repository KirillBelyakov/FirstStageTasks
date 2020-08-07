package JavaCollections.MainTask;

import JavaCollections.MainTask.FeaturedCategories.Brand;
import JavaCollections.MainTask.FeaturedCategories.Gender;
import JavaCollections.MainTask.FeaturedCategories.Material;
import JavaCollections.MainTask.FeaturedCategories.Size;
import JavaCollections.MainTask.MotoGear.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<MotoGear> motoGears = Arrays.asList(
                new Boots(50, 1500, Brand.BMW, Gender.FOR_MEN, Material.COMPOSITE, Size.XL, 45),
                new Gloves(30, 900, Brand.LEGION, Gender.FOR_MEN, Material.LEATHER, Size.M, false),
                new Helmet(110, 2500, Brand.BMW, Gender.FOR_MEN, Material.POLYCARBONATE, Size.XL, "Green"),
                new Jacket(225, 3600, Brand.DAYTONA, Gender.FOR_MEN, Material.LEATHER, Size.XL, "Dragon"),
                new Pants(80, 1700, Brand.SHARK, Gender.FOR_MEN, Material.LEATHER, Size.L, 6, false));

        BikerGear bikerGear = new BikerGear(motoGears);
        bikerGear.sortByMaxWeight();
        System.out.println("Sorted by max weight ");
        printGear(bikerGear.getMotoGears());
        System.out.println("Total cost: " + bikerGear.getTotalCost() + "$");
        System.out.println("Gear's elements in price range ");
        printGear(bikerGear.getGearByPriceRange(50, 155));
    }

    private static void printGear(List<MotoGear> motoGears) {
        for (MotoGear motoGear : motoGears) {
            System.out.println(motoGear);
        }
    }
}