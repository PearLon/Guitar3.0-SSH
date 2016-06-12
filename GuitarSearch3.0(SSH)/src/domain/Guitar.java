package domain;

import javax.persistence.*;


@Entity
@Table(name="guitar_inf")
public class Guitar
{
	@Id @Column(name="guitar_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="guitar_model")
	private String model;
	@Column(name="price")
	private double price;
	@Column(name="builder")
	private String builder;
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getBuilder()
	{
		return builder;
	}
	public void setBuilder(String builder)
	{
		this.builder = builder;
	}
}
