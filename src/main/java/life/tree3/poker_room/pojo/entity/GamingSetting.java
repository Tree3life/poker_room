package life.tree3.poker_room.pojo.entity;

import java.util.ArrayList;

/**
 * <p>
 * 每局游戏的设置
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 10:13 </p>
 */
public class GamingSetting {
    private GameSettings gameSettings;
    /**
     * 用于发牌:
     * 生成 0-gameSettings.getPackNumber() * 54 个数字，去除最后面的gameSettings.getRemainingCards() 个数字；将之前的数字打乱并分为平均分为四份
     * 实现发牌
     */
    private ArrayList<Integer> pokerIndexes = new ArrayList<>(gameSettings.getPackNumber() * 54);


    /**
     * 当前回合的牌
     */
    private PokerValue currentPokers;
    /**
     * 当前进攻/升级的队伍
     */
    private Team attackTeam;

    /**
     * 当前积分队伍
     */
    private Team defendTeam;

    /**
     * 当前积分队伍的积分
     */
    private Integer score;

    /**
     * 本局获胜的队伍
     */
    private Team winnerTeam;

    /**
     * 当前级数
     */
    private PokerValue currentSteps;


    /**
     * 当前 主花色
     */
    private String mainSuits;

    /**
     * 最后一回合&该回合的获胜者
     */
    private Object lastRounds;

    public GamingSetting(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }
}
