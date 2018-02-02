package ankermaker;

/**
 * @author Ankermaker
 *
 * Feb 2, 2018
 */
public class Users {

	private int user_id;
	private String user_name;
	private String user_six;
	private String user_salry;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_six() {
		return user_six;
	}
	public void setUser_six(String user_six) {
		this.user_six = user_six;
	}
	public String getUser_salry() {
		return user_salry;
	}
	public void setUser_salry(String user_salry) {
		this.user_salry = user_salry;
	}
	public Users(int user_id, String user_name, String user_six,
			String user_salry) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_six = user_six;
		this.user_salry = user_salry;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_six=" + user_six + ", user_salry=" + user_salry + "]";
	}
	
	
	
	
}
