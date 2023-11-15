class Whey {
    private WheyConcentrado wheyConcentrado;
    private WheyIsolado wheyIsolado;
    private WheyHidrolisado wheyHidrolisado;

    public Whey() {
        wheyConcentrado = new WheyConcentrado();
        wheyIsolado = new WheyIsolado();
        wheyHidrolisado = new WheyHidrolisado();
    }

    public void comprarWheyConcentrado(String concentradoProd) {
        wheyConcentrado.comprarWheyConcentrado(concentradoProd);
    }

    public void comprarWheyIsolado(String isoladoProd) {
        wheyisolado.comprarWheyIsolado(isoladoProd);
    }

    public void comprarWheyHidrolisado(String hidrolisadoProd) {
        wheyHidrolisado.comprarWheyHidrolisado(hidrolisadoProd);
    }
}