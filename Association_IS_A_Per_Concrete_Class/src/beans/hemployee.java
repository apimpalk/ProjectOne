package beans;

public class hemployee extends employee{
	
	private int wh;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param salary
	 * @param wh
	 */
	public hemployee(int id, String name, String email, int salary, int wh) {
		super(id, name, email, salary);
		this.wh = wh;
	}

	/**
	 * @return the wh
	 */
	public int getWh() {
		return wh;
	}

	/**
	 * @param wh the wh to set
	 */
	public void setWh(int wh) {
		this.wh = wh;
	}
	

}
