package com.pb.leonov.hw8;

import java.util.regex.Pattern;

public class Auth {

    public String login;
    public String password;

    public Auth signUp(String login, String password, String confirmPassword) {

//        System.out.print(login + " " + password+ " " + confirmPassword + "   ");

        int length_login = login.length();
        int length_password = password.length();

        System.out.println(Pattern.matches("([a-z-A-Z]*[0-9]*)", login));


        if (length_login > 20 && length_login < 5) {
            System.out.println("Длина логина должна быть от 5 до 20 символов");
            return null;
        } else {
            if (Pattern.matches("([a-zA-Z]*[0-9]*)", login)) {
                this.login = login;
            } else {
                System.out.println("Допустимые символы логина - латинские [A-Z] и цифры");
                return null;
            }
        }

        if (length_password > 5 && length_password < 25) {
            if (Pattern.matches("(\\w*)", password)) {
                this.password = password;
            } else {
                System.out.println("Допустимые символы пароля - латинские [A-Z], цифры и знак подчеркивания ");
                return null;
            }
        } else {
            System.out.println("Длина пароля должна быть от 5 до 25 символов");
            return null;
        }


        if (!password.equals(confirmPassword)) {
            System.out.println("Пароль не совпадает");
        } else {
            System.out.println("Регистрация успешно пройдена. \nПройдите авторизацию: ");
        }
        return null;
    }

}

