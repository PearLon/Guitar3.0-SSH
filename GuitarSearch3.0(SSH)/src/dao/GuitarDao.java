package dao;

import java.util.List;

import common.dao.BaseDao;
import domain.Guitar;

//�̳�BasDao,�Ӷ�ֱ�ӻ��ͨ�õ����ݲ�ѯ����
public interface GuitarDao extends BaseDao<Guitar>
{
	
	//��������ֱ����BasDao�̳У����ⷽ���Լ���д��
	List<Guitar> searchGuitar(String model);
}
