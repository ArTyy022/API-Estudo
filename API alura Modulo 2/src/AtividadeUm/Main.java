package AtividadeUm;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {



        String jsonPessoa = "{\"nome\":\"Arthur\",\"idade\":18,\"cidade\":\"Porto Alegre\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}
