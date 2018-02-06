package net.sf.nwn.loader;


import java.util.ArrayList;


public class DanglymeshGeomNode extends TrimeshGeomNode {

    public DanglymeshGeomNode(GeomNode parent) {
        super(parent);
        constraints = new ArrayList();
    }

    public String getType() {
        return "danglymesh";
    }

    public void addConstraint(float cons) {
        constraints.add(new Float(cons));
    }

}
