package kr.happyjob.study.cmp.model;


public class OrderConfirmModel {
	private String DIR_CODE;
	private String company;
	private String JORD_AMT;
	private String JORD_DATE;
	private String PD_NAME;
	private String PD_PRICE;
	private String JORD_CODE;
	private String BORD_CODE;
	private String name;
	private String BORD_AMT;
	
	public String getBORD_AMT() {
		return BORD_AMT;
	}
	public void setBORD_AMT(String bORD_AMT) {
		BORD_AMT = bORD_AMT;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDIR_CODE() {
		return DIR_CODE;
	}
	public void setDIR_CODE(String dIR_CODE) {
		DIR_CODE = dIR_CODE;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJORD_AMT() {
		return JORD_AMT;
	}
	public void setJORD_AMT(String jORD_AMT) {
		JORD_AMT = jORD_AMT;
	}
	public String getJORD_DATE() {
		return JORD_DATE;
	}
	public void setJORD_DATE(String jORD_DATE) {
		JORD_DATE = jORD_DATE;
	}
	public String getPD_NAME() {
		return PD_NAME;
	}
	public void setPD_NAME(String pD_NAME) {
		PD_NAME = pD_NAME;
	}
	public String getPD_PRICE() {
		return PD_PRICE;
	}
	public void setPD_PRICE(String pD_PRICE) {
		PD_PRICE = pD_PRICE;
	}
	public String getJORD_CODE() {
		return JORD_CODE;
	}
	public void setJORD_CODE(String jORD_CODE) {
		JORD_CODE = jORD_CODE;
	}
	public String getBORD_CODE() {
		return BORD_CODE;
	}
	public void setBORD_CODE(String bORD_CODE) {
		BORD_CODE = bORD_CODE;
	}
	@Override
	public String toString() {
		return "OrderConfirmModel [DIR_CODE=" + DIR_CODE + ", company=" + company + ", JORD_AMT=" + JORD_AMT
				+ ", JORD_DATE=" + JORD_DATE + ", PD_NAME=" + PD_NAME + ", PD_PRICE=" + PD_PRICE + ", JORD_CODE="
				+ JORD_CODE + ", BORD_CODE=" + BORD_CODE + ", name=" + name + ", BORD_AMT=" + BORD_AMT + "]";
	}
	

}
