package model;

public class User {
	private String name;
	private String address;
	private String phoneNo;
	private String userId;
	private byte picture;
	private String email;
	private String username;
	private String password;
	private String nationality;
	private String homeCity;
	private int age;
	private MyDate birthday;
	private char gender;
	private Article article;
	private GuestList guestList;
	
	
	
	public User(String name, String address, String phoneNo, String userId,
			byte picture, String email, String username, String password,
			String nationality, String homeCity, int age, MyDate birthday, char gender) {
		
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.userId = userId;
		this.picture = picture;
		this.email = email;
		this.username = username;
		this.password = password;
		this.nationality = nationality;
		this.homeCity = homeCity;
		this.age = age;
		this.birthday = birthday;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public byte getPicture() {
		return picture;
	}


	public void setPicture(byte picture) {
		this.picture = picture;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getHomeCity() {
		return homeCity;
	}


	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	


	public MyDate getBirthday() {
		return birthday;
	}


	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	

	@Override
	public String toString() {
		return "User \n name: " + name + "\n Address: " + address + "\n Phone number: "
				+ phoneNo + "\n UserId: " + userId + "\n Email: " + email 
				+ "\n Username: " + username + "\n Password:"
				+ password + "\n Nationality: " + nationality + "\n Home city: "
				+ homeCity + "\n Age: " + age + "\n Gender: " + gender ;
	}
	
	
	
	
}
