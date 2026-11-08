package org.example.habitats;

import java.util.ArrayList;
import java.util.Collection;

import org.example.animals.Animal;

public abstract class Habitat<A extends Animal> {

  public Collection<A> collection = new ArrayList<A>();

  public void feedAnimals() {
    for (A animal : collection) {
      animal.feed();
    }
  }

  public void observeAnimals() {
    for (A animal : collection) {
      animal.observe();
    }
  }

  public abstract void addInhabitant(A animal);
}
