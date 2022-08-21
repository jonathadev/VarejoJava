package com.example.Varejo.modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

	/*id: UUID
	• description: string
	• value: double
	• type: char (P para Produto e S para Serviço)
	*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return id == other.id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private Double valor;
	@Column(nullable = false)
	private char tipo;
	
	
}
