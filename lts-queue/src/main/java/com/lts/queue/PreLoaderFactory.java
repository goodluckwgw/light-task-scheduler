package com.lts.queue;

import com.lts.core.Application;
import com.lts.core.spi.SPI;
import com.lts.core.spi.SKey;

/**
 * @author Robert HG (254963746@qq.com) on 8/14/15.
 */
@SPI(key = SKey.JOB_QUEUE, dftValue = "mysql")
public interface PreLoaderFactory {

    public PreLoader getPreLoader(Application application);

}
