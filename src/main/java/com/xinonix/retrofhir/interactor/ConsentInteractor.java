package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Consent.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ConsentService;

import com.xinonix.hl7.fhir.stu3.Consent;

public class ConsentInteractor extends ResourceInteractor<ConsentService, Consent> {

    public static class ConsentComposer extends Composer<ConsentService, Consent, ConsentComposer> {

        public ConsentComposer()
        {
            super((Class) ConsentService.class, (Class) Consent.class);
        }

		public ResourceInteractor.Composer setAction(Modifier modifier, Prefix prefix, CodeableConcept Action)
		{
			return setParameter(Parameters.ACTION, modifier, prefix, Action);
		}

		public ResourceInteractor.Composer setAction(Modifier modifier, CodeableConcept Action)
		{
			return setParameter(Parameters.ACTION, modifier, Action);
		}

		public ResourceInteractor.Composer setAction(Prefix prefix, CodeableConcept Action)
		{
			return setParameter(Parameters.ACTION, prefix, Action);
		}
        			
		public ResourceInteractor.Composer setAction(CodeableConcept Action)
		{
			return setParameter(Parameters.ACTION, Action);
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

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, prefix, Period);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, Period);
		}

		public ResourceInteractor.Composer setPeriod(Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, prefix, Period);
		}
        			
		public ResourceInteractor.Composer setPeriod(Date Period)
		{
			return setParameter(Parameters.PERIOD, Period);
		}

		public ResourceInteractor.Composer setPurpose(Modifier modifier, Prefix prefix, Coding Purpose)
		{
			return setParameter(Parameters.PURPOSE, modifier, prefix, Purpose);
		}

		public ResourceInteractor.Composer setPurpose(Modifier modifier, Coding Purpose)
		{
			return setParameter(Parameters.PURPOSE, modifier, Purpose);
		}

		public ResourceInteractor.Composer setPurpose(Prefix prefix, Coding Purpose)
		{
			return setParameter(Parameters.PURPOSE, prefix, Purpose);
		}
        			
		public ResourceInteractor.Composer setPurpose(Coding Purpose)
		{
			return setParameter(Parameters.PURPOSE, Purpose);
		}

		public ResourceInteractor.Composer setSecuritylabel(Modifier modifier, Prefix prefix, Coding Securitylabel)
		{
			return setParameter(Parameters.SECURITYLABEL, modifier, prefix, Securitylabel);
		}

		public ResourceInteractor.Composer setSecuritylabel(Modifier modifier, Coding Securitylabel)
		{
			return setParameter(Parameters.SECURITYLABEL, modifier, Securitylabel);
		}

		public ResourceInteractor.Composer setSecuritylabel(Prefix prefix, Coding Securitylabel)
		{
			return setParameter(Parameters.SECURITYLABEL, prefix, Securitylabel);
		}
        			
		public ResourceInteractor.Composer setSecuritylabel(Coding Securitylabel)
		{
			return setParameter(Parameters.SECURITYLABEL, Securitylabel);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Consent.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Consent.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Consent.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Consent.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> ConsentInteractor.ConsentComposer Composer()
    {
        return new ConsentComposer();
    }

}