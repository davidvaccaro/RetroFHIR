package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.PaymentNoticeService;

import com.xinonix.hl7.fhir.stu3.PaymentNotice;

public class PaymentNoticeInteractor extends ResourceInteractor<PaymentNoticeService, PaymentNotice> {

    public static class PaymentNoticeComposer extends Composer<PaymentNoticeService, PaymentNotice, PaymentNoticeComposer> {

        public PaymentNoticeComposer()
        {
            super((Class) PaymentNoticeService.class, (Class) PaymentNotice.class);
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

		public ResourceInteractor.Composer setPaymentStatus(Modifier modifier, Prefix prefix, CodeableConcept PaymentStatus)
		{
			return setParameter(Parameters.PAYMENT_STATUS, modifier, prefix, PaymentStatus);
		}

		public ResourceInteractor.Composer setPaymentStatus(Modifier modifier, CodeableConcept PaymentStatus)
		{
			return setParameter(Parameters.PAYMENT_STATUS, modifier, PaymentStatus);
		}

		public ResourceInteractor.Composer setPaymentStatus(Prefix prefix, CodeableConcept PaymentStatus)
		{
			return setParameter(Parameters.PAYMENT_STATUS, prefix, PaymentStatus);
		}
        			
		public ResourceInteractor.Composer setPaymentStatus(CodeableConcept PaymentStatus)
		{
			return setParameter(Parameters.PAYMENT_STATUS, PaymentStatus);
		}

		public ResourceInteractor.Composer setStatusdate(Modifier modifier, Prefix prefix, Date Statusdate)
		{
			return setParameter(Parameters.STATUSDATE, modifier, prefix, Statusdate);
		}

		public ResourceInteractor.Composer setStatusdate(Modifier modifier, Date Statusdate)
		{
			return setParameter(Parameters.STATUSDATE, modifier, Statusdate);
		}

		public ResourceInteractor.Composer setStatusdate(Prefix prefix, Date Statusdate)
		{
			return setParameter(Parameters.STATUSDATE, prefix, Statusdate);
		}
        			
		public ResourceInteractor.Composer setStatusdate(Date Statusdate)
		{
			return setParameter(Parameters.STATUSDATE, Statusdate);
		}

    }

    public static <T> PaymentNoticeInteractor.PaymentNoticeComposer Composer()
    {
        return new PaymentNoticeComposer();
    }

}