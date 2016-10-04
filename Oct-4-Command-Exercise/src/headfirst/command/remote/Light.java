package headfirst.command.remote;

public class Light {
  private String location = "";

  public Light(String location) {
    this.location = location;
  }

  public void off() {
    System.out.println(location + " light is off");
  }

  public void on() {
    System.out.println(location + " light is on");
  }
}
