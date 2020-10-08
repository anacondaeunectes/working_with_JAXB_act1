package operaciones;

import java.io.File;
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
		
		//Creacion e instanciacion del director(tambien es profesor ya que hereda de este).
		DirectorType director = new DirectorType();
		director.setCodigoprofesor(new BigInteger("113"));
		director.setNombreprofesor("Isabel Moncada");
		director.setCodigo(director.getCodigoprofesor());
		
		//Agregado de los profesores(incluido el director) al Wrapper "profesores" del XML.
		ProfesoresType  profes = new ProfesoresType();
		profes.getProfesor().add(prof1);
		profes.getProfesor().add(prof2);
		profes.getProfesor().add(director);
		
		
		//Creacion e instanciacion de un objeto centro.
		CentroType centro = new CentroType();
		centro.setCodigocentro(new BigInteger("2778432"));
		centro.setNombrecentro("Escuelas del Norte");
		centro.setDireccion("C/ Girasol");
		centro.setDirector(director);
		
		//Objeto File que representa el XML sobre el que se volcaran los datos.
		File xmlFile;
		
		try {
			
			xmlFile = new File("micentro.xml");
			
			//Se crea un contexto a partir del ObjectFactory creado por el XSD "centrosprofes".
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
			
			//Se crea un elemento raiz y se le asignan todos los datos creados anteriormente.
			DatoscentroType datosCentro = new DatoscentroType();
			datosCentro.setCentro(centro);
			datosCentro.setProfesores(profes);
			
			//Creacion del marshaller encargado de convertir la estrucutra de clases y objetos en informacion XML.
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			//Se lleva a cabo la conversion a partir del elemento raiz otorgando un archivo donde volcar la informacion XML.
			marshaller.marshal(new ObjectFactory().createDatoscentro(datosCentro), xmlFile);
			
			
		} catch (JAXBException e) {

			e.printStackTrace();
		}		

	}

}
