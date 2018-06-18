package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Quantity;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ChargeItemService;

import com.xinonix.hl7.fhir.stu3.ChargeItem;

public class ChargeItemInteractor extends ResourceInteractor<ChargeItemService, ChargeItem> {

    public static class ChargeItemComposer extends Composer<ChargeItemService, ChargeItem, ChargeItemComposer> {

        public ChargeItemComposer()
        {
            super((Class) ChargeItemService.class, (Class) ChargeItem.class);
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

		public ResourceInteractor.Composer setEnteredDate(Modifier modifier, Prefix prefix, Date EnteredDate)
		{
			return setParameter(Parameters.ENTERED_DATE, modifier, prefix, EnteredDate);
		}

		public ResourceInteractor.Composer setEnteredDate(Modifier modifier, Date EnteredDate)
		{
			return setParameter(Parameters.ENTERED_DATE, modifier, EnteredDate);
		}

		public ResourceInteractor.Composer setEnteredDate(Prefix prefix, Date EnteredDate)
		{
			return setParameter(Parameters.ENTERED_DATE, prefix, EnteredDate);
		}
        			
		public ResourceInteractor.Composer setEnteredDate(Date EnteredDate)
		{
			return setParameter(Parameters.ENTERED_DATE, EnteredDate);
		}

		public ResourceInteractor.Composer setFactorOverride(Modifier modifier, Prefix prefix, Double FactorOverride)
		{
			return setParameter(Parameters.FACTOR_OVERRIDE, modifier, prefix, FactorOverride);
		}

		public ResourceInteractor.Composer setFactorOverride(Modifier modifier, Double FactorOverride)
		{
			return setParameter(Parameters.FACTOR_OVERRIDE, modifier, FactorOverride);
		}

		public ResourceInteractor.Composer setFactorOverride(Prefix prefix, Double FactorOverride)
		{
			return setParameter(Parameters.FACTOR_OVERRIDE, prefix, FactorOverride);
		}
        			
		public ResourceInteractor.Composer setFactorOverride(Double FactorOverride)
		{
			return setParameter(Parameters.FACTOR_OVERRIDE, FactorOverride);
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

		public ResourceInteractor.Composer setOccurrence(Modifier modifier, Prefix prefix, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, modifier, prefix, Occurrence);
		}

		public ResourceInteractor.Composer setOccurrence(Modifier modifier, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, modifier, Occurrence);
		}

		public ResourceInteractor.Composer setOccurrence(Prefix prefix, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, prefix, Occurrence);
		}
        			
		public ResourceInteractor.Composer setOccurrence(Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, Occurrence);
		}

		public ResourceInteractor.Composer setParticipantRole(Modifier modifier, Prefix prefix, CodeableConcept ParticipantRole)
		{
			return setParameter(Parameters.PARTICIPANT_ROLE, modifier, prefix, ParticipantRole);
		}

		public ResourceInteractor.Composer setParticipantRole(Modifier modifier, CodeableConcept ParticipantRole)
		{
			return setParameter(Parameters.PARTICIPANT_ROLE, modifier, ParticipantRole);
		}

		public ResourceInteractor.Composer setParticipantRole(Prefix prefix, CodeableConcept ParticipantRole)
		{
			return setParameter(Parameters.PARTICIPANT_ROLE, prefix, ParticipantRole);
		}
        			
		public ResourceInteractor.Composer setParticipantRole(CodeableConcept ParticipantRole)
		{
			return setParameter(Parameters.PARTICIPANT_ROLE, ParticipantRole);
		}

		public ResourceInteractor.Composer setPriceOverride(Modifier modifier, Prefix prefix, Quantity PriceOverride)
		{
			return setParameter(Parameters.PRICE_OVERRIDE, modifier, prefix, PriceOverride);
		}

		public ResourceInteractor.Composer setPriceOverride(Modifier modifier, Quantity PriceOverride)
		{
			return setParameter(Parameters.PRICE_OVERRIDE, modifier, PriceOverride);
		}

		public ResourceInteractor.Composer setPriceOverride(Prefix prefix, Quantity PriceOverride)
		{
			return setParameter(Parameters.PRICE_OVERRIDE, prefix, PriceOverride);
		}
        			
		public ResourceInteractor.Composer setPriceOverride(Quantity PriceOverride)
		{
			return setParameter(Parameters.PRICE_OVERRIDE, PriceOverride);
		}

		public ResourceInteractor.Composer setQuantity(Modifier modifier, Prefix prefix, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, modifier, prefix, Quantity);
		}

		public ResourceInteractor.Composer setQuantity(Modifier modifier, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, modifier, Quantity);
		}

		public ResourceInteractor.Composer setQuantity(Prefix prefix, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, prefix, Quantity);
		}
        			
		public ResourceInteractor.Composer setQuantity(Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, Quantity);
		}

    }

    public static <T> ChargeItemInteractor.ChargeItemComposer Composer()
    {
        return new ChargeItemComposer();
    }

}