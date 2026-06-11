package ar.edu.unahur.obj2.composite.filtros;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.composite.agrupable.IAgrupable;

public class FiltroCompuesto implements IAgrupable {
    private List<IAgrupable> filtros = new ArrayList<>();
    
    public FiltroCompuesto(List<IAgrupable> filtros) {
        this.filtros = filtros;
    }

    @Override
    public Boolean aplicar() {
        return filtros.stream().allMatch(filtro -> filtro.aplicar());
    }

    public void agregarFiltro(IAgrupable filtro){
        filtros.add(filtro);
    }


    

}
