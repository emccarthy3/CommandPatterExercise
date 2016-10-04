package headfirst.command.remote;

public class Hottub {
  private boolean on;
  private int temperature;

  public Hottub() {
  }

  public void bubblesOff() {
    if (on) {
      System.out.println("Hottub is not bubbling");
    }
  }

  public void bubblesOn() {
    if (on) {
      System.out.println("Hottub is bubbling!");
    }
  }

  public void cool() {
    temperature = 98;
    System.out.println("Hottub is cooling to 98 degrees");
  }

  public void heat() {
    temperature = 105;
    System.out.println("Hottub is heating to a steaming 105 degrees");
  }

  public void jetsOff() {
    if (on) {
      System.out.println("Hottub jets are off");
    }
  }

  public void jetsOn() {
    if (on) {
      System.out.println("Hottub jets are on");
    }
  }

  public void off() {
    on = false;
  }

  public void on() {
    on = true;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

}
