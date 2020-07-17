package singleton;

/**
 * A singleton object written in java. Has the same functionality as the kotlin SingletonCounter.kt
 */
public class JavaSingletonCounter {
    // Attributes and the instance
    private int num = 0;
    private static JavaSingletonCounter instance = null;

    /**
     * The constructor must be private, that way we can insure that it is only called when we want to (once at max)
     */
    private JavaSingletonCounter() {}

    /**
     * This is the core of the singleton design pattern. This function is responsible for getting the instance of this
     * object and maintaining a maximum of one instance at all times.
     *
     * This function must be static, as you should not need an instance of this object to already exist to call
     * getInstance(). This function must also be synchronized to keep all running threads updated on the value of
     * instance and prevent accidentally creating more than one JavaSingletonCounter instance.
     *
     * @return instance of the JavaSingletonCounter
     */
    public static synchronized JavaSingletonCounter getInstance() {
        // This should only evaluate to true once during the lifetime of the program.
        if (instance == null)
            instance = new JavaSingletonCounter();

        // Returning the instance
        return instance;
    }

    /**
     * Note how we only interact with getInstance() when we want to interact with or modify our object.
     */
    public void setNum(int num) {
        getInstance().num = num;
    }

    /**
     * Note how we only interact with getInstance() when we want to interact with or modify our object.
     */
    public int getNum() {
        return getInstance().num;
    }
}
