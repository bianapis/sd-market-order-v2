package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationExchangeInputModel
 */
public class BQTradeInitiationExchangeInputModel   {
  private String marketOrderTransactionInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private Object tradeInitiationExchangeActionTaskRecord = null;

  private BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest tradeInitiationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Market Order Transaction instance 
   * @return marketOrderTransactionInstanceReference
  **/

  public String getMarketOrderTransactionInstanceReference() {
    return marketOrderTransactionInstanceReference;
  }

  public void setMarketOrderTransactionInstanceReference(String marketOrderTransactionInstanceReference) {
    this.marketOrderTransactionInstanceReference = marketOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation instance 
   * @return tradeInitiationInstanceReference
  **/

  public String getTradeInitiationInstanceReference() {
    return tradeInitiationInstanceReference;
  }

  public void setTradeInitiationInstanceReference(String tradeInitiationInstanceReference) {
    this.tradeInitiationInstanceReference = tradeInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return tradeInitiationExchangeActionTaskRecord
  **/

  public Object getTradeInitiationExchangeActionTaskRecord() {
    return tradeInitiationExchangeActionTaskRecord;
  }

  public void setTradeInitiationExchangeActionTaskRecord(Object tradeInitiationExchangeActionTaskRecord) {
    this.tradeInitiationExchangeActionTaskRecord = tradeInitiationExchangeActionTaskRecord;
  }


  /**
   * Get tradeInitiationExchangeActionRequest
   * @return tradeInitiationExchangeActionRequest
  **/

  public BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest getTradeInitiationExchangeActionRequest() {
    return tradeInitiationExchangeActionRequest;
  }

  public void setTradeInitiationExchangeActionRequest(BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest tradeInitiationExchangeActionRequest) {
    this.tradeInitiationExchangeActionRequest = tradeInitiationExchangeActionRequest;
  }


}

