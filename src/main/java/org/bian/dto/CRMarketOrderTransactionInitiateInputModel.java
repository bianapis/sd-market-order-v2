package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionInitiateInputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionInitiateInputModel
 */
public class CRMarketOrderTransactionInitiateInputModel   {
  private String marketOrderServicingSessionReference = null;

  private Object marketOrderTransactionInitiateActionRecord = null;

  private String marketOrderTransactionInstanceStatus = null;

  private CRMarketOrderTransactionInitiateInputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketOrderServicingSessionReference
  **/

  public String getMarketOrderServicingSessionReference() {
    return marketOrderServicingSessionReference;
  }

  public void setMarketOrderServicingSessionReference(String marketOrderServicingSessionReference) {
    this.marketOrderServicingSessionReference = marketOrderServicingSessionReference;
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

  public CRMarketOrderTransactionInitiateInputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(CRMarketOrderTransactionInitiateInputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


}

