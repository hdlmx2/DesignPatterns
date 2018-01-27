package cn.hdlmx.designPatterns.Oberver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override

    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }
}
