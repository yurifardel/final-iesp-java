package br.com.iesp.avaliacao.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.avaliacao.api.model.AlunoFinal;
import br.com.iesp.avaliacao.api.service.FinalService;

@RequestMapping("/api")
@RestController
public class FinalResource {
    
    @Autowired
    private FinalService service;
    
    @GetMapping("/{id}")
    public void gravarFinal(@PathVariable Integer idAluno){
        service.consultar(idAluno);
    }

    @PostMapping
    public AlunoFinal salvar(@RequestBody AlunoFinal avaliacao){
        avaliacao = service.salvar(avaliacao);
        System.out.print(avaliacao);
        return avaliacao;
    }

    @PutMapping
    public void atualizar(@RequestBody AlunoFinal avaliacao){
        service.salvar(avaliacao);
    }

    @DeleteMapping("{id}")
    public void remover(int id){
        service.remover(id);
    }

    @GetMapping
    public void listar(){
        service.listar();
    }

}
