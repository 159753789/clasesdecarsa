package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 16/05/2015.
 */
public class Detalleproducto {
    private String iddetalle;
    private String idproducto;
    private String idcarateristicaportipo;
    private String valorcaracteristica;

    public String getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(String iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdcarateristicaportipo() {
        return idcarateristicaportipo;
    }

    public void setIdcarateristicaportipo(String idcarateristicaportipo) {
        this.idcarateristicaportipo = idcarateristicaportipo;
    }

    public String getValorcaracteristica() {
        return valorcaracteristica;
    }

    public void setValorcaracteristica(String valorcaracteristica) {
        this.valorcaracteristica = valorcaracteristica;
    }
}
