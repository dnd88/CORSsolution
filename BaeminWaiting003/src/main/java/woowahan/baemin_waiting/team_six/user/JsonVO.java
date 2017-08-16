package woowahan.baemin_waiting.team_six.user;

public class JsonVO {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "JsonVO [id=" + id + ", name=" + name + "]";
	}
	
	
}
