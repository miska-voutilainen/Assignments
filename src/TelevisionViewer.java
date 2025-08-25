class Television {
    private int currentChannel = 1;
    private boolean isOn = false;

    public void setChannel(int i) {
        if (isOn) {
            currentChannel = ((i - 1) % 10) + 1; // Wrap around from 10 to 1
        }
    }

    public int getChannel() {
        return isOn ? currentChannel : 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }
}

public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}