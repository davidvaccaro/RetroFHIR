package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.MedicationAdministration.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MedicationAdministrationService;

import com.xinonix.hl7.fhir.stu3.MedicationAdministration;

public class MedicationAdministrationInteractor extends ResourceInteractor<MedicationAdministrationService, MedicationAdministration> {

    public static class MedicationAdministrationComposer extends Composer<MedicationAdministrationService, MedicationAdministration, MedicationAdministrationComposer> {

        public MedicationAdministrationComposer()
        {
            super((Class) MedicationAdministrationService.class, (Class) MedicationAdministration.class);
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

		public ResourceInteractor.Composer setEffectiveTime(Modifier modifier, Prefix prefix, Date EffectiveTime)
		{
			return setParameter(Parameters.EFFECTIVE_TIME, modifier, prefix, EffectiveTime);
		}

		public ResourceInteractor.Composer setEffectiveTime(Modifier modifier, Date EffectiveTime)
		{
			return setParameter(Parameters.EFFECTIVE_TIME, modifier, EffectiveTime);
		}

		public ResourceInteractor.Composer setEffectiveTime(Prefix prefix, Date EffectiveTime)
		{
			return setParameter(Parameters.EFFECTIVE_TIME, prefix, EffectiveTime);
		}
        			
		public ResourceInteractor.Composer setEffectiveTime(Date EffectiveTime)
		{
			return setParameter(Parameters.EFFECTIVE_TIME, EffectiveTime);
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

		public ResourceInteractor.Composer setNotGiven(Modifier modifier, Prefix prefix, Boolean NotGiven)
		{
			return setParameter(Parameters.NOT_GIVEN, modifier, prefix, NotGiven);
		}

		public ResourceInteractor.Composer setNotGiven(Modifier modifier, Boolean NotGiven)
		{
			return setParameter(Parameters.NOT_GIVEN, modifier, NotGiven);
		}

		public ResourceInteractor.Composer setNotGiven(Prefix prefix, Boolean NotGiven)
		{
			return setParameter(Parameters.NOT_GIVEN, prefix, NotGiven);
		}
        			
		public ResourceInteractor.Composer setNotGiven(Boolean NotGiven)
		{
			return setParameter(Parameters.NOT_GIVEN, NotGiven);
		}

		public ResourceInteractor.Composer setReasonGiven(Modifier modifier, Prefix prefix, CodeableConcept ReasonGiven)
		{
			return setParameter(Parameters.REASON_GIVEN, modifier, prefix, ReasonGiven);
		}

		public ResourceInteractor.Composer setReasonGiven(Modifier modifier, CodeableConcept ReasonGiven)
		{
			return setParameter(Parameters.REASON_GIVEN, modifier, ReasonGiven);
		}

		public ResourceInteractor.Composer setReasonGiven(Prefix prefix, CodeableConcept ReasonGiven)
		{
			return setParameter(Parameters.REASON_GIVEN, prefix, ReasonGiven);
		}
        			
		public ResourceInteractor.Composer setReasonGiven(CodeableConcept ReasonGiven)
		{
			return setParameter(Parameters.REASON_GIVEN, ReasonGiven);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, MedicationAdministration.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, MedicationAdministration.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, MedicationAdministration.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(MedicationAdministration.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> MedicationAdministrationInteractor.MedicationAdministrationComposer Composer()
    {
        return new MedicationAdministrationComposer();
    }

}