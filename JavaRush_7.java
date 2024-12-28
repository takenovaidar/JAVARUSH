class JavaRush_7 {
    public static void main(String[] args) {
    }

    public static void signIn(String username){
        //write your code here
        if (username == "user") {
            return;
        }
        else if(username != "user") {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }
}
