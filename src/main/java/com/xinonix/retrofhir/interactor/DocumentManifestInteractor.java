package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.DocumentManifest.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.DocumentManifestService;

import com.xinonix.hl7.fhir.stu3.DocumentManifest;

public class DocumentManifestInteractor extends ResourceInteractor<DocumentManifestService, DocumentManifest> {

    public static class DocumentManifestComposer extends Composer<DocumentManifestService, DocumentManifest, DocumentManifestComposer> {

        public DocumentManifestComposer()
        {
            super((Class) DocumentManifestService.class, (Class) DocumentManifest.class);
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

		public ResourceInteractor.Composer setDescription(Modifier modifier, Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, prefix, Description);
		}

		public ResourceInteractor.Composer setDescription(Modifier modifier, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, Description);
		}

		public ResourceInteractor.Composer setDescription(Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, prefix, Description);
		}
        			
		public ResourceInteractor.Composer setDescription(String Description)
		{
			return setParameter(Parameters.DESCRIPTION, Description);
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

		public ResourceInteractor.Composer setRelatedId(Modifier modifier, Prefix prefix, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, modifier, prefix, RelatedId);
		}

		public ResourceInteractor.Composer setRelatedId(Modifier modifier, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, modifier, RelatedId);
		}

		public ResourceInteractor.Composer setRelatedId(Prefix prefix, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, prefix, RelatedId);
		}
        			
		public ResourceInteractor.Composer setRelatedId(Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, RelatedId);
		}

		public ResourceInteractor.Composer setSource(Modifier modifier, Prefix prefix, String Source)
		{
			return setParameter(Parameters.SOURCE, modifier, prefix, Source);
		}

		public ResourceInteractor.Composer setSource(Modifier modifier, String Source)
		{
			return setParameter(Parameters.SOURCE, modifier, Source);
		}

		public ResourceInteractor.Composer setSource(Prefix prefix, String Source)
		{
			return setParameter(Parameters.SOURCE, prefix, Source);
		}
        			
		public ResourceInteractor.Composer setSource(String Source)
		{
			return setParameter(Parameters.SOURCE, Source);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, DocumentManifest.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, DocumentManifest.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, DocumentManifest.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(DocumentManifest.Status Status)
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

    public static <T> DocumentManifestInteractor.DocumentManifestComposer Composer()
    {
        return new DocumentManifestComposer();
    }

}