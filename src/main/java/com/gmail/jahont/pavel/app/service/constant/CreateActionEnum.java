package com.gmail.jahont.pavel.app.service.constant;

public enum CreateActionEnum {

    CREATE_USER_TABLE("CREATE TABLE user\n" +
            "(\n" +
            "    id            INT PRIMARY KEY AUTO_INCREMENT,\n" +
            "    username      VARCHAR(60) NOT NULL,\n" +
            "    password      VARCHAR(60) NOT NULL,\n" +
            "    age           int         NOT NULL,\n" +
            "    is_active     BOOLEAN     NOT NULL DEFAULT TRUE\n" +
            ");"),
    CREATE_USER_INFORMATION_TABLE("CREATE TABLE user_information\n" +
            "(\n" +
            "    user_id   INT PRIMARY KEY,\n" +
            "    address   VARCHAR(60) NOT NULL,\n" +
            "    telephone VARCHAR(60) NOT NULL,\n" +
            "    FOREIGN KEY (user_id) REFERENCES user (id)\n" +
            ");");

    private final String query;

    CreateActionEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
