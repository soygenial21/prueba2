/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worknest.servicio;

import com.worknest.modelo.Casa;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCasa {
    
    private final KieContainer kieContainer;
    
    @Autowired
	public ServicioCasa(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
        
    public Casa getProductDiscount(Casa casa) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(casa);
		kieSession.fireAllRules();
		kieSession.dispose();
		return casa;
	}
    
}
