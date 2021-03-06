package net.raysforge.rest.server;

public class HttpResponse {
	
	public final boolean error;
	public final int statusCode;
	public String message;
	public byte bytes[];
	public boolean isBinary = false;
	public String contentType = "application/json";
	
	public HttpResponse(boolean error, int statusCode, String message) {
		this.error = error;
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public HttpResponse(int errorCode, String message) {
		this.error = true;
		this.statusCode = errorCode;
		this.message = message;
	}

	public HttpResponse(String message) {
		this.error = false;
		this.statusCode = 200;
		this.message = message;
	}

	public HttpResponse(byte bytes[], String contentType) {
		this.error = false;
		this.statusCode = 200;
		this.bytes = bytes;
		this.contentType = contentType;
		this.isBinary = true;
	}

	public HttpResponse(String message, String contentType) {
		this.error = false;
		this.statusCode = 200;
		this.message = message;
		this.contentType = contentType;
	}

	@Override
	public String toString() {
		return "HttpResponse [error=" + error + ", statusCode=" + statusCode + ", message=" + message + "]";
	}
	
	
}
