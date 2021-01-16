package processors;

public class ProcessorArm extends Processor {
    private final String architecture = "ARM";
    @Override
    String dataProcess(String data) {
        return data.toUpperCase();
    }

    @Override
    String dataProcess(long data) {
        return null;
    }

    //Создать несколько экземпляров класса.

}
