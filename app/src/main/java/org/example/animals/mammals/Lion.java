package org.example.animals.mammals;

public class Lion extends Mammal {

  @Override
  public void feed() {
    System.out.println("Lions in zoos are fed commercially sourced meat, such as ground beef, horse meat, or fortified meat mixes.");
  }

  @Override
  public void observe() {
    System.out.println("Enrichment for lions in captivity can be anything from chasing a ball to elicit hunting behavior to sniffing new scents or changing exhibit features.");
  }
}
