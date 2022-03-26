package org.git;



public class GitNew {

	private void empId(int id) {
		// TODO Auto-generated method stub
		System.out.println("Employee id:" + id);
	}
	private void empId(String name,long phno) {
		// TODO Auto-generated method stub
        System.out.println("Employee name:" + name);
        System.out.println("Employee phoneno :" +phno);
	}
	private void empId(int pincode,String email) {
		// TODO Auto-generated method stub
		System.out.println("Employee mail:" + email);
		System.out.println("Employee pin:" + pincode);
	}
public static void main(String[] args) {
	GitNew e=new GitNew();
	e.empId(001);
	e.empId("Nirmal", 9876543210l);
	e.empId(600, "nirmal12@gmail.com");
	
}
}
