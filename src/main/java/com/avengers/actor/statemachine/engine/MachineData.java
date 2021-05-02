package com.avengers.actor.statemachine.engine;

import com.avengers.actor.statemachine.engine.graph.AdjacencyOrientedEdge;
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
public class MachineData {

    private String startState;

    private List<String> finishState;

    private List<TransitTableItem> transitTableItemList;


    @Getter
    @Setter
    public static class TransitTableItem implements AdjacencyOrientedEdge<TransitTableItem> {

        private String fromStateKey;

        private int fromStateType;

        private String toStateKey;

        private int toStateType;

        private String actionName;


        public String getStartVertexValue() {
            return this.fromStateKey;
        }

        public String getEndVertexValue() {
            return this.toStateKey;
        }

        public TransitTableItem getData() {
            return this;
        }

        public int hashCode() {
            int result = 1;
            result = 31 * result + ((this.fromStateKey == null) ? 0 : this.fromStateKey.hashCode());
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            TransitTableItem other = (TransitTableItem) obj;
            if (this.fromStateKey == null) {
                return other.fromStateKey == null;
            } else {
                return this.fromStateKey.equals(other.fromStateKey);
            }
        }

        public String toString() {
            return "TransitTableItem [fromStateKey=" + this.fromStateKey + ", fromStateType="
                + this.fromStateType + ", toStateKey=" + this.toStateKey + ", toStateType="
                + this.toStateType + ", actionName=" + this.actionName + "]";
        }
    }
}
