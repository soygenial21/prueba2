
package com.worknest.modelo;


public class Casa {
    
    private String tipoDePredio;
    private String zona;
    private float valorCatastral;
    private float baseGravable;
    private float predial;
    private float descuento;
    private float proCaminos;
    private float proEducacion;
    private float proTurismo;
    private float total;
    private float dap;
    
    public void calcularDescuento(float descuento){
        
        if(descuento > 0){
            this.descuento = valorCatastral * descuento;
        }
        
        this.baseGravable = valorCatastral - descuento;
        
    } //End void
    
    public void calcularTotal(){
        this.total = predial + proCaminos + proEducacion + proTurismo;
    }
    
    
    /**
     * @return the tipoDePredio
     */
    public String getTipoDePredio() {
        return tipoDePredio;
    }

    /**
     * @param tipoDePredio the tipoDePredio to set
     */
    public void setTipoDePredio(String tipoDePredio) {
        this.tipoDePredio = tipoDePredio;
    }

    /**
     * @return the valorCatastral
     */
    public float getValorCatastral() {
        return valorCatastral;
    }

    /**
     * @param valorCatastral the valorCatastral to set
     */
    public void setValorCatastral(float valorCatastral) {
        this.valorCatastral = valorCatastral;
    }

    /**
     * @return the baseGravable
     */
    public float getBaseGravable() {
        return baseGravable;
    }

    /**
     * @param baseGravable the baseGravable to set
     */
    public void setBaseGravable(float baseGravable) {
        this.baseGravable = baseGravable;
    }

    /**
     * @return the predial
     */
    public float getPredial() {
        return predial;
    }

    /**
     * @param predial the predial to set
     */
    public void setPredial(float predial) {
        this.predial = predial;
    }

    /**
     * @return the descuento
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the proCaminos
     */
    public float getProCaminos() {
        return proCaminos;
    }

    /**
     * @param proCaminos the proCaminos to set
     */
    public void setProCaminos(float proCaminos) {
        this.proCaminos = proCaminos;
    }

    /**
     * @return the proEducacion
     */
    public float getProEducacion() {
        return proEducacion;
    }

    /**
     * @param proEducacion the proEducacion to set
     */
    public void setProEducacion(float proEducacion) {
        this.proEducacion = proEducacion;
    }

    /**
     * @return the proTurismo
     */
    public float getProTurismo() {
        return proTurismo;
    }

    /**
     * @param proTurismo the proTurismo to set
     */
    public void setProTurismo(float proTurismo) {
        this.proTurismo = proTurismo;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the dap
     */
    public float getDap() {
        return dap;
    }

    /**
     * @param dap the dap to set
     */
    public void setDap(float dap) {
        this.dap = dap;
    }
    
    

    
    
    
} //FIN DE CLASE

