package gseproject.passive.pallete;

import gseproject.passive.communicator.IStationCommunicator;
import gseproject.passive.communicator.ServiceTypeResponder;
import gseproject.passive.communicator.SourcePalleteCommunicator;
import gseproject.passive.pallete.core.GoalPalette;
import gseproject.passive.pallete.core.SourcePalette;
import jade.core.Agent;
import jade.lang.acl.MessageTemplate;

public class SourcepalleteAgent extends Agent {
    private static final long serialVersionUID = -7283341637605998716L;
    private SourcePalette sourcePalette;
    private IStationCommunicator stationCommunicator;
    private MessageTemplate robotServiceRequestTemplate;

    @Override
    protected void setup() {
	this.sourcePalette = new SourcePalette(5, 5);
	this.stationCommunicator = new SourcePalleteCommunicator(this.sourcePalette);
	this.addBehaviour(new ServiceTypeResponder(this, this.robotServiceRequestTemplate, stationCommunicator));
    }

    @Override
    protected void takeDown() {

    }

}
