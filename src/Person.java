
public class Person {
	private String name;
	private char sex;  //�Ա�'F'��ʾŮ�ԣ�'M'��ʾ����
	public Person(String n,char s){
		name=n;
		sex=s;
	}



	public String GetName(){
		return name;
	}
	public char GetSex(){
		return sex;
	}
	public void SetSex(char s){
		sex=s;
	}
	public void SetName(String n){
		name=n;
	}
}
