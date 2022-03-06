
package model;

//Tentarei retornar os resultados que estão armazenados no banco de dados na interface gráfica da calculadora. Ainda irei tentar criar uma lógica que exiba as operações com os resultados da calculadora. 

public class Historico {
    
    String numero;
    String priNum;      //Aqui tem variáveis que não estou usando, mas talvez ainda use.
    String segunNum;
    String resultado;
    String somaTotal;

    public String getSomaTotal() {
        return somaTotal;
    }

    public void setSomaTotal(String somaTotal) {
        this.somaTotal = somaTotal;
    }
    
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getPriNum() {
        return priNum;
    }

    public void setPriNum(String priNum) {
        this.priNum = priNum;
    }


    public String getSegunNum() {
        return segunNum;
    }

    public void setSegunNum(String segunNum) {
        this.segunNum = segunNum;
    }
}
