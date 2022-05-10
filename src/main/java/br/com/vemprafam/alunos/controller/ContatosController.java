package br.com.vemprafam.alunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vemprafam.alunos.controller.dao.JdbcContatoDao;
import br.com.vemprafam.alunos.pojo.Contato;

@Controller
public class ContatosController {

	@RequestMapping("adicionarContato")
	public String adicionar(Contato contato) {
		JdbcContatoDao dao = new JdbcContatoDao();
		dao.adicionar(contato);
		return "contato-adicionado";
	}

	@RequestMapping("novoContato")
	public String form() {
		return "formulario";
	}
}
