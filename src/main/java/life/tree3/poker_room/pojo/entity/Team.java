package life.tree3.poker_room.pojo.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 9:01 </p>
 */
public class Team {
    /**
     * 队伍标识
     */
    private String id;
    /**
     * 队伍人数
     */
    private Integer size;
    /**
     * 队伍成员
     */
    private HashMap<String, Player> members;

    /**
     * 当前 轮数
     * 级数 成功闯过13级，轮次加一，级数重置为1。
     */
    private int roundNumber;

    /**
     * 当前 级数
     */
    private int step;

    //region 队伍在当前场次的游戏信息
    /**
     * 队伍类型
     * 1：进攻队伍：目标-->获胜升级
     * -1. 防守队伍：积分-->获胜升级
     */
    private int task;


    /**
     * 队伍的当前得分
     */
    private Integer score;
    /**
     * 是否为最后一回合的赢家
     */
    private boolean lastRoundWinner;
    //endregion队伍在当前场次的游戏信息

    public Team(String id, HashMap<String, Player> members) {
        this.id = id;
        this.members = members;
    }
}
