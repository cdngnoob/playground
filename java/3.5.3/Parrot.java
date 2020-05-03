class Parrot extends Animal {

	void speak() {
		System.out.println("Ich kann sprechen");
	}
    
    void speak(String foo) {
        System.out.println(foo);
    }
    
    @Override
    void move() {
		System.out.println("Ich fliege");
	}
}