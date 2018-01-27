package cn.hdlmx.designPatterns.Oberver;



/*
    观察者中的主题
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
