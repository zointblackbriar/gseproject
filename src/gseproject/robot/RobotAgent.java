package gseproject.robot;

import gseproject.robot.domain.StateDto;
import gseproject.robot.interaction.AbstractActuator;
import gseproject.robot.interaction.AbstractSensor;
import jade.core.Agent;

public class RobotAgent extends Agent {

    private AbstractActuator _actuator;

    private AbstractSensor _sensor;

    public void Init()
    {

    }
}
