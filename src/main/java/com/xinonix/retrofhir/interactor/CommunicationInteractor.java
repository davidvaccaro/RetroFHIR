package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CommunicationService;

import com.xinonix.hl7.fhir.stu3.Communication;

public class CommunicationInteractor extends ResourceInteractor<CommunicationService, Communication> {

    public static class CommunicationComposer extends Composer<CommunicationService, Communication, CommunicationComposer> {

        public CommunicationComposer()
        {
            super((Class) CommunicationService.class, (Class) Communication.class);
        }

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
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

		public ResourceInteractor.Composer setMedium(Modifier modifier, Prefix prefix, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, modifier, prefix, Medium);
		}

		public ResourceInteractor.Composer setMedium(Modifier modifier, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, modifier, Medium);
		}

		public ResourceInteractor.Composer setMedium(Prefix prefix, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, prefix, Medium);
		}
        			
		public ResourceInteractor.Composer setMedium(CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, Medium);
		}

		public ResourceInteractor.Composer setReceived(Modifier modifier, Prefix prefix, Date Received)
		{
			return setParameter(Parameters.RECEIVED, modifier, prefix, Received);
		}

		public ResourceInteractor.Composer setReceived(Modifier modifier, Date Received)
		{
			return setParameter(Parameters.RECEIVED, modifier, Received);
		}

		public ResourceInteractor.Composer setReceived(Prefix prefix, Date Received)
		{
			return setParameter(Parameters.RECEIVED, prefix, Received);
		}
        			
		public ResourceInteractor.Composer setReceived(Date Received)
		{
			return setParameter(Parameters.RECEIVED, Received);
		}

		public ResourceInteractor.Composer setSent(Modifier modifier, Prefix prefix, Date Sent)
		{
			return setParameter(Parameters.SENT, modifier, prefix, Sent);
		}

		public ResourceInteractor.Composer setSent(Modifier modifier, Date Sent)
		{
			return setParameter(Parameters.SENT, modifier, Sent);
		}

		public ResourceInteractor.Composer setSent(Prefix prefix, Date Sent)
		{
			return setParameter(Parameters.SENT, prefix, Sent);
		}
        			
		public ResourceInteractor.Composer setSent(Date Sent)
		{
			return setParameter(Parameters.SENT, Sent);
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

    public static <T> CommunicationInteractor.CommunicationComposer Composer()
    {
        return new CommunicationComposer();
    }

}