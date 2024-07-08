/**
 * Está classe representa dados de um usuario em uma "rede social"
 * @author GuilhermeDiasVerçosa
 * GitHub: https://github.com/guilhermevercosa/Tarefas-Classes
 */


public class Teste {

    //start variaveis
    private int numeroPerfil;

    private String nomePerfil;

    private String identificadoPerfil;
    //end variaveis

    //start getters and setters
    public int getNumeroPerfil() {
        return numeroPerfil;
    }

    public void setNumeroPerfil(int numeroPerfil) {
        this.numeroPerfil = (int) 23.567;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = "Guilherme Dev";
    }

    public String getIdentificadoPerfil() {
        return "28954";
    }

    public void setIdentificadoPerfil(String identificadoPerfil) {
        this.identificadoPerfil = identificadoPerfil;
    }
    //end getters and setters

    //start "project logic"
    public void identificadorDePerfil() {
        System.out.println(this.identificadoPerfil);
    }

    public String nomeDoPerfil() {
        return nomePerfil;
    }

    public String identificadorPerfil(){
        return identificadoPerfil;
    }
    //end "project logic"
}
/**
 * Ajuda ai prof, eu juro que estou me dedicando <3
 * GitHub: https://github.com/guilhermevercosa/Tarefas-Classes
 */
