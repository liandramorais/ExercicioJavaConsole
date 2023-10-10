import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {

    public String cnpj;

    public String razaoSocial;

    public float CalcularImposto() {

        //rendimento abaixo de 30000 - 3%
        if (rendimento <= 3000) {
            float resultado = (rendimento / 100) * 3;
            return resultado;

            //rendimento entre 3000 à 6000 - 5%
        } else if (rendimento > 3000 && rendimento <= 6000){
            float resultado = (rendimento / 100) * 5;
            //float resultado = (rendimento * 0.5);
            return resultado;

            //rendimento entre 6000 à 10000 - 7%
        } else if (rendimento > 6000 && rendimento <= 10000){
            float resultado = (rendimento / 100) * 7;
            return resultado;

            //rendimento acima de 10000 - 9%
        }else {
            float resultado = (rendimento / 100) * 9;
            return resultado;
        }


    }



}
