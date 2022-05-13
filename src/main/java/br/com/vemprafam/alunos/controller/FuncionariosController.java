package br.com.vemprafam.alunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.vemprafam.alunos.controller.dao.DaoFuncionario;
import br.com.vemprafam.alunos.pojo.Funcionario;

@Controller
public class FuncionariosController {

	@RequestMapping("/cadastro")
	public String cadastro() {
	    System.out.println("Executando a lógica com Spring MVC");
	    return "cadastro";
	}
	
	@RequestMapping("/gravar") 
	public String gravar(Funcionario funcionario) {
		DaoFuncionario dao = new DaoFuncionario();
		dao.inserirFuncionario(funcionario);
		return "funcionario-cadastrado";
	}
	
	@RequestMapping("/lista") 
	public ModelAndView lista() {
		return new ModelAndView("Funcionarios1");
	}
	
	@RequestMapping("/excluir")
	public String excluir(@RequestParam int re) {
		DaoFuncionario dao = new DaoFuncionario();
		dao.excluirFuncionario(re);
		return "Funcionarios1";
	}
	
	@RequestMapping("/alterar")
	public ModelAndView alterar(@RequestParam int re, Model model) {
		DaoFuncionario dao = new DaoFuncionario();
		Funcionario funcionario = dao.buscarPeloRe(re);
		model.addAttribute("funcionario", funcionario);
		return new ModelAndView("alteracao");
	}
	
	@RequestMapping("/update")
	public String update(Funcionario funcionario) {
		DaoFuncionario dao = new DaoFuncionario();
		System.out.println(funcionario);
		dao.alterarFuncionario(funcionario);
		return "Funcionarios1";
	}
	
}
