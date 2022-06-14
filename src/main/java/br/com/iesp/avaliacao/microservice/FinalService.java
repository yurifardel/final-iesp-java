package br.com.iesp.avaliacao.microservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinalService {

    public AlunoFinal salvar(AlunoFinal avaliacaoFinal){
        return new AlunoFinal();
    }

    public AlunoFinal atualizar(AlunoFinal avaliacaoFinal){
        return new AlunoFinal();
    }

    public AlunoFinal consultar(int id){
        return new AlunoFinal();
    }

    public void remover(AlunoFinal avaliacaoFinal){
        // Código para remover
    }

    public List<AlunoFinal> listar(AlunoFinal avaliacaoFinal){
        return new ArrayList<>();
    }

}
