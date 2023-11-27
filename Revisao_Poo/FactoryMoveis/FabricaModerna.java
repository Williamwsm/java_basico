package FactoryMoveis;

public class FabricaModerna implements MovelFactory{
    public  Movel createMovel(String tipo){
        switch (tipo) {
            case "Cadeira":
                return new CadeiraModerna();
            case "Sofa":
                return new SofaModerno();
            case "MesaDeCentro":
                return new MesaDeCentroModerna();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }
}
