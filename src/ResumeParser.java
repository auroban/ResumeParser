import java.io.File;

import com.google.gson.Gson;

/**
 * @author Arijit Banerjee
 */
public class ResumeParser {
	
	public String parseResumeInJSON(File file) {
		Gson gson = new Gson();
		return gson.toJson("Hello");
	}

}
