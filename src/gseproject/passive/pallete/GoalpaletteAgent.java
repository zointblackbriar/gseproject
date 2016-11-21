package gseproject.passive.pallete;

import gseproject.passive.communicator.GoalPalleteCommunicator;
import gseproject.passive.communicator.IStationCommunicator;
import gseproject.passive.communicator.ServiceTypeResponder;
import gseproject.passive.pallete.core.GoalPalette;
import jade.core.Agent;
import jade.lang.acl.MessageTemplate;

public class GoalpaletteAgent extends Agent {
    private static final long serialVersionUID = -1104113813018831544L;
    private GoalPalette goalPalette;
    private IStationCommunicator stationCommunicator;
    private MessageTemplate robotServiceRequestTemplate;
    
    @Override
    protected void setup() {
	this.goalPalette = new GoalPalette(10);
	this.stationCommunicator = new GoalPalleteCommunicator(this.goalPalette);
	this.addBehaviour(new ServiceTypeResponder(this, this.robotServiceRequestTemplate, this.stationCommunicator));
    }

    @Override
    protected void takeDown() {

    }

}