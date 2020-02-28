package br.com.mywallet.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.startup.workcontrol.model.bean.BaseEntity;

@Entity
@Table(name="client")
public class ClienteBean implements BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String celular;
	private String email;
	private String complemento;
	
	@Temporal(TemporalType.DATE)
	private String dataNascimento;
	private String sexo;
	private String filhos;
	private String obs;
	private String obsGerencial;
	private String ativo;
	
	@Temporal(TemporalType.DATE)
	private String dataCadastro;
	
	@Temporal(TemporalType.DATE)
	private String dataAlteracao;
	
	@Temporal(TemporalType.DATE)
	private String dataExclusao;
	private String motivo;
	
	@Temporal(TemporalType.DATE)
	private String dataPrimeiraCompra;
	
	@Temporal(TemporalType.DATE)
	private String dataUltimaCompra;
	
	private EstadoCivilBean estadoCivil = new EstadoCivilBean();
	private UserBean usuarioCadastro  = new UserBean();
	private UserBean usuarioAlteracao = new UserBean();
	private UserBean usuarioExclusao  = new UserBean();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFilhos() {
		return filhos;
	}
	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getObsGerencial() {
		return obsGerencial;
	}
	public void setObsGerencial(String obsGerencial) {
		this.obsGerencial = obsGerencial;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public String getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDataPrimeiraCompra() {
		return dataPrimeiraCompra;
	}
	public void setDataPrimeiraCompra(String dataPrimeiraCompra) {
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}
	public String getDataUltimaCompra() {
		return dataUltimaCompra;
	}
	public void setDataUltimaCompra(String dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}
	public EstadoCivilBean getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivilBean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public UserBean getUsuarioCadastro() {
		return usuarioCadastro;
	}
	public void setUsuarioCadastro(UserBean usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}
	public UserBean getUsuarioAlteracao() {
		return usuarioAlteracao;
	}
	public void setUsuarioAlteracao(UserBean usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}
	public UserBean getUsuarioExclusao() {
		return usuarioExclusao;
	}
	public void setUsuarioExclusao(UserBean usuarioExclusao) {
		this.usuarioExclusao = usuarioExclusao;
	}
	@Override
	public String toString() {
		return "ClienteBean [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco
				+ ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep
				+ ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + "]";
	}
	
}