package com.codewithcolin.strategy.practice;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new AesEncryptionModule());
        chatClient.send("msg");
    }
}
