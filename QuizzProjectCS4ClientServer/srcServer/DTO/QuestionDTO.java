/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class QuestionDTO {
    private Integer id;
    private Integer examID;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;
    
    
    
    
	public QuestionDTO() {
		super();
	}
	public QuestionDTO(Integer id, Integer examID, String question, String a, String b, String c, String d,
			String answer) {
		super();
		this.id = id;
		this.examID = examID;
		this.question = question;
		A = a;
		B = b;
		C = c;
		D = d;
		this.answer = answer;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getExamID() {
		return examID;
	}
	public void setExamID(Integer examID) {
		this.examID = examID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
    
    
}
