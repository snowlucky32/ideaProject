public class chap3_6 {
	public static void  DancePartner(Person []dancer)
	{//数组dancer中存放跳舞的男女
	     int i,n=0;
	     Person p;
	     sequenceQueue<Person> Mdancers=new sequenceQueue<Person>();
	     sequenceQueue<Person> Fdancers=new sequenceQueue<Person>();
	     for(i=0;i<dancer.length;i++){



	     	//依次将跳舞者依其性别入队
	          p=dancer[i];       
	          if(p.GetSex()=='F')
	        	  Fdancers.EnQueue(p);//排入女队	 
	          else
	        	  Mdancers.EnQueue(p);//排入男队	       
	      }        
	     System.out.println("The dancing partners are:");
	     while(n!=Fdancers.size()&& n!=Mdancers.size()){
	    	 n++;
	    	 System.out.println("第"+n+"对舞伴:");
	    	 p=Fdancers.DeQueue();  Fdancers.EnQueue(p);
	    	 System.out.println("女士"+p.GetName());
	    	 p=Mdancers.DeQueue();  Mdancers.EnQueue(p);
	    	 System.out.println("男士"+p.GetName());	    	 
	     }
	     if(n<Fdancers.size()){
	    	 System.out.println("还有女士"+(Fdancers.size()-n)+"人等待下一轮的舞曲");
	    	 p=Fdancers.getHead();
	    	 System.out.println(p.GetName()+" 将是第一个参加下一轮舞曲的女士."); 	    	 
	     }
	     else   if(n<Mdancers.size()){
	    	 System.out.println("还有男士"+(Mdancers.size()-n)+"人等待下一轮的舞曲.");
	    	 p=Mdancers.getHead();
	    	 System.out.println(p.GetName()+" 将是第一个参加下一轮舞曲的男士."); 	    	 
	     }	
	} 
	public static void main(String[] args) {
		String[] names={"张丽","王小武","李小斌","赵薇","孙涛","贾冰"};
		char[] sexs={'F','M','M','F','M','M'};

		Person[] dancers=new Person[6];
	    for(int i=0;i<names.length;i++){
	    	dancers[i]=new Person(names[i],sexs[i]);	    	
	 //   	dancers[i].SetName(names[i]);
	 //   	dancers[i].SetSex(sexs[i]);
	    }
	    DancePartner(dancers);				
	}
}



 


