package wanda;

public class Animal {

    public String name;
    public int age;

    public void show(){
        System.out.println(name + "今年" + age + "岁了");
    }
}

class Dog extends Animal {
    public void wangwang(){
        System.out.println(name + "汪汪叫!");
    }
}

class Cat extends Animal {
    public void miaomiao(){
        System.out.println(name + "喵喵叫!");
    }
}

class Test{

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "狗狗";
        dog.age = 6;
        dog.show();

        Cat cat = new Cat();
        cat.name = "猫猫";
        cat.age = 4;
        cat.show();


    }
}


