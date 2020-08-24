package sub4;

public class Member {

	private String id;
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Member(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + "]";
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member other = (Member)obj;
			if(this.id.equals(other.getId())){
				return true;
			}
		}
		return false;//조상이 하던데로 하겠다는 얘기
	}
	

	
}
