package referencetype;

public class Company {
	private String companyname;
	private String companylocation;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanylocation() {
		return companylocation;
	}
	public void setCompanylocation(String companylocation) {
		this.companylocation = companylocation;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", companylocation=" + companylocation + "]";
	}

}
