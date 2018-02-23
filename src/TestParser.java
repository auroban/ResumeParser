import java.io.IOException;

import parsers.ResumeParser;

public class TestParser {

	public static void main(String[] args) {
		try {
			System.out.println(new ResumeParser().parseResumeInJSON(""));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
