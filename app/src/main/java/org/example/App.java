package org.example;

import org.example.animals.fish.BluefinTuna;
import org.example.animals.fish.Goldfish;
import org.example.animals.insects.Bumblebee;
import org.example.animals.insects.Ladybug;
import org.example.animals.mammals.Lion;
import org.example.animals.mammals.Wildebeest;

public class App {
    public static void main(String[] args) {
      Zoo zoo = new Zoo();

      zoo.addAnimal(new Lion());
      zoo.addAnimal(new Wildebeest());
      zoo.addAnimal(new BluefinTuna());
      zoo.addAnimal(new Goldfish());
      zoo.addAnimal(new Ladybug());
      zoo.addAnimal(new Bumblebee());

      zoo.feedingTime();
      zoo.observationTime();
    }
}
