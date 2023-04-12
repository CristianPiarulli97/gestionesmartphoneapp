package it.prova.gestionesmartphoneapp.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "app")
public class App {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id ; 
	
	@Column(name = "nome")
	private String nome ; 
	
	
	@Column(name = "datainstallazione")
	private LocalDateTime dataInstallazione;
	
	
	@Column(name = "dataultimoaggiornamento")
	private LocalDateTime dataUltimoAggiornamento;

	@Column(name = "versione")
	private int versione;
	
	@CreationTimestamp
	@Column(name = "createdatetime")
	private LocalDateTime createDateTime;
	@UpdateTimestamp
	@Column(name = "updatedatetime")
	private LocalDateTime updateDateTime;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "apps")
	private Set<Smartphone> smartphones = new HashSet<Smartphone>();

	
	public App(Long id, String nome, LocalDateTime dataInstallazione, LocalDateTime dataUltimoAggiornamento,
			int versione) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInstallazione = dataInstallazione;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
		this.versione = versione;
	}


	public App() {
		
	}


	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDateTime getDataInstallazione() {
		return dataInstallazione;
	}


	public void setDataInstallazione(LocalDateTime dataInstallazione) {
		this.dataInstallazione = dataInstallazione;
	}


	public LocalDateTime getDataUltimoAggiornamento() {
		return dataUltimoAggiornamento;
	}


	public void setDataUltimoAggiornamento(LocalDateTime dataUltimoAggiornamento) {
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
	}


	public int getVersione() {
		return versione;
	}


	public void setVersione(int versione) {
		this.versione = versione;
	}


	public Set<Smartphone> getSmartphones() {
		return smartphones;
	}


	public void setSmartphone(Set<Smartphone> smartphones) {
		this.smartphones = smartphones;
	}


	@Override
	public String toString() {
		return "App [id=" + id + ", nome=" + nome + ", dataInstallazione=" + dataInstallazione
				+ ", dataUltimoAggiornamento=" + dataUltimoAggiornamento + ", versione=" + versione + "]/n";
	}


	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}


	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}


	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}


	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	
	
	
	



}



