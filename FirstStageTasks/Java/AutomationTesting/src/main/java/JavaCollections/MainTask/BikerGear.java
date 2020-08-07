package JavaCollections.MainTask;

import JavaCollections.MainTask.MotoGear.MotoGear;

import java.util.*;

public class BikerGear {

    private List<MotoGear> motoGears;

    public BikerGear sortByMaxWeight() {
        Collections.sort(motoGears, new Comparator<MotoGear>() {
            public int compare(MotoGear o1, MotoGear o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        return this;
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (MotoGear motoGear : motoGears)
            totalCost += motoGear.getPrice();
        return totalCost;
    }

    public List<MotoGear> getGearByPriceRange(int minPrice, int maxPrice) {
        List<MotoGear> motoGearsPrice = new ArrayList<>();
        for (MotoGear motoGear : motoGears)
            if (minPrice <= motoGear.getPrice() && motoGear.getPrice() <= maxPrice)
                motoGearsPrice.add(motoGear);
        return motoGearsPrice;
    }

    public BikerGear(List<MotoGear> motoGears) {
        this.motoGears = motoGears;
    }

    public List<MotoGear> getMotoGears() {
        return motoGears;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "motoGears=" + motoGears +
                '}';
    }
}
