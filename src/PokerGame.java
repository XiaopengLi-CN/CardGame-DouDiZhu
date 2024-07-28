import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {


    static ArrayList<String> list = new ArrayList<>();
//以下的操作是：制作了一副扑克排，并放到了list对应的每个格子里。
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
//构造方法的方法名必须和其所在类的名字一样,并且构造方法不允许设置返回值,否则就会变成普通方法
    public PokerGame() {

//        System.out.println(list);
//                洗牌(随机打乱牌的顺序)
        Collections.shuffle(list);

//        System.out.println(list);

//        发牌

        ArrayList<String> lordDiPai = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i < 3) {
                lordDiPai.add(poker);
            } else//这个地方必须else,不然会从上而下都判断，导致底牌被重复发放
            {
                switch (i % 3) {
                    case 0:
                        player1.add(poker);
                        break;
                    case 1:
                        player2.add(poker);
                        break;
                    case 2:
                        player3.add(poker);
                        break;
                }
            }
        }

//     看牌
        lookpoker("底牌",lordDiPai);
        lookpoker("玩家1",player1);
        lookpoker("玩家2",player2);
        lookpoker("玩家3",player3);

//                排序
    }
    public void lookpoker(String name,ArrayList<String> pokers){
        System.out.print(name+":");
        for (String item:pokers){
            System.out.print(item+" ");
        }
        System.out.println();//最后换行,这之前不换行.

    }
}
