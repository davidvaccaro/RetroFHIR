package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Encounter.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.EncounterService;

import com.xinonix.hl7.fhir.stu3.Encounter;

public class EncounterInteractor extends ResourceInteractor<EncounterService, Encounter> {

    public static class EncounterComposer extends Composer<EncounterService, Encounter, EncounterComposer> {

        public EncounterComposer()
        {
            super((Class) EncounterService.class, (Class) Encounter.class);
        }

		public ResourceInteractor.Composer setClass(Modifier modifier, Prefix prefix, Coding Class)
		{
			return setParameter(Parameters.CLASS, modifier, prefix, Class);
		}

		public ResourceInteractor.Composer setClass(Modifier modifier, Coding Class)
		{
			return setParameter(Parameters.CLASS, modifier, Class);
		}

		public ResourceInteractor.Composer setClass(Prefix prefix, Coding Class)
		{
			return setParameter(Parameters.CLASS, prefix, Class);
		}
        			
		public ResourceInteractor.Composer setClass(Coding Class)
		{
			return setParameter(Parameters.CLASS, Class);
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

		public ResourceInteractor.Composer setLength(Modifier modifier, Prefix prefix, Double Length)
		{
			return setParameter(Parameters.LENGTH, modifier, prefix, Length);
		}

		public ResourceInteractor.Composer setLength(Modifier modifier, Double Length)
		{
			return setParameter(Parameters.LENGTH, modifier, Length);
		}

		public ResourceInteractor.Composer setLength(Prefix prefix, Double Length)
		{
			return setParameter(Parameters.LENGTH, prefix, Length);
		}
        			
		public ResourceInteractor.Composer setLength(Double Length)
		{
			return setParameter(Parameters.LENGTH, Length);
		}

		public ResourceInteractor.Composer setLocationPeriod(Modifier modifier, Prefix prefix, Date LocationPeriod)
		{
			return setParameter(Parameters.LOCATION_PERIOD, modifier, prefix, LocationPeriod);
		}

		public ResourceInteractor.Composer setLocationPeriod(Modifier modifier, Date LocationPeriod)
		{
			return setParameter(Parameters.LOCATION_PERIOD, modifier, LocationPeriod);
		}

		public ResourceInteractor.Composer setLocationPeriod(Prefix prefix, Date LocationPeriod)
		{
			return setParameter(Parameters.LOCATION_PERIOD, prefix, LocationPeriod);
		}
        			
		public ResourceInteractor.Composer setLocationPeriod(Date LocationPeriod)
		{
			return setParameter(Parameters.LOCATION_PERIOD, LocationPeriod);
		}

		public ResourceInteractor.Composer setParticipantType(Modifier modifier, Prefix prefix, CodeableConcept ParticipantType)
		{
			return setParameter(Parameters.PARTICIPANT_TYPE, modifier, prefix, ParticipantType);
		}

		public ResourceInteractor.Composer setParticipantType(Modifier modifier, CodeableConcept ParticipantType)
		{
			return setParameter(Parameters.PARTICIPANT_TYPE, modifier, ParticipantType);
		}

		public ResourceInteractor.Composer setParticipantType(Prefix prefix, CodeableConcept ParticipantType)
		{
			return setParameter(Parameters.PARTICIPANT_TYPE, prefix, ParticipantType);
		}
        			
		public ResourceInteractor.Composer setParticipantType(CodeableConcept ParticipantType)
		{
			return setParameter(Parameters.PARTICIPANT_TYPE, ParticipantType);
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

		public ResourceInteractor.Composer setSpecialArrangement(Modifier modifier, Prefix prefix, CodeableConcept SpecialArrangement)
		{
			return setParameter(Parameters.SPECIAL_ARRANGEMENT, modifier, prefix, SpecialArrangement);
		}

		public ResourceInteractor.Composer setSpecialArrangement(Modifier modifier, CodeableConcept SpecialArrangement)
		{
			return setParameter(Parameters.SPECIAL_ARRANGEMENT, modifier, SpecialArrangement);
		}

		public ResourceInteractor.Composer setSpecialArrangement(Prefix prefix, CodeableConcept SpecialArrangement)
		{
			return setParameter(Parameters.SPECIAL_ARRANGEMENT, prefix, SpecialArrangement);
		}
        			
		public ResourceInteractor.Composer setSpecialArrangement(CodeableConcept SpecialArrangement)
		{
			return setParameter(Parameters.SPECIAL_ARRANGEMENT, SpecialArrangement);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Encounter.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Encounter.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Encounter.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Encounter.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

    }

    public static <T> EncounterInteractor.EncounterComposer Composer()
    {
        return new EncounterComposer();
    }

}