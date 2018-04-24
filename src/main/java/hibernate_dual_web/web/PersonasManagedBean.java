package hibernate_dual_web.web;

import java.util.List;

import javax.annotation.*;
import javax.faces.bean.*;


import es.ProyectoHibernate.modelo.Persona;
import es.ProyectoHibernate.repositorio.RepositorioPersona;

@ManagedBean
@RequestScoped
public class PersonasManagedBean {
	
	List<Persona> personas;
	
	public PersonasManagedBean() {
		
	}
	
	@PostConstruct
	public void inicializar() {
		this.personas=RepositorioPersona.consultar("", "", "", null);
	}
	
	public void eliminar(Persona persona) {
		RepositorioPersona.eliminarPersona(persona.getIdUsuario());
	}

	public List<Persona> getPersonas() {
		return personas;
	}
}
