package com.mycompany.contabancaria;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    public void abriConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        }
    }
    public void depositar(){
        
    }
    public void sacar(){
        
    }
    public void pagarMensal(){
        
    }
    //Metodos especiais

    public ContaBanco() {
       this.saldo = 0;
       this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
}
