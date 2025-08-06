class dummy {
    void login() {
        System.out.println("dummy login done");
    }
}

class superkey extends dummy {
    void login() {
        super.login(); // super keyword usage
        System.out.println("Login successful!");
    }
}

public class superkeydemo {
    public static void main(String args[]) {
        Scanner sc = new java.util.Scanner(System.in);
        superkey obj = new superkey();
        obj.login();
    }
}