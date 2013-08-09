package de.mosst.spielwiese.no_class_def_found_error;

public class SingeltonClass_with_getInstanceO_Method {

	private static SingeltonClass_with_getInstanceO_Method INSTANCE;
	
	private SingeltonClass_with_getInstanceO_Method() {
		throw new RuntimeException("RuntimeException by instance with getInstanceO_Method");
    }
	
	public static SingeltonClass_with_getInstanceO_Method getInstance(){
		if(INSTANCE == null){
			INSTANCE = new SingeltonClass_with_getInstanceO_Method();
		}
		return INSTANCE;
	}

}
