package br.com.eusoutiagosantos.picpayclone.enums;

public enum BandeiraCartao {

    VISA("Visa"), MASTERCARD("MasterCard"), ELO("Elo");

    private String descricao;

    BandeiraCartao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
