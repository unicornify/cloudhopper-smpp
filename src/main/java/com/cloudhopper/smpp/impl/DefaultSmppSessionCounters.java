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
import com.cloudhopper.smpp.util.ConcurrentCommandCounterY;

/**
 * Default implementation of a SmppServerCounters interface.
 * 
 * @author joelauer (twitter: @jjlauer or <a href="http://twitter.com/jjlauer" target=window>http://twitter.com/jjlauer</a>)
 */
public class DefaultSmppSessionCounters implements SmppSessionCounters {
   
    private ConcurrentCommandCounterY txSubmitSM;
    private ConcurrentCommandCounterY txDeliverSM;
    private ConcurrentCommandCounterY txEnquireLink;
    private ConcurrentCommandCounterY txDataSM;
    private ConcurrentCommandCounterY rxSubmitSM;
    private ConcurrentCommandCounterY rxDeliverSM;
    private ConcurrentCommandCounterY rxEnquireLink;
    private ConcurrentCommandCounterY rxDataSM;
    
    public DefaultSmppSessionCounters() {
        this.txSubmitSM = new ConcurrentCommandCounterY();
        this.txDeliverSM = new ConcurrentCommandCounterY();
        this.txEnquireLink = new ConcurrentCommandCounterY();
        this.txDataSM = new ConcurrentCommandCounterY();
        this.rxSubmitSM = new ConcurrentCommandCounterY();
        this.rxDeliverSM = new ConcurrentCommandCounterY();
        this.rxEnquireLink = new ConcurrentCommandCounterY();
        this.rxDataSM = new ConcurrentCommandCounterY();
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
    public ConcurrentCommandCounterY getRxDataSM() {
        return rxDataSM;
    }

    @Override
    public ConcurrentCommandCounterY getRxDeliverSM() {
        return rxDeliverSM;
    }

    @Override
    public ConcurrentCommandCounterY getRxEnquireLink() {
        return rxEnquireLink;
    }

    @Override
    public ConcurrentCommandCounterY getRxSubmitSM() {
        return rxSubmitSM;
    }

    @Override
    public ConcurrentCommandCounterY getTxDataSM() {
        return txDataSM;
    }

    @Override
    public ConcurrentCommandCounterY getTxDeliverSM() {
        return txDeliverSM;
    }

    @Override
    public ConcurrentCommandCounterY getTxEnquireLink() {
        return txEnquireLink;
    }

    @Override
    public ConcurrentCommandCounterY getTxSubmitSM() {
        return txSubmitSM;
    }
}
