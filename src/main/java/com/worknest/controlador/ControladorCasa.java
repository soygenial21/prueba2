/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worknest.controlador;

import com.worknest.modelo.Casa;
import com.worknest.servicio.ServicioCasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorCasa {
    
    private final ServicioCasa servicio;

	@Autowired
	public ControladorCasa(ServicioCasa servicio) {
		this.servicio = servicio;
	}
        
        @RequestMapping(value = "/probar", method = RequestMethod.GET, produces = "application/json")
	public Casa getQuestions() {

		Casa casa = new Casa();
                casa.setValorCatastral(10000);
                casa.setTipoDePredio("URBANO EDIFICADO");
                casa.setZona("TURISTICA A EDIFICADA");
                casa.calcularDescuento(0);
		servicio.getProductDiscount(casa);
                casa.calcularTotal();
                
		return casa;
	}
    
}
