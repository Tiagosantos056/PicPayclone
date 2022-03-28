package br.com.eusoutiagosantos.picpayclone.model;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntidadeBase {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
