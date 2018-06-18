package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Quantity;
import com.xinonix.hl7.fhir.stu3.Substance.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SubstanceService;

import com.xinonix.hl7.fhir.stu3.Substance;

public class SubstanceInteractor extends ResourceInteractor<SubstanceService, Substance> {

    public static class SubstanceComposer extends Composer<SubstanceService, Substance, SubstanceComposer> {

        public SubstanceComposer()
        {
            super((Class) SubstanceService.class, (Class) Substance.class);
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

		public ResourceInteractor.Composer setContainerIdentifier(Modifier modifier, Prefix prefix, Identifier ContainerIdentifier)
		{
			return setParameter(Parameters.CONTAINER_IDENTIFIER, modifier, prefix, ContainerIdentifier);
		}

		public ResourceInteractor.Composer setContainerIdentifier(Modifier modifier, Identifier ContainerIdentifier)
		{
			return setParameter(Parameters.CONTAINER_IDENTIFIER, modifier, ContainerIdentifier);
		}

		public ResourceInteractor.Composer setContainerIdentifier(Prefix prefix, Identifier ContainerIdentifier)
		{
			return setParameter(Parameters.CONTAINER_IDENTIFIER, prefix, ContainerIdentifier);
		}
        			
		public ResourceInteractor.Composer setContainerIdentifier(Identifier ContainerIdentifier)
		{
			return setParameter(Parameters.CONTAINER_IDENTIFIER, ContainerIdentifier);
		}

		public ResourceInteractor.Composer setExpiry(Modifier modifier, Prefix prefix, Date Expiry)
		{
			return setParameter(Parameters.EXPIRY, modifier, prefix, Expiry);
		}

		public ResourceInteractor.Composer setExpiry(Modifier modifier, Date Expiry)
		{
			return setParameter(Parameters.EXPIRY, modifier, Expiry);
		}

		public ResourceInteractor.Composer setExpiry(Prefix prefix, Date Expiry)
		{
			return setParameter(Parameters.EXPIRY, prefix, Expiry);
		}
        			
		public ResourceInteractor.Composer setExpiry(Date Expiry)
		{
			return setParameter(Parameters.EXPIRY, Expiry);
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

		public ResourceInteractor.Composer setQuantity(Modifier modifier, Prefix prefix, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, modifier, prefix, Quantity);
		}

		public ResourceInteractor.Composer setQuantity(Modifier modifier, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, modifier, Quantity);
		}

		public ResourceInteractor.Composer setQuantity(Prefix prefix, Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, prefix, Quantity);
		}
        			
		public ResourceInteractor.Composer setQuantity(Quantity Quantity)
		{
			return setParameter(Parameters.QUANTITY, Quantity);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Substance.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Substance.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Substance.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Substance.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> SubstanceInteractor.SubstanceComposer Composer()
    {
        return new SubstanceComposer();
    }

}