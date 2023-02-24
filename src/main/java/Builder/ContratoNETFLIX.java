package Builder;

import java.util.ArrayList;
import java.util.List;

public class ContratoNETFLIX extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(200);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("netflix");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Spiderman");
        canales.add("StarWars");

        contrato.setListaDeCanales(canales);

    }

}
