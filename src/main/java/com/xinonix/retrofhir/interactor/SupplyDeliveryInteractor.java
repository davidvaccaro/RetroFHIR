package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.SupplyDelivery.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SupplyDeliveryService;

import com.xinonix.hl7.fhir.stu3.SupplyDelivery;

public class SupplyDeliveryInteractor extends ResourceInteractor<SupplyDeliveryService, SupplyDelivery> {

    public static class SupplyDeliveryComposer extends Composer<SupplyDeliveryService, SupplyDelivery, SupplyDeliveryComposer> {

        public SupplyDeliveryComposer()
        {
            super((Class) SupplyDeliveryService.class, (Class) SupplyDelivery.class);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, SupplyDelivery.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, SupplyDelivery.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, SupplyDelivery.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(SupplyDelivery.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> SupplyDeliveryInteractor.SupplyDeliveryComposer Composer()
    {
        return new SupplyDeliveryComposer();
    }

}