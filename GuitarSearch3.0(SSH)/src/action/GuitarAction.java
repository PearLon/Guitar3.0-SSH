package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import domain.Guitar;
import service.GuitarService;

public class GuitarAction extends ActionSupport
{
	private GuitarService guitarService;
	
	// 依赖注入GuitarService组件的setter方法。
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
	// 处理添加add()方法
	public String add()
	{
		
		System.out.print("here");
		// 调用业务逻辑组件的addGuitar()方法来处理用户请求		
		int result = guitarService.addGuitar(guitar);
		if(result > 0)
		{
			addActionMessage("恭喜您，图书添加成功！");
			return SUCCESS;
		}
		addActionError("图书添加失败，请重新输入！");
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
