package br.com.mywallet.route;

@Deprecated
public enum RouteEnum {
	LOGIN("validarLogin"), LOGOUT("logout");

	private String descricao;

	RouteEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}