package com.AppRH.AppRH.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppRH.AppRH.models.Candidato;
import com.AppRH.AppRH.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, Long> {

	Iterable<Candidato> findByVaga(Vaga vaga);

	// para deletar pelo RG
	Candidato findByCpf(String cpf);

	Candidato findById(long id);
	
	Candidato findByDataNascimento(String dataNascimento);

	// Query para a busca
	@Query(value = "select u from Candidato u where u.nomeCandidato like %?1%")
	List<Candidato> findByNomesCandidatos(String nomeCandidato);

}
