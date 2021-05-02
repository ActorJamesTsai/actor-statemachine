package com.avengers.actor.statemachine.engine;

import com.avengers.actor.statemachine.engine.context.SpringExecuteContext;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
/**
 * Description:
 *
 * Date: 2021/4/2
 *
 * @author JiaDu
 * @version 1.0.0
 */
@Getter
@Setter
public class BpmStateMachine {

    private String instanceId;

    private ActionLabelStateMachine masterStateMachine;

    private List<ActionLabelStateMachine> branchStateMachineList;

    public BpmStateMachine() {
    }

    public BpmStateMachine(String instanceId) {
        this.instanceId = instanceId;
    }


    public void executeAction(String actionName, SpringExecuteContext context) {
        boolean isAccept = this.masterStateMachine.canAccept(actionName);
        if (isAccept) {
            this.masterStateMachine.fire(actionName, context);
        } else {
            throw new RuntimeException("The actionName: '" + actionName + "' is unknown");
        }
    }

    public String getCurrentState() {
        return this.masterStateMachine.getCurrentState();
    }
}
