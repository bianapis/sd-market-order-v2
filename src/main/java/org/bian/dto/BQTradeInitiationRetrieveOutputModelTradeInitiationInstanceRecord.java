package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord
 */
public class BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord   {
  private String marketTradeTransactionInstanceReference = null;

  private String marketTradeTransactionInstanceStatus = null;

  private String marketTradeInitiationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The reference to the market trade. Note this can be the internal bank 'trade' against the bank's managed position and may not result in a matched trade in the wholesale markets 
   * @return marketTradeTransactionInstanceReference
  **/

  public String getMarketTradeTransactionInstanceReference() {
    return marketTradeTransactionInstanceReference;
  }

  public void setMarketTradeTransactionInstanceReference(String marketTradeTransactionInstanceReference) {
    this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The returned status of the market trade 
   * @return marketTradeTransactionInstanceStatus
  **/

  public String getMarketTradeTransactionInstanceStatus() {
    return marketTradeTransactionInstanceStatus;
  }

  public void setMarketTradeTransactionInstanceStatus(String marketTradeTransactionInstanceStatus) {
    this.marketTradeTransactionInstanceStatus = marketTradeTransactionInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the market trade initiation task 
   * @return marketTradeInitiationTaskResult
  **/

  public String getMarketTradeInitiationTaskResult() {
    return marketTradeInitiationTaskResult;
  }

  public void setMarketTradeInitiationTaskResult(String marketTradeInitiationTaskResult) {
    this.marketTradeInitiationTaskResult = marketTradeInitiationTaskResult;
  }


}

