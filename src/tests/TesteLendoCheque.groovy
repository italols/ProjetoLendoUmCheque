import main.LendoCheque
/**
 * Created by Italo on 13/06/2014.
 */
class TesteLendoCheque  extends GroovyTestCase{

    LendoCheque cheque = new LendoCheque()

    public void testvalorCheque(){

        assertEquals(0.50,cheque.converteValor('cinquenta centavos'))
        assertEquals(0.01,cheque.converteValor('um centavo'))
        assertEquals(0.17,cheque.converteValor('dezessete centavos'))
        assertEquals(0.45,cheque.converteValor('quarenta e cinco centavos'))

        assertEquals(1.50, cheque.converteValor('um real e cinquenta centavos') )
        assertEquals(5.00, cheque.converteValor('cinco reais') )

        assertEquals(21.50, cheque.converteValor('vinte um reais e cinquenta centavos') )
        assertEquals(83.16, cheque.converteValor('oitenta e tres reais e dezesseis centavos') )

        assertEquals(153.20, cheque.converteValor('cento e cinquenta e tres reais e vinte centavos') )
        assertEquals(567.11, cheque.converteValor('quinhentos e sessenta e sete reais e onze centavos') )

        assertEquals(1225.12, cheque.converteValor('um mil duzentos e vinte e cinco reais e doze centavos') )
        assertEquals(439321.25, cheque.converteValor('quatrocentos e trinta e nove mil trezentos e vinte e um reais e vinte e cinco centavos') )

        assertEquals(1439321.25, cheque.converteValor('um milhao quatrocentos e trinta e nove mil trezentos e vinte e um reais e vinte e cinco centavos') )
        assertEquals(812439321.25, cheque.converteValor('oitocentos e doze milhao quatrocentos e trinta e nove mil trezentos e vinte e um reais e vinte e cinco centavos') )

        assertEquals(1812439321.25, cheque.converteValor('um bilhao oitocentos e doze milhao quatrocentos e trinta e nove mil trezentos e vinte e um reais e vinte e cinco centavos') )
        assertEquals(121812439321.25, cheque.converteValor('cento e vinte e um bilhao oitocentos e doze milhao quatrocentos e trinta e nove mil trezentos e vinte e um reais e vinte e cinco centavos') )
    }

}
