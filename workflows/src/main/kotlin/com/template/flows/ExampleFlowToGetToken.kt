package com.template.flows

import co.paralleluniverse.fibers.Suspendable
import com.r3.corda.lib.tokens.contracts.states.FungibleToken
import com.r3.corda.lib.tokens.money.FiatCurrency
import com.r3.corda.lib.tokens.workflows.utilities.tokenAmountCriteria
import net.corda.core.contracts.StateAndRef
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.StartableByRPC
import net.corda.core.utilities.ProgressTracker

@StartableByRPC
class ExampleFlowToGetToken(val currency: String) : FlowLogic<List<StateAndRef<FungibleToken>>>() {
    override val progressTracker = ProgressTracker()

    @Suspendable
    override fun call(): List<StateAndRef<FungibleToken>> {
        val token = FiatCurrency.getInstance(currency)
        // Starts a new flow session.
        val tokenCriteria = tokenAmountCriteria(token)
        val tokens = serviceHub.vaultService.queryBy(FungibleToken :: class.java, tokenCriteria).states
        return tokens
    }
}
