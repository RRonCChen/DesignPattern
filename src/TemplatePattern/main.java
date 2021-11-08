package TemplatePattern;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        login("FB", "testFB", "testFB");
        login("Google", "testFB", "testFB");
    }

    public static void login(String loginType, String username, String password) {

        Optional<LoginHandler> loginHandlerOptional = Optional.empty();
        switch (loginType) {
            case "FB":
                loginHandlerOptional = Optional.of(new FBLoginHandler(username, password));
                break;
            case "Google":
                loginHandlerOptional = Optional.of(new GoogldLoginHandler(username, password));
                break;
        }

        LoginHandler loginHandler = loginHandlerOptional.orElseThrow(() ->
                new RuntimeException("錯誤的login type : " + loginType));

        if (loginHandler.login()) {
            System.out.println(loginHandler.getInfo());
        } else {
            System.out.println("登入 " + loginType + "帳號密碼錯誤");
        }
    }
}
