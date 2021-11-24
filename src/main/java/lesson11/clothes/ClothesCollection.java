package lesson11.clothes;

import java.util.ArrayList;

public class ClothesCollection {
    public static void main(String[] args) {
        ArrayList<String> clothes = new ArrayList<>();
        ArrayList<String> uniqueClothes = new ArrayList<>();

        clothes.add("scarf");
        clothes.add("T-shirt");
        clothes.add("skirt");
        clothes.add("trousers");
        clothes.add("T-shirt");
        clothes.add("hat");
        clothes.add("dress");
        clothes.add("trousers");
        clothes.add("gloves");
        clothes.add("jeans");
        clothes.add("gloves");
        clothes.add("T-shirt");
        clothes.add("dress");
        clothes.add("scarf");
        clothes.add("T-shirt");
        clothes.add("T-shirt");
        clothes.add("dress");
        clothes.add("T-shirt");
        clothes.add("blouse");
        clothes.add("hat");

        System.out.println("Clothes: " + clothes);

        for (int i = 0; i < clothes.size(); i++) {
            if (!uniqueClothes.contains(clothes.get(i))) {
                uniqueClothes.add(clothes.get(i));
            }
        }

        System.out.println("Unique positions: " + uniqueClothes);

        for (int i = 0; i < uniqueClothes.size(); i++) {
            String temp = uniqueClothes.get(i);
            int j = 0;
            for (int k = 0; k < clothes.size(); k++) {
                if (clothes.get(k) == temp) {
                    j++;
                }
            }
            System.out.println("'" + uniqueClothes.get(i) + "' meets " + j + " times");
        }
    }

}
