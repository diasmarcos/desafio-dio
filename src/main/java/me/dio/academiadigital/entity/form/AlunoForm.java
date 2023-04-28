package me.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Campo deve ser preenchido.")
  @Size(min=3, max = 50, message = "'${validatedValue}' precisa conter entre {min} e {max} caracteres. ")
  private String nome;

  @NotBlank(message = "Campo deve ser preenchido.")
  @CPF(message = "'${validatedValue}' é inválido.")
  private String cpf;

  @NotBlank(message = "Campo deve ser preenchido.")
  @Size(min=3, max=50, message = "'${validatedValue}' precisa conter entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Campo deve ser preenchido.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataNascimento;
}
