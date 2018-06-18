package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Media.Type;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MediaService;

import com.xinonix.hl7.fhir.stu3.Media;

public class MediaInteractor extends ResourceInteractor<MediaService, Media> {

    public static class MediaComposer extends Composer<MediaService, Media, MediaComposer> {

        public MediaComposer()
        {
            super((Class) MediaService.class, (Class) Media.class);
        }

		public ResourceInteractor.Composer setCreated(Modifier modifier, Prefix prefix, Date Created)
		{
			return setParameter(Parameters.CREATED, modifier, prefix, Created);
		}

		public ResourceInteractor.Composer setCreated(Modifier modifier, Date Created)
		{
			return setParameter(Parameters.CREATED, modifier, Created);
		}

		public ResourceInteractor.Composer setCreated(Prefix prefix, Date Created)
		{
			return setParameter(Parameters.CREATED, prefix, Created);
		}
        			
		public ResourceInteractor.Composer setCreated(Date Created)
		{
			return setParameter(Parameters.CREATED, Created);
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

		public ResourceInteractor.Composer setSite(Modifier modifier, Prefix prefix, CodeableConcept Site)
		{
			return setParameter(Parameters.SITE, modifier, prefix, Site);
		}

		public ResourceInteractor.Composer setSite(Modifier modifier, CodeableConcept Site)
		{
			return setParameter(Parameters.SITE, modifier, Site);
		}

		public ResourceInteractor.Composer setSite(Prefix prefix, CodeableConcept Site)
		{
			return setParameter(Parameters.SITE, prefix, Site);
		}
        			
		public ResourceInteractor.Composer setSite(CodeableConcept Site)
		{
			return setParameter(Parameters.SITE, Site);
		}

		public ResourceInteractor.Composer setSubtype(Modifier modifier, Prefix prefix, CodeableConcept Subtype)
		{
			return setParameter(Parameters.SUBTYPE, modifier, prefix, Subtype);
		}

		public ResourceInteractor.Composer setSubtype(Modifier modifier, CodeableConcept Subtype)
		{
			return setParameter(Parameters.SUBTYPE, modifier, Subtype);
		}

		public ResourceInteractor.Composer setSubtype(Prefix prefix, CodeableConcept Subtype)
		{
			return setParameter(Parameters.SUBTYPE, prefix, Subtype);
		}
        			
		public ResourceInteractor.Composer setSubtype(CodeableConcept Subtype)
		{
			return setParameter(Parameters.SUBTYPE, Subtype);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, Media.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Media.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, Media.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(Media.Type Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setView(Modifier modifier, Prefix prefix, CodeableConcept View)
		{
			return setParameter(Parameters.VIEW, modifier, prefix, View);
		}

		public ResourceInteractor.Composer setView(Modifier modifier, CodeableConcept View)
		{
			return setParameter(Parameters.VIEW, modifier, View);
		}

		public ResourceInteractor.Composer setView(Prefix prefix, CodeableConcept View)
		{
			return setParameter(Parameters.VIEW, prefix, View);
		}
        			
		public ResourceInteractor.Composer setView(CodeableConcept View)
		{
			return setParameter(Parameters.VIEW, View);
		}

    }

    public static <T> MediaInteractor.MediaComposer Composer()
    {
        return new MediaComposer();
    }

}