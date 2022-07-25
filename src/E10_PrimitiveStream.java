import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E10_PrimitiveStream {

	/*
	  # DataOutputStream, DataInputStream
	  
	   - 기본형 타입 데이터를 손쉽게 스트림으로 전송하기 위한 클래스
	   - Java의 기본형 타입이기 때문에 Java 이외의 언어에서는 해당 데이터를 활용할 수 없다
	   - 데이터를 저장했던 순서대로 꺼낼 수 있다
	   
	 */
	
	public static void main(String[] args) {
		File dataFile = new File("files/primitive.txt");
		
		try(
				FileOutputStream fout = new FileOutputStream(dataFile);
				DataOutputStream out = new DataOutputStream(fout); 
		){
			// 이렇게 저장하면 메모장에서는 읽기 어렵게 저장되지만 기존에 했던 것 처럼 문자로 저장하는게 아니라 데이터를 바이트단위로 저장하는거라 훨씬 효율적이다
			out.writeBoolean(true);
			out.writeDouble(123.12345);
			out.writeFloat(123.1234F);
			out.writeInt(123);
			out.writeUTF("大");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
			FileInputStream fin = new FileInputStream(dataFile);
			DataInputStream in = new DataInputStream(fin);
		){
			// 반드시 썼던 순서대로 읽어야한다.
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			System.out.println(in.readFloat());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
