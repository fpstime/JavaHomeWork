public class task3 {
    public static void main(String[] args) {

        String hello = "hello";
        int i = hello.length();
        while (i > 0) {
            i=i-1;
            System.out.print(hello.charAt(i));
        }
    }
}
