package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ProcedureRequestService;

import com.xinonix.hl7.fhir.stu3.ProcedureRequest;

public class ProcedureRequestInteractor extends ResourceInteractor<ProcedureRequestService, ProcedureRequest> {

    public static class ProcedureRequestComposer extends Composer<ProcedureRequestService, ProcedureRequest, ProcedureRequestComposer> {

        public ProcedureRequestComposer()
        {
            super((Class) ProcedureRequestService.class, (Class) ProcedureRequest.class);
        }

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, prefix, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, prefix, Authored);
		}
        			
		public ResourceInteractor.Composer setAuthored(Date Authored)
		{
			return setParameter(Parameters.AUTHORED, Authored);
		}

		public ResourceInteractor.Composer setBodySite(Modifier modifier, Prefix prefix, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, modifier, prefix, BodySite);
		}

		public ResourceInteractor.Composer setBodySite(Modifier modifier, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, modifier, BodySite);
		}

		public ResourceInteractor.Composer setBodySite(Prefix prefix, CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, prefix, BodySite);
		}
        			
		public ResourceInteractor.Composer setBodySite(CodeableConcept BodySite)
		{
			return setParameter(Parameters.BODY_SITE, BodySite);
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

		public ResourceInteractor.Composer setIntent(Modifier modifier, Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, prefix, Intent);
		}

		public ResourceInteractor.Composer setIntent(Modifier modifier, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, Intent);
		}

		public ResourceInteractor.Composer setIntent(Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, prefix, Intent);
		}
        			
		public ResourceInteractor.Composer setIntent(String Intent)
		{
			return setParameter(Parameters.INTENT, Intent);
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

		public ResourceInteractor.Composer setPerformerType(Modifier modifier, Prefix prefix, CodeableConcept PerformerType)
		{
			return setParameter(Parameters.PERFORMER_TYPE, modifier, prefix, PerformerType);
		}

		public ResourceInteractor.Composer setPerformerType(Modifier modifier, CodeableConcept PerformerType)
		{
			return setParameter(Parameters.PERFORMER_TYPE, modifier, PerformerType);
		}

		public ResourceInteractor.Composer setPerformerType(Prefix prefix, CodeableConcept PerformerType)
		{
			return setParameter(Parameters.PERFORMER_TYPE, prefix, PerformerType);
		}
        			
		public ResourceInteractor.Composer setPerformerType(CodeableConcept PerformerType)
		{
			return setParameter(Parameters.PERFORMER_TYPE, PerformerType);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, prefix, Priority);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, Priority);
		}

		public ResourceInteractor.Composer setPriority(Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, prefix, Priority);
		}
        			
		public ResourceInteractor.Composer setPriority(String Priority)
		{
			return setParameter(Parameters.PRIORITY, Priority);
		}

		public ResourceInteractor.Composer setRequisition(Modifier modifier, Prefix prefix, Identifier Requisition)
		{
			return setParameter(Parameters.REQUISITION, modifier, prefix, Requisition);
		}

		public ResourceInteractor.Composer setRequisition(Modifier modifier, Identifier Requisition)
		{
			return setParameter(Parameters.REQUISITION, modifier, Requisition);
		}

		public ResourceInteractor.Composer setRequisition(Prefix prefix, Identifier Requisition)
		{
			return setParameter(Parameters.REQUISITION, prefix, Requisition);
		}
        			
		public ResourceInteractor.Composer setRequisition(Identifier Requisition)
		{
			return setParameter(Parameters.REQUISITION, Requisition);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(String Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> ProcedureRequestInteractor.ProcedureRequestComposer Composer()
    {
        return new ProcedureRequestComposer();
    }

}