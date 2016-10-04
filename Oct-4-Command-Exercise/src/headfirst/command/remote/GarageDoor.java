package headfirst.command.remote;

public class GarageDoor {
  private String location;

  public GarageDoor(String location) {
    this.location = location;
  }

  public void down() {
    System.out.println(location + " garage Door is Down");
  }

  public void lightOff() {
    System.out.println(location + " garage light is off");
  }

  public void lightOn() {
    System.out.println(location + " garage light is on");
  }

  public void stop() {
    System.out.println(location + " garage Door is Stopped");
  }

  public void up() {
    System.out.println(location + " garage Door is Up");
  }
}
