package org.example;

import java.util.ArrayList;
import java.util.Collection;

import org.example.animals.Animal;
import org.example.animals.fish.Fish;
import org.example.animals.insects.Insect;
import org.example.animals.mammals.Mammal;
import org.example.habitats.AfricanSavannah;
import org.example.habitats.CoralReef;
import org.example.habitats.ForestTerrarium;

public class Zoo {
  private AfricanSavannah africanSavannah = new AfricanSavannah();
  private CoralReef coralReef = new CoralReef();
  private ForestTerrarium forestTerrarium = new ForestTerrarium();

  public void addAnimal(Animal animal) {
    if(animal instanceof Fish) {
      addFish((Fish) animal);
    } else if(animal instanceof Insect) {
      addInsect((Insect) animal);
    } else {
      addMammal((Mammal) animal);
    }
  }

  public void feedingTime() {
    africanSavannah.feedAnimals();
    coralReef.feedAnimals();
    forestTerrarium.feedAnimals();
  }

  public void observationTime() {
    africanSavannah.observeAnimals();
    coralReef.observeAnimals();
    forestTerrarium.observeAnimals();
  }

  private void addFish(Fish fish) {
    coralReef.addInhabitant(fish);
  }

  private void addInsect(Insect insect) {
    forestTerrarium.addInhabitant(insect);
  }

  private void addMammal(Mammal mammal) {
    africanSavannah.addInhabitant(mammal);
  }
}
