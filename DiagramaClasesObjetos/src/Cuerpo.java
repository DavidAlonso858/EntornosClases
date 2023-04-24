import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("46b3146d-0e94-4993-84db-aca09d22a70e")
public class Cuerpo {
    @mdl.prop
    @objid ("baec00b7-99e0-4a05-bd93-59e71ff2d24d")
    private String texto;

    @mdl.propgetter
    public String getTexto() {
        // Automatically generated method. Please do not modify this code.
        return this.texto;
    }

    @mdl.propsetter
    public void setTexto(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.texto = value;
    }

    @objid ("5f7c8f93-ac20-4469-9d75-6b3ba8b89d1c")
    public List<MensajeElectronico>  = new ArrayList<MensajeElectronico> ();

}
