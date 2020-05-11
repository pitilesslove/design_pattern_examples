package com.codewithcolin.strategy.practice;

public class ChatClient {
    private EncryptionModule encryptionAlgorithm;

    public ChatClient(EncryptionModule encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.applyEncryption(message);

        System.out.println("Sending the encrypted message...");
    }
}
