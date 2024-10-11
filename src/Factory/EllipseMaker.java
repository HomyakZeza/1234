package Factory;

import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class EllipseMaker implements ShapeMaker{

    @Override
    public void buildShape() {
        new Ellipse2D.Double();
    }
}
