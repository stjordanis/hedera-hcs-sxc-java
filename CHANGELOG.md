# Changelog

Besides bug fixes, some features may have changed with this release which need your attention, these will be listed here.

## April 14th 2020

* Addition of an MQ Consumer demo

## April 6th 2020

* Addition of a tokenization demo

## March 28th 2020

* It is now possible to override configured encryption in code when sending a message to HCS via HCS-SXC.

## March 25th 2020

* Proof after the fact. Outbound messages provide a `prove (originalMessage, publicKey)` api call, which allows sending proof requests to all peers from the address-book. Peers can verify messages by inspecting their messages received from the mirror and verify messages even if the stored messages are in encrypted form; thus, no decryption key is required to verify a message.

* The simple demo demonstrates proof after the fact.  

* The simple demo supports simple message thread creation, such that conversations are grouped by named threads. This demonstrates simple  state management and state replication across multiple App net participants.  


## March 6th 2020



Additionally, running the demos with encryption now requires a `contact-list.yaml` file to be generated. An automatic generator is available in both demos, please refer to `README.md` for details.

## Feburary 18th 2020

* App Ids are now optional strings, requires an update to docker-compose.

## February 4th 2020

* Cryptography plug in for encryption/decryption

## February 4th 2020

* Demo now supports fully automatic processing for credits and settlements (individually selectable). If a credit or settlement is set to automatic in the UI, the demo will proceed without further user input.

* Control returned to user immediately after closing new credit dialog allowing for a new credit to be created without waiting for mirror node response.

## February 3rd 2020

Simple demo simplification. It is now possible to run simple demo without relay and queue components. See README.md for details.
