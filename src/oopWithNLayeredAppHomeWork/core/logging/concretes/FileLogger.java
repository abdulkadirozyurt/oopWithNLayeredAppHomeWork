package oopWithNLayeredAppHomeWork.core.logging.concretes;

import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandi: " + data);

	}

}
