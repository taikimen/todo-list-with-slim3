package net.nhatien.todolist.service;

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
public class TaskServiceTest extends AppEngineTestCase {

    /**  */
    private TaskService service = new TaskService();

    /**
     * @throws Exception
     */
    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
