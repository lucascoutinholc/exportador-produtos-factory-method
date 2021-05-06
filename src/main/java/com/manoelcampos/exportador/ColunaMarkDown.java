package com.manoelcampos.exportador;

import java.util.function.Function;

class ColunaMarkDown extends AbstractColuna{
    public ColunaMarkDown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return " | ";
    }

    @Override
    public String fechar() {
        return "";
    }
}
