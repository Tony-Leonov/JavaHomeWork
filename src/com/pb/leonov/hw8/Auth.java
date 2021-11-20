package com.pb.leonov.hw8;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {

    public String login;
    public String password;

    public Auth () {

    }


    void signUp() throws WrongLoginException, WrongPasswordException {
        System.out.print("Регистрация аккаунта\nПридумайте login 5-20 символов: ");
        Scanner in = new Scanner(System.in);
        String login = in.next();

        System.out.println(Pattern.matches("([a-z-A-Z]*[0-9]*)", login));


        if (login.length() < 5 | login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть от 5 до 20 символов");
        } else {
            if (Pattern.matches("([a-zA-Z]*[0-9]*)", login)) {
                //this.login = login;
            } else {
                throw new WrongLoginException("Допустимые символы логина - латинские [A-Z] и цифры");
            }
        }
        System.out.print("Придумайте пароль, не менее 5 символов: ");

        String password = in.next();

                if (password.length() > 5 ) {
            if (Pattern.matches("(\\w*)", password)) {
            } else {
                throw new WrongPasswordException("Допустимые символы пароля - латинские [A-Z], цифры и знак подчеркивания ");
            }
        } else {
            throw new WrongPasswordException("Длина пароля должна быть от 5 до 25 символов");
        }

        System.out.print("Повторный ввод пароля: ");

        String confirmPassword = in.next();

        if (!password.equals(confirmPassword)) {
            System.out.println("Пароль не совпадает");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("Регистрация успешно пройдена.");
        }

    }


    void signIn() throws WrongLoginException, WrongPasswordException {
        Scanner in = new Scanner(System.in);

        System.out.print("\n\nВыполните вход\nВведите свой логин: ");
        String entry_login = in.next();


        System.out.print("\n\nВведите свой пароль: ");
        String entry_password = in.next();

        if (!Objects.equals(entry_login, login) || !Objects.equals(entry_password, password)) {
            System.out.println("Введены неверные пользовательские данные");
        } else {
            System.out.println("Успешная авторизация");
        }


    }


}

