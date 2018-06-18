package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Device.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.DeviceService;

import com.xinonix.hl7.fhir.stu3.Device;

public class DeviceInteractor extends ResourceInteractor<DeviceService, Device> {

    public static class DeviceComposer extends Composer<DeviceService, Device, DeviceComposer> {

        public DeviceComposer()
        {
            super((Class) DeviceService.class, (Class) Device.class);
        }

		public ResourceInteractor.Composer setDeviceName(Modifier modifier, Prefix prefix, String DeviceName)
		{
			return setParameter(Parameters.DEVICE_NAME, modifier, prefix, DeviceName);
		}

		public ResourceInteractor.Composer setDeviceName(Modifier modifier, String DeviceName)
		{
			return setParameter(Parameters.DEVICE_NAME, modifier, DeviceName);
		}

		public ResourceInteractor.Composer setDeviceName(Prefix prefix, String DeviceName)
		{
			return setParameter(Parameters.DEVICE_NAME, prefix, DeviceName);
		}
        			
		public ResourceInteractor.Composer setDeviceName(String DeviceName)
		{
			return setParameter(Parameters.DEVICE_NAME, DeviceName);
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

		public ResourceInteractor.Composer setManufacturer(Modifier modifier, Prefix prefix, String Manufacturer)
		{
			return setParameter(Parameters.MANUFACTURER, modifier, prefix, Manufacturer);
		}

		public ResourceInteractor.Composer setManufacturer(Modifier modifier, String Manufacturer)
		{
			return setParameter(Parameters.MANUFACTURER, modifier, Manufacturer);
		}

		public ResourceInteractor.Composer setManufacturer(Prefix prefix, String Manufacturer)
		{
			return setParameter(Parameters.MANUFACTURER, prefix, Manufacturer);
		}
        			
		public ResourceInteractor.Composer setManufacturer(String Manufacturer)
		{
			return setParameter(Parameters.MANUFACTURER, Manufacturer);
		}

		public ResourceInteractor.Composer setModel(Modifier modifier, Prefix prefix, String Model)
		{
			return setParameter(Parameters.MODEL, modifier, prefix, Model);
		}

		public ResourceInteractor.Composer setModel(Modifier modifier, String Model)
		{
			return setParameter(Parameters.MODEL, modifier, Model);
		}

		public ResourceInteractor.Composer setModel(Prefix prefix, String Model)
		{
			return setParameter(Parameters.MODEL, prefix, Model);
		}
        			
		public ResourceInteractor.Composer setModel(String Model)
		{
			return setParameter(Parameters.MODEL, Model);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Device.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Device.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Device.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Device.Status Status)
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

		public ResourceInteractor.Composer setUdiCarrier(Modifier modifier, Prefix prefix, String UdiCarrier)
		{
			return setParameter(Parameters.UDI_CARRIER, modifier, prefix, UdiCarrier);
		}

		public ResourceInteractor.Composer setUdiCarrier(Modifier modifier, String UdiCarrier)
		{
			return setParameter(Parameters.UDI_CARRIER, modifier, UdiCarrier);
		}

		public ResourceInteractor.Composer setUdiCarrier(Prefix prefix, String UdiCarrier)
		{
			return setParameter(Parameters.UDI_CARRIER, prefix, UdiCarrier);
		}
        			
		public ResourceInteractor.Composer setUdiCarrier(String UdiCarrier)
		{
			return setParameter(Parameters.UDI_CARRIER, UdiCarrier);
		}

		public ResourceInteractor.Composer setUdiDi(Modifier modifier, Prefix prefix, String UdiDi)
		{
			return setParameter(Parameters.UDI_DI, modifier, prefix, UdiDi);
		}

		public ResourceInteractor.Composer setUdiDi(Modifier modifier, String UdiDi)
		{
			return setParameter(Parameters.UDI_DI, modifier, UdiDi);
		}

		public ResourceInteractor.Composer setUdiDi(Prefix prefix, String UdiDi)
		{
			return setParameter(Parameters.UDI_DI, prefix, UdiDi);
		}
        			
		public ResourceInteractor.Composer setUdiDi(String UdiDi)
		{
			return setParameter(Parameters.UDI_DI, UdiDi);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, modifier, prefix, Url);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, String Url)
		{
			return setParameter(Parameters.URL, modifier, Url);
		}

		public ResourceInteractor.Composer setUrl(Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, prefix, Url);
		}
        			
		public ResourceInteractor.Composer setUrl(String Url)
		{
			return setParameter(Parameters.URL, Url);
		}

    }

    public static <T> DeviceInteractor.DeviceComposer Composer()
    {
        return new DeviceComposer();
    }

}