package com.hotelbeds.supplierintegrations.hackertest.detector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HackerDetectorImp implements HackerDetector {

	static List<Line> lines = new ArrayList();
	//Stream<Line> stream = lines.stream();
	
	@Override
	public String parseLine(String line) {
		// Definición de varibles fiveMinutes y failedLine con valores constantes.
		Integer fiveMinutes = 300;
		String failedLine = "SIGNIN_FAILURE";
		
		// Inicalizar los atributos de la clase <Line> spliteando el parametro <line> de la entrada.
		String[] splitedLine = line.split(",") ;
		Line record = new Line();
		record.ip = splitedLine[0];
		record.date = splitedLine[1];
		record.action = splitedLine[2];
		record.name = splitedLine[3];
		
		// Para agilizar tiempo y ahorrar memoria se eliminan las entradas caducas, es decir con fecha anterior a los últimos cinco minutos.
		boolean swTimedOut = lines.removeIf(x -> {return (Integer.parseInt(record.date) - Integer.parseInt(x.getDate())) >= fiveMinutes;});
//		if (swTimedOut) {
//			System.out.println(">>> AVISO: Se han eliminado las entradas caducas, superiores a cinco minutos.");
//		}
//		else {
//			System.out.println(">>> AVISO: No se han encontrado entradas caducadas.");
//		}
		
		// Comprobar la validez del parámetro de la entrada.
		if (failedLine.equals(record.action.toString())) {
			// Se añade el parámetro <line> de la entrada en la lista <lines>. En lines se registran todas las entradas con la accion: "SIGNIN_FAILURE". 
			lines.add(record);

			// Filtrar por la ip de la entrada y contar las entradas en los último cinco minutos.
			Integer count = (int) lines.stream().filter(x -> (x.getIp().equals(record.ip) && Integer.parseInt(record.date) - Integer.parseInt(x.getDate()) < fiveMinutes)).count();
			if (count < 5) { 
				return null;
			}
			else {
				return line;
			}			
		}
		else return null;
	}

}
