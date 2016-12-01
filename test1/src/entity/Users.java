package entity;

public class Users {
	private int id = 0;
	private String name = null;
	private int type = 1;
	
	public Users(int id, String name, int type){
		this.id = id ;
		this.name = name;
		this.type = type;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getType(){
		return type;
	}
}
