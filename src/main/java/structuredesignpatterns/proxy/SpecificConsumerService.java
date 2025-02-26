package structuredesignpatterns.proxy;

public class SpecificConsumerService implements ConsumerService {
    public SpecificConsumerService() {
        System.out.println("SpecificConsumerService constructed");
        System.out.println("Loading big data");
    }

    @Override
    public void showAllConsumers() {
        System.out.println("invoking showAllClients from SpecificConsumerService");
    }
}
