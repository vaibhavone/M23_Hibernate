package com.cg.services;

import com.cg.dao.PlacementDao;
import com.cg.dao.PlacementDaoImpl;
import com.cg.entities.Placement;

public class PlacementServiceImpl implements PlacementService
{

private PlacementDao dao;
	
	public PlacementServiceImpl() {
		super();
		dao=new PlacementDaoImpl();
	} 
	
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		dao.beginTransaction();
		dao.searchPlacement(id);
		dao.commitTransaction();
		return null;
		
		
	}

	@Override
	public boolean cancelPlacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}


