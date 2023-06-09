package Task.Ch05.contact;

public class Contact {
	
	// 인스턴스 정의
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
//--------------------------------------------------------------------------	
	
	// 데이터 초기화 생성자 정의
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
//--------------------------------------------------------------------------
	
	// 캡슐화
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		
		
		public String getGroup() {
			return group;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		
//--------------------------------------------------------------------------	
	// 출력하는 메소드
	public void printSimpleData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
	}
	
	public void printData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("이메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("생일: " + birthday);
		System.out.println("그룹: " + group);
	}
	
//--------------------------------------------------------------------------	
	
	

}
