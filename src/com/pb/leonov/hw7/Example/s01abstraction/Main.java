package com.pb.leonov.hw7.Example.s01abstraction;

import com.pb.leonov.hw7.Example.s01abstraction.notebook.Asus;
import com.pb.leonov.hw7.Example.s01abstraction.notebook.AsusModel1;
import com.pb.leonov.hw7.Example.s01abstraction.notebook.Notebook;
import com.pb.leonov.hw7.Example.s01abstraction.notebook.ToshibaModel1;

public class Main {
    public static void main(String[] args) {
        Notebook toshiba = new ToshibaModel1();
        Asus asus = new AsusModel1();

        toshiba.displayLogo();
        asus.doWork();

        asus.connectToWiFi();

        doWorkWithNotebook(asus);
        doWorkWithNotebook(toshiba);

    }

    public static void doWorkWithNotebook(Notebook notebook) {
        notebook.doWork();
    }
}
