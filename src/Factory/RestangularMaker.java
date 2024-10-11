package Factory;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RestangularMaker implements ShapeMaker{

    @Override
    public void buildShape() {
        new Rectangle2D.Double();
    }
}
