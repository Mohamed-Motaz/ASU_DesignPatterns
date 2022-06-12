package CreationalPatterns.Prototype;

import java.util.Hashtable;

public class ShapeCache {
    protected Hashtable<String, Shape> shapeMap =
            new Hashtable<>();

    protected Shape getShape(String id){
        Shape s = shapeMap.get(id);
        return (Shape)s.clone();
    }

    protected void loadCache(){
        Circle circle = new Circle();
        shapeMap.put("circle", circle);

        Rectangle rect = new Rectangle();
        shapeMap.put("rectangle", rect);
    }
}
