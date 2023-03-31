package lesson1;

public class DogTester {

    // static - поле или метод относятся к классу целиком

    public static void main(String[] args) {

        //конструктор по-умолчанию
        Dog trezor = new Dog(); //экземпляр класса

/*      trezor.age = 5;
        trezor.name = "Trezor";
        trezor.breed = "Bulldog";
        trezor.color = "White";
*/
        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");


 //       System.out.println("Trezor breed is: " + trezor.breed);

        System.out.println("Trezor breed is: " + trezor.getBreed());

//или через конструктор
        Dog eleonora = new Dog("Bolonka", "Eleonora", 3, "White");

        System.out.println("Eleonora age is: " + eleonora.getAge());

        eleonora.setAge(35);
        System.out.println("Eleonora's age is: " + eleonora.getAge());

        //сделаем, чтобы собаки погавкали
        trezor.bark();
        eleonora.bark();

        System.out.println("Number of dogs " + Dog.numberOfDogs);

        Dog.hello();
    }
}
// класс - объединение чего-либо по характерным признакам
// класс - шаблон для описания его представителей (экземпляр)
// экземпляр - конкретный представитель класса
// класс - это набор свойств и действий

//модификатры доступа
// если ничего не указыать, то доступ package private - эти поля видны только в пакете
// public - доступ к полю или методу имеют все классы отовсюду в проекте
//private - доступ имеют только методы этого класса
//protected - доступ имеют только методы класса и его наследников
class Dog {

    // конструктор - нужен, чтобы правильно инициализировать свойства экземпляра класса
//    public Dog(String dogBreed, String dogName, int dogAge, String dogColor)
//    {
//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;
//    }


    public Dog(String breed, String name, int age, String color) {
        //this - текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //напишите конструктор по-умолчанию
    public Dog()
    {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//менять возраст собаки только от 0 до 30
    public void setAge(int age) {
        if(age > 0 && age < 30) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // свойства == переменные класса ==поля класса
    private String breed;
    private String name;
    private int age;
    private String color;

    // методы ==функции == действия
    void bark()
    {
        //гавкнуть
        System.out.println(name + " bark-bark!");
    }

    public static int numberOfDogs = 2;

    // сделать статическую ф-ю hello, которая печатает

    public static void hello() {
        System.out.println("Hello");
    }

}
