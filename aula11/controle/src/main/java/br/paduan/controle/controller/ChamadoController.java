package br.paduan.controle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.ChamadoDAO;
import br.paduan.controle.model.Chamado;

@RestController
@CrossOrigin("*")
public class ChamadoController {

    @Autowired
    private ChamadoDAO dao;

    @GetMapping("/chamado/{id}")
    public Chamado buscarUm(@PathVariable int id) {
        Chamado chamado = dao.findById(id).orElse(null);
        return chamado;
    }

    @PostMapping("/chamado/update")
    public ResponseEntity<Chamado> updateChamado(@RequestBody Chamado chamado) {
        Chamado novo = dao.save(chamado);

        return ResponseEntity.ok(novo);
    }

    /*
    No 'Postman' o chamado para esse método deve ser feito com um 'corpo' como formato JSON indicado abaixo.
    Observe que o id do usuáriod deve ser enviado conforme a estrutura do objeto da relação, e não
    pensando no campo da tabela.
    Observe também que no campo de hora o formato deve ser dois dígidos em cada HH:mm, assim como na data

        {
            "numChamado": 1,
            "descricao": "Chamado modificado",
            "dataAgendamento": "20/09/2020",
            "horasGastas": "01:30",
            "troca": 1,
            "status": 1,
            "usuario": {
                "id": 2
            },
            "atividade": {
                "id": 1
            }
        }
    */

}