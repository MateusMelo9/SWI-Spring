package br.com.cfi.suporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cfi.suporte.model.PessoaFisica;

public interface IPessoaFisica extends JpaRepository<PessoaFisica, Long> {
	
}
