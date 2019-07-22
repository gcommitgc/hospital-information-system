package data;

import java.io.Serializable;
import java.util.Date;

public class Registration implements Serializable{

	private int recordid;
	private String name;
	private String sex;
	private int age;
	private Date birthday;
	private String wayToPay;
	private int id;
	private String address;
	private Boolean level;
	private Office office;
	private Doctor doctor;
	private Boolean needRecordBook;
	private double money;
	private Boolean finishMedicine;
	private Boolean finishPay;
	private MedicineList medicines;
	private String diagnose;
	public Registration(int recordid, String name, String sex, int age, Date birthday, String wayToPay, int id,
			String address, Boolean level, Office office, Doctor doctor, Boolean needRecordBook) {
		this.recordid = recordid;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.wayToPay = wayToPay;
		this.id = id;
		this.address = address;
		this.level = level;
		this.office = office;
		this.doctor = doctor;
		this.needRecordBook = needRecordBook;
		this.finishMedicine=false;
		this.finishPay=false;
		if(needRecordBook) {
			money=1;
		}
	}
	
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getWayToPay() {
		return wayToPay;
	}
	public void setWayToPay(String wayToPay) {
		this.wayToPay = wayToPay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getLevel() {
		return level;
	}
	public void setLevel(Boolean level) {
		this.level = level;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Boolean getNeedRecordBook() {
		return needRecordBook;
	}
	public void setNeedRecordBook(Boolean needRecordBook) {
		this.needRecordBook = needRecordBook;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Boolean getFinishMedicine() {
		return finishMedicine;
	}
	public void setFinishMedicine(Boolean finishMedicine) {
		this.finishMedicine = finishMedicine;
	}
	public Boolean getFinishPay() {
		return finishPay;
	}
	public void setFinishPay(Boolean finishPay) {
		this.finishPay = finishPay;
	}

	public MedicineList getMedicines() {
		return medicines;
	}

	public void setMedicines(MedicineList medicines) {
		this.medicines = medicines;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + recordid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (recordid != other.recordid)
			return false;
		return true;
	}
	
}
