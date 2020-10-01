
import java.awt.List;
import java.util.ArrayList;

public class SALARY_PRACTICE_ARRAY_LIST {

	public static void main(String[] args) {
    
		
		
		
   ArrayList<Job> employees =new ArrayList<>();
		
		Job eamy = new Job ("eamy",1500,12);
		Job uddin = new Job ("uddin",3000,13);
		Job mehjaben = new Job ("mehjaben",2500,14);
		Job nigar = new Job ("nigar",1200,15);
          employees.add(eamy);
          employees.add(mehjaben);
          employees.add(uddin);
          employees.add(nigar);
	
          for (Job employees1 :employees){
	            if(employees1.salary>=1400){
	              
	         System.out.print(  "\tname:" + employees1.name+"\tsalary:"  +   employees1.salary + "\tid :"  + employees1.id +  "\n"   );
	         
	         
	         
	            }
	        }
	}
	
	
	}
	


class Job {
    String name;
    int salary;
    int id;
     public Job(String name, int salary, int id) 
     
     {
        this.name=name;
        this.salary=salary;
        this.id=id;
     }


	

}
