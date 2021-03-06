package com.lts.queue;

import com.lts.core.cluster.Config;
import com.lts.core.spi.SPI;
import com.lts.core.spi.SKey;

/**
 * @author Robert HG (254963746@qq.com) on 5/28/15.
 */
@SPI(key = SKey.JOB_QUEUE, dftValue = "mysql")
public interface ExecutingJobQueueFactory {

    ExecutingJobQueue getQueue(Config config);
}