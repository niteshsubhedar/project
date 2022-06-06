package com.mindgate.main.pojo;

import java.util.Arrays;

public class DocumentDetails {
 private  int documentId;
 private String documentType;
 private int candidateId;
 private byte[] dacument;
 private CandidateDetails candidateDetails;
 
 public DocumentDetails() {
	// TODO Auto-generated constructor stub
}

public DocumentDetails(int documentId, String documentType, int candidateId, byte[] dacument,
		CandidateDetails candidateDetails) {
	super();
	this.documentId = documentId;
	this.documentType = documentType;
	this.candidateId = candidateId;
	this.dacument = dacument;
	this.candidateDetails = candidateDetails;
}

public int getDocumentId() {
	return documentId;
}

public void setDocumentId(int documentId) {
	this.documentId = documentId;
}

public String getDocumentType() {
	return documentType;
}

public void setDocumentType(String documentType) {
	this.documentType = documentType;
}

public int getCandidateId() {
	return candidateId;
}

public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}

public byte[] getDacument() {
	return dacument;
}

public void setDacument(byte[] dacument) {
	this.dacument = dacument;
}

public CandidateDetails getCandidateDetails() {
	return candidateDetails;
}

public void setCandidateDetails(CandidateDetails candidateDetails) {
	this.candidateDetails = candidateDetails;
}

@Override
public String toString() {
	return "DocumentDetails [documentId=" + documentId + ", documentType=" + documentType + ", candidateId="
			+ candidateId + ", dacument=" + Arrays.toString(dacument) + ", candidateDetails=" + candidateDetails + "]";
}
 
 
}
