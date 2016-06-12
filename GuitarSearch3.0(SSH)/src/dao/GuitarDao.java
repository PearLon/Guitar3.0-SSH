package dao;

import java.util.List;

import common.dao.BaseDao;
import domain.Guitar;

//继承BasDao,从而直接获得通用的数据查询方法
public interface GuitarDao extends BaseDao<Guitar>
{
	
	//多数方法直接由BasDao继承，特殊方法自己书写。
	List<Guitar> searchGuitar(String model);
}
