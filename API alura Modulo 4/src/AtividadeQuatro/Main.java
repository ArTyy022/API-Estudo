package AtividadeQuatro;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {


 Veiculo veiculo = new Veiculo();
 veiculo.setNome("Lancer");
 veiculo.setModelo("Mitsubishi");
 veiculo.setAnoDeFabricacao(2012);
 veiculo.setPreco(80.000);

        Gson gson = new Gson();
        String json = gson.toJson(veiculo);

        System.out.println(json);


    }
}
