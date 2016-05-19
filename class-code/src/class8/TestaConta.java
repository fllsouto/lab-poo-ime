package class8;

/**
 * Created by fsouto on 05/05/16.
 */

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TestaConta {

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void testaContaIntativa() {
        Conta c2 = new Conta("Fellipe", 1500.0);
        assertTrue(c2.inativaConta());
    }

    @Test
    public void testaExcecaoContaInativa() {
        Conta c2 = new Conta("Fellipe", 1500.0);
        exception.expect(ContaInativaException.class);
        exception.expectMessage("Conta inativa para realizar operações");
        assertTrue(c2.inativaConta());
        assertFalse(c2.inativaConta());
        c2.sacaDinheiro(500.0);

    }
}
