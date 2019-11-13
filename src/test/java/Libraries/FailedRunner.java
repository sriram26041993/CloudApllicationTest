package Libraries;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedRunner {

	public static void main(String[] args) {
		TestNG runner = new TestNG();

		List<String> list = new ArrayList<String>();

		list.add("C:\\Users\\syarabarla\\eclipse-workspace\\OMS\\test-output\\Default suite\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
	}

}
