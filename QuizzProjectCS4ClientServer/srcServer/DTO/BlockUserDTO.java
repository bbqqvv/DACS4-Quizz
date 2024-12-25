package DTO;



public class BlockUserDTO {
    private int UserID;
    private int Status;
	public BlockUserDTO(int userID, int status) {
		super();
		UserID = userID;
		Status = status;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
    
    
    
}
