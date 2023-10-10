import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    public String cpf;
    public LocalDate dataNascimento;
    public float CalcularImposto(){

        //rendimento abaixo de 1500 zerado
        if (rendimento <= 1500) {
            return 0;

            //rendimento entre 1500 à 3500 2%
        } else if (rendimento > 1500 && rendimento <= 3500){
            float resultado = (rendimento / 100) * 2;
            //float resultado = (rendimento * 0.2);
            return resultado;

            //rendimento entre 3500 à 6000
        } else if (rendimento > 3500 && rendimento <= 6000){
            float resultado = (rendimento / 100) * 3.5f;
            return resultado;

        }else {
            float resultado = (rendimento / 100) * 5;
            return resultado;
        }
    }
}
