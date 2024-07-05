package life.tree3.poker_room.pojo.entity;

import life.tree3.poker_room.GameConstant;

/**
 * <p>
 *
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 9:00 </p>
 */
public class Poker {

    /**
     * 数字
     * {@link PokerValue} PokerValue.大王
     */
    private PokerValue value;

    /**
     * 花色
     * {@link GameConstant#suits} GameConstant.suits.get("红桃")
     */
    private String suits;

    public Poker(PokerValue value, String suits) {
        this.value = value;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return suits+ ":" + value.getLook();
    }
}
