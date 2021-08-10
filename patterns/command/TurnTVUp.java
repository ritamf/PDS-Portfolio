public class TurnTVUp implements Command {
    EletronicDevice theDevice;

    public TurnTVUp(EletronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.volumeUp();
    }

    public void undo() {
        theDevice.volumeDown();
    }
} 