package FactoryMoveis;

public class FabricaVitoriana  implements  MovelFactory {
    public Movel createMovel(String tipo) {
        switch (tipo) {
            case "Cadeira":
                return new CadeiraVitoriana();
            case "Sofa":
                return new SofaVitoriano();
            case "MesaDeCentro":
                return new MesaDeCentroVitoriana();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }
}
