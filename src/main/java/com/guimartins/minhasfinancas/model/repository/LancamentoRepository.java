package com.guimartins.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guimartins.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
