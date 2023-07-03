package com.techpalle.model;

import javax.persistence.*;

@Entity
@Table(name="movie")
//bean class with is representing table in hibernate1 DB
public class Actor 
{
	@Id
	private int ano;
	private String aname;
	private String film;
	
	//Constructor for above private variables
	public Actor() 
	{
		super();
	}
	   
	public Actor(int ano, String aname, String film) 
	{
		super();
		this.ano = ano;
		this.aname = aname;
		this.film = film;
	}
	
	//getter and setter for above variables
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	
}
