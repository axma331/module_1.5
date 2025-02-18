package creational_pattern.singletonepattern;

public final class SingletonClass {
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }
}
