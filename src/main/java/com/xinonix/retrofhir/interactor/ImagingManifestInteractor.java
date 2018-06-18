package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ImagingManifestService;

import com.xinonix.hl7.fhir.stu3.ImagingManifest;

public class ImagingManifestInteractor extends ResourceInteractor<ImagingManifestService, ImagingManifest> {

    public static class ImagingManifestComposer extends Composer<ImagingManifestService, ImagingManifest, ImagingManifestComposer> {

        public ImagingManifestComposer()
        {
            super((Class) ImagingManifestService.class, (Class) ImagingManifest.class);
        }

		public ResourceInteractor.Composer setAuthoringTime(Modifier modifier, Prefix prefix, Date AuthoringTime)
		{
			return setParameter(Parameters.AUTHORING_TIME, modifier, prefix, AuthoringTime);
		}

		public ResourceInteractor.Composer setAuthoringTime(Modifier modifier, Date AuthoringTime)
		{
			return setParameter(Parameters.AUTHORING_TIME, modifier, AuthoringTime);
		}

		public ResourceInteractor.Composer setAuthoringTime(Prefix prefix, Date AuthoringTime)
		{
			return setParameter(Parameters.AUTHORING_TIME, prefix, AuthoringTime);
		}
        			
		public ResourceInteractor.Composer setAuthoringTime(Date AuthoringTime)
		{
			return setParameter(Parameters.AUTHORING_TIME, AuthoringTime);
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

		public ResourceInteractor.Composer setSelectedStudy(Modifier modifier, Prefix prefix, String SelectedStudy)
		{
			return setParameter(Parameters.SELECTED_STUDY, modifier, prefix, SelectedStudy);
		}

		public ResourceInteractor.Composer setSelectedStudy(Modifier modifier, String SelectedStudy)
		{
			return setParameter(Parameters.SELECTED_STUDY, modifier, SelectedStudy);
		}

		public ResourceInteractor.Composer setSelectedStudy(Prefix prefix, String SelectedStudy)
		{
			return setParameter(Parameters.SELECTED_STUDY, prefix, SelectedStudy);
		}
        			
		public ResourceInteractor.Composer setSelectedStudy(String SelectedStudy)
		{
			return setParameter(Parameters.SELECTED_STUDY, SelectedStudy);
		}

    }

    public static <T> ImagingManifestInteractor.ImagingManifestComposer Composer()
    {
        return new ImagingManifestComposer();
    }

}