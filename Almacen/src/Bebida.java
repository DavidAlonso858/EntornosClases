import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("14c89536-2e91-414e-8fba-b3b992779f5b")
public class Bebida {
    @mdl.prop
    @objid ("1ab0124f-e4eb-4f56-8be1-37c06dc0a58c")
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
    @objid ("3d458e76-76d0-4319-8a01-82b84efc9954")
    private double precio;

    @mdl.propgetter
    public double getPrecio() {
        // Automatically generated method. Please do not modify this code.
        return this.precio;
    }

    @mdl.propsetter
    public void setPrecio(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.precio = value;
    }

    @mdl.prop
    @objid ("5960a908-e52e-4682-99c4-4005176fdeb6")
    private double volumen;

    @mdl.propgetter
    public double getVolumen() {
        // Automatically generated method. Please do not modify this code.
        return this.volumen;
    }

    @mdl.propsetter
    public void setVolumen(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.volumen = value;
    }

    @objid ("ded288c5-db2f-4d35-80a2-32a9c9f0075b")
    public double calcularPrecio(): double(final double precio) {
        // TODO Auto-generated return
        return 0;
    }

}
