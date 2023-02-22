import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import DreaamBack.DProcessing;
import java.sql.*;

//创建主窗体
public class main extends JFrame {
    private final JMenuItem Setting_Menu;

    private final JMenuItem Plugin_Menu;

    private final JMenuItem Version_Menu;

    private final JMenuItem Mods_Menu;

    private final JMenuItem Api_Menu;

    private Panel Background;

    public main() {

        //注册窗体属性
        //是否可缩放
        setResizable(true);
        //设置标题
        setTitle("梦回启动器");
        //关闭方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗体位置及大小
        setBounds(300, 173, 854, 480);
        //设置图标
        Toolkit tok = Toolkit.getDefaultToolkit();
        Image image = tok.getImage("resource/icon.png");
        setIconImage(image);

        //Toolkit tokt = Toolkit.getDefaultToolkit();
        //Image imaget = tokt.getImage("resource/bg.png");

        FlowLayout centre = new FlowLayout(FlowLayout.CENTER);
        JPanel StarGame = new JPanel(centre);
        getContentPane().add(StarGame, BorderLayout.PAGE_END);

        //设置背景色/背景图
        Toolkit tokk = Toolkit.getDefaultToolkit();
        Image imaget = tokk.getImage("resource/bg.png");
        ((JPanel) this.getContentPane()).setOpaque(false);
        ImageIcon bg = new ImageIcon(imaget);
        JLabel BackgroundImage = new JLabel(new ImageIcon(bg.getImage()));
        BackgroundImage.setVisible(true);


        //系统菜单
        //注册菜单栏
        JMenuBar Menu = new JMenuBar();
        setJMenuBar(Menu);
        //注册'启动器'菜单
        JMenu SystemMenu = new JMenu("启动器");
        Menu.add(SystemMenu);
        //注册'游戏'菜单
        JMenu GameMenu = new JMenu("游戏");
        Menu.add(GameMenu);
        //注册'启动器'菜单选项'设置'
        Setting_Menu = new JMenuItem("设置");
        SystemMenu.add(Setting_Menu);
        //注册'启动器'菜单选项'插件'
        Plugin_Menu = new JMenuItem("插件");
        SystemMenu.add(Plugin_Menu);
        //注册'游戏'菜单选项'版本'
        Version_Menu = new JMenuItem("版本");
        GameMenu.add(Version_Menu);
        //注册'游戏'菜单选项'ModAPI'
        Api_Menu = new JMenuItem("ModAPI");
        GameMenu.add(Api_Menu);
        //注册'游戏'菜单选项'Mods'
        Mods_Menu = new JMenuItem("Mods");
        GameMenu.add(Mods_Menu);

        JButton StartGame = new JButton("启动游戏");
        StarGame.add(StartGame);

        Setting_Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Open the Settings window");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Open the Settings window");
                }catch (Exception error){
                    error.printStackTrace();
                }
                //注册字窗体 - 设置窗体
                JFrame Setting_FRame = new JFrame();
                Setting_FRame.setResizable(true);
                Setting_FRame.setTitle("梦回启动器 - 设置");
                Setting_FRame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Setting_FRame.setBounds(300, 173, 854, 480);
                Setting_FRame.getContentPane().setBackground(new Color(255, 255, 255));
                Setting_FRame.setVisible(true);
                Toolkit tok = Toolkit.getDefaultToolkit();
                Image image = tok.getImage("resource/icon.png");
                setIconImage(image);

                FlowLayout centre = new FlowLayout(FlowLayout.CENTER);
                JPanel Setting = new JPanel(centre);
                getContentPane().add(Setting, BorderLayout.PAGE_END);

                JButton Back = new JButton("深色主题");
                JButton White = new JButton("浅色主题");

                Setting.add(Back);
                Setting.add(White);

                Setting_FRame.add(Setting);

                //深色主题切换
                Back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Back.setBackground(new Color(45,45,45));
                        Back.setForeground(new Color(255,255,255));

                        SystemMenu.setBackground(new Color(45,45,45));
                        SystemMenu.setForeground(new Color(255,255,255));

                        Setting_Menu.setBackground(new Color(45,45,45));
                        Setting_Menu.setForeground(new Color(255,255,255));

                        Plugin_Menu.setBackground(new Color(45,45,45));
                        Plugin_Menu.setForeground(new Color(255,255,255));

                        GameMenu.setBackground(new Color(45,45,45));
                        GameMenu.setForeground(new Color(255,255,255));

                        Version_Menu.setBackground(new Color(45,45,45));
                        Version_Menu.setForeground(new Color(255,255,255));

                        Api_Menu.setBackground(new Color(45,45,45));
                        Api_Menu.setForeground(new Color(255,255,255));

                        Mods_Menu.setBackground(new Color(45,45,45));
                        Mods_Menu.setForeground(new Color(255,255,255));

                        Menu.setForeground(new Color(255,255,255));
                        Menu.setBackground(new Color(45,45,45));

                    }
                });
            }
        });

        Plugin_Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Open the Plugins window");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Open the Plugins window");
                }catch (Exception error){
                    error.printStackTrace();
                }
                //注册字窗体 - 插件窗体
                JFrame Setting_FRame = new JFrame();
                Setting_FRame.setResizable(true);
                Setting_FRame.setTitle("梦回启动器 - 插件");
                Setting_FRame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Setting_FRame.setBounds(300, 173, 854, 480);
                Setting_FRame.getContentPane().setBackground(new Color(255, 255, 255));
                Setting_FRame.setVisible(true);
                setIconImage(image);
            }
        });

        Version_Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Open the GameVersion window");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Open the GameVersion window");
                }catch (Exception error){
                    error.printStackTrace();
                }
                //注册字窗体 - 游戏版本窗体
                JFrame Setting_FRame = new JFrame();
                Setting_FRame.setResizable(true);
                Setting_FRame.setTitle("梦回启动器 - 游戏版本");
                Setting_FRame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Setting_FRame.setBounds(300, 173, 854, 480);
                Setting_FRame.getContentPane().setBackground(new Color(255, 255, 255));
                Setting_FRame.setVisible(true);
                setIconImage(image);
            }
        });

        Mods_Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Open the Mods window");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Open the GameVersion window");
                }catch (Exception error){
                    error.printStackTrace();
                }
                //注册字窗体 - 设置窗体
                JFrame Setting_FRame = new JFrame();
                Setting_FRame.setResizable(true);
                Setting_FRame.setTitle("梦回启动器 - Mods");
                Setting_FRame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Setting_FRame.setBounds(300, 173, 854, 480);
                Setting_FRame.getContentPane().setBackground(new Color(255, 255, 255));
                Setting_FRame.setVisible(true);
                setIconImage(image);
            }
        });

        Api_Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Open the ModApi window");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Open the ModApi window");
                }catch (Exception error){
                    error.printStackTrace();
                }
                //注册字窗体 - 设置窗体
                JFrame Setting_FRame = new JFrame();
                Setting_FRame.setResizable(true);
                Setting_FRame.setTitle("梦回启动器 - Api");
                Setting_FRame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Setting_FRame.setBounds(300, 173, 854, 480);
                Setting_FRame.getContentPane().setBackground(new Color(255, 255, 255));
                Setting_FRame.setVisible(true);
                setIconImage(image);
            }
        });

        StartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //打印日志
                System.out.println("[DreamBackLauncher/INFO]:Strat Game");
                try{
                    DProcessing.Data("[DreamBackLauncher/INFO]:Strat Game");
                }catch (Exception error){
                    error.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        DProcessing.UserData();
        System.out.println("[DreamBackLauncher/INFO]:The launcher starts");
        main frame = new main();
        frame.setVisible(true);
    }
}
