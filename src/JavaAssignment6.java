import java.util.Scanner;

public class JavaAssignment6 {
    public JavaAssignment6(int inputMoney ){ money = inputMoney;}

    private int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    private int money;

    void calculater(){
        for(int tempInt:unit){
            if (this.money > tempInt){
                System.out.println(tempInt + "원 짜리 : " + this.money/tempInt + "개");
                this.money %= tempInt;
            }
            else{
                System.out.println(tempInt + "원 짜리 : 0개");
            }
        }
    }

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>> ");
        int inputMoney = sc.nextInt();
        JavaAssignment6 a;
        a = new JavaAssignment6(inputMoney);
        a.calculater();
    }
}