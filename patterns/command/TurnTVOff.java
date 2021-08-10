public class TurnTVOff implements Command {
    EletronicDevice theDevice;

    public TurnTVOff(EletronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }

    public void undo() {
        theDevice.on();
    }
} 