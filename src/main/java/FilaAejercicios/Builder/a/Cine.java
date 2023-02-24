package FilaAejercicios.Builder.a;

public class Cine {
    private BuilderCombo combo;

    public Combo getCombo(){
        return combo.getCombo();
    }

    public void setCombo(BuilderCombo combo){
        this.combo = combo;
    }

    public void buildCombo(){
        this.combo.prepararCombo();
        this.combo.buildPipocas();
        this.combo.buildGaseosa();
        this.combo.buildChocolates();
    }
}
