package ch.sbb.mvp.blm.springbatchadmin.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is a test class to run a batch. Checks the configuration and if everything gets up and running.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestBatchConfiguration.class)
@ActiveProfiles("test")
public class BatchTest {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @Test
    public void startBatch() throws Exception {
        jobLauncher.run(job, new JobParameters());
    }
}