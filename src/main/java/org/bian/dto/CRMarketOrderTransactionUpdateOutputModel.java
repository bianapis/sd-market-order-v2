package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionUpdateOutputModel
 */
public class CRMarketOrderTransactionUpdateOutputModel   {
  private CRMarketOrderTransactionUpdateInputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private String marketOrderTransactionUpdateActionTaskReference = null;

  private Object marketOrderTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return marketOrderTransactionUpdateActionTaskReference
  **/

  public String getMarketOrderTransactionUpdateActionTaskReference() {
    return marketOrderTransactionUpdateActionTaskReference;
  }

  public void setMarketOrderTransactionUpdateActionTaskReference(String marketOrderTransactionUpdateActionTaskReference) {
    this.marketOrderTransactionUpdateActionTaskReference = marketOrderTransactionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

