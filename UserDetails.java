import java.util.Scanner;
class User {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User: { ID : " + id + ", NAME : " + name + " }";
	}
}


public class UserDetails{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users :");
		int n=sc.nextInt();
		User[] usr = new User[n];


		for(int i=0;i<n;i++){
			System.out.println("Enter the Id :");
			int id = sc.nextInt();
			usr[i] = new User();
			usr[i].setId(id);
			System.out.println("Enter the Name :");
			String nm = sc.next();
			usr[i].setName(nm);
		}
		

		for (int i=0;i<n ;i++ ) {
			for (int j=i+1;j<n ;j++ ) {
				if((usr[i].getName()).compareTo(usr[j].getName())>0)
				{	
					User temp=new User();
					temp.setName(usr[i].getName());
					temp.setId(usr[i].getId());
					usr[i].setName(usr[j].getName());
					usr[i].setId(usr[j].getId());
					usr[j].setName(temp.getName());
					usr[j].setId(temp.getId());
				}
			}
		}

		for (int i=0;i<n ;i++ ) {
			System.out.println(usr[i].toString());
		}
		
	}
}
