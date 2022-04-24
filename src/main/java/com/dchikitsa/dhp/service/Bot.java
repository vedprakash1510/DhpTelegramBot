package com.dchikitsa.dhp.service;

public class Bot {

	public String process(String message) {
		if (message == null) {
			return null;
		}

		if (message.equalsIgnoreCase("/bookdoctor")) {
			return """
					 Replace this with business logic related to DHP doctor booking
					""";
		}
		if (message.equalsIgnoreCase("/booklab")) {
			return """
					Replace this with business logic related to DHP lab booking
					""";
		}
		
		if (message.equalsIgnoreCase("/location")) {
			return """
					Replace this with business logic related to DHP location sharing
					""";
		}

		if (message.equalsIgnoreCase("/confirm")) {
			return """
					Replace this with business logic related to DHP confirm
					""";
		}

		if (message.equalsIgnoreCase("/status")) {
			return """
					 Replace this with business logic related to DHP status
					""";
		}

		if (message.equalsIgnoreCase("/aboutus")) {
			return """
					We harness the best of technology to help you deliver quality care.
					""";
		}

		if (message.equalsIgnoreCase("/help")) {
			return """
					Just send us a mail and we’ll get back to you as quickly as possible.
					email: abc@xyz.abc

					 		""";
		} else {

			return "Recived Your request! " + message;

		}
	}
}