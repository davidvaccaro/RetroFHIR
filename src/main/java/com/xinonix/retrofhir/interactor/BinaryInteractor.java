package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.BinaryService;

import com.xinonix.hl7.fhir.stu3.Binary;

public class BinaryInteractor extends ResourceInteractor<BinaryService, Binary> {

    public static class BinaryComposer extends Composer<BinaryService, Binary, BinaryComposer> {

        public BinaryComposer()
        {
            super((Class) BinaryService.class, (Class) Binary.class);
        }

		public ResourceInteractor.Composer setContenttype(Modifier modifier, Prefix prefix, String Contenttype)
		{
			return setParameter(Parameters.CONTENTTYPE, modifier, prefix, Contenttype);
		}

		public ResourceInteractor.Composer setContenttype(Modifier modifier, String Contenttype)
		{
			return setParameter(Parameters.CONTENTTYPE, modifier, Contenttype);
		}

		public ResourceInteractor.Composer setContenttype(Prefix prefix, String Contenttype)
		{
			return setParameter(Parameters.CONTENTTYPE, prefix, Contenttype);
		}
        			
		public ResourceInteractor.Composer setContenttype(String Contenttype)
		{
			return setParameter(Parameters.CONTENTTYPE, Contenttype);
		}

    }

    public static <T> BinaryInteractor.BinaryComposer Composer()
    {
        return new BinaryComposer();
    }

}