package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ImagingStudyService;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.ImagingStudy;

public class ImagingStudyInteractor extends ResourceInteractor<ImagingStudyService, ImagingStudy> {

    public static class ImagingStudyComposer extends Composer<ImagingStudyService, ImagingStudy, ImagingStudyComposer> {

        public ImagingStudyComposer()
        {
            super((Class) ImagingStudyService.class, (Class) ImagingStudy.class);
        }

		public ResourceInteractor.Composer setAccession(Modifier modifier, Prefix prefix, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, modifier, prefix, Accession);
		}

		public ResourceInteractor.Composer setAccession(Modifier modifier, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, modifier, Accession);
		}

		public ResourceInteractor.Composer setAccession(Prefix prefix, Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, prefix, Accession);
		}
        			
		public ResourceInteractor.Composer setAccession(Identifier Accession)
		{
			return setParameter(Parameters.ACCESSION, Accession);
		}

		public ResourceInteractor.Composer setBodysite(Modifier modifier, Prefix prefix, Coding Bodysite)
		{
			return setParameter(Parameters.BODYSITE, modifier, prefix, Bodysite);
		}

		public ResourceInteractor.Composer setBodysite(Modifier modifier, Coding Bodysite)
		{
			return setParameter(Parameters.BODYSITE, modifier, Bodysite);
		}

		public ResourceInteractor.Composer setBodysite(Prefix prefix, Coding Bodysite)
		{
			return setParameter(Parameters.BODYSITE, prefix, Bodysite);
		}
        			
		public ResourceInteractor.Composer setBodysite(Coding Bodysite)
		{
			return setParameter(Parameters.BODYSITE, Bodysite);
		}

		public ResourceInteractor.Composer setDicomClass(Modifier modifier, Prefix prefix, String DicomClass)
		{
			return setParameter(Parameters.DICOM_CLASS, modifier, prefix, DicomClass);
		}

		public ResourceInteractor.Composer setDicomClass(Modifier modifier, String DicomClass)
		{
			return setParameter(Parameters.DICOM_CLASS, modifier, DicomClass);
		}

		public ResourceInteractor.Composer setDicomClass(Prefix prefix, String DicomClass)
		{
			return setParameter(Parameters.DICOM_CLASS, prefix, DicomClass);
		}
        			
		public ResourceInteractor.Composer setDicomClass(String DicomClass)
		{
			return setParameter(Parameters.DICOM_CLASS, DicomClass);
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

		public ResourceInteractor.Composer setModality(Modifier modifier, Prefix prefix, Coding Modality)
		{
			return setParameter(Parameters.MODALITY, modifier, prefix, Modality);
		}

		public ResourceInteractor.Composer setModality(Modifier modifier, Coding Modality)
		{
			return setParameter(Parameters.MODALITY, modifier, Modality);
		}

		public ResourceInteractor.Composer setModality(Prefix prefix, Coding Modality)
		{
			return setParameter(Parameters.MODALITY, prefix, Modality);
		}
        			
		public ResourceInteractor.Composer setModality(Coding Modality)
		{
			return setParameter(Parameters.MODALITY, Modality);
		}

		public ResourceInteractor.Composer setReason(Modifier modifier, Prefix prefix, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, modifier, prefix, Reason);
		}

		public ResourceInteractor.Composer setReason(Modifier modifier, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, modifier, Reason);
		}

		public ResourceInteractor.Composer setReason(Prefix prefix, CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, prefix, Reason);
		}
        			
		public ResourceInteractor.Composer setReason(CodeableConcept Reason)
		{
			return setParameter(Parameters.REASON, Reason);
		}

		public ResourceInteractor.Composer setSeries(Modifier modifier, Prefix prefix, String Series)
		{
			return setParameter(Parameters.SERIES, modifier, prefix, Series);
		}

		public ResourceInteractor.Composer setSeries(Modifier modifier, String Series)
		{
			return setParameter(Parameters.SERIES, modifier, Series);
		}

		public ResourceInteractor.Composer setSeries(Prefix prefix, String Series)
		{
			return setParameter(Parameters.SERIES, prefix, Series);
		}
        			
		public ResourceInteractor.Composer setSeries(String Series)
		{
			return setParameter(Parameters.SERIES, Series);
		}

		public ResourceInteractor.Composer setStarted(Modifier modifier, Prefix prefix, Date Started)
		{
			return setParameter(Parameters.STARTED, modifier, prefix, Started);
		}

		public ResourceInteractor.Composer setStarted(Modifier modifier, Date Started)
		{
			return setParameter(Parameters.STARTED, modifier, Started);
		}

		public ResourceInteractor.Composer setStarted(Prefix prefix, Date Started)
		{
			return setParameter(Parameters.STARTED, prefix, Started);
		}
        			
		public ResourceInteractor.Composer setStarted(Date Started)
		{
			return setParameter(Parameters.STARTED, Started);
		}

		public ResourceInteractor.Composer setStudy(Modifier modifier, Prefix prefix, String Study)
		{
			return setParameter(Parameters.STUDY, modifier, prefix, Study);
		}

		public ResourceInteractor.Composer setStudy(Modifier modifier, String Study)
		{
			return setParameter(Parameters.STUDY, modifier, Study);
		}

		public ResourceInteractor.Composer setStudy(Prefix prefix, String Study)
		{
			return setParameter(Parameters.STUDY, prefix, Study);
		}
        			
		public ResourceInteractor.Composer setStudy(String Study)
		{
			return setParameter(Parameters.STUDY, Study);
		}

		public ResourceInteractor.Composer setUid(Modifier modifier, Prefix prefix, String Uid)
		{
			return setParameter(Parameters.UID, modifier, prefix, Uid);
		}

		public ResourceInteractor.Composer setUid(Modifier modifier, String Uid)
		{
			return setParameter(Parameters.UID, modifier, Uid);
		}

		public ResourceInteractor.Composer setUid(Prefix prefix, String Uid)
		{
			return setParameter(Parameters.UID, prefix, Uid);
		}
        			
		public ResourceInteractor.Composer setUid(String Uid)
		{
			return setParameter(Parameters.UID, Uid);
		}

    }

    public static <T> ImagingStudyInteractor.ImagingStudyComposer Composer()
    {
        return new ImagingStudyComposer();
    }

}