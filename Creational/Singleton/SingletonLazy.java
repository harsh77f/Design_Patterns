class SingletonLazy {
    private static SingletonLazy obj;
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(obj == null){
            obj = new SingletonLazy();
        }
        return obj;
    }

}
/*
Note: Singleton obj is not created until we need it and call the getInstance() method.
This is called lazy instantiation.
The main problem with the above method is that it is not thread-safe.
 */