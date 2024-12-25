/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Timestamp;
import java.util.Date;

public class UserWithOtpDTO {
    private Integer id;
    private String email;
    private String password;
    private String name;
    private Integer status;
    private Boolean gender;
    private Date birthday;
    private String role;
    private String otp;
    private Timestamp otp_create_time;
    

	public UserWithOtpDTO() {
		super();
	}
	public UserWithOtpDTO(Integer id, String email, String password, String name, Integer status, Boolean gender,
			Date birthday, String role, String otp, Timestamp otp_create_time) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.status = status;
		this.gender = gender;
		this.birthday = birthday;
		this.role = role;
		this.otp = otp;
		this.otp_create_time = otp_create_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public Timestamp getOtp_create_time() {
		return otp_create_time;
	}
	public void setOtp_create_time(Timestamp otp_create_time) {
		this.otp_create_time = otp_create_time;
	}
    
    
    
    
}
