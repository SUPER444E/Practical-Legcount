package org.example;

import java.util.Set;

public class legCount {
    //'lion', 'deer', 'elephant', 'horse', 'dog', 'cat'
    private static final Set<String> FOUR_LEGGED_ANIMALS = Set.of("lion","deer","elephant","horse","dog","cat");

    public static int legCount(String[] animals) {
        if (animals == null) {
            return 0;
        }
        int count =0;
        for (String animal : animals) {
            if(animal.isEmpty() || animal == null) {
                continue;
            }
            // cap-sensitive
            // whitespace
            if (FOUR_LEGGED_ANIMALS.contains(animal.trim().toLowerCase())) {
                count++;
            }

        }
        return count;
    }

}
