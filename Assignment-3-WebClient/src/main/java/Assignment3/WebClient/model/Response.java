package Assignment3.WebClient.model;

public class Response {
	private String status;
	private Data data;
	private String message;
	
	public Data getData() {
		return data; 
	} 
	public void setData(Data data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}