package gseproject.active;

import gseproject.*;

public interface IRobotActions {
	public void move();
	public Block pick(IGridSpace position);
	public void drop(IGridSpace dropPosition);
	public void doWork(IGridSpace workPosition);
}