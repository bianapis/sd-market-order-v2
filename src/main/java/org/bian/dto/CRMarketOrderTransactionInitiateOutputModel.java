package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionInitiateOutputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionInitiateOutputModel
 */
public class CRMarketOrderTransactionInitiateOutputModel   {
  private String marketOrderTransactionInstanceReference = null;

  private String marketOrderTransactionInitiateActionReference = null;

  private Object marketOrderTransactionInitiateActionRecord = null;

  private String marketOrderTransactionInstanceStatus = null;

  private CRMarketOrderTransactionInitiateOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Order Transaction instance 
   * @return marketOrderTransactionInstanceReference
  **/

  public String getMarketOrderTransactionInstanceReference() {
    return marketOrderTransactionInstanceReference;
  }

  public void setMarketOrderTransactionInstanceReference(String marketOrderTransactionInstanceReference) {
    this.marketOrderTransactionInstanceReference = marketOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return marketOrderTransactionInitiateActionReference
  **/

  public String getMarketOrderTransactionInitiateActionReference() {
    return marketOrderTransactionInitiateActionReference;
  }

  public void setMarketOrderTransactionInitiateActionReference(String marketOrderTransactionInitiateActionReference) {
    this.marketOrderTransactionInitiateActionReference = marketOrderTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return marketOrderTransactionInitiateActionRecord
  **/

  public Object getMarketOrderTransactionInitiateActionRecord() {
    return marketOrderTransactionInitiateActionRecord;
  }

  public void setMarketOrderTransactionInitiateActionRecord(Object marketOrderTransactionInitiateActionRecord) {
    this.marketOrderTransactionInitiateActionRecord = marketOrderTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Market Order Transaction instance (e.g. initialised, pending, active) 
   * @return marketOrderTransactionInstanceStatus
  **/

  public String getMarketOrderTransactionInstanceStatus() {
    return marketOrderTransactionInstanceStatus;
  }

  public void setMarketOrderTransactionInstanceStatus(String marketOrderTransactionInstanceStatus) {
    this.marketOrderTransactionInstanceStatus = marketOrderTransactionInstanceStatus;
  }


  /**
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public CRMarketOrderTransactionInitiateOutputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(CRMarketOrderTransactionInitiateOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


}

