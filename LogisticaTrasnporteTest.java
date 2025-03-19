class LogisticaTransporteTeste {
 
 @Test
 Void deveAdicionarTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogistica("Transporte");
assertEquals("Transporte contratado", logica.adicionar());

@Test
 Void deveRemoverTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogistica("Transporte");
assertEquals("Transporte removido", logica.remover());

}
