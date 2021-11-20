package com.pb.leonov.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {

    public String login;
    public String password;

    public Auth () {
        Scanner in = new Scanner(System.in);

        System.out.print("Регистрация аккаунта\nПридумайте login 5-20 символов: ");
        String login = in.next();
        System.out.print("Придумайте пароль, не менее 5 символов: ");
        String password= in.next();
        System.out.print("Повторный ввод пароля: ");
        String ConfirmPassword= in.next();

        signUp(login, password, ConfirmPassword);
    }


    void signUp(String login, String password, String confirmPassword) throws WrongLoginException {

        System.out.println(Pattern.matches("([a-z-A-Z]*[0-9]*)", login));


        if (login.length() > 5 && login.length() < 20)  {
            throw new WrongLoginException("Длина логина должна быть от 5 до 20 символов");
            //System.out.println("\nДлина логина должна быть от 5 до 20 символов");
        } else {
            if (Pattern.matches("([a-zA-Z]*[0-9]*)", login)) {
                this.login = login;
            } else {
                throw new WrongLoginException("asdasd");
                //System.out.println("Допустимые символы логина - латинские [A-Z] и цифры");
            }
        }

                if (password.length() > 5 && password.length() < 25) {
            if (Pattern.matches("(\\w*)", password)) {
                this.password = password;
            } else {
                System.out.println("Допустимые символы пароля - латинские [A-Z], цифры и знак подчеркивания ");
            }
        } else {
            System.out.println("Длина пароля должна быть от 5 до 25 символов");
        }


        if (!password.equals(confirmPassword)) {
            System.out.println("Пароль не совпадает");
        } else {
            System.out.println("Регистрация успешно пройдена. \nПройдите авторизацию: ");
        }
    }  public static class WrongLoginException (String s) extends Throwable {

    }
}

