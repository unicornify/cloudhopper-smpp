package com.cloudhopper.smpp.impl;

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

import com.cloudhopper.smpp.SmppSessionCounters;
import com.cloudhopper.smpp.SmppSessionCountersRequest;
import com.cloudhopper.smpp.util.ConcurrentCommandCounterRequest;

/**
 * Default implementation of a SmppServerCounters interface.
 * 
 * @author joelauer (twitter: @jjlauer or <a href="http://twitter.com/jjlauer" target=window>http://twitter.com/jjlauer</a>)
 */
public class DefaultSmppSessionCountersReuest implements SmppSessionCountersRequest {

    private ConcurrentCommandCounterRequest txSubmitSM;
    private ConcurrentCommandCounterRequest txDeliverSM;
    private ConcurrentCommandCounterRequest txEnquireLink;
    private ConcurrentCommandCounterRequest txDataSM;
    private ConcurrentCommandCounterRequest rxSubmitSM;
    private ConcurrentCommandCounterRequest rxDeliverSM;
    private ConcurrentCommandCounterRequest rxEnquireLink;
    private ConcurrentCommandCounterRequest rxDataSM;

    public DefaultSmppSessionCountersReuest() {
        this.txSubmitSM = new ConcurrentCommandCounterRequest();
        this.txDeliverSM = new ConcurrentCommandCounterRequest();
        this.txEnquireLink = new ConcurrentCommandCounterRequest();
        this.txDataSM = new ConcurrentCommandCounterRequest();
        this.rxSubmitSM = new ConcurrentCommandCounterRequest();
        this.rxDeliverSM = new ConcurrentCommandCounterRequest();
        this.rxEnquireLink = new ConcurrentCommandCounterRequest();
        this.rxDataSM = new ConcurrentCommandCounterRequest();
    }
    
    @Override
    public void reset() {
        this.txSubmitSM.reset();
        this.txDeliverSM.reset();
        this.txEnquireLink.reset();
        this.txDataSM.reset();
        this.rxSubmitSM.reset();
        this.rxDeliverSM.reset();
        this.rxEnquireLink.reset();
        this.rxDataSM.reset();
    }

    @Override
    public ConcurrentCommandCounterRequest getRxDataSMRequest() {
        return rxDataSM;
    }

    @Override
    public ConcurrentCommandCounterRequest getRxDeliverSMRequest() {
        return rxDeliverSM;
    }

    @Override
    public ConcurrentCommandCounterRequest getRxEnquireLinkRequest() {
        return rxEnquireLink;
    }

    @Override
    public ConcurrentCommandCounterRequest getRxSubmitSMRequest() {
        return rxSubmitSM;
    }

    @Override
    public ConcurrentCommandCounterRequest getTxDataSMRequest() {
        return txDataSM;
    }

    @Override
    public ConcurrentCommandCounterRequest getTxDeliverSMRequest() {
        return txDeliverSM;
    }

    @Override
    public ConcurrentCommandCounterRequest getTxEnquireLinkRequest() {
        return txEnquireLink;
    }

    @Override
    public ConcurrentCommandCounterRequest getTxSubmitSMRequest() {
        return txSubmitSM;
    }
}
