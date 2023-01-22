package com.hotelbeds.supplierintegrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelbeds.supplierintegrations.hackertest.detector.HackerDetectorImp;


@SpringBootApplication
public class SupplierintegrationsApplication {
	
	static String[] data = {
			"801.231.91.172,133612100,SIGNIN_FAILURE,Primero.Smith",
			"802.232.92.172,133612200,SIGNIN_SUCCESS,Segundo.Martin",
			"803.233.93.172,133612300,SIGNIN_FAILURE,Tercero.Martin",
			"804.234.94.172,133612400,SIGNIN_FAILURE,Cuatro.Smith",
			"801.231.91.172,133612500,SIGNIN_FAILURE,Cinco.Smith",
			"801.231.91.172,133612600,SIGNIN_FAILURE,Sexto.Sancho",
			"801.231.91.172,133612700,SIGNIN_FAILURE,Septimo.Smith",
			"802.232.92.172,133612800,SIGNIN_FAILURE,Octavio.Martin",
			"803.233.93.172,133612900,SIGNIN_FAILURE,Nono.Martin",
			"804.234.94.172,133613000,SIGNIN_FAILURE,Decimo.Smith",
			"801.231.91.172,133613100,SIGNIN_FAILURE,Once.Smith",
			"801.231.91.172,133613200,SIGNIN_SUCCESS,Docena.Sancho",
			"801.231.91.172,133613210,SIGNIN_FAILURE,Trece.Sancho",
			"801.231.91.172,133613220,SIGNIN_FAILURE,Catorce.Sancho",
			"801.231.91.172,133613230,SIGNIN_FAILURE,Quince.Sancho",
			"801.231.91.172,133613240,SIGNIN_FAILURE,Dieciseis.Sancho",
			"801.231.91.172,133613250,SIGNIN_FAILURE,Diecisiete.Sancho",
			"801.231.91.172,133613260,SIGNIN_SUCCESS,Dieciocho.Sancho",
			"801.231.91.171,133613270,SIGNIN_FAILURE,Diecinueve.Sancho",
			"801.231.91.172,133613280,SIGNIN_FAILURE,Veinte.Sancho",
			"801.231.91.171,133613290,SIGNIN_FAILURE,Veintiuno.Sancho",
			"801.231.91.172,133613300,SIGNIN_FAILURE,Veintidos.Sancho",
			"801.231.91.171,133613310,SIGNIN_FAILURE,Veintitres.Sancho",
			"801.231.91.172,133613320,SIGNIN_FAILURE,Veinticuatro.Sancho",
			"801.231.91.171,133613330,SIGNIN_FAILURE,Veinticinco.Sancho",
			"801.231.91.172,133613340,SIGNIN_SUCCESS,Veintiseis.Sancho",
			"801.231.91.172,133613340,SIGNIN_FAILURE,Veintisiete.Sancho",
			"801.231.91.172,133613340,SIGNIN_FAILURE,Veintiocho.Sancho",
			"801.231.91.172,133613340,SIGNIN_FAILURE,Veintinueve.Sancho",
			"801.231.91.171,133613270,SIGNIN_FAILURE,Trenta.Sancho",
			"801.231.91.172,133613280,SIGNIN_FAILURE,Treintaiuno.Sancho"
	};

	public static void main(String[] args) {
		SpringApplication.run(SupplierintegrationsApplication.class, args);
		
		HackerDetectorImp hackerDetector = new HackerDetectorImp();
		
		for (String line : data) {
			System.out.println("El resultado de la ejecución fue: " + hackerDetector.parseLine(line) + "\n");
		}
				
	}

}
