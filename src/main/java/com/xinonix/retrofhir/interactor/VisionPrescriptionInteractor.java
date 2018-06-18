package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.VisionPrescriptionService;

import com.xinonix.hl7.fhir.stu3.VisionPrescription;

public class VisionPrescriptionInteractor extends ResourceInteractor<VisionPrescriptionService, VisionPrescription> {

    public static class VisionPrescriptionComposer extends Composer<VisionPrescriptionService, VisionPrescription, VisionPrescriptionComposer> {

        public VisionPrescriptionComposer()
        {
            super((Class) VisionPrescriptionService.class, (Class) VisionPrescription.class);
        }

		public ResourceInteractor.Composer setDatewritten(Modifier modifier, Prefix prefix, Date Datewritten)
		{
			return setParameter(Parameters.DATEWRITTEN, modifier, prefix, Datewritten);
		}

		public ResourceInteractor.Composer setDatewritten(Modifier modifier, Date Datewritten)
		{
			return setParameter(Parameters.DATEWRITTEN, modifier, Datewritten);
		}

		public ResourceInteractor.Composer setDatewritten(Prefix prefix, Date Datewritten)
		{
			return setParameter(Parameters.DATEWRITTEN, prefix, Datewritten);
		}
        			
		public ResourceInteractor.Composer setDatewritten(Date Datewritten)
		{
			return setParameter(Parameters.DATEWRITTEN, Datewritten);
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

    public static <T> VisionPrescriptionInteractor.VisionPrescriptionComposer Composer()
    {
        return new VisionPrescriptionComposer();
    }

}