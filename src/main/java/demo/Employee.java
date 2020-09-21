package demo;

public class Employee {

	private Long id;
	private String name;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
