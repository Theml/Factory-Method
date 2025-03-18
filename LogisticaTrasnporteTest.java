class LogisticaTransporteTeste {
 
 @Test
 Void deveContratarTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogica("Transporte");
assertEquals("Transporte contratado", logica.adicionar());

@Test
 Void deveDemitirTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogica("Transporte");
assertEquals("Transporte removido", logica.remover());

}
