public class getFriends {


	public static void main(String[] args){
    	
   	 Hero superman = new Hero();
   	 Hero spiderman = new Hero();
    	
   	 superman.setDescription("Superman: Can fly, Lazer beams, Cape");
   	 spiderman.setDescription("Spiderman: Climb wals, Shoots webs");
   	 
   	 System.out.println(superman.getDescription());
   	 System.out.println(spiderman.getDescription());
	}

}
class Hero{
	String description;
    
	
	public void setDescription (String d){
		description = d;
	}
	
	public String getDescription (){
		//System.out.println("Superman is lame!");
		return this.description;
	}
}


