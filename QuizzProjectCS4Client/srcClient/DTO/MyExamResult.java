/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class MyExamResult {
    private int id;
    private int amount_correct;
    private int amount_incorrect;
    private  float time_doing;
    private float point;
    private int rank;
	public MyExamResult(int id, int amount_correct, int amount_incorrect, float time_doing, float point, int rank) {
		super();
		this.id = id;
		this.amount_correct = amount_correct;
		this.amount_incorrect = amount_incorrect;
		this.time_doing = time_doing;
		this.point = point;
		this.rank = rank;
	}
	public MyExamResult() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount_correct() {
		return amount_correct;
	}
	public void setAmount_correct(int amount_correct) {
		this.amount_correct = amount_correct;
	}
	public int getAmount_incorrect() {
		return amount_incorrect;
	}
	public void setAmount_incorrect(int amount_incorrect) {
		this.amount_incorrect = amount_incorrect;
	}
	public float getTime_doing() {
		return time_doing;
	}
	public void setTime_doing(float time_doing) {
		this.time_doing = time_doing;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
    
    
    
}
