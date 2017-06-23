package beans;

import beans.employee;

public class semployee extends employee {
	
	private String tool;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param salary
	 * @param tool
	 */
	public semployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	/**
	 * @return the tool
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * @param tool the tool to set
	 */
	public void setTool(String tool) {
		this.tool = tool;
	}

	

}
