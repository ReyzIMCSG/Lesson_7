package org.example;

public class Cat extends Animal {
    private boolean satiety;

    public static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.satiety = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт.");
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
