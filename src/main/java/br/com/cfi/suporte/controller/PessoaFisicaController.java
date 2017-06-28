package br.com.cfi.suporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cfi.suporte.model.PessoaFisica;
import br.com.cfi.suporte.repository.IPessoaFisica;

@Controller
@RequestMapping("/pessoafisica")
public class PessoaFisicaController {
	@Autowired
	private IPessoaFisica iPessoa;
	
	@RequestMapping("/novo")
	public String novo(){
		return "CadastroPessoaFisica";
	}
	
	@RequestMapping
	public String pesquisa(){
		return "PesquisaPessoaFisica";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(PessoaFisica pessoaFisica){
		//TODO: salvar no banco de dados
		iPessoa.save(pessoaFisica);
		ModelAndView mv = new ModelAndView("CadastroPessoaFisica");
		mv.addObject("mensagem", "Pessoa fisica cadastrada!");
		return mv;
	}
}
