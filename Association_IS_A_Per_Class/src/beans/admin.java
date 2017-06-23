package beans;

public class admin extends employee {

	
	private String branchname;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param salary
	 * @param branchname
	 */
	public admin(int id, String name, String email, int salary, String branchname) {
		super(id, name, email, salary);
		this.branchname = branchname;
	}

	/**
	 * @return the branchname
	 */
	public String getBranchname() {
		return branchname;
	}

	/**
	 * @param branchname the branchname to set
	 */
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
}
