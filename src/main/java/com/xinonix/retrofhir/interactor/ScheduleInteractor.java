package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ScheduleService;

import com.xinonix.hl7.fhir.stu3.Schedule;

public class ScheduleInteractor extends ResourceInteractor<ScheduleService, Schedule> {

    public static class ScheduleComposer extends Composer<ScheduleService, Schedule, ScheduleComposer> {

        public ScheduleComposer()
        {
            super((Class) ScheduleService.class, (Class) Schedule.class);
        }

		public ResourceInteractor.Composer setActive(Modifier modifier, Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, prefix, Active);
		}

		public ResourceInteractor.Composer setActive(Modifier modifier, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, Active);
		}

		public ResourceInteractor.Composer setActive(Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, prefix, Active);
		}
        			
		public ResourceInteractor.Composer setActive(Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, Active);
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

    public static <T> ScheduleInteractor.ScheduleComposer Composer()
    {
        return new ScheduleComposer();
    }

}