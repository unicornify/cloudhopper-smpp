package com.cloudhopper.smpp.jmx;

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

import java.util.Map;

/**
 * Defines the interface for an SmppSession managed bean.
 * 
 * @author joelauer
 */
public interface DefaultSmppSessionMXBean {

    public boolean isBinding();

    public boolean isBound();

    public boolean isClosed();

    public boolean isOpen();

    public boolean isUnbinding();
    
    public String getStateName();
    
    public String getBindTypeName();

    public String getBoundDuration();
    
    public String getInterfaceVersionName();
    
    public String getLocalTypeName();

    public String getRemoteTypeName();

    public int getNextSequenceNumber();
    
    public String getLocalAddressAndPort();
    
    public String getRemoteAddressAndPort();

    public void close();

    public void close(long timeoutInMillis);

    public void destroy();

    public void unbind(long timeoutInMillis);
    
    // most from configuration of a session
    public String getName();

    public String getPassword();

    public long getRequestExpiryTimeout();

    public String getSystemId();

    public String getSystemType();

    public boolean isWindowMonitorEnabled();
    
    public long getWindowMonitorInterval();

    public int getMaxWindowSize();

    public long getWindowWaitTimeout();
    
    // pulled from state objects and counters
    public int getWindowSize();
    
    public String[] dumpWindow();
    
    public void resetCounters();
    
    public String getRxDataSMCounter();

    public String getRxDeliverSMCounter();

    public String getRxEnquireLinkCounter();

    public String getRxSubmitSMCounter();

    public String getTxDataSMCounter();

    public String getTxDeliverSMCounter();

    public String getTxEnquireLinkCounter();

    public String getTxSubmitSMCounter();
    
    public String getRxDataSMCounterAndReset();

    public String getRxDeliverSMCounterAndReset();

    public String getRxEnquireLinkCounterAndReset();

    public String getRxSubmitSMCounterAndReset();

    public String getTxDataSMCounterAndReset();

    public String getTxDeliverSMCounterAndReset();

    public String getTxEnquireLinkCounterAndReset();

    public String getTxSubmitSMCounterAndReset();

    public int getTxDataSMCounterRequest();

    public int getTxDataSMCounterExpired();

    public int getTxDataSMCounterResponse();

    public double getTxDataSMCounterAvgWaitTime();

    public double getTxDataSMCounterAvgResponseTime();

    public double getTxDataSMCounterAvgEstimatedProcessingTime();

    public int getTxSubmitSMCounterRequest();

    public int getTxSubmitSMCounterExpired();

    public int getTxSubmitSMCounterResponse();

    public double getTxSubmitSMCounterAvgWaitTime();

    public double getTxSubmitSMCounterAvgResponseTime();

    public double getTxSubmitSMCounterAvgEstimatedProcessingTime();

    public int getTxDeliverSMCounterRequest();

    public int getTxDeliverSMCounterExpired();

    public int getTxDeliverSMCounterResponse();

    public double getTxDeliverSMCounterAvgWaitTime();

    public double getTxDeliverSMCounterAvgResponseTime();

    public double getTxDeliverSMCounterAvgEstimatedProcessingTime();

    public int getTxEnquireSMCounterRequest();

    public int getTxEnquireSMCounterExpired();

    public int getTxEnquireSMCounterResponse();

    public double getTxEnquireSMCounterAvgWaitTime();

    public double getTxEnquireSMCounterAvgResponseTime();

    public double getTxEnquireSMCounterAvgEstimatedProcessingTime();

    public int getRxDataSMCounterRequest();

    public int getRxDataSMCounterExpired();

    public int getRxDataSMCounterResponse();

    public double getRxDataSMCounterAvgWaitTime();

    public double getRxDataSMCounterAvgResponseTime();

    public double getRxDataSMCounterAvgEstimatedProcessingTime();

    public int getRxSubmitSMCounterRequest();

    public int getRxSubmitSMCounterExpired();

    public int getRxSubmitSMCounterResponse();

    public double getRxSubmitSMCounterAvgWaitTime();

    public double getRxSubmitSMCounterAvgResponseTime();

    public double getRxSubmitSMCounterAvgEstimatedProcessingTime();

    public int getRxDeliverSMCounterRequest();

    public int getRxDeliverSMCounterExpired();

    public int getRxDeliverSMCounterResponse();

    public double getRxDeliverSMCounterAvgWaitTime();

    public double getRxDeliverSMCounterAvgResponseTime();

    public double getRxDeliverSMCounterAvgEstimatedProcessingTime();

    public int getRxEnquireSMCounterRequest();

    public int getRxEnquireSMCounterExpired();

    public int getRxEnquireSMCounterResponse();

    public double getRxEnquireSMCounterAvgWaitTime();

    public double getRxEnquireSMCounterAvgResponseTime();

    public double getRxEnquireSMCounterAvgEstimatedProcessingTime();

    public long getTxDataSMRequestWaitTime();

    public long getTxDataSMRequestResponseTime();

    public long getTxDataSMRequestEstimatedProcessingTime();

    public int getTxDataSMResponseCommandStatusSuccessCounter();

    public long getRxDataSMRequestWaitTime();

    public long getRxDataSMRequestResponseTime();

    public long getRxDataSMRequestEstimatedProcessingTime();

    public int getRxDataSMResponseCommandStatusSuccessCounter();

    public long getTxSubmitSMRequestWaitTime();

    public long getTxSubmitSMRequestResponseTime();

    public long getTxSubmitSMRequestEstimatedProcessingTime();

    public int getTxSubmitSMResponseCommandStatusSuccessCounter();

    public long getRxSubmitSMRequestWaitTime();

    public long getRxSubmitSMRequestResponseTime();

    public long getRxSubmitSMRequestEstimatedProcessingTime();

    public int getRxSubmitSMResponseCommandStatusSuccessCounter();

    public long getTxDeliverSMRequestWaitTime();

    public long getTxDeliverSMRequestResponseTime();

    public long getTxDeliverSMRequestEstimatedProcessingTime();

    public int getTxDeliverSMResponseCommandStatusSuccessCounter();

    public long getRxDeliverSMRequestWaitTime();

    public long getRxDeliverSMRequestResponseTime();

    public long getRxDeliverSMRequestEstimatedProcessingTime();

    public int getRxDeliverSMResponseCommandStatusSuccessCounter();

    public long getTxEnquireSMRequestWaitTime();

    public long getTxEnquireSMRequestResponseTime();

    public long getTxEnquireSMRequestEstimatedProcessingTime();

    public int getTxEnquireSMResponseCommandStatusSuccessCounter();

    public long getRxEnquireSMRequestWaitTime();

    public long getRxEnquireSMRequestResponseTime();

    public long getRxEnquireSMRequestEstimatedProcessingTime();

    public int getRxEnquireSMResponseCommandStatusSuccessCounter();

    public void enableLogBytes();
    
    public void disableLogBytes();
    
    public void enableLogPdu();
    
    public void disableLogPdu();
}
