import java.io.IOException;

public class TestParser {

	public static void main(String[] args) {
		try {
			System.out.println(new ResumeParser().parseResumeInJSON(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
