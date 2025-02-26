package structuredesignpatterns.proxy;

public class ConsumerServiceProxy implements ConsumerService {
    private SpecificConsumerService consumerService;

    public ConsumerServiceProxy() {
        System.out.println("ConsumerServiceProxy constructed");
    }

    @Override
    public void showAllConsumers() {
        System.out.println("invoking showAllClients from ConsumerServiceProxy");
        System.out.println("Executing some work");
        if (consumerService == null) {
            consumerService = new SpecificConsumerService();
        }
        consumerService.showAllConsumers();
    }
}
