package headfirst.designpatterns.command.remoteWL;

public class CeilingFan {
  public static final int HIGH = 2;
  public static final int LOW = 0;
  public static final int MEDIUM = 1;
  int level;
  String location = "";

  public CeilingFan(String location) {
    this.location = location;
  }

  public int getSpeed() {
    return level;
  }

  public void high() {
    // turns the ceiling fan on to high
    level = HIGH;
    System.out.println(location + " ceiling fan is on high");

  }

  public void low() {
    // turns the ceiling fan on to low
    level = LOW;
    System.out.println(location + " ceiling fan is on low");
  }

  public void medium() {
    // turns the ceiling fan on to medium
    level = MEDIUM;
    System.out.println(location + " ceiling fan is on medium");
  }

  public void off() {
    // turns the ceiling fan off
    level = 0;
    System.out.println(location + " ceiling fan is off");
  }
}
