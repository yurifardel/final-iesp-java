package br.com.iesp.avaliacao.microservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FinalResource {

    private FinalService service;

    @GetMapping("/{id}")
    public void gravarFinal(Integer idAluno){
        service.consultar(idAluno);
    }

    @PutMapping("")
    public void salvar(AlunoFinal avaliacao){
        service.salvar(avaliacao);
    }

    @GetMapping("")
    public void atualizar(AlunoFinal avaliacao){
        service.salvar(avaliacao);
    }

    @GetMapping("/listar")
    public void listar(AlunoFinal avaliacao){
        service.listar(avaliacao);
    }

}
