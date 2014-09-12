package org.idempierelbr.cnab240febraban.model.registro.header.servico;

import org.idempierelbr.cnab240febraban.model.pojo.Controle;
import org.idempierelbr.cnab240febraban.model.pojo.Empresa;
import org.idempierelbr.cnab240febraban.model.pojo.Endereco;
import org.idempierelbr.cnab240febraban.model.pojo.Servico2;
import org.idempierelbr.cnab240febraban.model.registro.header.HeaderLote;
import org.idempierelbr.cnab240febraban.util.ArquivoUtils;


public class HeaderLotePagamentoTitulosCobranca extends HeaderLote {
	private Controle controle;
	private Servico2 servico;
	private String campoExclusivoCNAB1;
	private Empresa empresa;
	private String informacao1;
	private Endereco endereco;
	private String campoExclusivoCNAB2;
	private String codigoOcorrencias;

	public HeaderLotePagamentoTitulosCobranca() {
		setControle(new Controle());
		setServico(new Servico2());
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setEmpresa(new Empresa());
		setInformacao1(ArquivoUtils.BRANCO);
		setEndereco(new Endereco());
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
		setCodigoOcorrencias(ArquivoUtils.BRANCO);
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB1(), 1));
		sb.append(getEmpresa().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getInformacao1(), 40));
		sb.append(getEndereco().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB2(), 8));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCodigoOcorrencias(), 10));
		
		verificaTamanhoRegistro(sb);
		return sb.toString();
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico2 getServico() {
		return servico;
	}

	public void setServico(Servico2 servico) {
		this.servico = servico;
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getInformacao1() {
		return informacao1;
	}

	public void setInformacao1(String informacao1) {
		this.informacao1 = informacao1;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	public String getCodigoOcorrencias() {
		return codigoOcorrencias;
	}

	public void setCodigoOcorrencias(String codigoOcorrencias) {
		this.codigoOcorrencias = codigoOcorrencias;
	}

}
