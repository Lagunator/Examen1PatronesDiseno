package Builder;

import java.util.ArrayList;
import java.util.List;

public class ContratoAMAZON extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(500);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("AWS");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Peppa Pig");
        canales.add("Doki");

        contrato.setListaDeCanales(canales);

    }
}
