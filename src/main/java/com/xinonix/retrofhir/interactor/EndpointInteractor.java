package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Endpoint.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.EndpointService;

import com.xinonix.hl7.fhir.stu3.Endpoint;

public class EndpointInteractor extends ResourceInteractor<EndpointService, Endpoint> {

    public static class EndpointComposer extends Composer<EndpointService, Endpoint, EndpointComposer> {

        public EndpointComposer()
        {
            super((Class) EndpointService.class, (Class) Endpoint.class);
        }

		public ResourceInteractor.Composer setConnectionType(Modifier modifier, Prefix prefix, Coding ConnectionType)
		{
			return setParameter(Parameters.CONNECTION_TYPE, modifier, prefix, ConnectionType);
		}

		public ResourceInteractor.Composer setConnectionType(Modifier modifier, Coding ConnectionType)
		{
			return setParameter(Parameters.CONNECTION_TYPE, modifier, ConnectionType);
		}

		public ResourceInteractor.Composer setConnectionType(Prefix prefix, Coding ConnectionType)
		{
			return setParameter(Parameters.CONNECTION_TYPE, prefix, ConnectionType);
		}
        			
		public ResourceInteractor.Composer setConnectionType(Coding ConnectionType)
		{
			return setParameter(Parameters.CONNECTION_TYPE, ConnectionType);
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

		public ResourceInteractor.Composer setName(Modifier modifier, Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, modifier, prefix, Name);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, String Name)
		{
			return setParameter(Parameters.NAME, modifier, Name);
		}

		public ResourceInteractor.Composer setName(Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, prefix, Name);
		}
        			
		public ResourceInteractor.Composer setName(String Name)
		{
			return setParameter(Parameters.NAME, Name);
		}

		public ResourceInteractor.Composer setPayloadType(Modifier modifier, Prefix prefix, CodeableConcept PayloadType)
		{
			return setParameter(Parameters.PAYLOAD_TYPE, modifier, prefix, PayloadType);
		}

		public ResourceInteractor.Composer setPayloadType(Modifier modifier, CodeableConcept PayloadType)
		{
			return setParameter(Parameters.PAYLOAD_TYPE, modifier, PayloadType);
		}

		public ResourceInteractor.Composer setPayloadType(Prefix prefix, CodeableConcept PayloadType)
		{
			return setParameter(Parameters.PAYLOAD_TYPE, prefix, PayloadType);
		}
        			
		public ResourceInteractor.Composer setPayloadType(CodeableConcept PayloadType)
		{
			return setParameter(Parameters.PAYLOAD_TYPE, PayloadType);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Endpoint.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Endpoint.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Endpoint.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Endpoint.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> EndpointInteractor.EndpointComposer Composer()
    {
        return new EndpointComposer();
    }

}