package com.avengers.actor.statemachine.engine.context;

import com.avengers.actor.statemachine.instance.BpmInstance;
import lombok.Getter;
import lombok.Setter;

/**
 * Description:
 *
 * Date: 2021/3/3
 *
 * @author JiaDu
 * @version 1.0.0
 */
@Getter
@Setter
public class SpringExecuteContext implements ExecuteContext {

    private String instanceId;

    private BpmInstance bpmInstance;

    public SpringExecuteContext(String instanceId, BpmInstance bpmInstanceMapper) {
        this.instanceId = instanceId;
        this.bpmInstance = bpmInstanceMapper;
    }

}
