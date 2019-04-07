import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class reg_form extends Frame implements ActionListener
{
    String msg;
    Button b1=new Button("SAVE DETAILS");
    Label l0=new Label("STUDENT DETAILS",Label.CENTER);
    Label l1=new Label("NAME:",Label.LEFT);
    Label l2=new Label("AGE:",Label.LEFT);
    Label l3=new Label("SEX (M/F):",Label.LEFT);
    Label l4=new Label("ROLL No.:",Label.LEFT);
    Label l5=new Label("SCHOOL NAME:",Label.LEFT);
    Label l6=new Label("SEMESTER:",Label.LEFT);
    Label l7=new Label("HOBBIES:",Label.LEFT);
    TextField t1=new TextField();
    Choice c1=new Choice();
    CheckboxGroup cb1=new CheckboxGroup();
    Checkbox ck1=new Checkbox("MALE",false,cb1);
    Checkbox ck2=new Checkbox("FEMALE",false,cb1);
    Checkbox ck3=new Checkbox("TRANS",false,cb1);
    TextField t2=new TextField();
    Choice course=new Choice();
    Choice sem=new Choice();
    Choice age=new Choice();

    CheckboxGroup cb2=new CheckboxGroup();
    Checkbox ck4=new Checkbox("MUSIC",false,cb2);
    Checkbox ck5=new Checkbox("MOVIES",false,cb2);
    Checkbox ck6=new Checkbox("TRAVELING",false,cb2);
    Checkbox ck7=new Checkbox("EATING",false,cb2);
    Checkbox ck8=new Checkbox("SLEEPING",false,cb2);
    Checkbox ck9=new Checkbox("READING",false,cb2);
    Checkbox ck10=new Checkbox("WRITING",false,cb2);
    Checkbox ck11=new Checkbox("ART",false,cb2);
    Checkbox ck12=new Checkbox("COLLECTING",false,cb2);
    public reg_form()
    {
      addWindowListener(new myWindowAdapter());
      setBackground(Color.pink);
      setForeground(Color.black);
      setLayout(null);
      add(l0);  add(l1);  add(l2);  add(l3);
      add(l4);  add(l5);  add(l6);
      add(l7);  add(t1);
      add(t2);  add(ck1); add(ck2);  add(ck3);
      add(ck4); add(ck5);  add(ck6); add(ck7);
      add(ck8); add(ck9);  add(ck10);  add(ck11);
      add(ck12);  add(course);  add(sem); add(age);
      add(b1);   b1.addActionListener(this);  add(b1);

      course.add("USICT");
      course.add("USMS" );
      course.add("USCT");
      course.add("USBT");
      course.add("USAP");
      course.add("USMBBS");
      course.add("USLLS");

      sem.add("1"); sem.add("2");  sem.add("3");
      sem.add("4"); sem.add("5");  sem.add("6");
      sem.add("7"); sem.add("8");  sem.add("9");
      sem.add("10");
      age.add("15");  age.add("16");  age.add("17");
      age.add("18");  age.add("19");  age.add("20");
      age.add("21");  age.add("20");  age.add("21");
      age.add("22");  age.add("23");
      l1.setBounds(75,65,100,20); l2.setBounds(75,100,100,20);
      l3.setBounds(75,145,100,20);  l4.setBounds(75,175,100,20);
      l5.setBounds(75,205,100,20);  l6.setBounds(75,240,100,20);
      l7.setBounds(75,270,100,20);  l0.setBounds(100,40,280,20);
      t1.setBounds(175,65,170,20);  t2.setBounds(175,175,170,20);
      ck1.setBounds(175,145,100,20);  ck2.setBounds(275,145,100,20);
      ck3.setBounds(375,145,100,20);  course.setBounds(175,205,125,20);
      sem.setBounds(175,240,80,20); age.setBounds(175,100,80,20);
      b1.setBounds(160,370,140,30); ck4.setBounds(175,270,100,20);
      ck5.setBounds(275,270,100,20);  ck6.setBounds(375,270,100,20);
      ck7.setBounds(175,305,100,20);  ck8.setBounds(275,305,100,20);
      ck9.setBounds(375,305,100,20);  ck10.setBounds(175,340,100,20);
      ck11.setBounds(275,340,100,20); ck12.setBounds(375,340,100,20);

  }
  public void paint(Graphics g)
  {
    g.drawString(msg,90,420);
  }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getActionCommand().equals("SAVE DETAILS"))
      {
        msg="STUDENT DETAILS HAVE BEEN SAVED!";
        setForeground(Color.blue); 
      }
  }
  public static void main(String g[])
  {
    reg_form student=new reg_form();
    student.setSize(new Dimension(600,600));
    student.setTitle("STUDENT REGISTERATION");
    student.setVisible(true);
  }
}
class myWindowAdapter extends WindowAdapter
{
  public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
}
