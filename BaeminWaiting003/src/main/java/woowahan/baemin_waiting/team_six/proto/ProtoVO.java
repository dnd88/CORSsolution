package woowahan.baemin_waiting.team_six.proto;

public class ProtoVO {

	private String testId; //test_id
	private String testName; //test_name
	
	public ProtoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProtoVO(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	
	
}
