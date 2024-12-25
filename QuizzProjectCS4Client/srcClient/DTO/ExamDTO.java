/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class ExamDTO extends Object {
    private Integer id;
    private int userID;
    private String subject;
    private String class_room;
    private Integer quantity;
    private int status;
    private Integer total_time;
	public ExamDTO(Integer id, int userID, String subject, String class_room, Integer quantity, int status,
			Integer total_time) {
		super();
		this.id = id;
		this.userID = userID;
		this.subject = subject;
		this.class_room = class_room;
		this.quantity = quantity;
		this.status = status;
		this.total_time = total_time;
	}
	public ExamDTO() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getClass_room() {
		return class_room;
	}
	public void setClass_room(String class_room) {
		this.class_room = class_room;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Integer getTotal_time() {
		return total_time;
	}
	public void setTotal_time(Integer total_time) {
		this.total_time = total_time;
	}
    
    
    
    
}
