
public class iRock {
public static void main(String[] args) {	
	iRock rock = new iRock();
	rock.Truth("Lucas");
	rock.Echo("Hello");
	String daBest = rock.getTheBest();
	System.out.println(daBest);
	int sum = rock.sum(1, 2);
	System.out.println(sum);
	rock.even(1);
}
void iRock(String name){
	System.out.println(name+" rocks!");
}
void Truth(String name){
	if(name.equals("Lucas")){
	System.out.println(name+" is awesome!");
}
	else{
		System.out.println(name+" is still awesome!");
	}
}
void Echo(String name){
	System.out.println(name+" "+name+" "+name+" "+name+" "+name+" ");
}
String getTheBest(){
	return "Nic";
}
int sum (int sum , int sums){
	return (sum + sums);
}
void even(int sumss){
	if(sumss%2==0){
	System.out.println("You number is even");	
	}
	else{
	System.out.println("Your number is odd");
	}
}
}