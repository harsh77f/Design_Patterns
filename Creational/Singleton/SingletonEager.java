class SingletonEager {
    private static SingletonEager obj = new SingletonEager();
    private SingletonEager(){};

    public static SingletonEager getInstance(){
        return obj;
    }
}
/*
the Singleton instance is created at the time of class loading,
regardless of whether it is used or not. It is simple and thread-safe,
but may lead to unnecessary resource usage.
*/
