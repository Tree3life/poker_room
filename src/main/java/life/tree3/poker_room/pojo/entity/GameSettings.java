package life.tree3.poker_room.pojo.entity;

import life.tree3.poker_room.GameConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 9:00 </p>
 */
public class GameSettings {

    private static final long serialVersionUID = 1L;

    /**
     * 几副牌
     * 一盒
     * two decks of cards
     */
    private int packNumber;

    /**
     * 玩家数量,必须为偶数 4<=playerNumbers<=10
     */
    private int playerNumbers;

    /**
     * 剩余的底牌数量，最后的。剩余的
     */
    private int remainingCards = 2 * packNumber;
    private List<Poker> pokerList = new ArrayList<>(54 * packNumber);


    public GameSettings(int packNumber, int playerNumbers) {
        this.packNumber = packNumber;
        this.playerNumbers = playerNumbers;
        /**
         * 添加数字牌
         */
        for (int k = 0; k < packNumber; k++) {
            for (int i = 0; i < 4; i++) {// 4个花色
                for (int j = 0; j < GameConstant.countNumber; j++) {// 13个数字
                    pokerList.add(new Poker(GameConstant.pokerValues[j], GameConstant.suits.get(GameConstant.pokerSuits[i])));
                }
            }
        }

        /**
         * 添加王牌
         */
        for (int i = 0; i < packNumber * 2; i++) {
            // 1.i==奇数->小王
            if (i % 2 == 1) {
                pokerList.add(new Poker(PokerValue.xiaoWang, GameConstant.pokerSuits[4]));
            } else {
                // 1.i==偶数->大王
                pokerList.add(new Poker(PokerValue.daWang, GameConstant.pokerSuits[5]));
            }
        }
    }

    /**
     * 扑克牌
     *
     * @return
     */
    public List<Poker> getPokerList() {
        return pokerList;
    }

    public int getPackNumber() {
        return packNumber;
    }

    /**
     * 底牌数量
     *
     * @return
     */
    public int getRemainingCards() {
        return remainingCards;
    }
}
