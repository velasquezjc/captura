package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;;

@Entity
@Table(name = "corteServicioMedia")
public class CorteServicioMedia implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	@Column(name = "partido")
	private String partido;
	@Column(name = "localidad")
	private String localidad;
	@Column(name = "subestacion_alimentador")
	private String subestacion_alimentador;
	@Column(name = "usuarios")
	private String usuarios;
	@Column(name = "normalizacion")
	private String normalizacion;
	@Column(name = "ultimaActualizacion")
	private String ultimaActualizacion;

	protected CorteServicioMedia () {}

	
	public CorteServicioMedia(Long id, String partido, String localidad,
			String subestacion_alimentador, String usuarios,
			String normalizacion, String ultimaActualizacion) {
		super();
		this.id = id;
		this.partido = partido;
		this.localidad = localidad;
		this.subestacion_alimentador = subestacion_alimentador;
		this.usuarios = usuarios;
		this.normalizacion = normalizacion;
		this.ultimaActualizacion = ultimaActualizacion;
	}

	
}