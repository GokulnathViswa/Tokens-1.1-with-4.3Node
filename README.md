
To issue token to PartyB:

Step 1: Run command in PartyA shell
'start ExampleFlowWithFixedToken currency: GBP, amount: 100, recipient: PartyB'

To move token to PartyA:

Step 2: Run command in PartyB shell
'start ExampleFlowWithMoveToken currency: GBP, amount: 40, toParty: PartyA'

To check issued and moved tokens PartyA and PartyB:

Step 2: Run command in PartyA & PartyB shell
'start ExampleFlowToGetToken currency: GBP'

Results in PartyA :
[StateAndRef(state=TransactionState(data=40.00 TokenType(tokenIdentifier='GBP', fractionDigits=2) issued by PartyA held by PartyA,
contract=com.r3.corda.lib.tokens.contracts.FungibleTokenContract, notary=O=Notary, L=London, C=GB, encumbrance=null,
constraint=net.corda.core.contracts.WhitelistedByZoneAttachmentConstraint@26d80ab6),
ref=182136921AAC9E661F508F0DA0EC8871F2BC337646C75FC5E483F8581A1CE126(0))]

Results in PartyB :
[StateAndRef(state=TransactionState(data=60.00 TokenType(tokenIdentifier='GBP', fractionDigits=2) issued by PartyA held by PartyB,
contract=com.r3.corda.lib.tokens.contracts.FungibleTokenContract, notary=O=Notary, L=London, C=GB, encumbrance=null,
constraint=net.corda.core.contracts.WhitelistedByZoneAttachmentConstraint@69d30e98),
ref=182136921AAC9E661F508F0DA0EC8871F2BC337646C75FC5E483F8581A1CE126(1))]

