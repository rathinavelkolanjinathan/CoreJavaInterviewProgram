public class SingletonClassMultiThread {
    private static volatile SingletonClassMultiThread singletonClassMultiThread;
    private  SingletonClassMultiThread(){

    }

    public static  SingletonClassMultiThread  getInstance() {

        synchronized(SingletonClassMultiThread.class) {
            if (singletonClassMultiThread == null) {
                singletonClassMultiThread = new SingletonClassMultiThread();
            }
            return singletonClassMultiThread;
        }
    }
}
