import java.util.Scanner;

public class AutoMachine {
    /*
     * 自动贩卖机
     */
    public double balance;
    public double totalPrice;
    public int sub;
    final private String[] shop = new String[5];
    final private Double[] price = new Double[5];
    final private Scanner scanner = new Scanner(System.in);

    //构造函数初始化
    AutoMachine() {
        shop[0] = "美年达";
        shop[1] = "可口可乐";
        shop[2] = "旺仔牛奶";
        shop[3] = "百事可乐";
        shop[4] = "雪碧";
        price[0] = 3.0;
        price[1] = 2.0;
        price[2] = 5.0;
        price[3] = 2.5;
        price[4] = 1.5;
    }

    // 售货机计算余额
    public double balance(double money) {
        balance = money + balance;
        if (balance > 0) {
            System.out.println("当前余额为：" + (balance - totalPrice));
            System.out.println("是否继续购买？1：是 2：否");
            int x = scanner.nextInt();
            if (x == 1) {
                showTheList();
                int y = scanner.nextInt();
                deposit(y);
            } else {
                System.out.println("系统退出！欢迎下次光临！");
                System.out.println("找您" + (balance - totalPrice) + "元！");
                balance = 0;
            }
        }
        return balance;
    }

    // 售货机返回商品信息
    public double deposit(int choose) {
        boolean flag = false;
        for (int i = 0; i < shop.length; i++) {
            if ((choose - 1) == i) {
                System.out.println("您选择了：" + shop[i]);
                System.out.println("商品单价是：" + price[i]);
                sub = i;
                System.out.println("请输入购买数量：");
                totalPrice = priceTotal(scanner.nextInt());
                System.out.println("确认购买吗？1：是 2：否");
                int de = scanner.nextInt();
                isBye(de);
                return price[i];
            } else if ((choose - 1) >= shop.length) {
                System.out.println("很抱歉，没有这个商品！");
                break;
            } else if (choose <= 0) {
                System.out.println("输入错误，请重新输入！");
                break;
            } else {
                continue;
            }
        }
        return 0.0;
    }

    // 售货机返回商品总价格
    public double priceTotal(int sum) {
        totalPrice = sum * price[sub];
        System.out.println("商品总价是：" + sum * price[sub]);
        return totalPrice;
    }

    // 售货机显示当前菜单
    public void showTheList() {
        System.out.println("欢迎光临自动售货机！");
        System.out.println("请选择商品：1美年达 2可口可乐 3旺仔牛奶 4百事可乐 5雪碧");
    }

    // 售货机判定客户是否购买商品
    public void isBye(int decide) {
        if (decide == 1) {
            System.out.println(balance);
            if (balance == 0) {
                System.out.println("请投入货币：");
                balance(scanner.nextDouble());
            } else if (balance < totalPrice) {
                System.out.println("金额不足，请补充货币：");
                balance(scanner.nextDouble());
            } else {
                // balance = balance - totalPrice;
                // System.out.println(balance);
            }
        } else {
            System.out.println("交易取消！找您" + balance + "元!");
            System.out.println("欢迎下次光临！");
        }
    }
}
