package headfirst.command.simpleremote;

/**
 * Invoker of loosely couple command. Notice how the data member slot has no clue of the type of the
 * wrapped request object. It just sees a command.
 * 
 */
public class SimpleRemoteControl {
  private Command slot;

  public SimpleRemoteControl() {
  }

  public void buttonWasPressed() {
    slot.execute();
  }

  public void setCommand(Command command) {
    slot = command;
  }
}
