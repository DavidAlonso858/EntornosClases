import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b530843-3cfe-4284-98cb-8c4b22162f26")
public class Persona {
    @mdl.prop
    @objid ("293c77c5-8467-4543-82c9-a45bb4432779")
    private String nombre;

    @mdl.propgetter
    public String getNombre() {
        // Automatically generated method. Please do not modify this code.
        return this.nombre;
    }

    @mdl.propsetter
    public void setNombre(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nombre = value;
    }

}
