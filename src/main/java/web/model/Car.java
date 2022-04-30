package web.model;

public class Car {
    private String model;
    private int series;
    private int howOld;

    public Car() {
    }

    public Car(String model, int series, int howOld) {
        this.model = model;
        this.series = series;
        this.howOld = howOld;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHowOld() {
        return howOld;
    }

    public void setHowOld(int howOld) {
        this.howOld = howOld;
    }
}
