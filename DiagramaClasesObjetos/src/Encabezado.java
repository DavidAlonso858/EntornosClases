import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f99edc12-0bc6-4cb8-bd5b-cfe81b73c9ff")
public class Encabezado {
    @mdl.prop
    @objid ("1ca12a7a-8965-4cca-8f54-d070d0eb1fbe")
    private String asunto;

    @mdl.propgetter
    public String getAsunto() {
        // Automatically generated method. Please do not modify this code.
        return this.asunto;
    }

    @mdl.propsetter
    public void setAsunto(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.asunto = value;
    }

    @mdl.prop
    @objid ("faefd330-100d-45a5-acfc-26598d70a403")
    private Date fecha;

    @mdl.propgetter
    public Date getFecha() {
        // Automatically generated method. Please do not modify this code.
        return this.fecha;
    }

    @mdl.propsetter
    public void setFecha(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.fecha = value;
    }

    @objid ("de6cd7b2-e125-438d-aec4-2782020eca90")
    public List<MensajeElectronico>  = new ArrayList<MensajeElectronico> ();

}
