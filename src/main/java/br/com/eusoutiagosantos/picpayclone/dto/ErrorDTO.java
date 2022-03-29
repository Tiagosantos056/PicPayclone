package br.com.eusoutiagosantos.picpayclone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) //Não inclui dados nulos no JSON
public class ErrorDTO {

    private String campo;

    private String mensagem;
}
