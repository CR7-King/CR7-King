import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.minuteToHour();
        AutoMachine autoMachine = new AutoMachine();
        while (true) {
            autoMachine.showTheList();
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            autoMachine.deposit(choose);
        }
//        if (autoMachine.deposit(choose) != 0.0) {
//            System.out.println("请输入购买数量：");
//            int sum = scanner.nextInt();
//            autoMachine.priceTotal(sum);
//            System.out.println("确认购买？ 1：确认 2：退出：");
//            int deside = scanner.nextInt();
//            if (deside == 1) {
//                System.out.println("请投币：");
//                double money = scanner.nextDouble();
//                balance = autoMachine.balance(money);
//                if (balance != 0.0) {
//                    System.out.println("是否继续购买？ 1：是 2：否");
//                    int i = scanner.nextInt();
//                    if (i == 1) {
//
//                    } else {
//                        System.out.println("系统退出！");
//                    }
//                } else {
//                    System.out.println("系统退出！");
//                }
//            } else {
//                System.out.println("系统退出！");
//            }
//        }
    }
}
