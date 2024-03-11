import java.util.*;
class Student
{
	int rollno[]=new int[10];
	String name[]=new String[10];
	String city[]=new String[10];
	int mob[]=new int[10];
	int i=0;
	Scanner sc=new Scanner(System.in);
	public void inputdata()
	{
	System.out.println("Enter roll no : ");
	rollno[i]=sc.nextInt();
	System.out.println("Enter Name : ");
	name[i]=sc.next();
	System.out.println("Enter City : ");
	city[i]=sc.next();
	System.out.println("Enter Mobile no : ");
	mob[i]=sc.nextInt();
	++i;

	}

	public void showInfo()
	{
	  System.out.println("rollno\tname\tcity\tmob");
	  System.out.println("-----------------------------------------------------------------");
	  for(int k=0;k<i;++k)
	  {
	  	System.out.println(rollno[k]+"\t"+name[k]+"\t"+city[k]+"\t"+mob[k]+"\t");
	  }
	}
	  public void updateData()
	  {
	  	System.out.println("Enter roll no: ");
	  	int rno=sc.nextInt();
	  	for(int k=0;k<i;++k)
	  	{
	  		if(rollno[k]==rno)
	  		{
  		    	System.out.println("1.Name"+name[k]+"\t 2.City"+city[k]+"\t 3. Mobile no"+mob[k]+"\t Exit");
	  			System.out.println("Enter the choice");
	  			int n1=sc.nextInt();
	  			switch(n1)
	  		{
	  		case 1:
					System.out.println("Enter new name :");
	  				String name1=sc.next();
	  				name[k]=name1;

	  				System.out.println("Record updated.........");
	  				break;
	  		case 2:
	  				System.out.println("Enter new City name :");
	  				String city1=sc.next();
	  				city[k]=city1;
	  				System.out.println("Record updated.........");
	  				break;
	  		case 3:
					System.out.println("Enter new Mobile no :");
	  				int mobno1=sc.nextInt();
	  				mob[k]=mobno1;

	  				System.out.println("Record updated.........");
	  				break;		
	  	}


	  }
	}
}
	  public void deleteData()
	  {
	  	
	  	for(int k=0;k<i;++k)
	  	{
	  		System.out.println("1.Name"+name[k]+"\t 2.City"+city[k]+"\t 3. Mobile no"+mob[k]+"\t Exit");
	  		System.out.println("Enter the choice");
	  		int cn1=sc.nextInt();
	  		for(int j=0;j<i;++j)
	  		{
	  			rollno[j]=rollno[j+1];
	  			name[j]=name[j+1];
	  			city[j]=city[j+1];
	  			mob[j]=mob[j+1];
	  			--i;
	  		}
        
	  }
	}
}



	 

	  class management1
	  {
	  	public static void main(String args[])
	  	{
	  		Student s = new Student();
            while(true)
            {
            	System.out.println("1. Input data");
            	System.out.println("2. Show info");
            	System.out.println("3. Updata data");
            	System.out.println("4. Delete data");
            	System.out.println("5. Exit");
            	int ch = new java.util.Scanner(System.in).nextInt();
            	switch(ch)
            	{
            	case 1: s.inputdata();
            	        break; 
            	case 2: s.showInfo();
                        break;
                case 3: s.updateData();
            	       break; 
            	case 4: s.deleteData();
            	       break; 
            	case 5: System.exit(0);
            	       break;                               
            	}

            }            
	  	}
	  }
	
