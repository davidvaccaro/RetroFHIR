package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ProvenanceService;

import com.xinonix.hl7.fhir.stu3.Provenance;

public class ProvenanceInteractor extends ResourceInteractor<ProvenanceService, Provenance> {

    public static class ProvenanceComposer extends Composer<ProvenanceService, Provenance, ProvenanceComposer> {

        public ProvenanceComposer()
        {
            super((Class) ProvenanceService.class, (Class) Provenance.class);
        }

		public ResourceInteractor.Composer setAgentRole(Modifier modifier, Prefix prefix, CodeableConcept AgentRole)
		{
			return setParameter(Parameters.AGENT_ROLE, modifier, prefix, AgentRole);
		}

		public ResourceInteractor.Composer setAgentRole(Modifier modifier, CodeableConcept AgentRole)
		{
			return setParameter(Parameters.AGENT_ROLE, modifier, AgentRole);
		}

		public ResourceInteractor.Composer setAgentRole(Prefix prefix, CodeableConcept AgentRole)
		{
			return setParameter(Parameters.AGENT_ROLE, prefix, AgentRole);
		}
        			
		public ResourceInteractor.Composer setAgentRole(CodeableConcept AgentRole)
		{
			return setParameter(Parameters.AGENT_ROLE, AgentRole);
		}

		public ResourceInteractor.Composer setEnd(Modifier modifier, Prefix prefix, Date End)
		{
			return setParameter(Parameters.END, modifier, prefix, End);
		}

		public ResourceInteractor.Composer setEnd(Modifier modifier, Date End)
		{
			return setParameter(Parameters.END, modifier, End);
		}

		public ResourceInteractor.Composer setEnd(Prefix prefix, Date End)
		{
			return setParameter(Parameters.END, prefix, End);
		}
        			
		public ResourceInteractor.Composer setEnd(Date End)
		{
			return setParameter(Parameters.END, End);
		}

		public ResourceInteractor.Composer setEntityId(Modifier modifier, Prefix prefix, Identifier EntityId)
		{
			return setParameter(Parameters.ENTITY_ID, modifier, prefix, EntityId);
		}

		public ResourceInteractor.Composer setEntityId(Modifier modifier, Identifier EntityId)
		{
			return setParameter(Parameters.ENTITY_ID, modifier, EntityId);
		}

		public ResourceInteractor.Composer setEntityId(Prefix prefix, Identifier EntityId)
		{
			return setParameter(Parameters.ENTITY_ID, prefix, EntityId);
		}
        			
		public ResourceInteractor.Composer setEntityId(Identifier EntityId)
		{
			return setParameter(Parameters.ENTITY_ID, EntityId);
		}

		public ResourceInteractor.Composer setRecorded(Modifier modifier, Prefix prefix, Date Recorded)
		{
			return setParameter(Parameters.RECORDED, modifier, prefix, Recorded);
		}

		public ResourceInteractor.Composer setRecorded(Modifier modifier, Date Recorded)
		{
			return setParameter(Parameters.RECORDED, modifier, Recorded);
		}

		public ResourceInteractor.Composer setRecorded(Prefix prefix, Date Recorded)
		{
			return setParameter(Parameters.RECORDED, prefix, Recorded);
		}
        			
		public ResourceInteractor.Composer setRecorded(Date Recorded)
		{
			return setParameter(Parameters.RECORDED, Recorded);
		}

		public ResourceInteractor.Composer setSignatureType(Modifier modifier, Prefix prefix, Coding SignatureType)
		{
			return setParameter(Parameters.SIGNATURE_TYPE, modifier, prefix, SignatureType);
		}

		public ResourceInteractor.Composer setSignatureType(Modifier modifier, Coding SignatureType)
		{
			return setParameter(Parameters.SIGNATURE_TYPE, modifier, SignatureType);
		}

		public ResourceInteractor.Composer setSignatureType(Prefix prefix, Coding SignatureType)
		{
			return setParameter(Parameters.SIGNATURE_TYPE, prefix, SignatureType);
		}
        			
		public ResourceInteractor.Composer setSignatureType(Coding SignatureType)
		{
			return setParameter(Parameters.SIGNATURE_TYPE, SignatureType);
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

    }

    public static <T> ProvenanceInteractor.ProvenanceComposer Composer()
    {
        return new ProvenanceComposer();
    }

}