package operaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

import datosClases.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Clase que contiene el metodo main de la aplicacion. Es el punto de entreada al programa.
 * @author anaco
 *
 */
public class Aplicacion {

	public static void main(String[] args) {
		
		//Creacion e instanciacion de varios profesores.
		ProfesorType prof1 = new ProfesorType();
		prof1.setCodigoprofesor(new BigInteger("101"));
		prof1.setNombreprofesor("Esteban Cortaza");
		
		ProfesorType prof2 = new ProfesorType();
		prof2.setCodigoprofesor(new BigInteger("102"));
		prof2.setNombreprofesor("Anabel Ramos");
		
		ProfesorType prof3 = new ProfesorType();
		prof3.setCodigoprofesor(new BigInteger("103"));
		prof3.setNombreprofesor("Isabel Moncada");
		
		//Agregado de los profesores al Wrapper "profesores" del XML
		ProfesoresType  profes = new ProfesoresType();
		profes.getProfesor().add(prof1);
		profes.getProfesor().add(prof2);
		profes.getProfesor().add(prof3);
		
		//Creacion e instanciacion de un objeto centro.
		CentroType centro = new CentroType();
		centro.setCodigocentro(new BigInteger("2778432"));
		centro.setNombrecentro("Escuelas del Norte");
		centro.setDireccion("C/ Girasol");
		centro.setDirector(prof2);
		
		//Objeto File que representa el XML sobre el que se volcaran los datos.
		File xmlFile;
		
		try {
			
			xmlFile = new File("micentro.xml");
			
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
			
			DatoscentroType datosCentro = new DatoscentroType();
			
			datosCentro.setCentro(centro);
			datosCentro.setProfesores(profes);
			
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.marshal(new ObjectFactory().createDatoscentro(datosCentro), xmlFile);
			
			
		} catch (JAXBException e) {

			e.printStackTrace();
		}		

	}

}
