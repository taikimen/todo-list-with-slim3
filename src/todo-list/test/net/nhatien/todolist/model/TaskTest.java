package net.nhatien.todolist.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.slim3.tester.AppEngineTestCase;

/**
 * 
 * 
 * @author shimazu
 */
public class TaskTest extends AppEngineTestCase {

    /**  */
    private Task model = new Task();

    /**
     * @throws Exception
     */
    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
