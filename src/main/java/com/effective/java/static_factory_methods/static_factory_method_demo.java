package com.effective.java.static_factory_methods;

public class static_factory_method_demo {
		public static void main(String[] args){
				Services.registerDefaultProvider(new BSNL());
				Services.registerProvider("Airtel", new Airtel());

				UseService(Services.newInstance());
				UseService(Services.newInstance("Airtel"));
				UseService(Services.newInstance("Jio"));


				//Boolean.valueOf("True"); // static factory method
				//new Boolean("True"); // doing it via constructor

			//IType Type = ServiceProvider.getType1();
			// IType ServiceProvider.getType1(){// return Type2}

			//Client (uses Service) (You/Me) -> ServiceProviderFrmework(TRAI) <- ServiceProvider (Airtel/BSL/JIO)
					//Service Interface
					//ServiceProvider Interface
					// Registration/de-re API
					//Service Access API

		}

	private static void UseService(IService service) {
			service.CallingService();
			service.SMSService();
			service.InternetService();
	}
}
