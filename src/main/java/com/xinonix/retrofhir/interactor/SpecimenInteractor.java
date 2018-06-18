package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Specimen.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SpecimenService;

import com.xinonix.hl7.fhir.stu3.Specimen;

public class SpecimenInteractor extends ResourceInteractor<SpecimenService, Specimen> {

    public static class SpecimenComposer extends Composer<SpecimenService, Specimen, SpecimenComposer> {

        public SpecimenComposer()
        {
            super((Class) SpecimenService.class, (Class) Specimen.class);
        }

		public ResourceInteractor.Composer setAccession(Modifier modifier, Prefix prefix, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, modifier, prefix, Accession);
		}

		public ResourceInteractor.Composer setAccession(Modifier modifier, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, modifier, Accession);
		}

		public ResourceInteractor.Composer setAccession(Prefix prefix, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, prefix, Accession);
		}
        			
		public ResourceInteractor.Composer setAccession(Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, Accession);
		}

		public ResourceInteractor.Composer setBodysite(Modifier modifier, Prefix prefix, CodeableConcept Bodysite)
		{
			return setParameter(Parameters.BODYSITE, modifier, prefix, Bodysite);
		}

		public ResourceInteractor.Composer setBodysite(Modifier modifier, CodeableConcept Bodysite)
		{
			return setParameter(Parameters.BODYSITE, modifier, Bodysite);
		}

		public ResourceInteractor.Composer setBodysite(Prefix prefix, CodeableConcept Bodysite)
		{
			return setParameter(Parameters.BODYSITE, prefix, Bodysite);
		}
        			
		public ResourceInteractor.Composer setBodysite(CodeableConcept Bodysite)
		{
			return setParameter(Parameters.BODYSITE, Bodysite);
		}

		public ResourceInteractor.Composer setCollected(Modifier modifier, Prefix prefix, Date Collected)
		{
			return setParameter(Parameters.COLLECTED, modifier, prefix, Collected);
		}

		public ResourceInteractor.Composer setCollected(Modifier modifier, Date Collected)
		{
			return setParameter(Parameters.COLLECTED, modifier, Collected);
		}

		public ResourceInteractor.Composer setCollected(Prefix prefix, Date Collected)
		{
			return setParameter(Parameters.COLLECTED, prefix, Collected);
		}
        			
		public ResourceInteractor.Composer setCollected(Date Collected)
		{
			return setParameter(Parameters.COLLECTED, Collected);
		}

		public ResourceInteractor.Composer setContainer(Modifier modifier, Prefix prefix, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, modifier, prefix, Container);
		}

		public ResourceInteractor.Composer setContainer(Modifier modifier, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, modifier, Container);
		}

		public ResourceInteractor.Composer setContainer(Prefix prefix, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, prefix, Container);
		}
        			
		public ResourceInteractor.Composer setContainer(CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, Container);
		}

		public ResourceInteractor.Composer setContainerId(Modifier modifier, Prefix prefix, Identifier ContainerId)
		{
			return setParameter(Parameters.CONTAINER_ID, modifier, prefix, ContainerId);
		}

		public ResourceInteractor.Composer setContainerId(Modifier modifier, Identifier ContainerId)
		{
			return setParameter(Parameters.CONTAINER_ID, modifier, ContainerId);
		}

		public ResourceInteractor.Composer setContainerId(Prefix prefix, Identifier ContainerId)
		{
			return setParameter(Parameters.CONTAINER_ID, prefix, ContainerId);
		}
        			
		public ResourceInteractor.Composer setContainerId(Identifier ContainerId)
		{
			return setParameter(Parameters.CONTAINER_ID, ContainerId);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Specimen.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Specimen.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Specimen.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Specimen.Status Status)
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

    public static <T> SpecimenInteractor.SpecimenComposer Composer()
    {
        return new SpecimenComposer();
    }

}