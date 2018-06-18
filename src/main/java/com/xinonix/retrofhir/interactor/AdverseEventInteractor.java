package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AdverseEventService;

import com.xinonix.hl7.fhir.stu3.AdverseEvent;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;

public class AdverseEventInteractor extends ResourceInteractor<AdverseEventService, AdverseEvent> {

    public static class AdverseEventComposer extends Composer<AdverseEventService, AdverseEvent, AdverseEventComposer> {

        public AdverseEventComposer()
        {
            super((Class) AdverseEventService.class, (Class) AdverseEvent.class);
        }

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, AdverseEvent.Category Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, AdverseEvent.Category Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, AdverseEvent.Category Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(AdverseEvent.Category Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
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

		public ResourceInteractor.Composer setSeriousness(Modifier modifier, Prefix prefix, CodeableConcept Seriousness)
		{
			return setParameter(Parameters.SERIOUSNESS, modifier, prefix, Seriousness);
		}

		public ResourceInteractor.Composer setSeriousness(Modifier modifier, CodeableConcept Seriousness)
		{
			return setParameter(Parameters.SERIOUSNESS, modifier, Seriousness);
		}

		public ResourceInteractor.Composer setSeriousness(Prefix prefix, CodeableConcept Seriousness)
		{
			return setParameter(Parameters.SERIOUSNESS, prefix, Seriousness);
		}
        			
		public ResourceInteractor.Composer setSeriousness(CodeableConcept Seriousness)
		{
			return setParameter(Parameters.SERIOUSNESS, Seriousness);
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

    public static <T> AdverseEventInteractor.AdverseEventComposer Composer()
    {
        return new AdverseEventComposer();
    }

}