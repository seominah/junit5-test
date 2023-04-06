package org.example.password;

public class User {
    private String passwrod;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be
        String password = passwordGenerator.generatePassword();

        /**
         * pw는 최소 8자 이상 12이하
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.passwrod = password;
        }
    }

    public String getPasswrod() {
        return passwrod;
    }
}
