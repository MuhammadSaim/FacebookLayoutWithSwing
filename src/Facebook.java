import javax.swing.*;
import java.awt.*;

/**
 * Created by muhammadsaim on 8/9/17.
 */
public class Facebook extends JFrame{

    public Facebook(){


        //setting up Frame
        super("Facebook");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        //setting up panel for navbar
        JPanel navbar = new JPanel();
        navbar.setBounds(0, 0, 1280, 83);
        navbar.setBackground(Color.decode("#3b5998"));
        add(navbar);

        //set facebook logo
        navbar.setLayout(null);
        ImageIcon fb_logo = new ImageIcon("images/Facebook_white_logo_small.png");
        JLabel icon = new JLabel(fb_logo);
        icon.setBounds(60, 20, 174, 34);
        navbar.add(icon);

        //label for username
        JLabel usernamelabel = new JLabel("Username");
        usernamelabel.setForeground(Color.white);
        usernamelabel.setBounds(650, 15, 200, 15);

        //username text filed
        JTextField username = new JTextField(20);
        username.setBounds(650, 33, 200, 25);


        //label for password
        JLabel passwordlabel = new JLabel("Password");
        passwordlabel.setForeground(Color.white);
        passwordlabel.setBounds(870, 15, 200, 15);


        //textfield for password
        JPasswordField loginPass = new JPasswordField();
        loginPass.setBounds(870, 33, 200, 25);

        //forgot passsord label
        JLabel forgotPass = new JLabel("Forgotten account?");
        forgotPass.setBounds(870, 28, 250, 80);
        forgotPass.setFont(new Font("Helvatica", Font.PLAIN, 11));
        forgotPass.setForeground(Color.decode("#9cb4d8"));


        //login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(1080, 33, 75, 25);
        loginButton.setBackground(Color.decode("#4267b2"));
        loginButton.setForeground(Color.WHITE);

        //adding field elements
        navbar.add(usernamelabel);
        navbar.add(username);
        navbar.add(passwordlabel);
        navbar.add(loginPass);
        navbar.add(forgotPass);
        navbar.add(loginButton);

        //navbar ends here


        //main page left side layout starts

        //creating panel
        JPanel bodyPanel = new JPanel(){
            //this is for gradient on body panel white and light gray
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth();
                int h = getHeight();
                Color color1 = Color.decode("#ffffff");
                Color color2 = Color.decode("#D3D8E8");
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);
            }
        };
        bodyPanel.setBounds(0, 83, 1280, 637);
        add(bodyPanel);

        //set layout of bodyPanel
        bodyPanel.setLayout(null);


        //about facebook
        JLabel aboutFacebook1 = new JLabel("Facebook helps you connect and share with the");
        JLabel aboutFacebook2 = new JLabel("people in your life.");
        aboutFacebook1.setBounds(75, 10, 600, 100);
        aboutFacebook2.setBounds(75, 35, 400, 100);

        //setting up font colors
        aboutFacebook1.setForeground(Color.decode("#0e385f"));
        aboutFacebook2.setForeground(Color.decode("#0e385f"));

        //setting up fonts
        aboutFacebook1.setFont(new Font("Helvetica", Font.BOLD, 25));
        aboutFacebook2.setFont(new Font("Helvetica", Font.BOLD, 25));


        //setting up networking image
        ImageIcon fb_ntwrk_image = new ImageIcon("images/socialNetworkImage.png");
        JLabel fb_ntwrk_img = new JLabel(fb_ntwrk_image);
        fb_ntwrk_img.setBounds(75, 120, 537, 195);


        //main page left side layout ends


        //main page right side layout starts


        //create account text heading
        JLabel createAccount  = new JLabel("Create an account");
        createAccount.setForeground(Color.decode("#333333"));
        createAccount.setFont(new Font("Helvetica", Font.BOLD, 36));
        createAccount.setBounds(745, -20, 450, 150);


        //text simple
        JLabel simpleText  = new JLabel("It's free and always will be.");
        simpleText.setForeground(Color.decode("#1d2129"));
        simpleText.setFont(new Font("Helvetica", Font.PLAIN, 19));
        simpleText.setBounds(750, 20, 450, 150);


        //creating signup form

        //first name filed
        JTextField firstname = new JTextField(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);

                if(getText().isEmpty() && ! (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
                    Graphics2D g2 = (Graphics2D)g.create();
                    g2.setBackground(Color.decode("#bdc7d8"));
                    g2.setFont(new Font("Helvatica", Font.PLAIN, 19));
                    g2.drawString("First Name", 5, 25); //figure out x, y from font's FontMetrics and size of component.
                    g2.dispose();
                }
            }
        };
        firstname.setBounds(750, 135, 200, 40);
        firstname.setForeground(Color.decode("#aeaeae"));

        //sur name filed
        JTextField surname = new JTextField(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);

                if(getText().isEmpty() && ! (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
                    Graphics2D g2 = (Graphics2D)g.create();
                    g2.setBackground(Color.decode("#bdc7d8"));
                    g2.setFont(new Font("Helvatica", Font.PLAIN, 19));
                    g2.drawString("Sur Name", 5, 25); //figure out x, y from font's FontMetrics and size of component.
                    g2.dispose();
                }
            }
        };
        surname.setBounds(975, 135, 200, 40);
        surname.setForeground(Color.decode("#aeaeae"));


        //email or number filed
        JTextField emailornum = new JTextField(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);

                if(getText().isEmpty() && ! (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
                    Graphics2D g2 = (Graphics2D)g.create();
                    g2.setBackground(Color.decode("#bdc7d8"));
                    g2.setFont(new Font("Helvatica", Font.PLAIN, 19));
                    g2.drawString("Mobile number or email address", 5, 25); //figure out x, y from font's FontMetrics and size of component.
                    g2.dispose();
                }
            }
        };
        emailornum.setBounds(750, 185, 425, 40);
        emailornum.setForeground(Color.decode("#aeaeae"));



        //email or number filed
        JTextField pass = new JPasswordField(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);

                if(getText().isEmpty() && ! (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
                    Graphics2D g2 = (Graphics2D)g.create();
                    g2.setBackground(Color.decode("#bdc7d8"));
                    g2.setFont(new Font("Helvatica", Font.PLAIN, 19));
                    g2.drawString("New Password", 5, 25); //figure out x, y from font's FontMetrics and size of component.
                    g2.dispose();
                }
            }
        };
        pass.setBounds(750, 235, 425, 40);
        pass.setForeground(Color.decode("#aeaeae"));



        //birthday slection
        JLabel birthday = new JLabel("Birthday");
        birthday.setFont(new Font("Helvatica", Font.PLAIN, 20));
        birthday.setForeground(Color.decode("#1d2129"));
        birthday.setBounds(750, 295, 200, 30);


        //days string
        String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String years[] = {"2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"};


        //day comboBox
        JComboBox daysList = new JComboBox(days);
        daysList.setBounds(750, 330, 60, 30);

        //month comboBox
        JComboBox monthList = new JComboBox(months);
        monthList.setBounds(813, 330, 85, 30);

        //year comboBox
        JComboBox yearList = new JComboBox(years);
        yearList.setBounds(901,330, 85, 30);


        //note label
        JLabel noteLabel1 = new JLabel("Why do I need to provide my");
        JLabel noteLabel2 = new JLabel("date of birth?");
        noteLabel1.setFont(new Font("Helvatica", Font.PLAIN, 11));
        noteLabel2.setFont(new Font("Helvatica", Font.PLAIN, 11));
        noteLabel1.setForeground(Color.decode("#365899"));
        noteLabel2.setForeground(Color.decode("#365899"));
        noteLabel1.setBounds(990, 322, 185, 30);
        noteLabel2.setBounds(990, 338, 185, 30);


        //Gender radio buttons
        JRadioButton female = new JRadioButton("Female");
        JRadioButton male = new JRadioButton("Male");
        female.setBounds(750, 375, 100, 30);
        male.setBounds(850, 375, 100, 30);
        female.setFont(new Font("Helvatica", Font.BOLD, 18));
        male.setFont(new Font("Helvatica", Font.BOLD, 18));
        male.setBackground(Color.decode("#E4E7F1"));
        female.setBackground(Color.decode("#E4E7F1"));



        //label for terms and conditions
        JLabel termsAndCondition = new JLabel("<html>By clicking Create an account, you agree to our <a href=\"\">Terms</a> and<br>confirm that you have read our <a href=\"\">Data Policy</a>, including our <a href=\"\">Cookie</a><br><a href=\"\">Use Policy</a>. You may receive SMS message notifications from<br>Facebook and can opt out at any time.</html>");
        termsAndCondition.setBounds(750, 340, 400, 200);
        termsAndCondition.setForeground(Color.decode("#777777"));
        termsAndCondition.setFont(new Font("Helvatica", Font.PLAIN, 11));


        //create an account button
        JButton createAccountButton = new JButton("Create an account");
        createAccountButton.setBounds(750, 485, 300, 50);
        createAccountButton.setFont(new Font("Halvatica", Font.BOLD, 19));
        createAccountButton.setForeground(Color.white);
        createAccountButton.setBackground(Color.decode("#578843"));



        //adding components to bodyPanel
        bodyPanel.add(aboutFacebook1);
        bodyPanel.add(aboutFacebook2);
        bodyPanel.add(fb_ntwrk_img);
        bodyPanel.add(createAccount);
        bodyPanel.add(simpleText);
        bodyPanel.add(firstname);
        bodyPanel.add(surname);
        bodyPanel.add(emailornum);
        bodyPanel.add(pass);
        bodyPanel.add(birthday);
        bodyPanel.add(daysList);
        bodyPanel.add(monthList);
        bodyPanel.add(yearList);
        bodyPanel.add(noteLabel1);
        bodyPanel.add(noteLabel2);
        bodyPanel.add(female);
        bodyPanel.add(male);
        bodyPanel.add(termsAndCondition);
        bodyPanel.add(createAccountButton);





        //setting frame visiblity
        setVisible(true);
    }//constructor ends here


    public static void main(String[] args) {
        Facebook fb = new Facebook();
    }//end main method here


}//end facebook class here
