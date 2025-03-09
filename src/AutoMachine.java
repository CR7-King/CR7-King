public class AutoMachine {
    /*
     * 自动贩卖机
     */
    public double balance;
    public double totalPrice;
    public int sub;
    final private String[] shop = new String[5];
    final private Double[] price = new Double[5];

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

    // 计算余额
    public double balance(double money) {
        balance = money + balance;
        if (balance != 0) {
            System.out.println("当前余额为：" + balance);
        }
        if (balance < totalPrice) {
            System.out.println("当前余额不足，请继续投币！");
        } else {
            balance = balance - totalPrice;
            System.out.println("找您" + balance + "元！");
        }
        return balance;
    }

    // 返回商品信息
    public double deposit(int choose) {
        boolean flag = false;
        for (int i = 0; i < shop.length; i++) {
            if ((choose - 1) == i) {
                System.out.println("您选择了：" + shop[i]);
                System.out.println("商品单价是：" + price[i]);
                sub = i;
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

    // 返回商品总价格
    public double priceTotal(int sum) {
        totalPrice = sum * price[sub];
        System.out.println("商品总价是：" + sum * price[sub]);
        return totalPrice;
    }
}
