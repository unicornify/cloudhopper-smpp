package com.cloudhopper.smpp.util;

/*
 * #%L
 * ch-smpp
 * %%
 * Copyright (C) 2009 - 2015 Cloudhopper by Twitter
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.cloudhopper.commons.util.DecimalUtil;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author joelauer
 */
public class ConcurrentCommandCounterRequest {

    private static final String SEPARATOR = ";";
    private static final int BUFF_LENGTH = 128;

    private final AtomicInteger request;

    public ConcurrentCommandCounterRequest() {
        this.request = new AtomicInteger(0);
    }

    public ConcurrentCommandCounterRequest(int request) {
        this.request = new AtomicInteger(request);
    }

    public void reset() {
        this.request.set(0);
    }

    public ConcurrentCommandCounterRequest createSnapshot() {
        return new ConcurrentCommandCounterRequest(request.get());
    }

    public int getRequest() {
        return this.request.get();
    }

    public int incrementRequestAndGet() {
        return this.request.incrementAndGet();
    }

    /**
     * Dump and reset.
     *
     * @return the string
     */
    public String dumpAndReset() {
        final StringBuilder sb = new StringBuilder(BUFF_LENGTH);
        sb.append(request.get()).append(SEPARATOR);
        return sb.toString();
    }
}
