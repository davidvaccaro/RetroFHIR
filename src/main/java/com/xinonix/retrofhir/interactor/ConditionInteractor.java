package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Condition.VerificationStatus;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Quantity;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ConditionService;

import com.xinonix.hl7.fhir.stu3.Condition;

public class ConditionInteractor extends ResourceInteractor<ConditionService, Condition> {

    public static class ConditionComposer extends Composer<ConditionService, Condition, ConditionComposer> {

        public ConditionComposer()
        {
            super((Class) ConditionService.class, (Class) Condition.class);
        }

		public ResourceInteractor.Composer setAbatementAge(Modifier modifier, Prefix prefix, Quantity AbatementAge)
		{
			return setParameter(Parameters.ABATEMENT_AGE, modifier, prefix, AbatementAge);
		}

		public ResourceInteractor.Composer setAbatementAge(Modifier modifier, Quantity AbatementAge)
		{
			return setParameter(Parameters.ABATEMENT_AGE, modifier, AbatementAge);
		}

		public ResourceInteractor.Composer setAbatementAge(Prefix prefix, Quantity AbatementAge)
		{
			return setParameter(Parameters.ABATEMENT_AGE, prefix, AbatementAge);
		}
        			
		public ResourceInteractor.Composer setAbatementAge(Quantity AbatementAge)
		{
			return setParameter(Parameters.ABATEMENT_AGE, AbatementAge);
		}

		public ResourceInteractor.Composer setAbatementBoolean(Modifier modifier, Prefix prefix, String AbatementBoolean)
		{
			return setParameter(Parameters.ABATEMENT_BOOLEAN, modifier, prefix, AbatementBoolean);
		}

		public ResourceInteractor.Composer setAbatementBoolean(Modifier modifier, String AbatementBoolean)
		{
			return setParameter(Parameters.ABATEMENT_BOOLEAN, modifier, AbatementBoolean);
		}

		public ResourceInteractor.Composer setAbatementBoolean(Prefix prefix, String AbatementBoolean)
		{
			return setParameter(Parameters.ABATEMENT_BOOLEAN, prefix, AbatementBoolean);
		}
        			
		public ResourceInteractor.Composer setAbatementBoolean(String AbatementBoolean)
		{
			return setParameter(Parameters.ABATEMENT_BOOLEAN, AbatementBoolean);
		}

		public ResourceInteractor.Composer setAbatementDate(Modifier modifier, Prefix prefix, Date AbatementDate)
		{
			return setParameter(Parameters.ABATEMENT_DATE, modifier, prefix, AbatementDate);
		}

		public ResourceInteractor.Composer setAbatementDate(Modifier modifier, Date AbatementDate)
		{
			return setParameter(Parameters.ABATEMENT_DATE, modifier, AbatementDate);
		}

		public ResourceInteractor.Composer setAbatementDate(Prefix prefix, Date AbatementDate)
		{
			return setParameter(Parameters.ABATEMENT_DATE, prefix, AbatementDate);
		}
        			
		public ResourceInteractor.Composer setAbatementDate(Date AbatementDate)
		{
			return setParameter(Parameters.ABATEMENT_DATE, AbatementDate);
		}

		public ResourceInteractor.Composer setAbatementString(Modifier modifier, Prefix prefix, String AbatementString)
		{
			return setParameter(Parameters.ABATEMENT_STRING, modifier, prefix, AbatementString);
		}

		public ResourceInteractor.Composer setAbatementString(Modifier modifier, String AbatementString)
		{
			return setParameter(Parameters.ABATEMENT_STRING, modifier, AbatementString);
		}

		public ResourceInteractor.Composer setAbatementString(Prefix prefix, String AbatementString)
		{
			return setParameter(Parameters.ABATEMENT_STRING, prefix, AbatementString);
		}
        			
		public ResourceInteractor.Composer setAbatementString(String AbatementString)
		{
			return setParameter(Parameters.ABATEMENT_STRING, AbatementString);
		}

