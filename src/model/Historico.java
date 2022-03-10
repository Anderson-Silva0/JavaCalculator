package model;

public class Historico {

    int id;
    String priNum;
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
