

class Main {
    public static void main(String[] args){

        // not possible because Singleton constructor is private and Singleton helper method constructor depends on an instance
        // Singleton obj = new Singleton();   

        Singleton obj1 = Singleton.createSingleton();
        Singleton obj2 = Singleton.createSingleton();
        Singleton obj3 = Singleton.createSingleton();
        // all instances are referring to the same object
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}