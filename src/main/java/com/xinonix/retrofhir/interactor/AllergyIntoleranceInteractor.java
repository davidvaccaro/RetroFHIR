package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AllergyIntoleranceService;

import com.xinonix.hl7.fhir.stu3.AllergyIntolerance;
import com.xinonix.hl7.fhir.stu3.AllergyIntoleranceReaction;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

public class AllergyIntoleranceInteractor extends ResourceInteractor<AllergyIntoleranceService, AllergyIntolerance> {

    public static class AllergyIntoleranceComposer extends Composer<AllergyIntoleranceService, AllergyIntolerance, AllergyIntoleranceComposer> {

        public AllergyIntoleranceComposer()
        {
            super((Class) AllergyIntoleranceService.class, (Class) AllergyIntolerance.class);
        }

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, String Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, String Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, String Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(String Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
		}

		public ResourceInteractor.Composer setClinicalStatus(Modifier modifier, Prefix prefix, AllergyIntolerance.ClinicalStatus ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, modifier, prefix, ClinicalStatus);
		}

		public ResourceInteractor.Composer setClinicalStatus(Modifier modifier, AllergyIntolerance.ClinicalStatus ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, modifier, ClinicalStatus);
		}

		public ResourceInteractor.Composer setClinicalStatus(Prefix prefix, AllergyIntolerance.ClinicalStatus ClinicalStatus)
		{
			return setParameter(Parameters.CLINICAL_STATUS, prefix, ClinicalStatus);
		}
        			
		public ResourceInteractor.Composer setClinicalStatus(AllergyIntolerance.ClinicalStatus ClinicalStatus)
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

		public ResourceInteractor.Composer setCriticality(Modifier modifier, Prefix prefix, AllergyIntolerance.Criticality Criticality)
		{
			return setParameter(Parameters.CRITICALITY, modifier, prefix, Criticality);
		}

		public ResourceInteractor.Composer setCriticality(Modifier modifier, AllergyIntolerance.Criticality Criticality)
		{
			return setParameter(Parameters.CRITICALITY, modifier, Criticality);
		}

		public ResourceInteractor.Composer setCriticality(Prefix prefix, AllergyIntolerance.Criticality Criticality)
		{
			return setParameter(Parameters.CRITICALITY, prefix, Criticality);
		}
        			
		public ResourceInteractor.Composer setCriticality(AllergyIntolerance.Criticality Criticality)
		{
			return setParameter(Parameters.CRITICALITY, Criticality);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, prefix, Date);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, Date);
		}

		public ResourceInteractor.Composer setDate(Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, prefix, Date);
		}
        			
		public ResourceInteractor.Composer setDate(Date Date)
		{
			return setParameter(Parameters.DATE, Date);
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

		public ResourceInteractor.Composer setLastDate(Modifier modifier, Prefix prefix, Date LastDate)
		{
			return setParameter(Parameters.LAST_DATE, modifier, prefix, LastDate);
		}

		public ResourceInteractor.Composer setLastDate(Modifier modifier, Date LastDate)
		{
			return setParameter(Parameters.LAST_DATE, modifier, LastDate);
		}

		public ResourceInteractor.Composer setLastDate(Prefix prefix, Date LastDate)
		{
			return setParameter(Parameters.LAST_DATE, prefix, LastDate);
		}
        			
		public ResourceInteractor.Composer setLastDate(Date LastDate)
		{
			return setParameter(Parameters.LAST_DATE, LastDate);
		}

		public ResourceInteractor.Composer setManifestation(Modifier modifier, Prefix prefix, CodeableConcept Manifestation)
		{
			return setParameter(Parameters.MANIFESTATION, modifier, prefix, Manifestation);
		}

		public ResourceInteractor.Composer setManifestation(Modifier modifier, CodeableConcept Manifestation)
		{
			return setParameter(Parameters.MANIFESTATION, modifier, Manifestation);
		}

		public ResourceInteractor.Composer setManifestation(Prefix prefix, CodeableConcept Manifestation)
		{
			return setParameter(Parameters.MANIFESTATION, prefix, Manifestation);
		}
        			
		public ResourceInteractor.Composer setManifestation(CodeableConcept Manifestation)
		{
			return setParameter(Parameters.MANIFESTATION, Manifestation);
		}

		public ResourceInteractor.Composer setOnset(Modifier modifier, Prefix prefix, Date Onset)
		{
			return setParameter(Parameters.ONSET, modifier, prefix, Onset);
		}

		public ResourceInteractor.Composer setOnset(Modifier modifier, Date Onset)
		{
			return setParameter(Parameters.ONSET, modifier, Onset);
		}

		public ResourceInteractor.Composer setOnset(Prefix prefix, Date Onset)
		{
			return setParameter(Parameters.ONSET, prefix, Onset);
		}
        			
		public ResourceInteractor.Composer setOnset(Date Onset)
		{
			return setParameter(Parameters.ONSET, Onset);
		}

		public ResourceInteractor.Composer setRoute(Modifier modifier, Prefix prefix, CodeableConcept Route)
		{
			return setParameter(Parameters.ROUTE, modifier, prefix, Route);
		}

		public ResourceInteractor.Composer setRoute(Modifier modifier, CodeableConcept Route)
		{
			return setParameter(Parameters.ROUTE, modifier, Route);
		}

		public ResourceInteractor.Composer setRoute(Prefix prefix, CodeableConcept Route)
		{
			return setParameter(Parameters.ROUTE, prefix, Route);
		}
        			
		public ResourceInteractor.Composer setRoute(CodeableConcept Route)
		{
			return setParameter(Parameters.ROUTE, Route);
		}

		public ResourceInteractor.Composer setSeverity(Modifier modifier, Prefix prefix, AllergyIntoleranceReaction.Severity Severity)
		{
			return setParameter(Parameters.SEVERITY, modifier, prefix, Severity);
		}

		public ResourceInteractor.Composer setSeverity(Modifier modifier, AllergyIntoleranceReaction.Severity Severity)
		{
			return setParameter(Parameters.SEVERITY, modifier, Severity);
		}

		public ResourceInteractor.Composer setSeverity(Prefix prefix, AllergyIntoleranceReaction.Severity Severity)
		{
			return setParameter(Parameters.SEVERITY, prefix, Severity);
		}
        			
		public ResourceInteractor.Composer setSeverity(AllergyIntoleranceReaction.Severity Severity)
		{
			return setParameter(Parameters.SEVERITY, Severity);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, AllergyIntolerance.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, AllergyIntolerance.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, AllergyIntolerance.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(AllergyIntolerance.Type Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setVerificationStatus(Modifier modifier, Prefix prefix, AllergyIntolerance.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, modifier, prefix, VerificationStatus);
		}

		public ResourceInteractor.Composer setVerificationStatus(Modifier modifier, AllergyIntolerance.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, modifier, VerificationStatus);
		}

		public ResourceInteractor.Composer setVerificationStatus(Prefix prefix, AllergyIntolerance.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, prefix, VerificationStatus);
		}
        			
		public ResourceInteractor.Composer setVerificationStatus(AllergyIntolerance.VerificationStatus VerificationStatus)
		{
			return setParameter(Parameters.VERIFICATION_STATUS, VerificationStatus);
		}

    }

    public static <T> AllergyIntoleranceInteractor.AllergyIntoleranceComposer Composer()
    {
        return new AllergyIntoleranceComposer();
    }

}