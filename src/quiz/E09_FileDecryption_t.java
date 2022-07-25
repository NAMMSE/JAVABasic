package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class E09_FileDecryption_t {
	final static String ALPHABET ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] LOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	File crypto;
	int sampleLength =10;
	
	public E09_FileDecryption_t(File crypto) {
		this.crypto = crypto;
	}
	
	public E09_FileDecryption_t(File crypto, int sampleLength) {
		this.crypto = crypto;
		this.sampleLength = sampleLength;
	
	}
	
	public String decrypt(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[index - key < 0 ? 26+(index-key) : index -key]);
			}else if(Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[index - key < 0 ? 26+(index-key) : index -key]);
			}else {
				builder.append(ch);
			}
		}
		return builder.toString();
	}
	
	public void sample() {
		StringBuilder samplebuilder = new StringBuilder();
		
		// AutoClose �������̽��� ������ Ŭ�������� try()���� ����� �� �ִ�
		// try ���� ()�� ������ ��ü���� try���� �����鼭 �ڵ����� close()�� �����Ѵ�
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				) {
			for(int i=0; i<10;i++) {
				samplebuilder.append(in.readLine()+ '\n');
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	
		for(int key = 1;key<26;key++) {
			System.out.printf("[key %d]\n\n",key);
			System.out.println(decrypt(samplebuilder.toString(), key));
		}
	}
	
	public void bruteForce() {
		// 10�پ� �����ֱ�
		sample();
		
		// ��� ���� �����ϱ�(bufferedReader�� �̿��� �ַܼκ��� �Է¹ޱ�)
		// InputStreamReader : byte������ inputstream�� char������ Reader�� ������ ���ִ� Ŭ����
		try(    
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
		){
			
			while(true) {
				try {
					System.out.print("���Ͻô� key �Է�>>");
					String userInput = in.readLine();
					int key = Integer.parseInt(userInput);
					execute(key);
					
					break;
				}catch(NumberFormatException o){
					System.out.println("plz input integer number");
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void execute(int key) {
		String[] path = crypto.getPath().split("\\.");
		path[0] = path[0] + "_decrypted";
		
		File decryptFile = new File(String.join(".", path));
		
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in =new BufferedReader(fin);
				FileWriter fou = new FileWriter(decryptFile);
				BufferedWriter bout = new BufferedWriter(fou);
				PrintWriter out = new PrintWriter(bout); // ���۶����ͷ� ���� ������ ������ ����Ʈ ������ ���
				){
			String line;
			while((line = in.readLine())!=null) {
				//out.write(decrypt(line,key) + '\n');
				// ���� ����Ʈln�� �ý��ۿ����� ������ ����Ʈ ����Ʈ Ŭ������ ����ϸ� �޸𿡴ٰ� ����� �� �� �ִ�
				out.println(decrypt(line, key)); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//bruteForce(new File("files/frankenstein_encrypted.txt"));
		E09_FileDecryption_t decryption = new E09_FileDecryption_t(new File("files/frankenstein_encrypted.txt"));
		
		decryption.bruteForce();
	}
}
