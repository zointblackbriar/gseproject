package gseproject.infrastructure.serialization.robot;

import gseproject.infrastructure.contracts.RobotGoalContract;
import gseproject.infrastructure.serialization.IWriter;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Risthart on 21.11.2016.
 */
public class RobotGoalWriter implements IWriter<RobotGoalContract>{
    @Override
    public void write(RobotGoalContract object, DataOutputStream stream) throws IOException {
        stream.writeUTF(object.aid.getName());
        stream.writeInt(object.currentPosition.getX());
        stream.writeInt(object.currentPosition.getY());
        stream.writeInt(object.goal.getX());
        stream.writeInt(object.goal.getY());
    }
}
