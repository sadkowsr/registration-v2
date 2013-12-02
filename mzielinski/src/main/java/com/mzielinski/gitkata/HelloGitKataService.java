package com.mzielinski.gitkata;

import org.springframework.stereotype.Component;

@Component
public class HelloGitKataService {

    private static final byte[] ENCRYPT_MESSAGE = {80, 108, 101, 97, 115, 101, 44, 32, 108, 101, 116, 32, 109, 101, 32, 105, 110, 46, 46, 46};

    public String decryptMessage() {
        return new String(ENCRYPT_MESSAGE);
    }

}
