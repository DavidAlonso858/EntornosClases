import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c7a4aedb-0c3a-4b18-8fd1-bf37ef76fc11")
public class ArchivoAdjunto {
    @mdl.prop
    @objid ("c31f5d55-e804-46b9-b6c4-067d40f5c2a8")
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

    @mdl.prop
    @objid ("0191dad4-061a-4f7f-88d8-ce9eba9d244d")
    private String tipo;

    @mdl.propgetter
    public String getTipo() {
        // Automatically generated method. Please do not modify this code.
        return this.tipo;
    }

    @mdl.propsetter
    public void setTipo(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.tipo = value;
    }

    @mdl.prop
    @objid ("6dfbce7a-c22c-4174-b0a9-43b839363316")
    private int tamaño;

    @mdl.propgetter
    public int getTamaño() {
        // Automatically generated method. Please do not modify this code.
        return this.tamaño;
    }

    @mdl.propsetter
    public void setTamaño(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.tamaño = value;
    }

    @objid ("3da6ad69-db54-4522-ab77-9c2a503b438b")
    public List<MensajeElectronico>  = new ArrayList<MensajeElectronico> ();

}
