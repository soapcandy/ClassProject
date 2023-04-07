package Chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeableTest2 {

	public static void main(String[] args) {

		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
			// Person p = (Person) inputStream.readObject(); // 앞의 SerializeableTest 클래스의 outputStream.writeObject 와 순서를 맞춰야함 안맞으면 에러남
			
			p.tell();
			System.out.println(newStr);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
