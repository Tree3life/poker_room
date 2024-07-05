package life.tree3.poker_room.pojo.entity;

import java.util.Map;

/**
 * <p>
 * 表格法+策略模式 实现游戏中回合胜利及本局游戏胜利的规则。
 * </p>
 * <a>@Author: Rupert</ a>
 * <p>创建时间: 2024/7/5 10:00 </p>
 */
public interface Rule {
    /**
     * 回合胜利规则
     * fixme：考虑返回值和参数的设计
     *
     * @param params
     * @return
     */
    public boolean roundWinRule(Map params);

    /**
     * 局胜利规则
     * fixme：考虑返回值和参数的设计
     *
     * @param params
     * @return
     */
    public boolean finalWinRule(Map params);
}
