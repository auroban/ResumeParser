package parsers;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.google.gson.Gson;

/**
 * Simple class to parse resumes
 * @author Arijit Banerjee
 */
public class ResumeParser {
	
	private static final String FILETYPE_PDF = "pdf";
	private static final String FILETYPE_DOC = "doc";
	private static final String FILETYPE_DOCX = "docx";
	private static final String FILETYPE_TXT = "txt";
	
	public String parseResumeInJSON(String filePath) throws IOException {
		
		String result = determineFileTypeAndProcess(filePath);
		return result;
	}
	
	public String parseResumeInXML(String filePath) {
		String result = determineFileTypeAndProcess(filePath);
		return result;
	}
	
	private String determineFileTypeAndProcess(String filePath) {
		
		File file = new File(filePath);
		String fileName = file.getName();
		String fileExtension = null;
		if (fileName.contains(".") && fileName.lastIndexOf(".")!=0) {
			fileExtension = fileName.substring(fileName.lastIndexOf(".")+1);
			
			switch (fileExtension) {
			case FILETYPE_PDF:
				PDFParser pdfParser = new PDFParser();
				break;
			case FILETYPE_DOC:
			case FILETYPE_DOCX:
				DocParser docParser = new DocParser();
				break;
			case FILETYPE_TXT:
				TxtParser txtParser = new TxtParser();
				break;

			default:
				System.out.print("File type not supported");
				break;
			}
		}
		
		return null;
	}
	

}
