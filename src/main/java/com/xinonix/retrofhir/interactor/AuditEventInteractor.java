package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AuditEventService;

import com.xinonix.hl7.fhir.stu3.AuditEvent;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Identifier;

public class AuditEventInteractor extends ResourceInteractor<AuditEventService, AuditEvent> {

    public static class AuditEventComposer extends Composer<AuditEventService, AuditEvent, AuditEventComposer> {

        public AuditEventComposer()
        {
            super((Class) AuditEventService.class, (Class) AuditEvent.class);
        }

		public ResourceInteractor.Composer setAction(Modifier modifier, Prefix prefix, AuditEvent.Action Action)
		{
			return setParameter(Parameters.ACTION, modifier, prefix, Action);
		}

		public ResourceInteractor.Composer setAction(Modifier modifier, AuditEvent.Action Action)
		{
			return setParameter(Parameters.ACTION, modifier, Action);
		}

		public ResourceInteractor.Composer setAction(Prefix prefix, AuditEvent.Action Action)
		{
			return setParameter(Parameters.ACTION, prefix, Action);
		}
        			
		public ResourceInteractor.Composer setAction(AuditEvent.Action Action)
		{
			return setParameter(Parameters.ACTION, Action);
		}

		public ResourceInteractor.Composer setAddress(Modifier modifier, Prefix prefix, String Address)
		{
			return setParameter(Parameters.ADDRESS, modifier, prefix, Address);
		}

		public ResourceInteractor.Composer setAddress(Modifier modifier, String Address)
		{
			return setParameter(Parameters.ADDRESS, modifier, Address);
		}

		public ResourceInteractor.Composer setAddress(Prefix prefix, String Address)
		{
			return setParameter(Parameters.ADDRESS, prefix, Address);
		}
        			
		public ResourceInteractor.Composer setAddress(String Address)
		{
			return setParameter(Parameters.ADDRESS, Address);
		}

		public ResourceInteractor.Composer setAgentName(Modifier modifier, Prefix prefix, String AgentName)
		{
			return setParameter(Parameters.AGENT_NAME, modifier, prefix, AgentName);
		}

		public ResourceInteractor.Composer setAgentName(Modifier modifier, String AgentName)
		{
			return setParameter(Parameters.AGENT_NAME, modifier, AgentName);
		}

		public ResourceInteractor.Composer setAgentName(Prefix prefix, String AgentName)
		{
			return setParameter(Parameters.AGENT_NAME, prefix, AgentName);
		}
        			
