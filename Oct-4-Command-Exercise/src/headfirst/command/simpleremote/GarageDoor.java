package headfirst.command.simpleremote;

public class GarageDoor {

  public GarageDoor() {
  }

  public void down() {
    System.out.println("Garage Door is Closed");
  }

  public void lightOff() {
    System.out.println("Garage light is off");
  }

  public void lightOn() {
    System.out.println("Garage light is on");
  }

  public void stop() {
    System.out.println("Garage Door is Stopped");
  }

  public void up() {
    System.out.println("Garage Door is Open");
  }
}
