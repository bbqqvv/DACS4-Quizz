package DTO;

public class ResponseDTO {
    private int status;
    private String result;
    private String message;
	public ResponseDTO(int status, String result, String message) {
		super();
		this.status = status;
		this.result = result;
		this.message = message;
	}
	public ResponseDTO() {
		super();
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    
}
