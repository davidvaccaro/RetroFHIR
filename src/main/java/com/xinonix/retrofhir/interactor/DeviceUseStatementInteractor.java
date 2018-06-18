package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.DeviceUseStatementService;

import com.xinonix.hl7.fhir.stu3.DeviceUseStatement;

public class DeviceUseStatementInteractor extends ResourceInteractor<DeviceUseStatementService, DeviceUseStatement> {

    public static class DeviceUseStatementComposer extends Composer<DeviceUseStatementService, DeviceUseStatement, DeviceUseStatementComposer> {

        public DeviceUseStatementComposer()
        {
            super((Class) DeviceUseStatementService.class, (Class) DeviceUseStatement.class);
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

    }

    public static <T> DeviceUseStatementInteractor.DeviceUseStatementComposer Composer()
    {
        return new DeviceUseStatementComposer();
    }

}