package oopWithNLayeredAppHomeWork.core.logging.concretes;

import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gonderildi: " + data);

	}

}
