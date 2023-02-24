package log;

import log.PluginsAPI;

import javax.swing.*;

public class TestAPI {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setResizable(true);
        //设置标题
        jf.setTitle("梦回启动器 - API调试工具");
        //关闭方式
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗体位置及大小
        jf.setBounds(300, 173, 854, 480);
        jf.setVisible(true);
    }
}
