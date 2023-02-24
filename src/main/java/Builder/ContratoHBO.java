package Builder;

import java.util.ArrayList;
import java.util.List;

public class ContratoHBO extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(150);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("HBO");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Sony 12");
        canales.add("Thor");

        contrato.setListaDeCanales(canales);

    }
}
