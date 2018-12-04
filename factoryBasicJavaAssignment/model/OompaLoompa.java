package model;
public class OompaLoompa{
	private String code;
	private String name;
	private int height;
	private String favoritefood;
	public OompaLoompa(String code, String name,int height, String favoritefood ){			
			this.code=code;
			this.name=name;
			this.height=height;
			this.favoritefood=favoritefood;
	}
	public String getCode(){
		return code;
	}
	public String getName(){
		return name;
	}
	public int getHeight(){
		return height;
	}
	public String getFavoritefood(){
		return favoritefood;
	}
	@Override
	public String toString(){
		return ""+"\n Code:"+ code
		+"\n Name:"+name
		+"\n Height: "+ height
		+"\n FavorideFood: "+ favoritefood;
	}
	
}