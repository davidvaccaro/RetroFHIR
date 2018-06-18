package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ImmunizationService;

import com.xinonix.hl7.fhir.stu3.Immunization;

public class ImmunizationInteractor extends ResourceInteractor<ImmunizationService, Immunization> {

    public static class ImmunizationComposer extends Composer<ImmunizationService, Immunization, ImmunizationComposer> {

        public ImmunizationComposer()
        {
            super((Class) ImmunizationService.class, (Class) Immunization.class);
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

		public ResourceInteractor.Composer setLotNumber(Modifier modifier, Prefix prefix, String LotNumber)
		{
			return setParameter(Parameters.LOT_NUMBER, modifier, prefix, LotNumber);
		}

		public ResourceInteractor.Composer setLotNumber(Modifier modifier, String LotNumber)
		{
			return setParameter(Parameters.LOT_NUMBER, modifier, LotNumber);
		}

		public ResourceInteractor.Composer setLotNumber(Prefix prefix, String LotNumber)
		{
			return setParameter(Parameters.LOT_NUMBER, prefix, LotNumber);
		}
        			
		public ResourceInteractor.Composer setLotNumber(String LotNumber)
		{
			return setParameter(Parameters.LOT_NUMBER, LotNumber);
		}

		public ResourceInteractor.Composer setNotgiven(Modifier modifier, Prefix prefix, Boolean Notgiven)
		{
			return setParameter(Parameters.NOTGIVEN, modifier, prefix, Notgiven);
		}

		public ResourceInteractor.Composer setNotgiven(Modifier modifier, Boolean Notgiven)
		{
			return setParameter(Parameters.NOTGIVEN, modifier, Notgiven);
		}

		public ResourceInteractor.Composer setNotgiven(Prefix prefix, Boolean Notgiven)
		{
			return setParameter(Parameters.NOTGIVEN, prefix, Notgiven);
		}
        			
		public ResourceInteractor.Composer setNotgiven(Boolean Notgiven)
		{
			return setParameter(Parameters.NOTGIVEN, Notgiven);
		}

		public ResourceInteractor.Composer setReactionDate(Modifier modifier, Prefix prefix, Date ReactionDate)
		{
			return setParameter(Parameters.REACTION_DATE, modifier, prefix, ReactionDate);
		}

		public ResourceInteractor.Composer setReactionDate(Modifier modifier, Date ReactionDate)
		{
			return setParameter(Parameters.REACTION_DATE, modifier, ReactionDate);
		}

		public ResourceInteractor.Composer setReactionDate(Prefix prefix, Date ReactionDate)
		{
			return setParameter(Parameters.REACTION_DATE, prefix, ReactionDate);
		}
        			
		public ResourceInteractor.Composer setReactionDate(Date ReactionDate)
		{
			return setParameter(Parameters.REACTION_DATE, ReactionDate);
		}

		public ResourceInteractor.Composer setReason(Modifier modifier, Prefix prefix, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, modifier, prefix, Reason);
		}

		public ResourceInteractor.Composer setReason(Modifier modifier, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, modifier, Reason);
		}

		public ResourceInteractor.Composer setReason(Prefix prefix, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, prefix, Reason);
		}
        			
		public ResourceInteractor.Composer setReason(CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, Reason);
		}

		public ResourceInteractor.Composer setReasonNotGiven(Modifier modifier, Prefix prefix, CodeableConcept ReasonNotGiven)
		{
			return setParameter(Parameters.REASON_NOT_GIVEN, modifier, prefix, ReasonNotGiven);
		}

		public ResourceInteractor.Composer setReasonNotGiven(Modifier modifier, CodeableConcept ReasonNotGiven)
		{
			return setParameter(Parameters.REASON_NOT_GIVEN, modifier, ReasonNotGiven);
		}

		public ResourceInteractor.Composer setReasonNotGiven(Prefix prefix, CodeableConcept ReasonNotGiven)
		{
			return setParameter(Parameters.REASON_NOT_GIVEN, prefix, ReasonNotGiven);
		}
        			
		public ResourceInteractor.Composer setReasonNotGiven(CodeableConcept ReasonNotGiven)
		{
			return setParameter(Parameters.REASON_NOT_GIVEN, ReasonNotGiven);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(String Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setVaccineCode(Modifier modifier, Prefix prefix, CodeableConcept VaccineCode)
		{
			return setParameter(Parameters.VACCINE_CODE, modifier, prefix, VaccineCode);
		}

		public ResourceInteractor.Composer setVaccineCode(Modifier modifier, CodeableConcept VaccineCode)
		{
			return setParameter(Parameters.VACCINE_CODE, modifier, VaccineCode);
		}

		public ResourceInteractor.Composer setVaccineCode(Prefix prefix, CodeableConcept VaccineCode)
		{
			return setParameter(Parameters.VACCINE_CODE, prefix, VaccineCode);
		}
        			
		public ResourceInteractor.Composer setVaccineCode(CodeableConcept VaccineCode)
		{
			return setParameter(Parameters.VACCINE_CODE, VaccineCode);
		}

    }

    public static <T> ImmunizationInteractor.ImmunizationComposer Composer()
    {
        return new ImmunizationComposer();
    }

}