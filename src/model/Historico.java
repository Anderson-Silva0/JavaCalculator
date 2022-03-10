
package model;

//Tentarei retornar os resultados que estão armazenados no banco de dados na interface gráfica da calculadora. Ainda irei tentar criar uma lógica que exiba as operações com os resultados da calculadora. 

public class Historico {
    
   int id;
    String priNum;      //Aqui tem variáveis que não estou usando, mas talvez ainda use.
    String segunNum;
    String resultado;
    String expressao;
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
