package AtividadeDois;


import AtividadeUm.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {


        String jsonPessoa = "{\"nome\":\"Arthur\",\"idade\":18,\"cidade\":\"Porto Alegre\"}";
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}
