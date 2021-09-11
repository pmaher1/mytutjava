package instance_of;

public class InstanceEvaluation {
    /**
     * Evaluates the instance type of a given object, reports back the type.
     * Returns "Integer" if an instance of Integer is passed,
     * "Double" if an instance of Double is passed,
     * "String" if an instance of String is passed,
     * "null" if no object (i.e. null) is passed,
     *  otherwise "".
     * @param object The object to be evaluated.
     * @return String referring to the type of object that is passed.
     */
    public static String evaluateInstanceType(Object object) {
        String value = "";
        if (object instanceof Integer){
            value = "Integer";
        }
        else if (object instanceof Double){
            value = "Double";
        }
        else if (object instanceof String){
            value = "String";
        }
        else if (object instanceof null){
            value =  "null";
        }
        else {
        }
        return value;
    }
}
