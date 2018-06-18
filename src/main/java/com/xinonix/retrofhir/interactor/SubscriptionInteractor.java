package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.Subscription.Status;
import com.xinonix.hl7.fhir.stu3.SubscriptionChannel;
import com.xinonix.hl7.fhir.stu3.SubscriptionChannel.Type;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SubscriptionService;

import com.xinonix.hl7.fhir.stu3.Subscription;

public class SubscriptionInteractor extends ResourceInteractor<SubscriptionService, Subscription> {

    public static class SubscriptionComposer extends Composer<SubscriptionService, Subscription, SubscriptionComposer> {

        public SubscriptionComposer()
        {
            super((Class) SubscriptionService.class, (Class) Subscription.class);
        }

		public ResourceInteractor.Composer setAddTag(Modifier modifier, Prefix prefix, Coding AddTag)
		{
			return setParameter(Parameters.ADD_TAG, modifier, prefix, AddTag);
		}

		public ResourceInteractor.Composer setAddTag(Modifier modifier, Coding AddTag)
		{
			return setParameter(Parameters.ADD_TAG, modifier, AddTag);
		}

		public ResourceInteractor.Composer setAddTag(Prefix prefix, Coding AddTag)
		{
			return setParameter(Parameters.ADD_TAG, prefix, AddTag);
		}
        			
		public ResourceInteractor.Composer setAddTag(Coding AddTag)
		{
			return setParameter(Parameters.ADD_TAG, AddTag);
		}

		public ResourceInteractor.Composer setContact(Modifier modifier, Prefix prefix, ContactPoint Contact)
		{
			return setParameter(Parameters.CONTACT, modifier, prefix, Contact);
		}

		public ResourceInteractor.Composer setContact(Modifier modifier, ContactPoint Contact)
		{
			return setParameter(Parameters.CONTACT, modifier, Contact);
		}

		public ResourceInteractor.Composer setContact(Prefix prefix, ContactPoint Contact)
		{
			return setParameter(Parameters.CONTACT, prefix, Contact);
		}
        			
		public ResourceInteractor.Composer setContact(ContactPoint Contact)
		{
			return setParameter(Parameters.CONTACT, Contact);
		}

		public ResourceInteractor.Composer setCriteria(Modifier modifier, Prefix prefix, String Criteria)
		{
			return setParameter(Parameters.CRITERIA, modifier, prefix, Criteria);
		}

		public ResourceInteractor.Composer setCriteria(Modifier modifier, String Criteria)
		{
			return setParameter(Parameters.CRITERIA, modifier, Criteria);
		}

		public ResourceInteractor.Composer setCriteria(Prefix prefix, String Criteria)
		{
			return setParameter(Parameters.CRITERIA, prefix, Criteria);
		}
        			
		public ResourceInteractor.Composer setCriteria(String Criteria)
		{
			return setParameter(Parameters.CRITERIA, Criteria);
		}

		public ResourceInteractor.Composer setPayload(Modifier modifier, Prefix prefix, String Payload)
		{
			return setParameter(Parameters.PAYLOAD, modifier, prefix, Payload);
		}

		public ResourceInteractor.Composer setPayload(Modifier modifier, String Payload)
		{
			return setParameter(Parameters.PAYLOAD, modifier, Payload);
		}

		public ResourceInteractor.Composer setPayload(Prefix prefix, String Payload)
		{
			return setParameter(Parameters.PAYLOAD, prefix, Payload);
		}
        			
		public ResourceInteractor.Composer setPayload(String Payload)
		{
			return setParameter(Parameters.PAYLOAD, Payload);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Subscription.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Subscription.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Subscription.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Subscription.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, SubscriptionChannel.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, SubscriptionChannel.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, SubscriptionChannel.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(SubscriptionChannel.Type Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, modifier, prefix, Url);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, String Url)
		{
			return setParameter(Parameters.URL, modifier, Url);
		}

		public ResourceInteractor.Composer setUrl(Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, prefix, Url);
		}
        			
		public ResourceInteractor.Composer setUrl(String Url)
		{
			return setParameter(Parameters.URL, Url);
		}

    }

    public static <T> SubscriptionInteractor.SubscriptionComposer Composer()
    {
        return new SubscriptionComposer();
    }

}