package headfirst.command.remote;

public class TV {
  private int channel;
  private String location;

  public TV(String location) {
    this.location = location;
  }

  public void off() {
    System.out.println("TV is off");
  }

  public void on() {
    System.out.println("TV is on");
  }

  public void setInputChannel() {
    this.channel = 3;
    System.out.println("Channel is set for VCR");
  }
}
