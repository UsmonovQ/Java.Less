package last_hw;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Создайте Package (правой кнопкой мыши на папке src -> New -> Package).
//1.1 В созданном пакете создайте класс с минимум 3мя полями для одного из объектов реального мира (студент, батарейка, автомобиль…).
// Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными.
// Создайте объект этого класса в программе и попробуйте установить значения для полей.
// Какие поля возможно установить?
        Student stud = new Student();
        stud.name = "Qiyomiddin";
        stud.surname = "Usmonov";
        stud.dob = LocalDate.of(1996, 4, 15);
        stud.id = 35276834L;
        stud.cours = 3;
        stud.faculty = "Stomatology";
        stud.group = 4;
        System.out.println(stud.name);
        System.out.println(stud.surname);
        System.out.println(stud.dob);
        System.out.println(stud.group);
        System.out.println(stud.id);
        System.out.println(stud.cours);
        System.out.println(stud.faculty);

    }
}
