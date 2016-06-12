package service;

import java.util.List;

import domain.Guitar;


public interface GuitarService
{
	// 添加吉他
	int addGuitar(Guitar guitar);
	
	//罗列所有吉他
	List<Guitar> getAllGuitars();
	
	//按照id删除吉他
	void deleteGuitar(int id);
	
	//搜索吉他
	List<Guitar> searchGuitar(String model);
}
