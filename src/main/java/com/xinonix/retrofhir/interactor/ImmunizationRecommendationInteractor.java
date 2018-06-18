package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ImmunizationRecommendationService;

import com.xinonix.hl7.fhir.stu3.ImmunizationRecommendation;

public class ImmunizationRecommendationInteractor extends ResourceInteractor<ImmunizationRecommendationService, ImmunizationRecommendation> {

    public static class ImmunizationRecommendationComposer extends Composer<ImmunizationRecommendationService, ImmunizationRecommendation, ImmunizationRecommendationComposer> {

        public ImmunizationRecommendationComposer()
        {
            super((Class) ImmunizationRecommendationService.class, (Class) ImmunizationRecommendation.class);
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

		public ResourceInteractor.Composer setDoseNumber(Modifier modifier, Prefix prefix, Double DoseNumber)
		{
			return setParameter(Parameters.DOSE_NUMBER, modifier, prefix, DoseNumber);
		}

		public ResourceInteractor.Composer setDoseNumber(Modifier modifier, Double DoseNumber)
		{
			return setParameter(Parameters.DOSE_NUMBER, modifier, DoseNumber);
		}

		public ResourceInteractor.Composer setDoseNumber(Prefix prefix, Double DoseNumber)
		{
			return setParameter(Parameters.DOSE_NUMBER, prefix, DoseNumber);
		}
        			
		public ResourceInteractor.Composer setDoseNumber(Double DoseNumber)
		{
			return setParameter(Parameters.DOSE_NUMBER, DoseNumber);
		}

		public ResourceInteractor.Composer setDoseSequence(Modifier modifier, Prefix prefix, Double DoseSequence)
		{
			return setParameter(Parameters.DOSE_SEQUENCE, modifier, prefix, DoseSequence);
		}

		public ResourceInteractor.Composer setDoseSequence(Modifier modifier, Double DoseSequence)
		{
			return setParameter(Parameters.DOSE_SEQUENCE, modifier, DoseSequence);
		}

		public ResourceInteractor.Composer setDoseSequence(Prefix prefix, Double DoseSequence)
		{
			return setParameter(Parameters.DOSE_SEQUENCE, prefix, DoseSequence);
		}
        			
		public ResourceInteractor.Composer setDoseSequence(Double DoseSequence)
		{
			return setParameter(Parameters.DOSE_SEQUENCE, DoseSequence);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, CodeableConcept Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, CodeableConcept Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, CodeableConcept Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(CodeableConcept Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTargetDisease(Modifier modifier, Prefix prefix, CodeableConcept TargetDisease)
		{
			return setParameter(Parameters.TARGET_DISEASE, modifier, prefix, TargetDisease);
		}

		public ResourceInteractor.Composer setTargetDisease(Modifier modifier, CodeableConcept TargetDisease)
		{
			return setParameter(Parameters.TARGET_DISEASE, modifier, TargetDisease);
		}

		public ResourceInteractor.Composer setTargetDisease(Prefix prefix, CodeableConcept TargetDisease)
		{
			return setParameter(Parameters.TARGET_DISEASE, prefix, TargetDisease);
		}
        			
		public ResourceInteractor.Composer setTargetDisease(CodeableConcept TargetDisease)
		{
			return setParameter(Parameters.TARGET_DISEASE, TargetDisease);
		}

		public ResourceInteractor.Composer setVaccineType(Modifier modifier, Prefix prefix, CodeableConcept VaccineType)
		{
			return setParameter(Parameters.VACCINE_TYPE, modifier, prefix, VaccineType);
		}

		public ResourceInteractor.Composer setVaccineType(Modifier modifier, CodeableConcept VaccineType)
		{
			return setParameter(Parameters.VACCINE_TYPE, modifier, VaccineType);
		}

		public ResourceInteractor.Composer setVaccineType(Prefix prefix, CodeableConcept VaccineType)
		{
			return setParameter(Parameters.VACCINE_TYPE, prefix, VaccineType);
		}
        			
		public ResourceInteractor.Composer setVaccineType(CodeableConcept VaccineType)
		{
			return setParameter(Parameters.VACCINE_TYPE, VaccineType);
		}

    }

    public static <T> ImmunizationRecommendationInteractor.ImmunizationRecommendationComposer Composer()
    {
        return new ImmunizationRecommendationComposer();
    }

}