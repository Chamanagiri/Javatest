package oppsconcepts;

public class Employee 

{

		//Variable declaration
		int id;
		String name;
		int salary;
		int departmentno;
		
		
		/*Employee(int empid,String empname,int empsalary,int empdno) // Constructor
		{
			id=empid;
			name= empname;
			salary=empsalary;
			departmentno=empdno;
		}*/
		
		void setdata(int empid,String empname,int empsalary,int empdno)
		{
			id=empid;
			name= empname;
			salary=empsalary;
			departmentno=empdno;
		}
		
		void display()  // display Method()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(departmentno);
		}
	
		//Main 
	public static void main(String Args[])
	{
		
		//Assigning values to variables using Normal Object - Type 1
		
	   /*Employee emp1= new Employee(); //Object creation
	   emp1.id =1000234;
	   emp1.name = "sindhu";
	   emp1.salary = 90000;
	   emp1.departmentno = 26;
	   emp1.display();   // Calling method display()*/
	   
	   //System.out.println("-----------");
	   
	   
	   /*Employee emp2=new Employee(); //Object creation 
	   emp2.id = 11836679;
	   emp2.name = "Samira";
	   emp2.salary = 59000;
	   emp2.departmentno=10;
	   emp2.display(); // Calling method display()*/
	   
		
		//Assigning values to variables using Constructor - Type 2
		
		/*Employee emp1=new Employee(101,"Vrinda",70000,20);
		emp1.display();
		
		Employee emp2=new Employee(121,"Krishna",50000,10);
		emp2.display();*/
		
		
		//Assigning values to variables using Method() - Type 3
		
		
		Employee emp1=new Employee();
		emp1.setdata(101,"Sid", 2000,13);
		emp1.display();
		
		System.out.println("-----------");
		
		Employee emp2=new Employee();
		emp2.setdata(102,"Sam", 3000,16);
		emp2.display();
		
		
		
		
		
	}	

}

	
