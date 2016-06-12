package service.impl;

import java.util.List;

import dao.GuitarDao;
import domain.Guitar;
import service.GuitarService;


public class GuitarServiceImpl implements GuitarService
{
	private GuitarDao guitarDao;
	
	public void setGuitarDao(GuitarDao guitarDao)
	{
		this.guitarDao = guitarDao;
	}

	@Override
	public int addGuitar(Guitar guitar)
	{
		return (Integer) guitarDao.save(guitar);
	}

	@Override
	public List<Guitar> getAllGuitars()
	{
		return guitarDao.findAll(Guitar.class);
	}

	@Override
	public void deleteGuitar(int id)
	{
		guitarDao.delete(Guitar.class, id);
	}

	@Override
	public List<Guitar> searchGuitar(String model) {
		return guitarDao.searchGuitar(model);
	}
}
