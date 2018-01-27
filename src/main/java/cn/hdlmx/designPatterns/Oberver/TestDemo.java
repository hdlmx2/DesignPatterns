package cn.hdlmx.designPatterns.Oberver;

public class TestDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDispaly = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(100,100,200);
    }
}
