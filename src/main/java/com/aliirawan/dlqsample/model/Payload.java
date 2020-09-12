package com.aliirawan.dlqsample.model;

public class Payload {

	 private String message;

	    public Payload() {
	    	this.message = "";
	    }
	    
	    
		/**
		 * @param message
		 */
		public Payload(String message) {
			this.message = message;
		}


		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}

		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}
	    
}
