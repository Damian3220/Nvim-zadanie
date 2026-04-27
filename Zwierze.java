class Zwierze {
  void wydajDzwiek() {
    System.out.println("Dźwięk zwierzęcia");
  }
}

class Kot extends Zwierze {
  @Override
  void wydajDzwiek() {
    System.out.println("Miau");
  }
}
