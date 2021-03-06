package com.hedera.hcsapp;

/*-
 * ‌
 * hcs-sxc-java
 * ​
 * Copyright (C) 2019 - 2020 Hedera Hashgraph, LLC
 * ​
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
 * ‍
 */

public enum States {
    CREDIT_PROPOSED_PENDING("Proposed (Pending)", "N/A")
    ,CREDIT_PROPOSED("Proposed", "N/A")
    ,CREDIT_AGREED_PENDING("Agreed (Pending)", "N/A")
    ,CREDIT_AGREED("Agreed", "N/A")

    ,SETTLE_PROPOSED_PENDING("Agreed", "Proposed (Pending)")
    ,SETTLE_PROPOSED("Settlement Proposed", "Proposed")
    ,SETTLE_AGREED_PENDING("Settlement Proposed", "Agreed (Pending)")
    ,SETTLE_AGREED("Settling", "Agreed")

    ,SETTLE_PAY_CHANNEL_PROPOSED_PENDING("Settling", "Payment Channel Proposed (Pending)")
    ,SETTLE_PAY_CHANNEL_PROPOSED("Settling", "Payment Channel Proposed")
    ,SETTLE_PAY_CHANNEL_AGREED_PENDING("Settling", "Payment Channel Agreed (Pending)")
    ,SETTLE_PAY_CHANNEL_AGREED("Settling", "Payment Channel Agreed")

    ,SETTLE_PAY_PROPOSED_PENDING("Settling", "Payment Proposed (Pending)")
    ,SETTLE_PAY_PROPOSED("Settling", "Payment Proposed")
    ,SETTLE_PAY_AGREED_PENDING("Settling", "Payment Agreed (Pending)")
    ,SETTLE_PAY_AGREED("Settling", "Payment Agreed")

    ,SETTLE_PAY_MADE_PENDING("Settling", "Payment Made (Pending)")
    ,SETTLE_PAY_MADE("Settling", "Payment Made")
    ,SETTLE_PAY_ACK_PENDING("Settling", "Payment Acknowledged (Pending)")
    ,SETTLE_PAY_ACK("Settling", "Payment Acknowledged")

    ,SETTLE_RCPT_REQUESTED_PENDING("Settling", "Receipt Requested (Pending)")
    ,SETTLE_RCPT_REQUESTED("Settling", "Receipt Requested")
    ,SETTLE_RCPT_CONFIRMED_PENDING("Settling", "Receipt Confirmed (Pending)")
    ,SETTLE_RCPT_CONFIRMED("Settling", "Receipt Confirmed")

    ,SETTLE_PAY_CONFIRMED_PENDING("Settling", "Payment Confirmed (Pending)")
    ,SETTLE_PAY_CONFIRMED("Settling", "Payment Confirmed")
    ,SETTLE_COMPLETE_PENDING("Settling", "Complete (Pending)")
    ,SETTLE_COMPLETE("Settled", "Complete");
    
    private final String displayForCredit;
    private final String displayForSettlement;
    
    States(String displayForCredit, String displayForSettlement) {
        this.displayForCredit = displayForCredit;
        this.displayForSettlement = displayForSettlement;
    }
    
    public String getDisplayForCredit() {
        return this.displayForCredit;
    }
    public String getDisplayForSettlement() {
        return this.displayForSettlement;
    }
}

