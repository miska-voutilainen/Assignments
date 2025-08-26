// Class representing a Television
class Television {
    private int currentChannel = 1; // Default channel
    private boolean isOn = false;   // TV is initially off

    // Set the channel (only if TV is on)
    public void setChannel(int i) {
        if (isOn) {
            currentChannel = ((i - 1) % 10) + 1; // Wrap around from 10 to 1
        }
    }

    // Get the current channel (returns 0 if TV is off)
    public int getChannel() {
        return isOn ? currentChannel : 0;
    }

    // Check if the TV is on
    public boolean isOn() {
        return isOn;
    }

    // Toggle the TV power
    public void pressOnOff() {
        isOn = !isOn;
    }
}

// Class simulating a viewer's daily routine with the TV
public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television(); // Create a Television object
        myTV.setChannel(1); // Set initial channel

        // Simulate 10 days of waking up and watching TV
        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            // Turn on the TV if it's off
            if (!myTV.isOn())
                myTV.pressOnOff();

            // Watch TV until tired (when channel is divisible by 4)
            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            // Turn off the TV and go to sleep
            myTV.pressOnOff();
            System.out.println("Falling asleep");
        }
    }
}
