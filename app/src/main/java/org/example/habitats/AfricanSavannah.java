package org.example.habitats;

import org.example.animals.mammals.Mammal;

public class AfricanSavannah extends Habitat<Mammal> {
    @Override
    public void addInhabitant(Mammal mammal) {
        collection.add(mammal);
    }
}
