package headfirst.command.undo;

import java.util.*;

//
// This is the invoker
//
public class RemoteControlWithUndo {
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;
  private Stack<Command> undoStack;

  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    undoStack = new Stack<Command>();
    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
    undoStack.push(undoCommand);
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
    undoStack.push(undoCommand);
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
    undoStack.pop();
  }

  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    "
                        + offCommands[i].getClass().getName() + "\n");
      
    }
    for (int j = 0; j < undoStack.size(); j++){
    stringBuff.append("[undo] " + undoStack.get(j).getClass().getName() + "\n");
    }
    return stringBuff.toString();
  }
}
