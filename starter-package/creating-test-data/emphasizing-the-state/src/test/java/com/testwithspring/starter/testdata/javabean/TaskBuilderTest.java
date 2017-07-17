package com.testwithspring.starter.testdata.javabean;

import org.junit.Test;

/**
 * This class demonstrates how we can emphasize the state of the created
 * {@code Task} objects by using a test data builder.
 *
 * <strong>Note:</strong> The test method names found from this class suck. Do not use similar names in your tests.
 *
 * @author Petri Kainulainen
 */
public class TaskBuilderTest {


    @Test
    public void test() {
        GenericBuilder.of(MeTask::new)
            .with(MeTask::setId, 3L)
            .build();
    }

}