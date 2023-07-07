class Singleton {
    // Singleton means only one instance can be made of an object. When a helper (public method) of calling the constructor,
    // it will return that same instance.
    private Singleton () {

    }

    // The first time an object is created, static properties will be defined, then other objects to be created will share
    // that same instance
    private static Singleton instance; // reference variable for Singleton class

    // needs to be static so this method won't be dependant on an object
    public static Singleton createSingleton() {
        // if no instance is made yet, create a singleton class
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}