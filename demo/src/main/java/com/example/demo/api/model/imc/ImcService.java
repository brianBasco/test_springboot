package com.example.demo.api.model.imc;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ImcService {
    
    public Map<String,String> calculate(ImcDTO data) {

        double imc = data.poids() / (data.taille() * data.taille());
        imc = Math.round(imc*100) / 100;
        String advise = this.analyse(imc);
        return Map.of("imc", String.valueOf(imc),"advise",advise);
    }

    private String analyse(double imc) {
        if(imc < 16.5) return "ELEVE";
        return "SURPOIDS";
    }
}
