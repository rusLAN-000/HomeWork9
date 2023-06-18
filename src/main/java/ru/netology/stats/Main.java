package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.numberPassport = "4444 № 4444444";
        post.patronymic = "Иванович";
        post.phone = "+ 7 ( 999 ) - 999 - 99 - 99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1992;
        // заполните другие поля
    }
}