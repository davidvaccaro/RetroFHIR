package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Sequence.Type;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SequenceService;

import com.xinonix.hl7.fhir.stu3.Sequence;

public class SequenceInteractor extends ResourceInteractor<SequenceService, Sequence> {

    public static class SequenceComposer extends Composer<SequenceService, Sequence, SequenceComposer> {

        public SequenceComposer()
        {
            super((Class) SequenceService.class, (Class) Sequence.class);
        }

		public ResourceInteractor.Composer setChromosome(Modifier modifier, Prefix prefix, CodeableConcept Chromosome)
		{
			return setParameter(Parameters.CHROMOSOME, modifier, prefix, Chromosome);
		}

		public ResourceInteractor.Composer setChromosome(Modifier modifier, CodeableConcept Chromosome)
		{
			return setParameter(Parameters.CHROMOSOME, modifier, Chromosome);
		}

		public ResourceInteractor.Composer setChromosome(Prefix prefix, CodeableConcept Chromosome)
		{
			return setParameter(Parameters.CHROMOSOME, prefix, Chromosome);
		}
        			
		public ResourceInteractor.Composer setChromosome(CodeableConcept Chromosome)
		{
			return setParameter(Parameters.CHROMOSOME, Chromosome);
		}

		public ResourceInteractor.Composer setCoordinate(Modifier modifier, Prefix prefix, String Coordinate)
		{
			return setParameter(Parameters.COORDINATE, modifier, prefix, Coordinate);
		}

		public ResourceInteractor.Composer setCoordinate(Modifier modifier, String Coordinate)
		{
			return setParameter(Parameters.COORDINATE, modifier, Coordinate);
		}

		public ResourceInteractor.Composer setCoordinate(Prefix prefix, String Coordinate)
		{
			return setParameter(Parameters.COORDINATE, prefix, Coordinate);
		}
        			
		public ResourceInteractor.Composer setCoordinate(String Coordinate)
		{
			return setParameter(Parameters.COORDINATE, Coordinate);
		}

		public ResourceInteractor.Composer setEnd(Modifier modifier, Prefix prefix, Double End)
		{
			return setParameter(Parameters.END, modifier, prefix, End);
		}

		public ResourceInteractor.Composer setEnd(Modifier modifier, Double End)
		{
			return setParameter(Parameters.END, modifier, End);
		}

		public ResourceInteractor.Composer setEnd(Prefix prefix, Double End)
		{
			return setParameter(Parameters.END, prefix, End);
		}
        			
		public ResourceInteractor.Composer setEnd(Double End)
		{
			return setParameter(Parameters.END, End);
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

		public ResourceInteractor.Composer setStart(Modifier modifier, Prefix prefix, Double Start)
		{
			return setParameter(Parameters.START, modifier, prefix, Start);
		}

		public ResourceInteractor.Composer setStart(Modifier modifier, Double Start)
		{
			return setParameter(Parameters.START, modifier, Start);
		}

		public ResourceInteractor.Composer setStart(Prefix prefix, Double Start)
		{
			return setParameter(Parameters.START, prefix, Start);
		}
        			
		public ResourceInteractor.Composer setStart(Double Start)
		{
			return setParameter(Parameters.START, Start);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, Sequence.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Sequence.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, Sequence.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(Sequence.Type Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

    }

    public static <T> SequenceInteractor.SequenceComposer Composer()
    {
        return new SequenceComposer();
    }

}