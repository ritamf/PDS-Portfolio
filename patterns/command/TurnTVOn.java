public class TurnTVOn implements Command {
    EletronicDevice theDevice;

    public TurnTVOn(EletronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }
} 