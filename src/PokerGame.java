import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerGame {


    static ArrayList<String> list = new ArrayList<>();

    //下面的学名叫  “静态代码块”：随着类的加载而加载，只执行一次。
// 准备牌
// 为了避免每次创建对象都初始化一副新牌，所以写在方法外面，属于类，所有对象共用同一副poker
    static {
// 1.四种花色 2.牌的数字   数量都是有限的，所以使用数组。
        String[] colors = {"♦️", "♣️", "♠️", "♥️"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//定义一个集合ArrayList,相当于装牌的盒子。

        for (String color : colors) {
            for (String number : numbers) {
                list.add(color + number);
            }
        }
        list.add("小王");
        list.add("大王");
    }


    public PokerGame() {

        System.out.println(list);
//                洗牌(随机打乱牌的顺序)
        Collections.shuffle(list);

        System.out.println(list);

//        发牌

        ArrayList<String> DiPai = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


//                排序
    }
}
