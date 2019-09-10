package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelMarketOrderTransactionInstanceRecord;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModel
 */
public class BQTradeInitiationRetrieveOutputModel   {
  private BQTradeInitiationRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private String tradeInitiationRetrieveActionTaskReference = null;

  private Object tradeInitiationRetrieveActionTaskRecord = null;

  private String tradeInitiationRetrieveActionResponse = null;

  private BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport tradeInitiationInstanceReport = null;

  private BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis = null;


  /**
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public BQTradeInitiationRetrieveOutputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(BQTradeInitiationRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


  /**
   * Get tradeInitiationInstanceRecord
   * @return tradeInitiationInstanceRecord
  **/

  public BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord getTradeInitiationInstanceRecord() {
    return tradeInitiationInstanceRecord;
  }

  public void setTradeInitiationInstanceRecord(BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord) {
    this.tradeInitiationInstanceRecord = tradeInitiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trade Initiation instance retrieve service call 
   * @return tradeInitiationRetrieveActionTaskReference
  **/

  public String getTradeInitiationRetrieveActionTaskReference() {
    return tradeInitiationRetrieveActionTaskReference;
  }

  public void setTradeInitiationRetrieveActionTaskReference(String tradeInitiationRetrieveActionTaskReference) {
    this.tradeInitiationRetrieveActionTaskReference = tradeInitiationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return tradeInitiationRetrieveActionTaskRecord
  **/

  public Object getTradeInitiationRetrieveActionTaskRecord() {
    return tradeInitiationRetrieveActionTaskRecord;
  }

  public void setTradeInitiationRetrieveActionTaskRecord(Object tradeInitiationRetrieveActionTaskRecord) {
    this.tradeInitiationRetrieveActionTaskRecord = tradeInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return tradeInitiationRetrieveActionResponse
  **/

  public String getTradeInitiationRetrieveActionResponse() {
    return tradeInitiationRetrieveActionResponse;
  }

  public void setTradeInitiationRetrieveActionResponse(String tradeInitiationRetrieveActionResponse) {
    this.tradeInitiationRetrieveActionResponse = tradeInitiationRetrieveActionResponse;
  }


  /**
   * Get tradeInitiationInstanceReport
   * @return tradeInitiationInstanceReport
  **/

  public BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport getTradeInitiationInstanceReport() {
    return tradeInitiationInstanceReport;
  }

  public void setTradeInitiationInstanceReport(BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport tradeInitiationInstanceReport) {
    this.tradeInitiationInstanceReport = tradeInitiationInstanceReport;
  }


  /**
   * Get tradeInitiationInstanceAnalysis
   * @return tradeInitiationInstanceAnalysis
  **/

  public BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis getTradeInitiationInstanceAnalysis() {
    return tradeInitiationInstanceAnalysis;
  }

  public void setTradeInitiationInstanceAnalysis(BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis) {
    this.tradeInitiationInstanceAnalysis = tradeInitiationInstanceAnalysis;
  }


}