		public ResourceInteractor.Composer setAssertedDate(Modifier modifier, Prefix prefix, Date AssertedDate)
		{
			return setParameter(Parameters.ASSERTED_DATE, modifier, prefix, AssertedDate);
		}

		public ResourceInteractor.Composer setAssertedDate(Modifier modifier, Date AssertedDate)
		{
			return setParameter(Parameters.ASSERTED_DATE, modifier, AssertedDate);
		}

		public ResourceInteractor.Composer setAssertedDate(Prefix prefix, Date AssertedDate)
		{
			return setParameter(Parameters.ASSERTED_DATE, prefix, AssertedDate);
		}
        			
		public ResourceInteractor.Composer setAssertedDate(Date AssertedDate)
		{
			return setParameter(Parameters.ASSERTED_DATE, AssertedDate);
		}

		public ResourceInteractor.Composer setBodySite(Modifier modifier, Prefix prefix, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, modifier, prefix, BodySite);
		}

		public ResourceInteractor.Composer setBodySite(Modifier modifier, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, modifier, BodySite);
		}

		public ResourceInteractor.Composer setBodySite(Prefix prefix, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, prefix, BodySite);
		}
        			
		public ResourceInteractor.Composer setBodySite(CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, BodySite);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
		}

		public ResourceInteractor.Composer setClinicalStatus(Modifier modifier, Prefix prefix, String ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, modifier, prefix, ClinicalStatus);
		}

		public ResourceInteractor.Composer setClinicalStatus(Modifier modifier, String ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, modifier, ClinicalStatus);
		}

		public ResourceInteractor.Composer setClinicalStatus(Prefix prefix, String ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, prefix, ClinicalStatus);
		}
        			
		public ResourceInteractor.Composer setClinicalStatus(String ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, ClinicalStatus);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, Prefix prefix, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, modifier, prefix, Code);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, modifier, Code);
		}

		public ResourceInteractor.Composer setCode(Prefix prefix, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, prefix, Code);
		}
        			
		public ResourceInteractor.Composer setCode(CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, Code);
		}

		public ResourceInteractor.Composer setEvidence(Modifier modifier, Prefix prefix, CodeableConcept Evidence)
		{
			return setParameter(Parameters.EVIDENCE, modifier, prefix, Evidence);
		}

		public ResourceInteractor.Composer setEvidence(Modifier modifier, CodeableConcept Evidence)
		{
			return setParameter(Parameters.EVIDENCE, modifier, Evidence);
		}

		public ResourceInteractor.Composer setEvidence(Prefix prefix, CodeableConcept Evidence)
		{
			return setParameter(Parameters.EVIDENCE, prefix, Evidence);
		}
        			
		public ResourceInteractor.Composer setEvidence(CodeableConcept Evidence)
		{
			return setParameter(Parameters.EVIDENCE, Evidence);
		}

		public ResourceInteractor.Composer setIdentifier(Modifier modifier, Prefix prefix, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, modifier, prefix, Identifier);
		}

		public ResourceInteractor.Composer setIdentifier(Modifier modifier, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, modifier, Identifier);
		}

		public ResourceInteractor.Composer setIdentifier(Prefix prefix, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, prefix, Identifier);
		}
        			
		public ResourceInteractor.Composer setIdentifier(Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, Identifier);
		}

		public ResourceInteractor.Composer setOnsetAge(Modifier modifier, Prefix prefix, Quantity OnsetAge)
		{
			return setParameter(Parameters.ONSET_AGE, modifier, prefix, OnsetAge);
		}

		public ResourceInteractor.Composer setOnsetAge(Modifier modifier, Quantity OnsetAge)
		{
			return setParameter(Parameters.ONSET_AGE, modifier, OnsetAge);
		}

		public ResourceInteractor.Composer setOnsetAge(Prefix prefix, Quantity OnsetAge)
		{
			return setParameter(Parameters.ONSET_AGE, prefix, OnsetAge);
		}
        			
		public ResourceInteractor.Composer setOnsetAge(Quantity OnsetAge)
		{
			return setParameter(Parameters.ONSET_AGE, OnsetAge);
		}

		public ResourceInteractor.Composer setOnsetDate(Modifier modifier, Prefix prefix, Date OnsetDate)
		{
			return setParameter(Parameters.ONSET_DATE, modifier, prefix, OnsetDate);
		}

		public ResourceInteractor.Composer setOnsetDate(Modifier modifier, Date OnsetDate)
		{
			return setParameter(Parameters.ONSET_DATE, modifier, OnsetDate);
		}

		public ResourceInteractor.Composer setOnsetDate(Prefix prefix, Date OnsetDate)
		{
			return setParameter(Parameters.ONSET_DATE, prefix, OnsetDate);
		}
        			
		public ResourceInteractor.Composer setOnsetDate(Date OnsetDate)
		{
			return setParameter(Parameters.ONSET_DATE, OnsetDate);
		}

		public ResourceInteractor.Composer setOnsetInfo(Modifier modifier, Prefix prefix, String OnsetInfo)
		{
			return setParameter(Parameters.ONSET_INFO, modifier, prefix, OnsetInfo);
		}

		public ResourceInteractor.Composer setOnsetInfo(Modifier modifier, String OnsetInfo)
		{
			return setParameter(Parameters.ONSET_INFO, modifier, OnsetInfo);
		}

		public ResourceInteractor.Composer setOnsetInfo(Prefix prefix, String OnsetInfo)
		{
			return setParameter(Parameters.ONSET_INFO, prefix, OnsetInfo);
		}
        			
		public ResourceInteractor.Composer setOnsetInfo(String OnsetInfo)
		{
			return setParameter(Parameters.ONSET_INFO, OnsetInfo);
		}

		public ResourceInteractor.Composer setSeverity(Modifier modifier, Prefix prefix, CodeableConcept Severity)
		{
			return setParameter(Parameters.SEVERITY, modifier, prefix, Severity);
		}

		public ResourceInteractor.Composer setSeverity(Modifier modifier, CodeableConcept Severity)
		{
			return setParameter(Parameters.SEVERITY, modifier, Severity);
		}

		public ResourceInteractor.Composer setSeverity(Prefix prefix, CodeableConcept Severity)
		{
			return setParameter(Parameters.SEVERITY, prefix, Severity);
		}
        			
		public ResourceInteractor.Composer setSeverity(CodeableConcept Severity)
		{
			return setParameter(Parameters.SEVERITY, Severity);
		}

		public ResourceInteractor.Composer setStage(Modifier modifier, Prefix prefix, CodeableConcept Stage)
		{
			return setParameter(Parameters.STAGE, modifier, prefix, Stage);
		}

		public ResourceInteractor.Composer setStage(Modifier modifier, CodeableConcept Stage)
		{
			return setParameter(Parameters.STAGE, modifier, Stage);
		}

		public ResourceInteractor.Composer setStage(Prefix prefix, CodeableConcept Stage)
		{
			return setParameter(Parameters.STAGE, prefix, Stage);
		}
        			
		public ResourceInteractor.Composer setStage(CodeableConcept Stage)
		{
			return setParameter(Parameters.STAGE, Stage);
		}

		public ResourceInteractor.Composer setVerificationStatus(Modifier modifier, Prefix prefix, Condition.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, modifier, prefix, VerificationStatus);
		}

		public ResourceInteractor.Composer setVerificationStatus(Modifier modifier, Condition.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, modifier, VerificationStatus);
		}

		public ResourceInteractor.Composer setVerificationStatus(Prefix prefix, Condition.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, prefix, VerificationStatus);
		}
        			
		public ResourceInteractor.Composer setVerificationStatus(Condition.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, VerificationStatus);
		}

    }

    public static <T> ConditionInteractor.ConditionComposer Composer()
    {
        return new ConditionComposer();
    }

}