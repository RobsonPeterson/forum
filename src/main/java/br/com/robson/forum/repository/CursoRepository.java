package br.com.robson.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.robson.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);
	
}
