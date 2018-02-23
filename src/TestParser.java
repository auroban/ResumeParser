import java.io.IOException;

import parsers.ResumeParser;

public class TestParser {

	public static void main(String[] args) {
		try {
			System.out.println(new ResumeParser().parseResumeInJSON("/home/auro/Desktop/auro.shit.pdf"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
