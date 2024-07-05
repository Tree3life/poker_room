package life.tree3.poker_room.pojo.entity;

/**
 * <p>
 *
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 9:22 </p>
 */
public enum PokerValue {
    one(1, "A"),
    two(2, "2"),
    three(3, "3"),
    four(4, "4"),
    five(5, "5"),
    six(6, "6"),
    seven(7, "7"),
    eight(8, "8"),
    nine(9, "9"),
    ten(10, "10"),
    eleven(11, "J"),
    twelve(12, "Q"),
    thirteen(13, "K"),
    xiaoWang(98, "小王"),
    daWang(99, "大王");
    /**
     * 数字
     */
    private int number;
    /**
     * 呈现的数字
     */
    private String look;

    PokerValue(int number, String look) {
        this.number = number;
        this.look = look;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }
}
