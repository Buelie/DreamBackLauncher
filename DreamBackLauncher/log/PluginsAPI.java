package log;

public class PluginsAPI {
    public static String LogData(String context, String PluginsName, String mode){
        try{
            if (mode.equals("INFO")){
                System.out.println("["+PluginsName+"/INFO]:"+context);
                return "200 : INFO";
            } else if (mode.equals("ERROR")) {
                System.out.println("["+PluginsName+"/ERROR]:"+context);
                return "200 : ERROR";
            } else if (mode.equals("WARN")) {
                System.out.println("["+PluginsName+"/WARN]:"+context);
                return "200 : WARN";
            }
        }catch (Exception ErrorOne){
            return "400";
        }finally {
            System.out.println("[Finally/INFO]:FINALLY");
        }
        return "[LogData/INFO]:NULL";
    }
    public static String ReturnLog(String context){
        try{
            return context;
        }catch (Exception ErrorTwo){
            return "400";
        }
    }
}
