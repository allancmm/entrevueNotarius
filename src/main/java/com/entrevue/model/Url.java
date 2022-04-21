package com.entrevue.model;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/*
 * @author Allan Martins
 */
@Document(collection = "Url")
public class Url {

	@Id
	@NotBlank(message = "Url shortened cannot be null or emtpy")
	private String urlShortened;
	
	@NotBlank(message = "Url origin cannot be null or empty")
	private String urlOriginal;
	
	public Url(String urlShortened, String urlOriginal) {
		this.urlShortened = Objects.requireNonNull(urlShortened);
		this.urlOriginal = Objects.requireNonNull(urlShortened);;
	}
	
	public Url() {}
	
	public String getUrlShortened() {
		return urlShortened;
	}

	public void setUrlShortened(String urlShortened) {
		this.urlShortened = urlShortened;
	}

	public String getUrlOriginal() {
		return urlOriginal;
	}

	public void setUrlOriginal(String urlOriginal) {
		this.urlOriginal = urlOriginal;
	}
}
