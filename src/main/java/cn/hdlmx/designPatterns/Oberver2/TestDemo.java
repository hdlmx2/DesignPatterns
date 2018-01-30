package cn.hdlmx.designPatterns.Oberver2;

public class TestDemo {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10,100,200);

    }
}
