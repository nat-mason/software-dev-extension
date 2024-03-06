import java.util.ArrayList; // import important  functions
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> parsedArgs = parseArgs(args); // create the has map
        System.out.println(parsedArgs); // print out the parse args
    }

    private static HashMap<String, ArrayList<String>> parseArgs(String[] args){
        HashMap<String, ArrayList<String>> parsedArgs = new HashMap<>(); // init the hash map with parsed args
        ArrayList<String> argValues = null; // set the arg values to null
        for(String arg : args){ // define what is to be iterated over
            if (arg.startsWith("-")) {
                argValues = new ArrayList<>();
                parsedArgs.put(arg, argValues);
                continue;
            }
            if(argValues != null){ // avoid null pointer error
                argValues.add(arg);
            }
        }
        return parsedArgs;

    }
}

