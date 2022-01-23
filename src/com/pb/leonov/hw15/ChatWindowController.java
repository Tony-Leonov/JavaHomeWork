package com.pb.leonov.hw15;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import static java.lang.System.out;

public class ChatWindowController {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    public TextField getTextField() {
        return textField;
    }

    @FXML
    void handleSubmitButtonAction() throws IOException {
       // textArea.setText(textArea.getText() + "\n" + textField.getText());
       // textField.clear();


        ////
        out.println("Клиент стартовал");
        String serverIp = "127.0.0.1";
        int serverPort = 1234;
        out.println("Соединяемся с сервером " + serverIp + ":" + serverPort);
        out.print("Соединение успешно." +
                "\nДля выхода из диалога, введите exit" +
                "\nВведите сообщение: ");

        Socket server = new Socket(serverIp, serverPort);
        BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);
        BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

       //textField.setOnAction(event -> {
            try {
                String dataFromUser, dataFromServer;
                dataFromUser = textField.getText();
                out.println(dataFromUser);


                dataFromServer = inServer.readLine();
                textArea.setText(outServer + "\n"+ textField.getText());
                //textArea.setText(textArea.getText() + "\n" + textField.getText());
                textField.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


