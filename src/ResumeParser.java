import java.io.IOException;
import com.google.gson.Gson;

/**
 * @author Arijit Banerjee
 */
public class ResumeParser {
	
	public String parseResumeInJSON(String filePath) throws IOException {
		
		Gson gson = new Gson();
		return gson.toJson("Hello");
	}
	
	public String parseResumeInXML(String filePath) {
		return null;
	}

}
