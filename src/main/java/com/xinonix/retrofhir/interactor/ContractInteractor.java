package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ContractService;

import com.xinonix.hl7.fhir.stu3.Contract;

public class ContractInteractor extends ResourceInteractor<ContractService, Contract> {

    public static class ContractComposer extends Composer<ContractService, Contract, ContractComposer> {

        public ContractComposer()
        {
            super((Class) ContractService.class, (Class) Contract.class);
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

		public ResourceInteractor.Composer setIssued(Modifier modifier, Prefix prefix, Date Issued)
		{
			return setParameter(Parameters.ISSUED, modifier, prefix, Issued);
		}

		public ResourceInteractor.Composer setIssued(Modifier modifier, Date Issued)
		{
			return setParameter(Parameters.ISSUED, modifier, Issued);
		}

		public ResourceInteractor.Composer setIssued(Prefix prefix, Date Issued)
		{
			return setParameter(Parameters.ISSUED, prefix, Issued);
		}
        			
		public ResourceInteractor.Composer setIssued(Date Issued)
		{
			return setParameter(Parameters.ISSUED, Issued);
		}

    }

    public static <T> ContractInteractor.ContractComposer Composer()
    {
        return new ContractComposer();
    }

}