public class smartWatch extends SmartGadget{
    private int HeartRate;
    private boolean multiTouchScreen;

    public boolean isMultiTouchScreen() {
        return multiTouchScreen;
    }

    public void setMultiTouchScreen(boolean multiTouchScreen) {
        this.multiTouchScreen = multiTouchScreen;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int heartRate) {
        HeartRate = heartRate;
    }
}
