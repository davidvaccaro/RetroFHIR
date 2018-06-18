package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Claim.Use;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ClaimService;

import com.xinonix.hl7.fhir.stu3.Claim;

public class ClaimInteractor extends ResourceInteractor<ClaimService, Claim> {

    public static class ClaimComposer extends Composer<ClaimService, Claim, ClaimComposer> {

        public ClaimComposer()
        {
            super((Class) ClaimService.class, (Class) Claim.class);
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

		public ResourceInteractor.Composer setPriority(Modifier modifier, Prefix prefix, CodeableConcept Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, prefix, Priority);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, CodeableConcept Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, Priority);
		}

		public ResourceInteractor.Composer setPriority(Prefix prefix, CodeableConcept Priority)
		{
			return setParameter(Parameters.PRIORITY, prefix, Priority);
		}
        			
		public ResourceInteractor.Composer setPriority(CodeableConcept Priority)
		{
			return setParameter(Parameters.PRIORITY, Priority);
		}

		public ResourceInteractor.Composer setUse(Modifier modifier, Prefix prefix, Claim.Use Use)
		{
			return setParameter(Parameters.USE, modifier, prefix, Use);
		}

		public ResourceInteractor.Composer setUse(Modifier modifier, Claim.Use Use)
		{
			return setParameter(Parameters.USE, modifier, Use);
		}

		public ResourceInteractor.Composer setUse(Prefix prefix, Claim.Use Use)
		{
			return setParameter(Parameters.USE, prefix, Use);
		}
        			
		public ResourceInteractor.Composer setUse(Claim.Use Use)
		{
			return setParameter(Parameters.USE, Use);
		}

    }

    public static <T> ClaimInteractor.ClaimComposer Composer()
    {
        return new ClaimComposer();
    }

}