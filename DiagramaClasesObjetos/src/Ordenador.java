import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ac6bfad0-482d-4f7d-be41-51b3d4ffeb46")
public class Ordenador {
    @mdl.prop
    @objid ("f45885bc-8925-4678-bfa1-2f50ec4922a8")
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
    @objid ("4cc568a0-61fd-4ef6-8a6f-c9f1e4f9644e")
    private int potencia;

    @mdl.propgetter
    public int getPotencia() {
        // Automatically generated method. Please do not modify this code.
        return this.potencia;
    }

    @mdl.propsetter
    public void setPotencia(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.potencia = value;
    }

    @mdl.prop
    @objid ("2744e2ad-5c77-4c8d-9fb0-0af6a7fc8f73")
    private int memoria;

    @mdl.propgetter
    public int getMemoria() {
        // Automatically generated method. Please do not modify this code.
        return this.memoria;
    }

    @mdl.propsetter
    public void setMemoria(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.memoria = value;
    }

    @objid ("ed8dfb2b-aa65-4444-8b61-4e49d69f4fdb")
    public boolean apagar() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("b85de634-3064-4db7-91ae-ee80731da2ac")
    public boolean encender() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("59a3f68a-e19a-41fc-9e61-9e61f0def302")
    public class Ordenador {
        @mdl.prop
        @objid ("cb102bd9-9c25-4b48-a757-40021a649550")
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
        @objid ("0c68081e-858a-4232-856b-b51b81d26973")
        private int potencia;

        @mdl.propgetter
        public int getPotencia() {
            // Automatically generated method. Please do not modify this code.
            return this.potencia;
        }

        @mdl.propsetter
        public void setPotencia(final int value) {
            // Automatically generated method. Please do not modify this code.
            this.potencia = value;
        }

        @mdl.prop
        @objid ("cefd2b6e-42c1-494e-9c70-434ce0b0e4d4")
        private int memoria;

        @mdl.propgetter
        public int getMemoria() {
            // Automatically generated method. Please do not modify this code.
            return this.memoria;
        }

        @mdl.propsetter
        public void setMemoria(final int value) {
            // Automatically generated method. Please do not modify this code.
            this.memoria = value;
        }

        @objid ("82b9b95b-d5c6-40d3-be38-96b7063267ad")
        public boolean apagar() {
            // TODO Auto-generated return
            return false;
        }

        @objid ("412fb302-99ff-4e0a-873b-ea7bab88b73b")
        public boolean encender() {
            // TODO Auto-generated return
            return false;
        }

    }

}
