package com.pb.leonov.hw12.s01funcinterface;

public interface B {
    default int defaultMethod() {
        return 0;
    }

    default int anotherDefaultMethod() {
        return 0;
    }

    void method();
}
