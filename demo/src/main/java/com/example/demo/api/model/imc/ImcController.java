package com.example.demo.api.model.imc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "imc", produces = MediaType.APPLICATION_JSON_VALUE)
public class ImcController {

    ImcService i;

    @Autowired
    public ImcController(ImcService i) {
        this.i = i;
    }
    
    @PostMapping("/hello")
    @ResponseBody
    public Map<String, String> calculate(@RequestBody ImcDTO data) {
        //System.out.println("requête passée");
        return this.i.calculate(data);
    }

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        Map<String, String> res = i.calculate(new ImcDTO(80,1.85));
        String advise = res.get("advise");
    return new ResponseEntity<>(advise, HttpStatus.OK);
}

    @GetMapping("cal")
    public String calculate(){
        return "hello world";
    }
}
