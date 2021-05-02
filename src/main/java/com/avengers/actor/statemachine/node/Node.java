package com.avengers.actor.statemachine.node;

/**
 * Description:
 *
 * Date: 2021/3/2
 *
 * @author JiaDu
 * @version 1.0.0
 */
public interface Node {

    String getNodeCode();

    Integer getNodeType();

    String getDefinitionId();

    Integer getDefinitionVersion();
}