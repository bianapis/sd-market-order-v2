package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionUpdateInputModel
 */
public class CRMarketOrderTransactionUpdateInputModel   {
  private String marketOrderServicingSessionReference = null;

  private String marketOrderTransactionInstanceReference = null;

  private CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private Object marketOrderTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return marketOrderTransactionUpdateActionTaskRecord
  **/

  public Object getMarketOrderTransactionUpdateActionTaskRecord() {
    return marketOrderTransactionUpdateActionTaskRecord;
  }

  public void setMarketOrderTransactionUpdateActionTaskRecord(Object marketOrderTransactionUpdateActionTaskRecord) {
    this.marketOrderTransactionUpdateActionTaskRecord = marketOrderTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

