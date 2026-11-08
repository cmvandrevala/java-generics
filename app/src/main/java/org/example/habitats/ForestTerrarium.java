package org.example.habitats;

import org.example.animals.insects.Insect;

public class ForestTerrarium extends Habitat<Insect> {
    @Override
    public void addInhabitant(Insect insect) {
        collection.add(insect);
    }
}
