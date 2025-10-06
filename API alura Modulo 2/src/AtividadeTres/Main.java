package AtividadeTres;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Dom Casmurro!\n\",\"autor\":\"Machado de Assis\n\",\"editora\":{\"nome\":\"Livraria Garnier\",\"cidade\":\"Rio de Janeiro\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Livro: " + livro);
    }
}