		public ResourceInteractor.Composer setAgentName(String AgentName)
		{
			return setParameter(Parameters.AGENT_NAME, AgentName);
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

		public ResourceInteractor.Composer setAltid(Modifier modifier, Prefix prefix, String Altid)
		{
			return setParameter(Parameters.ALTID, modifier, prefix, Altid);
		}

		public ResourceInteractor.Composer setAltid(Modifier modifier, String Altid)
		{
			return setParameter(Parameters.ALTID, modifier, Altid);
		}

		public ResourceInteractor.Composer setAltid(Prefix prefix, String Altid)
		{
			return setParameter(Parameters.ALTID, prefix, Altid);
		}
        			
		public ResourceInteractor.Composer setAltid(String Altid)
		{
			return setParameter(Parameters.ALTID, Altid);
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

		public ResourceInteractor.Composer setEntityName(Modifier modifier, Prefix prefix, String EntityName)
		{
			return setParameter(Parameters.ENTITY_NAME, modifier, prefix, EntityName);
		}

		public ResourceInteractor.Composer setEntityName(Modifier modifier, String EntityName)
		{
			return setParameter(Parameters.ENTITY_NAME, modifier, EntityName);
		}

		public ResourceInteractor.Composer setEntityName(Prefix prefix, String EntityName)
		{
			return setParameter(Parameters.ENTITY_NAME, prefix, EntityName);
		}
        			
		public ResourceInteractor.Composer setEntityName(String EntityName)
		{
			return setParameter(Parameters.ENTITY_NAME, EntityName);
		}

		public ResourceInteractor.Composer setEntityRole(Modifier modifier, Prefix prefix, Coding EntityRole)
		{
			return setParameter(Parameters.ENTITY_ROLE, modifier, prefix, EntityRole);
		}

		public ResourceInteractor.Composer setEntityRole(Modifier modifier, Coding EntityRole)
		{
			return setParameter(Parameters.ENTITY_ROLE, modifier, EntityRole);
		}

		public ResourceInteractor.Composer setEntityRole(Prefix prefix, Coding EntityRole)
		{
			return setParameter(Parameters.ENTITY_ROLE, prefix, EntityRole);
		}
        			
		public ResourceInteractor.Composer setEntityRole(Coding EntityRole)
		{
			return setParameter(Parameters.ENTITY_ROLE, EntityRole);
		}

		public ResourceInteractor.Composer setEntityType(Modifier modifier, Prefix prefix, Coding EntityType)
		{
			return setParameter(Parameters.ENTITY_TYPE, modifier, prefix, EntityType);
		}

		public ResourceInteractor.Composer setEntityType(Modifier modifier, Coding EntityType)
		{
			return setParameter(Parameters.ENTITY_TYPE, modifier, EntityType);
		}

		public ResourceInteractor.Composer setEntityType(Prefix prefix, Coding EntityType)
		{
			return setParameter(Parameters.ENTITY_TYPE, prefix, EntityType);
		}
        			
		public ResourceInteractor.Composer setEntityType(Coding EntityType)
		{
			return setParameter(Parameters.ENTITY_TYPE, EntityType);
		}

		public ResourceInteractor.Composer setOutcome(Modifier modifier, Prefix prefix, AuditEvent.Outcome Outcome)
		{
			return setParameter(Parameters.OUTCOME, modifier, prefix, Outcome);
		}

		public ResourceInteractor.Composer setOutcome(Modifier modifier, AuditEvent.Outcome Outcome)
		{
			return setParameter(Parameters.OUTCOME, modifier, Outcome);
		}

		public ResourceInteractor.Composer setOutcome(Prefix prefix, AuditEvent.Outcome Outcome)
		{
			return setParameter(Parameters.OUTCOME, prefix, Outcome);
		}
        			
		public ResourceInteractor.Composer setOutcome(AuditEvent.Outcome Outcome)
		{
			return setParameter(Parameters.OUTCOME, Outcome);
		}

		public ResourceInteractor.Composer setPolicy(Modifier modifier, Prefix prefix, String Policy)
		{
			return setParameter(Parameters.POLICY, modifier, prefix, Policy);
		}

		public ResourceInteractor.Composer setPolicy(Modifier modifier, String Policy)
		{
			return setParameter(Parameters.POLICY, modifier, Policy);
		}

		public ResourceInteractor.Composer setPolicy(Prefix prefix, String Policy)
		{
			return setParameter(Parameters.POLICY, prefix, Policy);
		}
        			
		public ResourceInteractor.Composer setPolicy(String Policy)
		{
			return setParameter(Parameters.POLICY, Policy);
		}

		public ResourceInteractor.Composer setSite(Modifier modifier, Prefix prefix, String Site)
		{
			return setParameter(Parameters.SITE, modifier, prefix, Site);
		}

		public ResourceInteractor.Composer setSite(Modifier modifier, String Site)
		{
			return setParameter(Parameters.SITE, modifier, Site);
		}

		public ResourceInteractor.Composer setSite(Prefix prefix, String Site)
		{
			return setParameter(Parameters.SITE, prefix, Site);
		}
        			
		public ResourceInteractor.Composer setSite(String Site)
		{
			return setParameter(Parameters.SITE, Site);
		}

		public ResourceInteractor.Composer setSource(Modifier modifier, Prefix prefix, Identifier Source)
		{
			return setParameter(Parameters.SOURCE, modifier, prefix, Source);
		}

		public ResourceInteractor.Composer setSource(Modifier modifier, Identifier Source)
		{
			return setParameter(Parameters.SOURCE, modifier, Source);
		}

		public ResourceInteractor.Composer setSource(Prefix prefix, Identifier Source)
		{
			return setParameter(Parameters.SOURCE, prefix, Source);
		}
        			
		public ResourceInteractor.Composer setSource(Identifier Source)
		{
			return setParameter(Parameters.SOURCE, Source);
		}

		public ResourceInteractor.Composer setSubtype(Modifier modifier, Prefix prefix, Coding Subtype)
		{
			return setParameter(Parameters.SUBTYPE, modifier, prefix, Subtype);
		}

		public ResourceInteractor.Composer setSubtype(Modifier modifier, Coding Subtype)
		{
			return setParameter(Parameters.SUBTYPE, modifier, Subtype);
		}

		public ResourceInteractor.Composer setSubtype(Prefix prefix, Coding Subtype)
		{
			return setParameter(Parameters.SUBTYPE, prefix, Subtype);
		}
        			
		public ResourceInteractor.Composer setSubtype(Coding Subtype)
		{
			return setParameter(Parameters.SUBTYPE, Subtype);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, Coding Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Coding Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, Coding Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(Coding Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setUser(Modifier modifier, Prefix prefix, Identifier User)
		{
			return setParameter(Parameters.USER, modifier, prefix, User);
		}

		public ResourceInteractor.Composer setUser(Modifier modifier, Identifier User)
		{
			return setParameter(Parameters.USER, modifier, User);
		}

		public ResourceInteractor.Composer setUser(Prefix prefix, Identifier User)
		{
			return setParameter(Parameters.USER, prefix, User);
		}
        			
		public ResourceInteractor.Composer setUser(Identifier User)
		{
			return setParameter(Parameters.USER, User);
		}



    }

    public static <T> AuditEventInteractor.AuditEventComposer Composer()
    {
        return new AuditEventComposer();
    }

}