public class Robot {
  String model;
  int poziomBaterii;

  public void przedstawSie() {
    System.out.println("Model: " + model + "poziomBaterii: " + poziomBaterii + "%");
  }
}

public static void main(String[] args) {
  Robot r = new Robot();
  r.model = "Robot1";
  r.poziomBaterii = 85;
  r.przedstawSie();
}
