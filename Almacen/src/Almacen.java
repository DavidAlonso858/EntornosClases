import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ac18dff8-5e3f-4e6e-bf50-778fdb8e37e8")
public class Almacen {
    @mdl.prop
    @objid ("bd1fd0d4-74d3-40f3-a6ff-29e90020cfbb")
    private Bebida bebidas: ArrayList;

    @mdl.propgetter
    public Bebida getBebidas: ArrayList() {
        // Automatically generated method. Please do not modify this code.
        return this.bebidas: ArrayList;
    }

    @mdl.propsetter
    public void setBebidas: ArrayList(final Bebida value) {
        // Automatically generated method. Please do not modify this code.
        this.bebidas: ArrayList = value;
    }

    @objid ("b854331f-d250-46d1-bfd3-88f06954beb1")
    public List<Bebida> almacena = new ArrayList<Bebida> ();

    @objid ("b4acb72c-955a-4ca5-aa6e-acaa2c03da64")
    public Bebida agregarBebida(Bebida)(final Bebida b) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("59a5cb75-301f-467b-99b4-47f53a00e10b")
    public Bebida eliminarBebida(Bebida)(final Bebida b) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("a82e22c7-883a-453e-a5d4-0a9c78f688bf")
    public void mostrarBebidas() {
    }

    @objid ("4da1b42c-efb1-4ba9-bf53-ced63576c03f")
    public double calcularPrecioBebidas() {
        // TODO Auto-generated return
        return 0;
    }

}
