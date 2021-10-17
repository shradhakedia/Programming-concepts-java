package JavaBasics;
import java.awt.*;
import java.awt.event.*;

public class FormDesign extends Frame implements ActionListener, ItemListener {

    Label fname, lname, Gender, rollnum, dob, Email, Address, state, submit;
    TextField first, last, roll, email;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice DD, MM, YY;
    List stateList;
    Button Submit;
    TextArea text;

    public FormDesign() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void showFrame() {

        fname = new Label("First Name: ", Label.LEFT);
        lname = new Label("Last Name: ", Label.RIGHT);
        Gender = new Label("Gender: ", Label.LEFT);
        rollnum = new Label("Roll No.: ", Label.LEFT);
        dob = new Label("DOB: ", Label.LEFT);
        Email = new Label("Email id: ", Label.LEFT);
        Address = new Label("Address: ", Label.LEFT);
        state = new Label("State: ", Label.LEFT);
        submit = new Label("Submit: ", Label.CENTER);

        first = new TextField(10);
        last = new TextField(10);
        roll = new TextField(10);
        email = new TextField(15);

        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        DD = new Choice();
        MM = new Choice();
        YY = new Choice();
        text = new TextArea(4, 15);
        stateList = new List();
        Submit = new Button("Submit");

        first.addActionListener(this);
        last.addActionListener(this);
        male.addItemListener(this);
        female.addItemListener(this);
        roll.addActionListener(this);
        DD.addItemListener(this);
        MM.addItemListener(this);
        YY.addItemListener(this);
        email.addActionListener(this);
        stateList.addItemListener(this);
        Submit.addActionListener(this);

        add(fname); add(first); add(lname); add(last);
        add(Gender); add(male); add(female);
        add(rollnum); add(roll);
        add(dob);
        for(int i = 1; i <= 31; i++)
            DD.add(String.valueOf(i)); //date
        add(DD);
        for(int i = 1; i<= 12; i++)
            MM.add(String.valueOf(i)); //month
        add(MM);
        for(int i = 1990; i <= 2020; i++)
            YY.add(String.valueOf(i)); //year
        add(YY);
        add(Email);
        add(email);
        add(Address);
        add(text);
        stateList.add("UP");
        stateList.add("Delhi");
        stateList.add("Haryana");
        stateList.add("Punjab");
        stateList.add("Bihar");
        add(state);
        add(stateList);
        add(submit);
        add(Submit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e);
    }

    public static void main(String[] args) {

        FormDesign formDesign = new FormDesign();
        formDesign.showFrame();
        formDesign.setLayout(new FlowLayout());
        formDesign.setSize(400, 500);
        formDesign.setTitle("Students Detail");
        formDesign.setVisible(true);
    }
}
