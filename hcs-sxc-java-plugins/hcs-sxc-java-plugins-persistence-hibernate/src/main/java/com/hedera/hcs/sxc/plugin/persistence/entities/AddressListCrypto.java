package com.hedera.hcs.sxc.plugin.persistence.entities;

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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import com.hedera.hcs.sxc.interfaces.SxcAddressListItemCryptoInterface;
import java.io.Serializable;

@Data
@Entity
@Table(name = "address_list_crypto")
public class AddressListCrypto implements Serializable, SxcAddressListItemCryptoInterface{

    @Id
    private String appId;
    private String theirEd25519PubKeyForSigning; // HEX
    private String sharedSymmetricEncryptionKey; // HEX

}