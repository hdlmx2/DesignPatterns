package cn.hdlmx.designPatterns.Oberver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float tempperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override

    public void display() {
        this.toString();
    }

    @Override
    public void update(float tempperature, float humidity, float pressure) {
        this.tempperature = tempperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "tempperature=" + tempperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }
}
