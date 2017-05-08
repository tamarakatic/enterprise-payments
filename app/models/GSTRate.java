package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class GSTRate extends Model{
	
	@Column(nullable = false)
	public Date date;
	
	@Column(nullable = false)
	public double GSTPercent;
	
	@ManyToOne
	public GSTType gsttype;

	public GSTRate(Date date, double GSTPercent, GSTType gsttype) {
		super();
		this.date = date;
		this.GSTPercent = GSTPercent;
		this.gsttype = gsttype;
	}
}
