import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.google.gson.Gson;

/**
 * Simple class to parse resumes
 * @author Arijit Banerjee
 */
public class ResumeParser {
	
	public String parseResumeInJSON(String filePath) throws IOException {
		
		PDDocument document = PDDocument.load(new File(filePath));
		if (!document.isEncrypted()) {
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String result = pdfTextStripper.getText(document);
			document.close();
			return result;
		}
		Gson gson = new Gson();
		return gson.toJson("Hello");
	}
	
	public String parseResumeInXML(String filePath) {
		return null;
	}

}
