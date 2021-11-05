package by.klintsov.entity;

public abstract class Device {
    private float cost;

    public Device() {
        this.cost = 0.0f;
    }

    public Device(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString() {
        return "Device{\n" +
                "cost: " + cost +
                "\n}";
    }

    @Override
    public int hashCode() {
        int result;
        int floatAsInt = (int) cost;
        result = 31 * floatAsInt;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Device that = (Device) o;
        return cost == that.getCost();
    }
}
