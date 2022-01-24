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

    public ChatWindowController() throws IOException {
    }

    public TextField getTextField() {
        return textField;
    }

   // out.println("Клиент стартовал");
    String serverIp = "127.0.0.1";
    int serverPort = 1234;
        //out.println("Соединяемся с сервером " + serverIp + ":" + serverPort);

    Socket server = new Socket(serverIp, serverPort);

    @FXML
    void handleSubmitButtonAction() throws IOException {

        //BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));

            try {
                String dataFromUser, dataFromServer;
                dataFromUser = textField.getText();
                outServer.println(dataFromUser);

                dataFromServer = in.readLine();
                System.out.println(dataFromServer);
                textArea.appendText(dataFromServer + "\n");
                textField.clear();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


