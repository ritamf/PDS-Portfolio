import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {
        EletronicDevice newDevice = TVRemote.getDevice();

        Command command = new TurnTVUp(newDevice);

        DeviceButton onPressed = new DeviceButton(command);

        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();

        // ---------------------------------------------------------

        Television tv = new Television();
        Radio radio = new Radio();

        List<EletronicDevice> allDevices = new ArrayList<>();

        allDevices.add(tv);
        allDevices.add(radio);

        TurnItAllOff allOffCommand = new TurnItAllOff(allDevices);

        DeviceButton buttonThatTurnsAllDevicesOff = new DeviceButton(allOffCommand);
        buttonThatTurnsAllDevicesOff.press();
        buttonThatTurnsAllDevicesOff.pressUndo();

        

    }
}
