package oopWithNLayeredAppHomeWork.core.logging.concretes;

import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;

;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi: " + data);
		
	}

}
