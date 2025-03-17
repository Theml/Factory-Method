class LogisticaTransporteTeste {
 
 @Test
 Void deveContratarTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogica("Transporte");
assertEquals("Transporte contratado", logica.contratar());

@Test
 Void deveDemitirTransporte() {
 ILogistica logistica = LogisticaFactory.obterLogica("Transporte");
assertEquals("Transporte removido", logica.demitir());

}