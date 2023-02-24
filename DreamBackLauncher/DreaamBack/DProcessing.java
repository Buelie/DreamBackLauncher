package DreaamBack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DProcessing{
    public class Test{

    }
    public static void UserData(){
        String succeed = "[DreamBackLauncher/INFO]:The background started successfully\n";
        File data = new File("log.log");
        byte[] udata = succeed.getBytes();
        OutputStream out = null;
        try{
            out = new FileOutputStream(data,true);
            out.write(udata);
            out.flush();
            out.close();
            System.out.println(succeed);
        }catch (Exception e){
            System.out.println("[DreamBackLauncher/ERROR]:"+e);
        }finally {
            System.out.println("[DreamBackLauncher/INFO]:Background debugging completes");
        }
    }
    public static void Data(String data){
        String succeed = data+"\n";
        File dataTxt = new File("log.log");
        byte[] udata = succeed.getBytes();
        OutputStream out = null;
        try{
            out = new FileOutputStream(dataTxt,true);
            out.write(udata);
            out.flush();
            out.close();
            System.out.println(succeed);
        }catch (Exception ErrorT){
            ErrorT.printStackTrace();
        }finally {
            System.out.println("[DreamBackLauncher/INFO]:Print the information to the log");
        }
    }
}
