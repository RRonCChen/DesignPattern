package TemplatePattern;

public abstract class LoginHandler {
    private String username;
    private String password;

    public LoginHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean login();
    public abstract String getInfo();
}
