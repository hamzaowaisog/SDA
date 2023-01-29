public class smartPhone extends SmartGadget{
    private boolean multiTouchScreen;
    private int HeartRate;

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int heartRate) {
        HeartRate = heartRate;
    }

    public boolean isMultiTouchScreen() {
        return multiTouchScreen;
    }

    public void setMultiTouchScreen(boolean multiTouchScreen) {
        this.multiTouchScreen = multiTouchScreen;
    }
}
