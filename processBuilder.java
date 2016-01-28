package OOP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class processBuilder {

	public static void main(String[] args) {
		try{ 
			ProcessBuilder pb = new ProcessBuilder("ls", "-lrt");
			Process p = pb.start();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			File file = new File("output.txt");
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			
			String line = br.readLine();
			while(line!=null){
				output.write(line+"\n");
				line =  null;
			}
output.close();
p.equals(null);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("File Written!");
	}

}
