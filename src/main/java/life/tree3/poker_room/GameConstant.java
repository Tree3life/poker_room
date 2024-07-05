package life.tree3.poker_room;

import life.tree3.poker_room.pojo.entity.GameSettings;
import life.tree3.poker_room.pojo.entity.Poker;
import life.tree3.poker_room.pojo.entity.PokerValue;
import life.tree3.poker_room.pojo.entity.Rule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 游戏常量/术语
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 9:15 </p>
 */
public class GameConstant {
    public static final String GAME_NAME = "PokerRoom";
    /**
     * 最大玩家人数
     */
    public static final int MAX_PLAYER = 10;
    public static final int MIN_PLAYER = 4;
    /**
     * 一份牌的数量
     */
    public final static int pokerQuantity = 54;
    /**
     * 扑克牌共13个数字 1-13
     */
    public static final int countNumber = 13;

    /**
     * 扑克的花色
     * 红桃♥、梅花♣、黑桃♠、方片♦
     */
    public static final HashMap<String, String> suits = new HashMap<>(4);



    /**
     * 游戏规则
     */
    public static final HashMap<String, Rule> rules = new HashMap<>(4);

    public static final String[] pokerSuits = {"红桃", "黑桃", "梅花", "方片", "小王", "大王"};

    public static final PokerValue[] pokerValues = {PokerValue.one, PokerValue.two,
            PokerValue.three, PokerValue.four, PokerValue.five,
            PokerValue.six, PokerValue.seven, PokerValue.eight,
            PokerValue.nine, PokerValue.ten, PokerValue.eleven,
            PokerValue.twelve, PokerValue.thirteen};

    static {
        suits.put(pokerSuits[0], "♥");
        suits.put(pokerSuits[1], "♠");
        suits.put(pokerSuits[2], "♣");
        suits.put(pokerSuits[3], "♦");
        rules.put("打升级", new Rule() {
            @Override
            public boolean roundWinRule(Map params) {
                // todo：打升级 的 回合获胜规则(Rupert， )
                return false;
            }

            @Override
            public boolean finalWinRule(Map params) {
                // todo：打升级 每把的获胜规则(Rupert， )
                return false;
            }
        });
    }

    public static void main(String[] args) {
        GameSettings gameSettings = new GameSettings(2, 4);
        List<Poker> pokerList = gameSettings.getPokerList();
        for (int i = 0; i < pokerList. size(); i++) {
            System.out.println(pokerList.get(i).toString());
        }
        System.out.println("共："+pokerList.size()+"张牌");

    }
}
