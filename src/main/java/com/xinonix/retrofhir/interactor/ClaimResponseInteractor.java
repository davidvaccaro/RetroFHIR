package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ClaimResponseService;

import com.xinonix.hl7.fhir.stu3.ClaimResponse;

public class ClaimResponseInteractor extends ResourceInteractor<ClaimResponseService, ClaimResponse> {

    public static class ClaimResponseComposer extends Composer<ClaimResponseService, ClaimResponse, ClaimResponseComposer> {

        public ClaimResponseComposer()
        {
            super((Class) ClaimResponseService.class, (Class) ClaimResponse.class);
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

		public ResourceInteractor.Composer setDisposition(Modifier modifier, Prefix prefix, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, modifier, prefix, Disposition);
		}

		public ResourceInteractor.Composer setDisposition(Modifier modifier, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, modifier, Disposition);
		}

		public ResourceInteractor.Composer setDisposition(Prefix prefix, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, prefix, Disposition);
		}
        			
		public ResourceInteractor.Composer setDisposition(String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, Disposition);
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

		public ResourceInteractor.Composer setOutcome(Modifier modifier, Prefix prefix, CodeableConcept Outcome)
		{
			return setParameter(Parameters.OUTCOME, modifier, prefix, Outcome);
		}

		public ResourceInteractor.Composer setOutcome(Modifier modifier, CodeableConcept Outcome)
		{
			return setParameter(Parameters.OUTCOME, modifier, Outcome);
		}

		public ResourceInteractor.Composer setOutcome(Prefix prefix, CodeableConcept Outcome)
		{
			return setParameter(Parameters.OUTCOME, prefix, Outcome);
		}
        			
		public ResourceInteractor.Composer setOutcome(CodeableConcept Outcome)
		{
			return setParameter(Parameters.OUTCOME, Outcome);
		}

		public ResourceInteractor.Composer setPaymentDate(Modifier modifier, Prefix prefix, Date PaymentDate)
		{
			return setParameter(Parameters.PAYMENT_DATE, modifier, prefix, PaymentDate);
		}

		public ResourceInteractor.Composer setPaymentDate(Modifier modifier, Date PaymentDate)
		{
			return setParameter(Parameters.PAYMENT_DATE, modifier, PaymentDate);
		}

		public ResourceInteractor.Composer setPaymentDate(Prefix prefix, Date PaymentDate)
		{
			return setParameter(Parameters.PAYMENT_DATE, prefix, PaymentDate);
		}
        			
		public ResourceInteractor.Composer setPaymentDate(Date PaymentDate)
		{
			return setParameter(Parameters.PAYMENT_DATE, PaymentDate);
		}

    }

    public static <T> ClaimResponseInteractor.ClaimResponseComposer Composer()
    {
        return new ClaimResponseComposer();
    }

}