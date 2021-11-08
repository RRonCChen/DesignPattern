package TemplatePattern;

public class FBLoginHandler extends LoginHandler {

    private String username;
    private String password;

    public FBLoginHandler(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        return (this.username.equals("testFB") && password.equals("testFB")) ? true : false;
    }

    @Override
    public String getInfo() {
        return "login FB successful";
    }
}
