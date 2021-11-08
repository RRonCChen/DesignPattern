package TemplatePattern;

public class GoogldLoginHandler extends LoginHandler {
    private String username;
    private String password;

    public GoogldLoginHandler(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        return (this.username.equals("testGoogle") && password.equals("testGoogle")) ? true : false;
    }

    @Override
    public String getInfo() {
        return "login Google successful";
    }
}
