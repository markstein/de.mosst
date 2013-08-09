package de.mosst.spielwiese.no_class_def_found_error;

public class SingeltonClass_with_INSTANCE_as_field {
	
	public static SingeltonClass_with_INSTANCE_as_field INSTANCE = new SingeltonClass_with_INSTANCE_as_field();
	
	private SingeltonClass_with_INSTANCE_as_field() {
		throw new RuntimeException("RuntimeException by instance with field");
    }

}
