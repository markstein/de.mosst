package de.mosst.playarea.resteasy;


public class PlayareaRsServer implements PlayareaRsInterface{
    

    @Override
    public void save(ComplexeObjectAleph objectAleph, ComplexeObjectBeth objectBeth) {
        System.out.println("Aleph: " + objectAleph.aleph);
        System.out.println("Beth:  " + objectBeth.beth);
    }

}
