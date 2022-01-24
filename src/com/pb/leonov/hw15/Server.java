package com.pb.leonov.hw15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    static class Handler implements Runnable {
        public final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
            System.out.println("Подключен клиент, - " + socket);
        }

        @Override
        public void run() {
            try {
                // поток для чтения данных
                BufferedReader in = null;
                // поток для отправки данных
                PrintWriter out = null;

                // серверный сокет
                ServerSocket server = null;
                // сокет для обслуживания клиента
                Socket clientSocket = null;

                // создаем потоки для связи с клиентом
                assert clientSocket != null;
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                String clientMessage;

                // цикл ожидания сообщений от клиента
                System.out.println("Ожидаем сообщений");
                while ((clientMessage = in.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break;
                    }
                    String dates = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    out.println(dates + " Message: " + clientMessage);

                    //out.println("Сервер: " + clientMessage);
                    System.out.println(clientMessage);
                }

                // Закрываем все соединения
                out.close();
                in.close();
                clientSocket.close();
                server.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception ex) {
                    // ignore
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        int port = 1234;
        System.out.println("Сервер стартовал");
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(50);

        // В цикле ждем запроса клиента
        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new Handler(clientSocket));
        }
    }
}
