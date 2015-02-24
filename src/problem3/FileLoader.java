package problem3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileLoader {

	private String path;
	BufferedReader br;
	
	public FileLoader(String path){
		this.path = path;
	}
	
	public Data loadFile() throws IOException{
		Data data = new Data();
		br = new BufferedReader(new FileReader(path));
		String line;
		while ((line = br.readLine()) != null) {
			data.addMember(line);
		}
		return data;
	}
}
