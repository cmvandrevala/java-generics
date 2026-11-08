package org.example.animals.fish;

public class Goldfish extends Fish {
  @Override
  public void feed() {
    System.out.println("Goldfish eat those little fish flakes that come in a can.");
  }

  @Override
  public void observe() {
    System.out.println("I mean, honestly, goldfish don't do too much... blub blub...");
  }
}
