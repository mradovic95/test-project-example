import file.FileBasicOperation;
import org.reflections.Reflections;

import java.util.Set;

public class Main {

    public static void main(String args[]) throws IllegalAccessException, InstantiationException {
        //Instance reflection class
        Reflections reflections = new Reflections(".*");
        //Find all sub types for given type
        Set<Class<? extends FileBasicOperation>> subTypes =
                reflections.getSubTypesOf(FileBasicOperation.class);
        //Get first from set
        Class<? extends FileBasicOperation> implementation = (Class<? extends FileBasicOperation>) subTypes.toArray()[0];
        FileBasicOperation fileBasicOperation = implementation.newInstance();
        //Call method using specification
        fileBasicOperation.downlaodFile("path", "path");
    }
}
