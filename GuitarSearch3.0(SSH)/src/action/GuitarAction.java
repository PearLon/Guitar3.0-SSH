package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import domain.Guitar;
import service.GuitarService;

public class GuitarAction extends ActionSupport
{
	private GuitarService guitarService;
	
	// ����ע��GuitarService�����setter������
	public void setGuitarService(GuitarService guitarService)
	{
		this.guitarService = guitarService;
	}
	private Guitar guitar;
	private List<Guitar> guitars;
	private int id;
	public Guitar getGuitar()
	{
		return guitar;
	}
	public void setGuitar(Guitar guitar)
	{
		this.guitar = guitar;
	}
	
	public List<Guitar> getGuitars()
	{
		return guitars;
	}
	public void setGuitars(List<Guitar> guitars)
	{
		this.guitars = guitars;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	// �������add()����
	public String add()
	{
		
		System.out.print("here");
		// ����ҵ���߼������addGuitar()�����������û�����		
		int result = guitarService.addGuitar(guitar);
		if(result > 0)
		{
			addActionMessage("��ϲ����ͼ����ӳɹ���");
			return SUCCESS;
		}
		addActionError("ͼ�����ʧ�ܣ����������룡");
		return ERROR;
	}
	public String list()
	{
		setGuitars(guitarService.getAllGuitars());
		return SUCCESS;
	}
	public String delete()
	{
		guitarService.deleteGuitar(id);
		return SUCCESS;
	}	
	
	
	public String search(){
		setGuitars(guitarService.searchGuitar(guitar.getModel()));
		return SUCCESS;
		
	}
}
