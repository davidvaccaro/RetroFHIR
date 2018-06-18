package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.DiagnosticReport.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.DiagnosticReportService;

import com.xinonix.hl7.fhir.stu3.DiagnosticReport;

public class DiagnosticReportInteractor extends ResourceInteractor<DiagnosticReportService, DiagnosticReport> {

    public static class DiagnosticReportComposer extends Composer<DiagnosticReportService, DiagnosticReport, DiagnosticReportComposer> {

        public DiagnosticReportComposer()
        {
            super((Class) DiagnosticReportService.class, (Class) DiagnosticReport.class);
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

		public ResourceInteractor.Composer setDate(Modifier modifier, Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, prefix, Date);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, Date);
		}

		public ResourceInteractor.Composer setDate(Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, prefix, Date);
		}
        			
		public ResourceInteractor.Composer setDate(Date Date)
		{
			return setParameter(Parameters.DATE, Date);
		}

		public ResourceInteractor.Composer setDiagnosis(Modifier modifier, Prefix prefix, CodeableConcept Diagnosis)
		{
			return setParameter(Parameters.DIAGNOSIS, modifier, prefix, Diagnosis);
		}

		public ResourceInteractor.Composer setDiagnosis(Modifier modifier, CodeableConcept Diagnosis)
		{
			return setParameter(Parameters.DIAGNOSIS, modifier, Diagnosis);
		}

		public ResourceInteractor.Composer setDiagnosis(Prefix prefix, CodeableConcept Diagnosis)
		{
			return setParameter(Parameters.DIAGNOSIS, prefix, Diagnosis);
		}
        			
		public ResourceInteractor.Composer setDiagnosis(CodeableConcept Diagnosis)
		{
			return setParameter(Parameters.DIAGNOSIS, Diagnosis);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, DiagnosticReport.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, DiagnosticReport.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, DiagnosticReport.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(DiagnosticReport.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> DiagnosticReportInteractor.DiagnosticReportComposer Composer()
    {
        return new DiagnosticReportComposer();
    }

}