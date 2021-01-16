package processors;

public abstract class Processor {
    double frequency;
    double cache;
    int bitCapacity;

    String getDetails() { // Метод, который возвращает технические характеристики процессора.
        return String.valueOf(frequency + cache + bitCapacity); // Пока не знаю, что возвращать
    }
    abstract String dataProcess(String data); // Абстрактный метод.
    abstract String dataProcess(long data); // Абстрактный метод.
}
