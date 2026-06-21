class SingletonImpl{
    private static SingletonImpl instance;
    private SingletonImpl(){
        System.out.println("Singleton instance is initiated...");
    };
    public static SingletonImpl getInstance(){
        if(instance == null){
            instance = new SingletonImpl();
        }
        return instance;
    }
    public static void doSomething(){
        System.out.println("Doing something...");
    }
}

class Singleton{
    public static void  main(String args[]){
        SingletonImpl.getInstance().doSomething();
    }
}