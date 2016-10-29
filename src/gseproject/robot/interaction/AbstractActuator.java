package gseproject.robot.interaction;

import gseproject.infrastructure.ICallback;
import gseproject.infrastructure.interaction.IActuator;

public abstract class AbstractActuator implements IActuator {

    @Override
    public void init() {

    }

    public abstract void someAction(Object param, ICallback callback);
}