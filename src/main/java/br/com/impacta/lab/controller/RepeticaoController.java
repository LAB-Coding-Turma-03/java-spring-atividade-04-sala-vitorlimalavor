package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class RepeticaoController {
    @GetMapping("/repeticao")
    public ResponseEntity<String> simularValores(@RequestParam(name="numero") int numero){         
        String ret = new String();
        for (int i = 1; i <= numero; i++){
            ret = ret + i;
        }
   
       return ResponseEntity.ok(ret);
   }	
}
