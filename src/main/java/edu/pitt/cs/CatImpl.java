package edu.pitt.cs;
public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String catName;
	private boolean rented;
	public CatImpl(int id, String name) {
		this.id = id;
		this.catName = name;
	}

	public void rentCat() {
		this.rented = true;
	}

	public void returnCat() {
		this.rented = false;
	}

	public void renameCat(String name) {
		this.catName = name;
	}

	public String getName() {
		return this.catName;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.rented;
	}

	public String toString() {
		return "ID " + this.id + ". " + this.catName;
	}

}