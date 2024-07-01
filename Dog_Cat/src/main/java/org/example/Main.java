package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");

        // Проверка бега и плавания
        dogBobik.run(150);
        dogBobik.swim(5);

        catBarsik.run(150);
        catBarsik.swim(5);

        // Проверка кормления котов
        Bowl bowl = new Bowl(20);

        Cat[] cats = {catBarsik, catMurzik};
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        // Вывод информации о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Добавление еды в миску и повторная попытка накормить котов
        bowl.addFood(15);
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(bowl, 10);
            }
        }

        // Вывод окончательной информации о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Вывод количества животных
        System.out.println("Количество животных: " + Animal.animalCount);
        System.out.println("Количество собак: " + Dog.dogCount);
        System.out.println("Количество котов: " + Cat.catCount);
    }
}
