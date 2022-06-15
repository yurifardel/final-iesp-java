package br.com.iesp.avaliacao.api.service;

import org.springframework.stereotype.Service;

import br.com.iesp.avaliacao.api.model.AlunoFinal;
import br.com.iesp.avaliacao.api.repository.FinalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FinalService {

    private FinalRepository repository;

    public AlunoFinal salvar(AlunoFinal avaliacaoFinal){
        return repository.save(avaliacaoFinal);
    }

    public AlunoFinal atualizar(AlunoFinal avaliacaoFinal){
        return repository.save(avaliacaoFinal);

    }

    public Optional<AlunoFinal> consultar(int id){   
        return repository.findById(id);
    }

    public void remover(int id){
        repository.deleteById(id);
    }

    public List<AlunoFinal> listar(){
        return repository.findAll();
    }

}
