package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.TestReport.Result;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.TestReportService;

import com.xinonix.hl7.fhir.stu3.TestReport;

public class TestReportInteractor extends ResourceInteractor<TestReportService, TestReport> {

    public static class TestReportComposer extends Composer<TestReportService, TestReport, TestReportComposer> {

        public TestReportComposer()
        {
            super((Class) TestReportService.class, (Class) TestReport.class);
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

		public ResourceInteractor.Composer setParticipant(Modifier modifier, Prefix prefix, String Participant)
		{
			return setParameter(Parameters.PARTICIPANT, modifier, prefix, Participant);
		}

		public ResourceInteractor.Composer setParticipant(Modifier modifier, String Participant)
		{
			return setParameter(Parameters.PARTICIPANT, modifier, Participant);
		}

		public ResourceInteractor.Composer setParticipant(Prefix prefix, String Participant)
		{
			return setParameter(Parameters.PARTICIPANT, prefix, Participant);
		}
        			
		public ResourceInteractor.Composer setParticipant(String Participant)
		{
			return setParameter(Parameters.PARTICIPANT, Participant);
		}

		public ResourceInteractor.Composer setResult(Modifier modifier, Prefix prefix, TestReport.Result Result)
		{
			return setParameter(Parameters.RESULT, modifier, prefix, Result);
		}

		public ResourceInteractor.Composer setResult(Modifier modifier, TestReport.Result Result)
		{
			return setParameter(Parameters.RESULT, modifier, Result);
		}

		public ResourceInteractor.Composer setResult(Prefix prefix, TestReport.Result Result)
		{
			return setParameter(Parameters.RESULT, prefix, Result);
		}
        			
		public ResourceInteractor.Composer setResult(TestReport.Result Result)
		{
			return setParameter(Parameters.RESULT, Result);
		}

		public ResourceInteractor.Composer setTester(Modifier modifier, Prefix prefix, String Tester)
		{
			return setParameter(Parameters.TESTER, modifier, prefix, Tester);
		}

		public ResourceInteractor.Composer setTester(Modifier modifier, String Tester)
		{
			return setParameter(Parameters.TESTER, modifier, Tester);
		}

		public ResourceInteractor.Composer setTester(Prefix prefix, String Tester)
		{
			return setParameter(Parameters.TESTER, prefix, Tester);
		}
        			
		public ResourceInteractor.Composer setTester(String Tester)
		{
			return setParameter(Parameters.TESTER, Tester);
		}

    }

    public static <T> TestReportInteractor.TestReportComposer Composer()
    {
        return new TestReportComposer();
    }

}