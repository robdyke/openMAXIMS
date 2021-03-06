//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Gabriel Maxim using IMS Development Environment (version 1.80 build 5127.24028)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.internalreferralseditnotedialog;

import ims.clinical.vo.ClinicalReferralNotesVo;
import ims.clinical.vo.ClinicalReferralNotesVoCollection;
import ims.clinical.vo.ClinicalReferralStatusLiteVo;
import ims.clinical.vo.ClinicalReferralStatusLiteVoCollection;
import ims.clinical.vo.ClinicalReferralStatusVo;
import ims.clinical.vo.ClinicalReferralStatusVoCollection;
import ims.clinical.vo.ClinicalReferralToUpdateForClinicalReferralNoteVo;
import ims.clinical.vo.ClinicalReferralsRefVo;
import ims.clinical.vo.ClinicalReferralsVo;
import ims.clinical.vo.PatientDocumentForClinicalReferralVo;
import ims.clinical.vo.lookups.ClinicalReferralNoteType;
import ims.clinical.vo.lookups.ClinicalReferralType;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.RecordingUserInformationVo;
import ims.core.vo.ServerDocumentVo;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.DocumentCreationType;
import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.InternalReferralStatus;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;

import java.security.SecureRandom;
import java.util.ArrayList;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	//WDEV-18959
	private static final int INTERNAL_REFERRAL_COMPLETION_IMSID = 349; 
	private static final String INTERNAL_REFERRAL_COMPLETION_DOCUMENT_NAME = "Internal Referral Completion";
	private static final String CLINICAL_REFERRAL_SEED = "ClinicalReferrals_id";

	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		if (args != null && args.length > 0)
		{
			if (args.length >= 1 && args[0] != null && args[0] instanceof ClinicalReferralNoteType)
			{
				form.getLocalContext().setPredefinedNoteType((ClinicalReferralNoteType) args[0]);
			}
			if (args.length >= 2 && args[1] != null && args[1] instanceof InternalReferralStatus)
			{
				form.getLocalContext().setReferralStatusToSave((InternalReferralStatus) args[1]);
			}
			if (args.length >= 3 && args[2] != null && args[2] instanceof ClinicalReferralsVo)
			{
				form.getLocalContext().setUpdatedReferralReturned((ClinicalReferralsVo) args[2]);
			}
		}
		
		if (form.getGlobalContext().Clinical.getClinicalReferralRef() != null)
			form.getLocalContext().setClinicalReferralToUpdateForClinicalReferralNoteVo(domain.getPatientReferralDetails(form.getGlobalContext().Clinical.getClinicalReferralRef())); //wdev-18961
		
		open();
	}
	private void open()
	{
		clearControls();
		if (form.getLocalContext().getPredefinedNoteType()!= null)
		{	
			form.cmbNoteType().setValue(form.getLocalContext().getPredefinedNoteType());
		}
		else
		{
			form.cmbNoteType().removeRow(ClinicalReferralNoteType.COMPLETION_NOTE);
		}
		setRecordingInfo();
		updateControlsState();

	}
	private void clearControls()
	{
		form.cmbNoteType().setValue(null);
		form.lblRecUserVal().setValue("");
		form.lblRecDteTimeVal().setValue("");
		form.txtNote().setValue(null);

	}
	private void setRecordingInfo()
	{
		form.lblRecUserVal().setValue(getRecordingUser() != null ? getRecordingUser().getName().toString() != null && getRecordingUser().getName().toString().length() > 70 ?  getRecordingUser().getName().toString().substring(0, 70) : getRecordingUser().getName().toString() : "");
		form.lblRecUserVal().setTooltip(getRecordingUser() != null ? getRecordingUser().getName().toString() : "" );
		form.lblRecDteTimeVal().setValue(new DateTime().toString(DateTimeFormat.STANDARD));

	}
	private MemberOfStaffLiteVo getRecordingUser()
	{
		Object user = domain.getMosUser();
		if (user == null) 
			return null;
		if (user instanceof HcpLiteVo)
			return (((HcpLiteVo) user).getMos());
		else if (user instanceof MemberOfStaffLiteVo)
			return ((MemberOfStaffLiteVo) user);
		return null;	
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (! form.getGlobalContext().Clinical.getClinicalReferralRefIsNotNull() || Boolean.TRUE.equals(form.getGlobalContext().Clinical.getSaveInternalReferralNote()))
		{
			if (addNoteToClinicalNotesCollection())
				engine.close(DialogResult.OK);
		}
		else if (form.getLocalContext().getUpdatedReferralReturned() == null)
		{
			if (save())		
			engine.close(DialogResult.OK);
		}	
		else if (saveReferralFromInitArgument())
			engine.close(DialogResult.OK);
	}
	
	private boolean addNoteToClinicalNotesCollection() 
	{
		ClinicalReferralNotesVoCollection clinNotes = form.getGlobalContext().Clinical.getClinicalReferraNotes();
		RecordingUserInformationVo recInfo = populateRecordingUserInfo();
		ClinicalReferralNotesVo note = populateNoteDataFromScreen(recInfo);
		
		if (note.validate() != null && note.validate().length > 0)
		{
			engine.showErrors(note.validate());
			return false;
		}
			
		if (clinNotes == null)
			clinNotes = new ClinicalReferralNotesVoCollection(); 
		
		clinNotes.add(note);
		form.getGlobalContext().Clinical.setClinicalReferraNotes(clinNotes);
		
		return true;
	}
	
	private boolean save()
	{		
		boolean isReferralStatusUpdated = form.getLocalContext().getReferralStatusToSave() != null;
		ClinicalReferralToUpdateForClinicalReferralNoteVo referralToSave = populateDataFromScreen(form.getGlobalContext().Clinical.getClinicalReferralRef(),isReferralStatusUpdated);

		if (referralToSave.validate() != null && referralToSave.validate().length > 0)
		{
			engine.showErrors(referralToSave.validate());
			return false;
		}
		
		//---------------- wdev-20960
		try
		{
			referralToSave = domain.saveNoteAndUpdateReferral(referralToSave,null);//WDEV-18959
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
			return false;
		}
		//---------------- End wdev-20960
	
		PatientDocumentForClinicalReferralVo document = null;
		
		//WDEV-18959
		if (ClinicalReferralNoteType.COMPLETION_NOTE.equals(form.getLocalContext().getPredefinedNoteType()) && InternalReferralStatus.COMPLETED.equals(form.getLocalContext().getReferralStatusToSave()))
		{
			
			document = createPatientDocument();
			
			if(document == null)
				return false;
			
			String[] errors = document.validate();
			if(errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}
		}
		
		//-------------- Wdev-20960 -----
		if (referralToSave.validate() != null && referralToSave.validate().length > 0)
		{
			engine.showErrors(referralToSave.validate());
			return false;
		}
		//------------------
		
		try
		{
			domain.saveNoteAndUpdateReferral(referralToSave,document);//WDEV-18959
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
			return false;
		}
		form.getGlobalContext().Clinical.setClinicalReferralCurrentStatus(form.getLocalContext().getReferralStatusToSave());
		
		return true;
	}
	
	//WDEV-18959
	private PatientDocumentForClinicalReferralVo createPatientDocument() 
	{
		String fileName = createAndUploadDocument();
		
		if(fileName != null)
		{
			PatientDocumentForClinicalReferralVo completionDocument = new PatientDocumentForClinicalReferralVo();
			
			completionDocument.setName(INTERNAL_REFERRAL_COMPLETION_DOCUMENT_NAME);
			completionDocument.setPatient(form.getGlobalContext().Core.getPatientShort());
			completionDocument.setCreationType(DocumentCreationType.GENERATED);
			completionDocument.setStatus(PreActiveActiveInactiveStatus.ACTIVE);
			completionDocument.setCategory(DocumentCategory.INTERNAL_REFERRALS);
			
			Object user = domain.getMosUser();
			
			if(user instanceof MemberOfStaffLiteVo)
			{
				MemberOfStaffLiteVo mosUser = (MemberOfStaffLiteVo) user;
				completionDocument.setRecordingUser(mosUser);	
			}
		
			completionDocument.setRecordingDateTime(new DateTime());
		
			completionDocument.setDocumentDate(new Date());
			
			ServerDocumentVo doc = new ServerDocumentVo();
			doc.setFileName(fileName);
			doc.setFileType(FileType.PDF);
			
			completionDocument.setServerDocument(doc);
			
			return completionDocument;
		}
		
		return null;
	}
	
	//WDEV-18959
	private String createAndUploadDocument() 
	{
		byte[] report = buildCompletionReport();
		
		if(report != null)
		{
			String pdfFileName = generateName() + ".pdf";
			
			try 
			{								
				engine.uploadFile(ConfigFlag.GEN.PDF_UPLOAD_URL.getValue(), report, pdfFileName, ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + "\\");
			}
			catch (Exception e)
			{
				engine.showMessage(e.getMessage());
				return null;
			}
			
			int year  = new DateTime().getDate().getYear();
			int month = new DateTime().getDate().getMonth();
			int day   = new DateTime().getDate().getDay();
			
			if(pdfFileName != null && pdfFileName.length() > 0)
				return year + "\\" + month + "\\" + day + "\\" + pdfFileName;
		}
		
		return null;
	}
	
	//WDEV-18959
	private byte[] buildCompletionReport() 
	{
		if(!validateReportConfigFlags())
			return null;
		
		String queryServerUrl = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		String reportServerUrl = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		Object[] obj = domain.getSystemReportAndTemplate(INTERNAL_REFERRAL_COMPLETION_IMSID);
	
		if(obj == null || obj.length < 2)
		{
			engine.showMessage("I could not get the report and template !");
			return null;
		}

		if(obj[0] == null || obj[1] == null)
		{
			engine.showMessage("The report has not been deployed !");
			return null;
		}
		
		byte[] report = null;
		
		QueryBuilderClient client = new QueryBuilderClient(queryServerUrl, engine.getSessionId()); 
		
		client.addSeed(new SeedValue(CLINICAL_REFERRAL_SEED, form.getGlobalContext().Clinical.getClinicalReferralRef().getID_ClinicalReferrals(), Integer.class));	
		
		try
		{	
			report = client.buildReport((String)obj[0], (String)obj[1], reportServerUrl, QueryBuilderClient.PDF, "", 1);
		}
		catch (QueryBuilderClientException ex)
		{
			engine.showMessage("Error creating report: " + ex.getMessage());
			return null;
		}	
		
		return report;
	}
	
	//WDEV-18959
	private boolean validateReportConfigFlags() 
	{
		String queryServerUrl = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		String reportServerUrl = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		ArrayList<String> errors = new ArrayList<String>();
		
		if(queryServerUrl == null || queryServerUrl.length() == 0 || queryServerUrl.equals(ConfigFlag.GEN.QUERY_SERVER_URL.getDefaultValue()))
		{
			errors.add("The config flag QUERY_SERVER_URL is not set!");
		}
		
		if(reportServerUrl == null || reportServerUrl.length() == 0 || reportServerUrl.equals(ConfigFlag.GEN.REPORT_SERVER_URL.getDefaultValue()))
		{
			errors.add("The config flag REPORT_SERVER_URL is not set !");
		}
		
		if(errors.size() == 0)
			return true;
		
		engine.showMessage(getErrors(errors.toArray(new String[errors.size()])), "Errors", MessageButtons.OK, MessageIcon.ERROR);
		
		return false;
	}
	
	//WDEV-18959
	private String getErrors(String[] uiErrors) 
	{
		if(uiErrors == null || uiErrors.length == 0)
			return "";
		
		String errors = "";
		
		for(int i=0; i<uiErrors.length; i++)
		{
			if(uiErrors[i] == null)
				continue;
			
			errors += uiErrors[i] + "\n";
		}
		
		return errors;
	}
	
	//WDEV-18959
	private String generateName()
	{
		String str = "";

		try
		{
			// Get Random Segment
			SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
			str += Integer.toHexString(prng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}

			// Get CurrentTimeMillis() segment
			str += Long.toHexString(System.currentTimeMillis());
			while (str.length() < 12)
			{
				str = '0' + str;
			}

			// Get Random Segment
			SecureRandom secondPrng = SecureRandom.getInstance("SHA1PRNG");
			str += Integer.toHexString(secondPrng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}

			// Get IdentityHash() segment
			str += Long.toHexString(System.identityHashCode((Object) this));
			while (str.length() < 8)
			{
				str = '0' + str;
			}
			// Get Third Random Segment
			byte bytes[] = new byte[16];
			SecureRandom thirdPrng = SecureRandom.getInstance("SHA1PRNG");
			thirdPrng.nextBytes(bytes);
			str += Integer.toHexString(thirdPrng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}
		}
		catch (java.security.NoSuchAlgorithmException ex)
		{
			ex.getMessage();
		}

		return str;
	}
	
	
	private boolean saveReferralFromInitArgument()
	{		
		boolean isReferralStatusUpdated = form.getLocalContext().getReferralStatusToSave() != null;
		ClinicalReferralsVo argsReferralForSave = populateDataFromArgumentAndScreen(form.getLocalContext().getUpdatedReferralReturned(), isReferralStatusUpdated);
		
		if (argsReferralForSave.validate() != null && argsReferralForSave.validate().length > 0)
		{
			engine.showErrors(argsReferralForSave.validate());
			return false;
		}
	
		try
		{
			domain.saveFullReferral(argsReferralForSave);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
			return false;
		}
				
		return true;
	}
	
	private ClinicalReferralsVo populateDataFromArgumentAndScreen(ClinicalReferralsVo referral, boolean isReferralStatusUpdated)
	{
		if (referral == null)
			return null;
				
		ClinicalReferralsVo argsReferralToSave = (ClinicalReferralsVo) referral.clone(); //WDEV-18975

		RecordingUserInformationVo recInfo = populateRecordingUserInfo();
		
		ClinicalReferralNotesVo note = populateNoteDataFromScreen(recInfo);
		
		if (argsReferralToSave.getClinicalReferralNotes() == null)
			argsReferralToSave.setClinicalReferralNotes(new ClinicalReferralNotesVoCollection()); 
		argsReferralToSave.getClinicalReferralNotes().add(note);

		if (isReferralStatusUpdated)
		{
			ClinicalReferralStatusVo status = populateFullStatusData(recInfo);
			if (argsReferralToSave.getHistoryOfReferralStatus() == null)
				argsReferralToSave.setHistoryOfReferralStatus(new ClinicalReferralStatusVoCollection());

			argsReferralToSave.setCurrentReferralStatus(status);
			argsReferralToSave.getHistoryOfReferralStatus().add(status);
		}

		return argsReferralToSave;
	}
	private ClinicalReferralToUpdateForClinicalReferralNoteVo populateDataFromScreen(ClinicalReferralsRefVo clinicalReferralRef, boolean isReferralStatusUpdated)
	{
		if (clinicalReferralRef == null)
			return null;
		if (form.getLocalContext().getClinicalReferralToUpdateForClinicalReferralNoteVo() == null)
			return null;
		ClinicalReferralToUpdateForClinicalReferralNoteVo referralToSave = (ClinicalReferralToUpdateForClinicalReferralNoteVo) form.getLocalContext().getClinicalReferralToUpdateForClinicalReferralNoteVo().clone(); //wdev-18961 //WDEV-18975
		
		boolean isOutpatientReferral = referralToSave != null && (ClinicalReferralType.IP_TO_BE_SEEN_AS_OUTPATIENT.equals(referralToSave.getReferralType()) || ClinicalReferralType.OP_TO_BE_SEEN_AS_OUTPATIENT.equals(referralToSave.getReferralType()));
		
		RecordingUserInformationVo recInfo = populateRecordingUserInfo();
		
		ClinicalReferralNotesVo note = populateNoteDataFromScreen(recInfo);
		
		if (referralToSave.getClinicalReferralNotes() == null)
			referralToSave.setClinicalReferralNotes(new ClinicalReferralNotesVoCollection()); 
		referralToSave.getClinicalReferralNotes().add(note);

		if (isReferralStatusUpdated)
		{
			ClinicalReferralStatusLiteVo status = populateLiteStatusData(recInfo, isOutpatientReferral);
			if (referralToSave.getHistoryOfReferralStatus() == null)
				referralToSave.setHistoryOfReferralStatus(new ClinicalReferralStatusLiteVoCollection());

			referralToSave.setCurrentReferralStatus(status);
			referralToSave.getHistoryOfReferralStatus().add(status);
		}

		return referralToSave;
	}

	private ClinicalReferralNotesVo populateNoteDataFromScreen(RecordingUserInformationVo recordingInfoVo)
	{
		ClinicalReferralNotesVo note = new ClinicalReferralNotesVo();
		note.setNote(form.txtNote().getValue());
		note.setNoteType(form.cmbNoteType().getValue());
		note.setRecordingInfo(recordingInfoVo);

		return note;
	}
	private ClinicalReferralStatusVo populateFullStatusData(RecordingUserInformationVo recordingInfoVo) 
	{
		ClinicalReferralStatusVo newStatus = new ClinicalReferralStatusVo();
		newStatus.setRecordingInfo(recordingInfoVo);
		newStatus.setReferralStatus(form.getLocalContext().getReferralStatusToSave());
		return newStatus;
	}
	private ClinicalReferralStatusLiteVo populateLiteStatusData(RecordingUserInformationVo recordingInfoVo, boolean isOutpatientReferral) 
	{
		ClinicalReferralStatusLiteVo newStatus = new ClinicalReferralStatusLiteVo();
		newStatus.setRecordingInfo(recordingInfoVo);
		newStatus.setReferralStatus(form.getLocalContext().getReferralStatusToSave());
		
		//WDEV-18948
		if (InternalReferralStatus.ACCEPTED.equals(form.getLocalContext().getReferralStatusToSave()))
			newStatus.setAppointmentRequired(isOutpatientReferral ? Boolean.TRUE : Boolean.FALSE);
		
		return newStatus;
	}
	private RecordingUserInformationVo populateRecordingUserInfo()
	{
		RecordingUserInformationVo recInfoVo = new RecordingUserInformationVo();
		recInfoVo.setRecordingUser(getRecordingUser());
		recInfoVo.setRecordingDateTime(new DateTime());
		return recInfoVo;
	}
	private void updateControlsState()
	{
	  form.cmbNoteType().setEnabled(form.getLocalContext().getPredefinedNoteType() == null);
	}

}
