package com.codewithcolin.strategy.practice;

public class DesEncryptionModule implements EncryptionModule {
    @Override
    public void applyEncryption(String msg) {
        System.out.println( msg + " Encrypting message using DES" );
    }
}
