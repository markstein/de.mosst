package de.mosst.spielwiese.no_class_def_found_error;

public class Tester {

	@SuppressWarnings("unused")
    public static void main(String[] args) {
		System.out.println("Start with INSTANCE");
		try {
			SingeltonClass_with_INSTANCE_as_field objectAleph = SingeltonClass_with_INSTANCE_as_field.INSTANCE;
		} catch (Throwable e) {
			System.out.println("The first initialization was wrong with this ErrorMessage: ");
			e.printStackTrace();
		}
		try {
			System.out.println("\nThe error message by every next acces:");
			SingeltonClass_with_INSTANCE_as_field objectBeth = SingeltonClass_with_INSTANCE_as_field.INSTANCE;
		} catch (Throwable e) {
			System.out.println("The first initialization was wrong with this ErrorMessage: ");
			e.printStackTrace();
		}
		
		
		
		System.out.println("\n\n\nStart with getInstance()");
		try {
			SingeltonClass_with_getInstanceO_Method objectGimel = SingeltonClass_with_getInstanceO_Method.getInstance();
		} catch (Throwable e) {
			System.out.println("The first initialization was wrong with this ErrorMessage: ");
			e.printStackTrace();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		}
		try {
			SingeltonClass_with_getInstanceO_Method objectDaleth = SingeltonClass_with_getInstanceO_Method.getInstance();
		} catch (Throwable e) {
			System.out.println("\nThe first initialization was wrong with this ErrorMessage: ");
			e.printStackTrace();
		}
	}

}
