package net.nhatien.todolist.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.slim3.tester.ControllerTestCase;

/**
 * 
 * 
 * @author shimazu
 */
public class FinishControllerTest extends ControllerTestCase {

    /**
     * @throws Exception
     */
    @SuppressWarnings("boxing")
    @Test
    public void run() throws Exception {
        tester.start("/finish");
        FinishController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
