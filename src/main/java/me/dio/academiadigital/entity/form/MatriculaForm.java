package me.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {

  @NotNull(message = "Campo deve ser preenchido.")
  @Positive(message = "O Id do aluno deve ser positivo!")
  private Long alunoId;

}
