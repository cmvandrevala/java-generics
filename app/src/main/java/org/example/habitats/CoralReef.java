package org.example.habitats;

import org.example.animals.fish.Fish;

public class CoralReef extends Habitat<Fish> {
    @Override
    public void addInhabitant(Fish fish) {
        collection.add(fish);
    }
}
