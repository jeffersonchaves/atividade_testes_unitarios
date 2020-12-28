package br.edu.ifpr.servicos;

import static br.edu.ifpr.utils.DataUtils.adicionarDias;

import java.util.Date;

import br.edu.ifpr.entidades.Filme;
import br.edu.ifpr.entidades.Locacao;
import br.edu.ifpr.entidades.Usuario;



public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}

	public static void main(String[] args) {
		
	}
}