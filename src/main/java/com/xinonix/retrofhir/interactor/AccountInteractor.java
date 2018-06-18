package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AccountService;

import com.xinonix.hl7.fhir.stu3.Account;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Quantity;

public class AccountInteractor extends ResourceInteractor<AccountService, Account> {

    public static class AccountComposer extends Composer<AccountService, Account, AccountComposer> {

        public AccountComposer()
        {
            super((Class) AccountService.class, (Class) Account.class);
        }

		public ResourceInteractor.Composer setBalance(Modifier modifier, Prefix prefix, Quantity Balance)
		{
			return setParameter(Parameters.BALANCE, modifier, prefix, Balance);
		}

		public ResourceInteractor.Composer setBalance(Modifier modifier, Quantity Balance)
		{
			return setParameter(Parameters.BALANCE, modifier, Balance);
		}

		public ResourceInteractor.Composer setBalance(Prefix prefix, Quantity Balance)
		{
			return setParameter(Parameters.BALANCE, prefix, Balance);
		}
        			
		public ResourceInteractor.Composer setBalance(Quantity Balance)
		{
			return setParameter(Parameters.BALANCE, Balance);
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

		public ResourceInteractor.Composer setName(Modifier modifier, Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, modifier, prefix, Name);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, String Name)
		{
			return setParameter(Parameters.NAME, modifier, Name);
		}

		public ResourceInteractor.Composer setName(Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, prefix, Name);
		}
        			
		public ResourceInteractor.Composer setName(String Name)
		{
			return setParameter(Parameters.NAME, Name);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Account.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Account.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Account.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Account.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

    }

    public static <T> AccountInteractor.AccountComposer Composer()
    {
        return new AccountComposer();
    }

}