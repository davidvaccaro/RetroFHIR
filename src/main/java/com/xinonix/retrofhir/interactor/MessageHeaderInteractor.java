package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.MessageHeaderResponse;
import com.xinonix.hl7.fhir.stu3.MessageHeaderResponse.Code;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MessageHeaderService;

import com.xinonix.hl7.fhir.stu3.MessageHeader;

public class MessageHeaderInteractor extends ResourceInteractor<MessageHeaderService, MessageHeader> {

    public static class MessageHeaderComposer extends Composer<MessageHeaderService, MessageHeader, MessageHeaderComposer> {

        public MessageHeaderComposer()
        {
            super((Class) MessageHeaderService.class, (Class) MessageHeader.class);
        }

		public ResourceInteractor.Composer setCode(Modifier modifier, Prefix prefix, MessageHeaderResponse.Code Code)
		{
			return setParameter(Parameters.CODE, modifier, prefix, Code);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, MessageHeaderResponse.Code Code)
		{
			return setParameter(Parameters.CODE, modifier, Code);
		}

		public ResourceInteractor.Composer setCode(Prefix prefix, MessageHeaderResponse.Code Code)
		{
			return setParameter(Parameters.CODE, prefix, Code);
		}
        			
		public ResourceInteractor.Composer setCode(MessageHeaderResponse.Code Code)
		{
			return setParameter(Parameters.CODE, Code);
		}

		public ResourceInteractor.Composer setDestination(Modifier modifier, Prefix prefix, String Destination)
		{
			return setParameter(Parameters.DESTINATION, modifier, prefix, Destination);
		}

		public ResourceInteractor.Composer setDestination(Modifier modifier, String Destination)
		{
			return setParameter(Parameters.DESTINATION, modifier, Destination);
		}

		public ResourceInteractor.Composer setDestination(Prefix prefix, String Destination)
		{
			return setParameter(Parameters.DESTINATION, prefix, Destination);
		}
        			
		public ResourceInteractor.Composer setDestination(String Destination)
		{
			return setParameter(Parameters.DESTINATION, Destination);
		}

		public ResourceInteractor.Composer setDestinationUri(Modifier modifier, Prefix prefix, String DestinationUri)
		{
			return setParameter(Parameters.DESTINATION_URI, modifier, prefix, DestinationUri);
		}

		public ResourceInteractor.Composer setDestinationUri(Modifier modifier, String DestinationUri)
		{
			return setParameter(Parameters.DESTINATION_URI, modifier, DestinationUri);
		}

		public ResourceInteractor.Composer setDestinationUri(Prefix prefix, String DestinationUri)
		{
			return setParameter(Parameters.DESTINATION_URI, prefix, DestinationUri);
		}
        			
		public ResourceInteractor.Composer setDestinationUri(String DestinationUri)
		{
			return setParameter(Parameters.DESTINATION_URI, DestinationUri);
		}

		public ResourceInteractor.Composer setEvent(Modifier modifier, Prefix prefix, Coding Event)
		{
			return setParameter(Parameters.EVENT, modifier, prefix, Event);
		}

		public ResourceInteractor.Composer setEvent(Modifier modifier, Coding Event)
		{
			return setParameter(Parameters.EVENT, modifier, Event);
		}

		public ResourceInteractor.Composer setEvent(Prefix prefix, Coding Event)
		{
			return setParameter(Parameters.EVENT, prefix, Event);
		}
        			
		public ResourceInteractor.Composer setEvent(Coding Event)
		{
			return setParameter(Parameters.EVENT, Event);
		}

		public ResourceInteractor.Composer setResponseId(Modifier modifier, Prefix prefix, String ResponseId)
		{
			return setParameter(Parameters.RESPONSE_ID, modifier, prefix, ResponseId);
		}

		public ResourceInteractor.Composer setResponseId(Modifier modifier, String ResponseId)
		{
			return setParameter(Parameters.RESPONSE_ID, modifier, ResponseId);
		}

		public ResourceInteractor.Composer setResponseId(Prefix prefix, String ResponseId)
		{
			return setParameter(Parameters.RESPONSE_ID, prefix, ResponseId);
		}
        			
		public ResourceInteractor.Composer setResponseId(String ResponseId)
		{
			return setParameter(Parameters.RESPONSE_ID, ResponseId);
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

		public ResourceInteractor.Composer setSourceUri(Modifier modifier, Prefix prefix, String SourceUri)
		{
			return setParameter(Parameters.SOURCE_URI, modifier, prefix, SourceUri);
		}

		public ResourceInteractor.Composer setSourceUri(Modifier modifier, String SourceUri)
		{
			return setParameter(Parameters.SOURCE_URI, modifier, SourceUri);
		}

		public ResourceInteractor.Composer setSourceUri(Prefix prefix, String SourceUri)
		{
			return setParameter(Parameters.SOURCE_URI, prefix, SourceUri);
		}
        			
		public ResourceInteractor.Composer setSourceUri(String SourceUri)
		{
			return setParameter(Parameters.SOURCE_URI, SourceUri);
		}

		public ResourceInteractor.Composer setTimestamp(Modifier modifier, Prefix prefix, Date Timestamp)
		{
			return setParameter(Parameters.TIMESTAMP, modifier, prefix, Timestamp);
		}

		public ResourceInteractor.Composer setTimestamp(Modifier modifier, Date Timestamp)
		{
			return setParameter(Parameters.TIMESTAMP, modifier, Timestamp);
		}

		public ResourceInteractor.Composer setTimestamp(Prefix prefix, Date Timestamp)
		{
			return setParameter(Parameters.TIMESTAMP, prefix, Timestamp);
		}
        			
		public ResourceInteractor.Composer setTimestamp(Date Timestamp)
		{
			return setParameter(Parameters.TIMESTAMP, Timestamp);
		}

    }

    public static <T> MessageHeaderInteractor.MessageHeaderComposer Composer()
    {
        return new MessageHeaderComposer();
    }

}