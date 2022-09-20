package com.cg.dao;

import com.cg.entities.Placement;

public interface PlacementDao 
{
	public abstract Placement addPlacement(Placement placement) ;
	public abstract Placement updatePlacement(Placement placement) ;
	public abstract Placement searchPlacement(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
