package com.careerinfotech.usermanagement.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_no;
	private Date date;
	private String gender;
	private String password;
	private String account_status;

	private Long country_id;
	private Long states_id;
	private Long city_id;

	private String createdBy;
	private String updatedBy;
	private LocalDateTime createOn;
	private LocalDateTime updateOn;

	public UserProfile() {
		// TODO Auto-generated constructor stub
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public Long getStates_id() {
		return states_id;
	}

	public void setStates_id(Long states_id) {
		this.states_id = states_id;
	}

	public Long getCity_id() {
		return city_id;
	}

	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCreateOn() {
		return createOn;
	}

	public void setCreateOn(LocalDateTime createOn) {
		this.createOn = createOn;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}

	public UserProfile(Long user_id, String first_name, String last_name, String email, String phone_no, Date date,
			String gender, String password, String account_status, Long country_id, Long states_id, Long city_id,
			String createdBy, String updatedBy, LocalDateTime createOn, LocalDateTime updateOn) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_no = phone_no;
		this.date = date;
		this.gender = gender;
		this.password = password;
		this.account_status = account_status;
		this.country_id = country_id;
		this.states_id = states_id;
		this.city_id = city_id;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createOn = createOn;
		this.updateOn = updateOn;
	}

	@Override
	public String toString() {
		return "UserProfile [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_no=" + phone_no + ", date=" + date + ", gender=" + gender
				+ ", password=" + password + ", account_status=" + account_status + ", country_id=" + country_id
				+ ", states_id=" + states_id + ", city_id=" + city_id + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + ", createOn=" + createOn + ", updateOn=" + updateOn + "]";
	}

}
