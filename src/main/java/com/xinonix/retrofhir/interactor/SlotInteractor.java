package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Slot.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SlotService;

import com.xinonix.hl7.fhir.stu3.Slot;

public class SlotInteractor extends ResourceInteractor<SlotService, Slot> {

    public static class SlotComposer extends Composer<SlotService, Slot, SlotComposer> {

        public SlotComposer()
        {
            super((Class) SlotService.class, (Class) Slot.class);
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

		public ResourceInteractor.Composer setSlotType(Modifier modifier, Prefix prefix, CodeableConcept SlotType)
		{
			return setParameter(Parameters.SLOT_TYPE, modifier, prefix, SlotType);
		}

		public ResourceInteractor.Composer setSlotType(Modifier modifier, CodeableConcept SlotType)
		{
			return setParameter(Parameters.SLOT_TYPE, modifier, SlotType);
		}

		public ResourceInteractor.Composer setSlotType(Prefix prefix, CodeableConcept SlotType)
		{
			return setParameter(Parameters.SLOT_TYPE, prefix, SlotType);
		}
        			
		public ResourceInteractor.Composer setSlotType(CodeableConcept SlotType)
		{
			return setParameter(Parameters.SLOT_TYPE, SlotType);
		}

		public ResourceInteractor.Composer setStart(Modifier modifier, Prefix prefix, Date Start)
		{
			return setParameter(Parameters.START, modifier, prefix, Start);
		}

		public ResourceInteractor.Composer setStart(Modifier modifier, Date Start)
		{
			return setParameter(Parameters.START, modifier, Start);
		}

		public ResourceInteractor.Composer setStart(Prefix prefix, Date Start)
		{
			return setParameter(Parameters.START, prefix, Start);
		}
        			
		public ResourceInteractor.Composer setStart(Date Start)
		{
			return setParameter(Parameters.START, Start);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Slot.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Slot.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Slot.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Slot.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> SlotInteractor.SlotComposer Composer()
    {
        return new SlotComposer();
    }

}