package com.pb.leonov.hw8;

import java.util.Scanner;

import static com.pb.leonov.hw8.Auth.*;

public class OnlineShop {
    public static <signUp> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Регистрация аккаунта\nПридумайте login 5-20 символов: ");
        String usersLogin = in.next();
        System.out.print("Придумайте пароль, не менее 5 символов: ");
        String usersPassword= in.next();
        System.out.print("Повторный ввод пароля: ");
        String usersConfirmPassword= in.next();


        Auth a = new Auth().signUp(usersLogin, usersPassword, usersConfirmPassword);

//        signUp(usersLogin, usersPassword, usersConfirmPassword);

    }
}
