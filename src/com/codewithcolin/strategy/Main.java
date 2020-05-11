package com.codewithcolin.strategy;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a.jpeg", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b.png", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
