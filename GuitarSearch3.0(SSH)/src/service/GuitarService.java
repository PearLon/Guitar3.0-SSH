package service;

import java.util.List;

import domain.Guitar;


public interface GuitarService
{
	// ��Ӽ���
	int addGuitar(Guitar guitar);
	
	//�������м���
	List<Guitar> getAllGuitars();
	
	//����idɾ������
	void deleteGuitar(int id);
	
	//��������
	List<Guitar> searchGuitar(String model);
}
