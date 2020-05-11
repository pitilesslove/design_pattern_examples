package com.codewithcolin.strategy.practice;

public class AesEncryptionModule implements EncryptionModule {
    @Override
    public void applyEncryption(String msg) {
        System.out.println( msg + " Encrypting message using AES" );
    }
}
