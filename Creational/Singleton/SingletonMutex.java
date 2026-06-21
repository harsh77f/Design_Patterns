class SingletonMutex {
    private static volatile SingletonMutex obj = new SingletonMutex();
    private SingletonMutex(){};

    public static SingletonMutex getInstance() {
        if(obj == null){
            //acquiring the lock for SingletonMutex.class instance
            synchronized (SingletonMutex.class){
                // check again as multiple threads can reach above step
                if(obj == null){
                    obj = new SingletonMutex();
                }
            }
        }
        return obj;
    }
}

