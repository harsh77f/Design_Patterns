class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe obj;
    private SingletonLazyThreadSafe(){}


    // Only one thread can execute this at a time
    public static synchronized SingletonLazyThreadSafe getInstance(){
        if(obj == null){
            obj = new SingletonLazyThreadSafe();
        }
        return obj;
    }

}
