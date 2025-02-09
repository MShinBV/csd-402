// Miles Shinsato, 02/09/2025, Programming Assignment M7 (Reusing Programming Assignment M6)

// Define the Fan class
class shinsato_m7_Fan {

    // Constants representing fan speed levels
    // 0 = STOPPED, 1 = SLOW, 2 = MEDIUM, 3 = FAST
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields (instance variables)
    // Holds: fan speed, if fan is on (true) or off (false), radius of fan, and fan color
    private int speed;
    private boolean FanStateOn;
    private double radius;
    private String color;

    // No-argument constructor (where the fan default values are set)
    public shinsato_m7_Fan() {
        // Defaults for fan: speed is STOPPED (0), state is off (false), radius is 6.0, color is white
        this.speed = STOPPED;
        this.FanStateOn = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters (allows setting initial values)
    public shinsato_m7_Fan(int speed, boolean FanStateOn, double radius, String color) {
        // Set the fan speed, fanState, radius, and color
        this.speed = speed;
        this.FanStateOn = true;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods for speed
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter methods for FanStateOn (if true = fan on)
    public boolean isfanStateOn() {
        return FanStateOn;
    }
    public void setFanStateOn(boolean on) {
        this.FanStateOn = on;
    }

    // Getter and setter methods for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter methods for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Override toString() method to return a description of the Fan's state
    @Override
    public String toString() {
        String speedText;
        switch (speed) {
            case SLOW:
                speedText = "Slow";
                break;
            case MEDIUM:
                speedText = "Medium";
                break;
            case FAST:
                speedText = "Fast";
                break;
            default:
                speedText = "Stopped";
        }

        if (FanStateOn) {
            return "\nFan status: On \nFan speed: " + speedText + "\nColor: " + color + "\nRadius: " + radius;
        } else {
            return "\nFan status: Off \nColor: " + color + "\nRadius: " + radius;
        }
    }
}
