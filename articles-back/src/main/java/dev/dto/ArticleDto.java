/**
 * 
 */
package dev.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ArticleDto {
	
	@NotNull
	@NotBlank
	private String libelle;
	
	@NotNull
	private Double prix;

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
