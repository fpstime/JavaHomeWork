public class task2 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        String str = "Sum Divisible By Tree Numbers = ";

        while (num2 >= num1 && num2 % 3 != 0) {
            num2=num2 - 1;
        }
        int num3 = num2;
        while (num2 >=num1) {
            if (num2 % 3 == 0) {
                num2 = num2 - 3;
            }
            if (num2 >= num1){
            num3=num3+num2;
        }
    }

        System.out.println(str+num3);
    }
}
