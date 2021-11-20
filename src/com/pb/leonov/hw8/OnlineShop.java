package com.pb.leonov.hw8;

public abstract class OnlineShop  {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Auth user = new Auth();

        try {
            user.signUp();
            user.signIn();
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        }


    }
}
