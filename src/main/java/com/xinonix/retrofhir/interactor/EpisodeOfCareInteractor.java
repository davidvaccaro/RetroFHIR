package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.EpisodeOfCare.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.EpisodeOfCareService;

import com.xinonix.hl7.fhir.stu3.EpisodeOfCare;

public class EpisodeOfCareInteractor extends ResourceInteractor<EpisodeOfCareService, EpisodeOfCare> {

    public static class EpisodeOfCareComposer extends Composer<EpisodeOfCareService, EpisodeOfCare, EpisodeOfCareComposer> {

        public EpisodeOfCareComposer()
        {
            super((Class) EpisodeOfCareService.class, (Class) EpisodeOfCare.class);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, EpisodeOfCare.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, EpisodeOfCare.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, EpisodeOfCare.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(EpisodeOfCare.Status Status)
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

    public static <T> EpisodeOfCareInteractor.EpisodeOfCareComposer Composer()
    {
        return new EpisodeOfCareComposer();
    }

}