import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("83892c96-8d37-4008-98bf-4ee406046379")
public class MensajeElectronico {
    @mdl.prop
    @objid ("5c876865-4b60-43dc-8003-cb076182366f")
    private String titulo;

    @mdl.propgetter
    public String getTitulo() {
        // Automatically generated method. Please do not modify this code.
        return this.titulo;
    }

    @mdl.propsetter
    public void setTitulo(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.titulo = value;
    }

    @mdl.prop
    @objid ("db330e20-31dd-42cb-860f-8686bcdfe4f5")
    private String destinatario;

    @mdl.propgetter
    public String getDestinatario() {
        // Automatically generated method. Please do not modify this code.
        return this.destinatario;
    }

    @mdl.propsetter
    public void setDestinatario(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.destinatario = value;
    }

}
