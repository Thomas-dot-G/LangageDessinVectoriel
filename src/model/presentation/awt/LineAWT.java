package model.presentation.awt;

import model.Shape;
import model.presentation.ShapeState;
import model.specific_path.Line;

import java.awt.*;

/**
 * Created by Xiaxing SHI on 11/11/15.
 */
public class LineAWT implements ShapeState {
    private Line line;
    private StateDelegate delegate;

    public LineAWT(Line line, StateDelegate delegate) {
        this.line = line;
        this.delegate = delegate;
    }

    @Override
    public Object getDrawing() {
        Graphics2D g = delegate.getGraphics2D();

        g.setStroke(new BasicStroke(this.line.getPencil().getWidth()));
        g.drawLine(this.line.getX1(), this.line.getY1(), this.line.getX2(), this.line.getY2());

        return this;
    }

    @Override
    public void setShape(Shape shape) throws Exception {

    }
}
