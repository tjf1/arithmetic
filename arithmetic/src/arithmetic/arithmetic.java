package arithmetic;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class arithmetic implements ActionListener {
	JFrame f;
	JTextField jfirst1, jfirst2, jfirst3, jfirst4, jfirst5, jfirst6, jfirst7,
			jfirst8, jfirst9, jfirst10;// 10道题的分别的第一个数据
	JLabel jsymbol1, jsymbol2, jsymbol3, jsymbol4, jsymbol5, jsymbol6,
			jsymbol7, jsymbol8, jsymbol9, jsymbol10;// 10道题的分别的符号
	JTextField jsecond1, jsecond2, jsecond3, jsecond4, jsecond5, jsecond6,
			jsecond7, jsecond8, jsecond9, jsecond10;// 10道题的分别的第二个数据
	JTextField janswer1, janswer2, janswer3, janswer4, janswer5, janswer6,
			janswer7, janswer8, janswer9, janswer10;// 10道题分别的结果
	JLabel jjudge1, jjudge2, jjudge3, jjudge4, jjudge5, jjudge6, jjudge7,
			jjudge8, jjudge9, jjudge10;// 判断10道题输入答案的对错
	JTextField jjresult1, jjresult2, jjresult3, jjresult4, jjresult5,
			jjresult6, jjresult7, jjresult8, jjresult9, jjresult10;//10道题分别的 正确答案
	JButton SubmitBtn;// 提交答案按钮
	JButton AddBtn, SubBtn, MulBtn, DivBtn, ExitBtn;// 加法测试，减法测试，乘法测试，除法测试，退出系统
	JLabel jtotle, jright, jjright;// 总共题数，提示：“正确题数：”，正确的题数

	int first1, first2, first3, first4, first5, first6, first7, first8, first9,
			first10;
	int second1, second2, second3, second4, second5, second6, second7, second8,
			second9, second10;

	public arithmetic() {
		f = new JFrame(" 小学四则运算系统");
		f.setBounds(200, 100, 1100, 520);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = f.getContentPane();

		// 添加提示：“请选择”，添加加法测试按钮、减法测试按钮、乘法测试按钮、除法测试按钮、退出测试按钮
		JLabel Choose = new JLabel("请选择:");
		Choose.setFont(new Font("黑体", Font.BOLD, 18));
		AddBtn = new JButton("加法运算");
		AddBtn.setFont(new Font("黑体", Font.BOLD, 18));
		AddBtn.addActionListener(this);
		SubBtn = new JButton("减法运算");
		SubBtn.setFont(new Font("黑体", Font.BOLD, 18));
		SubBtn.addActionListener(this);
		MulBtn = new JButton("乘法运算");
		MulBtn.setFont(new Font("黑体", Font.BOLD, 18));
		MulBtn.addActionListener(this);
		DivBtn = new JButton("除法运算");
		DivBtn.setFont(new Font("黑体", Font.BOLD, 18));
		DivBtn.addActionListener(this);
		ExitBtn = new JButton("退出系统");
		ExitBtn.setFont(new Font("黑体", Font.BOLD, 18));
		ExitBtn.addActionListener(this);
		Box box11 = Box.createVerticalBox();
		box11.add(Box.createHorizontalStrut(73));
		box11.add(Choose);
		box11.add(Box.createVerticalStrut(44));
		box11.add(AddBtn);
		box11.add(Box.createVerticalStrut(44));
		box11.add(SubBtn);
		box11.add(Box.createVerticalStrut(44));
		box11.add(MulBtn);
		box11.add(Box.createVerticalStrut(44));
		box11.add(DivBtn);
		box11.add(Box.createVerticalStrut(44));
		box11.add(ExitBtn);
		box11.add(Box.createVerticalStrut(35));

		// 添加标签：“您已进入加法测试，现在开始答题："”
		JLabel title = new JLabel("您已进入加法测试，现在开始答题：");
		title.setFont(new Font("黑体", Font.BOLD, 18));
		Box box = Box.createHorizontalBox();
		box.add(Box.createHorizontalGlue());
		box.add(title);
		box.add(Box.createHorizontalGlue());

		// 添加每道题的符号标签
		jsymbol1 = new JLabel("?");
		jsymbol2 = new JLabel("?");
		jsymbol3 = new JLabel("?");
		jsymbol4 = new JLabel("?");
		jsymbol5 = new JLabel("?");
		jsymbol6 = new JLabel("?");
		jsymbol7 = new JLabel("?");
		jsymbol8 = new JLabel("?");
		jsymbol9 = new JLabel("?");
		jsymbol10 = new JLabel("?");

		// 设置答案对错的标签
		jjudge1 = new JLabel("?");
		jjudge2 = new JLabel("?");
		jjudge3 = new JLabel("?");
		jjudge4 = new JLabel("?");
		jjudge5 = new JLabel("?");
		jjudge6 = new JLabel("?");
		jjudge7 = new JLabel("?");
		jjudge8 = new JLabel("?");
		jjudge9 = new JLabel("?");
		jjudge10 = new JLabel("?");

		// 为每道题的结果设置为不可更改
		jjresult1 = new JTextField(8);
		jjresult1.setEditable(false);
		jjresult2 = new JTextField(8);
		jjresult2.setEditable(false);
		jjresult3 = new JTextField(8);
		jjresult3.setEditable(false);
		jjresult4 = new JTextField(8);
		jjresult4.setEditable(false);
		jjresult5 = new JTextField(8);
		jjresult5.setEditable(false);
		jjresult6 = new JTextField(8);
		jjresult6.setEditable(false);
		jjresult7 = new JTextField(8);
		jjresult7.setEditable(false);
		jjresult8 = new JTextField(8);
		jjresult8.setEditable(false);
		jjresult9 = new JTextField(8);
		jjresult9.setEditable(false);
		jjresult10 = new JTextField(8);
		jjresult10.setEditable(false);

		// 设置第一个数据和第二个数据为不可见
		jfirst1 = new JTextField(6);
		jfirst1.setEditable(false);
		jfirst2 = new JTextField(6);
		jfirst2.setEditable(false);
		jsecond1 = new JTextField(6);
		jsecond1.setEditable(false);
		jsecond2 = new JTextField(6);
		jsecond2.setEditable(false);
		janswer1 = new JTextField(6);
		janswer2 = new JTextField(6);
		// 把标签加入盒子box1中
		Box box1 = Box.createHorizontalBox();
		box1.add(Box.createHorizontalStrut(50));
		box1.add(jfirst1);
		box1.add(Box.createHorizontalStrut(3));
		box1.add(jsymbol1);
		box1.add(Box.createHorizontalStrut(3));
		box1.add(jsecond1);
		box1.add(Box.createHorizontalStrut(5));
		box1.add(new JLabel("="));
		box1.add(Box.createHorizontalStrut(5));
		box1.add(janswer1);
		box1.add(Box.createHorizontalStrut(5));
		box1.add(new JLabel("对/错："));
		box1.add(jjudge1);
		box1.add(Box.createHorizontalStrut(20));
		box1.add(new JLabel("正确答案："));
		box1.add(jjresult1);
		box1.add(Box.createHorizontalStrut(73));
		box1.add(jfirst2);
		box1.add(Box.createHorizontalStrut(3));
		box1.add(jsymbol2);
		box1.add(Box.createHorizontalStrut(3));
		box1.add(jsecond2);
		box1.add(Box.createHorizontalStrut(5));
		box1.add(new JLabel("="));
		box1.add(Box.createHorizontalStrut(5));
		box1.add(janswer2);
		box1.add(Box.createHorizontalStrut(5));
		box1.add(new JLabel("对/错："));
		box1.add(jjudge2);
		box1.add(Box.createHorizontalStrut(20));
		box1.add(new JLabel("正确答案："));
		box1.add(jjresult2);
		box1.add(Box.createHorizontalStrut(50));

		jfirst3 = new JTextField(6);
		jfirst3.setEditable(false);
		jfirst4 = new JTextField(6);
		jfirst4.setEditable(false);
		jsecond3 = new JTextField(6);
		jsecond3.setEditable(false);
		jsecond4 = new JTextField(6);
		jsecond4.setEditable(false);
		janswer3 = new JTextField(6);
		janswer4 = new JTextField(6);
		Box box2 = Box.createHorizontalBox();
		box2.add(Box.createHorizontalStrut(50));
		box2.add(jfirst3);
		box2.add(Box.createHorizontalStrut(3));
		box2.add(jsymbol3);
		box2.add(Box.createHorizontalStrut(3));
		box2.add(jsecond3);
		box2.add(Box.createHorizontalStrut(5));
		box2.add(new JLabel("="));
		box2.add(Box.createHorizontalStrut(5));
		box2.add(janswer3);
		box2.add(Box.createHorizontalStrut(5));
		box2.add(new JLabel("对/错："));
		box2.add(jjudge3);
		box2.add(Box.createHorizontalStrut(20));
		box2.add(new JLabel("正确答案："));
		box2.add(jjresult3);
		box2.add(Box.createHorizontalStrut(73));
		box2.add(jfirst4);
		box2.add(Box.createHorizontalStrut(3));
		box2.add(jsymbol4);
		box2.add(Box.createHorizontalStrut(3));
		box2.add(jsecond4);
		box2.add(Box.createHorizontalStrut(5));
		box2.add(new JLabel("="));
		box2.add(Box.createHorizontalStrut(5));
		box2.add(janswer4);
		box2.add(Box.createHorizontalStrut(5));
		box2.add(new JLabel("对/错："));
		box2.add(jjudge4);
		box2.add(Box.createHorizontalStrut(20));
		box2.add(new JLabel("正确答案："));
		box2.add(jjresult4);
		box2.add(Box.createHorizontalStrut(50));

		jfirst5 = new JTextField(6);
		jfirst5.setEditable(false);
		jfirst6 = new JTextField(6);
		jfirst6.setEditable(false);
		jsecond5 = new JTextField(6);
		jsecond5.setEditable(false);
		jsecond6 = new JTextField(6);
		jsecond6.setEditable(false);
		janswer5 = new JTextField(6);
		janswer6 = new JTextField(6);
		Box box3 = Box.createHorizontalBox();
		box3.add(Box.createHorizontalStrut(50));
		box3.add(jfirst5);
		box3.add(Box.createHorizontalStrut(3));
		box3.add(jsymbol5);
		box3.add(Box.createHorizontalStrut(3));
		box3.add(jsecond5);
		box3.add(Box.createHorizontalStrut(5));
		box3.add(new JLabel("="));
		box3.add(Box.createHorizontalStrut(5));
		box3.add(janswer5);
		box3.add(Box.createHorizontalStrut(5));
		box3.add(new JLabel("对/错："));
		box3.add(jjudge5);
		box3.add(Box.createHorizontalStrut(20));
		box3.add(new JLabel("正确答案："));
		box3.add(jjresult5);
		box3.add(Box.createHorizontalStrut(73));
		box3.add(jfirst6);
		box3.add(Box.createHorizontalStrut(3));
		box3.add(jsymbol6);
		box3.add(Box.createHorizontalStrut(3));
		box3.add(jsecond6);
		box3.add(Box.createHorizontalStrut(5));
		box3.add(new JLabel("="));
		box3.add(Box.createHorizontalStrut(5));
		box3.add(janswer6);
		box3.add(Box.createHorizontalStrut(5));
		box3.add(new JLabel("对/错："));
		box3.add(jjudge6);
		box3.add(Box.createHorizontalStrut(20));
		box3.add(new JLabel("正确答案："));
		box3.add(jjresult6);
		box3.add(Box.createHorizontalStrut(50));

		jfirst7 = new JTextField(6);
		jfirst7.setEditable(false);
		jfirst8 = new JTextField(6);
		jfirst8.setEditable(false);
		jsecond7 = new JTextField(6);
		jsecond7.setEditable(false);
		jsecond8 = new JTextField(6);
		jsecond8.setEditable(false);
		janswer7 = new JTextField(6);
		janswer8 = new JTextField(6);
		Box box4 = Box.createHorizontalBox();
		box4.add(Box.createHorizontalStrut(50));
		box4.add(jfirst7);
		box4.add(Box.createHorizontalStrut(3));
		box4.add(jsymbol7);
		box4.add(Box.createHorizontalStrut(3));
		box4.add(jsecond7);
		box4.add(Box.createHorizontalStrut(5));
		box4.add(new JLabel("="));
		box4.add(Box.createHorizontalStrut(5));
		box4.add(janswer7);
		box4.add(Box.createHorizontalStrut(5));
		box4.add(new JLabel("对/错："));
		box4.add(jjudge7);
		box4.add(Box.createHorizontalStrut(20));
		box4.add(new JLabel("正确答案："));
		box4.add(jjresult7);
		box4.add(Box.createHorizontalStrut(73));
		box4.add(jfirst8);
		box4.add(Box.createHorizontalStrut(3));
		box4.add(jsymbol8);
		box4.add(Box.createHorizontalStrut(3));
		box4.add(jsecond8);
		box4.add(Box.createHorizontalStrut(5));
		box4.add(new JLabel("="));
		box4.add(Box.createHorizontalStrut(5));
		box4.add(janswer8);
		box4.add(Box.createHorizontalStrut(5));
		box4.add(new JLabel("对/错："));
		box4.add(jjudge8);
		box4.add(Box.createHorizontalStrut(20));
		box4.add(new JLabel("正确答案："));
		box4.add(jjresult8);
		box4.add(Box.createHorizontalStrut(50));

		jfirst9 = new JTextField(6);
		jfirst9.setEditable(false);
		jfirst10 = new JTextField(6);
		jfirst10.setEditable(false);
		jsecond9 = new JTextField(6);
		jsecond9.setEditable(false);
		jsecond10 = new JTextField(6);
		jsecond10.setEditable(false);
		janswer9 = new JTextField(6);
		janswer10 = new JTextField(6);
		Box box5 = Box.createHorizontalBox();
		box5.add(Box.createHorizontalStrut(50));
		box5.add(jfirst9);
		box5.add(Box.createHorizontalStrut(3));
		box5.add(jsymbol9);
		box5.add(Box.createHorizontalStrut(3));
		box5.add(jsecond9);
		box5.add(Box.createHorizontalStrut(5));
		box5.add(new JLabel("="));
		box5.add(Box.createHorizontalStrut(5));
		box5.add(janswer9);
		box5.add(Box.createHorizontalStrut(5));
		box5.add(new JLabel("对/错："));
		box5.add(jjudge9);
		box5.add(Box.createHorizontalStrut(20));
		box5.add(new JLabel("正确答案："));
		box5.add(jjresult9);
		box5.add(Box.createHorizontalStrut(73));
		box5.add(jfirst10);
		box5.add(Box.createHorizontalStrut(3));
		box5.add(jsymbol10);
		box5.add(Box.createHorizontalStrut(3));
		box5.add(jsecond10);
		box5.add(Box.createHorizontalStrut(5));
		box5.add(new JLabel("="));
		box5.add(Box.createHorizontalStrut(5));
		box5.add(janswer10);
		box5.add(Box.createHorizontalStrut(5));
		box5.add(new JLabel("对/错："));
		box5.add(jjudge10);
		box5.add(Box.createHorizontalStrut(20));
		box5.add(new JLabel("正确答案："));
		box5.add(jjresult10);
		box5.add(Box.createHorizontalStrut(50));

		SubmitBtn = new JButton("提交答案");
		SubmitBtn.setFont(new Font("黑体", Font.BOLD, 18));
		SubmitBtn.addActionListener(this);
		jtotle = new JLabel("总题数：10 题");
		jtotle.setFont(new Font("黑体", Font.BOLD, 18));
		jright = new JLabel("答对题数：");
		jright.setFont(new Font("黑体", Font.BOLD, 18));
		jjright = new JLabel("？");
		jjright.setFont(new Font("黑体", Font.BOLD, 18));
		Box box6 = Box.createHorizontalBox();
		box6.add(Box.createHorizontalStrut(50));
		box6.add(SubmitBtn);
		box6.add(Box.createHorizontalStrut(50));
		box6.add(jtotle);
		box6.add(Box.createHorizontalStrut(50));
		box6.add(jright);
		box6.add(Box.createHorizontalStrut(20));
		box6.add(jjright);
		box6.add(Box.createHorizontalStrut(50));

		Box box7 = Box.createVerticalBox();
		box7.add(Box.createVerticalStrut(30));
		box7.add(box);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box1);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box2);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box3);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box4);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box5);
		box7.add(Box.createVerticalStrut(30));
		box7.add(box6);
		box7.add(Box.createVerticalStrut(30));

		Box box8 = Box.createHorizontalBox();
		box8.add(box11);
		box8.add(Box.createHorizontalStrut(40));
		box8.add(new JSeparator(JSeparator.VERTICAL));
		box8.add(box7);

		c.add(box8);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new arithmetic();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/* 加法计算 */
		if (e.getSource() == AddBtn) {
			jsymbol1.setText("+");
			jsymbol2.setText("+");
			jsymbol3.setText("+");
			jsymbol4.setText("+");
			jsymbol5.setText("+");
			jsymbol6.setText("+");
			jsymbol7.setText("+");
			jsymbol8.setText("+");
			jsymbol9.setText("+");
			jsymbol10.setText("+");
			janswer1.setText("");
			janswer2.setText("");
			janswer3.setText("");
			janswer4.setText("");
			janswer5.setText("");
			janswer6.setText("");
			janswer7.setText("");
			janswer8.setText("");
			janswer9.setText("");
			janswer10.setText("");
			jjresult1.setText("");
			jjresult2.setText("");
			jjresult3.setText("");
			jjresult4.setText("");
			jjresult5.setText("");
			jjresult6.setText("");
			jjresult7.setText("");
			jjresult8.setText("");
			jjresult9.setText("");
			jjresult10.setText("");
			jjright.setText("?");
			Random rand = new Random();

			first1 = rand.nextInt(200);
			first1 = first1 - 100;
			second1 = rand.nextInt(200);
			second1 = second1 - 100;
			String f1 = Float.toString(first1);
			jfirst1.setText(f1);
			String s1 = Float.toString(second1);
			jsecond1.setText(s1);

			first2 = rand.nextInt(200);
			first2 = first2 - 100;
			second2 = rand.nextInt(200);
			second2 = second2 - 100;
			String f2 = Float.toString(first2);
			jfirst2.setText(f2);
			String s2 = Float.toString(second2);
			jsecond2.setText(s2);

			first3 = rand.nextInt(200);
			first3 = first3 - 100;
			second3 = rand.nextInt(200);
			second3 = second3 - 100;
			String f3 = Float.toString(first3);
			jfirst3.setText(f3);
			String s3 = Float.toString(second3);
			jsecond3.setText(s3);

			first4 = rand.nextInt(200);
			first4 = first4 - 100;
			second4 = rand.nextInt(200);
			second4 = second4 - 100;
			String f4 = Float.toString(first4);
			jfirst4.setText(f4);
			String s4 = Float.toString(second4);
			jsecond4.setText(s4);

			first5 = rand.nextInt(200);
			first5 = first5 - 100;
			second5 = rand.nextInt(200);
			second5 = second5 - 100;
			String f5 = Float.toString(first5);
			jfirst5.setText(f5);
			String s5 = Float.toString(second5);
			jsecond5.setText(s5);

			first6 = rand.nextInt(200);
			first6 = first6 - 100;
			second6 = rand.nextInt(200);
			second6 = second6 - 100;
			String f6 = Float.toString(first6);
			jfirst6.setText(f6);
			String s6 = Float.toString(second6);
			jsecond6.setText(s6);

			first7 = rand.nextInt(200);
			first7 = first7 - 100;
			second7 = rand.nextInt(200);
			second7 = second7 - 100;
			String f7 = Float.toString(first7);
			jfirst7.setText(f7);
			String s7 = Float.toString(second7);
			jsecond7.setText(s7);

			first8 = rand.nextInt(200);
			first8 = first8 - 100;
			second8 = rand.nextInt(200);
			second8 = second8 - 100;
			String f8 = Float.toString(first8);
			jfirst8.setText(f8);
			String s8 = Float.toString(second8);
			jsecond8.setText(s8);

			first9 = rand.nextInt(200);
			first9 = first9 - 100;
			second9 = rand.nextInt(200);
			second9 = second9 - 100;
			String f9 = Float.toString(first9);
			jfirst9.setText(f9);
			String s9 = Float.toString(second9);
			jsecond9.setText(s9);

			first10 = rand.nextInt(200);
			first10 = first10 - 100;
			second10 = rand.nextInt(200);
			second10 = second10 - 100;
			String f10 = Float.toString(first10);
			jfirst10.setText(f10);
			String s10 = Float.toString(second10);
			jsecond10.setText(s10);
		}
		if (e.getSource() == SubmitBtn) {
			double a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
			int true1 = 0;
			// 计算第一道题
			String answer1 = null;
			a1 = first1 + second1;
			answer1 = Double.toString(a1);
			String result1 = janswer1.getText();
			if (result1.equals(answer1)) {
				jjudge1.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge1.setText("错");
				jjresult1.setText(answer1);
			}
			// 计算第二道题
			String answer2 = null;
			a2 = first2 + second2;
			answer2 = Double.toString(a2);
			String result2 = janswer2.getText();
			if (result2.equals(answer2)) {
				jjudge2.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge2.setText("错");
				jjresult2.setText(answer2);
			}
			// 计算第三道题
			String answer3 = null;
			a3 = first3 + second3;
			answer3 = Double.toString(a3);
			String result3 = janswer3.getText();
			if (result3.equals(answer3)) {
				jjudge3.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge3.setText("错");
				jjresult3.setText(answer3);
			}
			// 计算第四道题
			String answer4 = null;
			a4 = first4 + second4;
			answer4 = Double.toString(a4);
			String result4 = janswer4.getText();
			if (result4.equals(answer4)) {
				jjudge4.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge4.setText("错");
				jjresult4.setText(answer4);
			}
			// 计算第五道题
			String answer5 = null;
			a5 = first5 + second5;
			answer5 = Double.toString(a5);
			String result5 = janswer5.getText();
			if (result5.equals(answer5)) {
				jjudge5.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge5.setText("错");
				jjresult5.setText(answer5);
			}
			// 计算第六道题
			String answer6 = null;
			a6 = first6 + second6;
			answer6 = Double.toString(a6);
			String result6 = janswer6.getText();
			if (result6.equals(answer6)) {
				jjudge6.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge6.setText("错");
				jjresult6.setText(answer6);
			}
			// 计算第七道题
			String answer7 = null;
			a7 = first7 + second7;
			answer7 = Double.toString(a7);
			String result7 = janswer7.getText();
			if (result7.equals(answer7)) {
				jjudge7.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge7.setText("错");
				jjresult7.setText(answer7);
			}
			// 计算第八道题
			String answer8 = null;
			a8 = first8 + second8;
			answer8 = Double.toString(a8);
			String result8 = janswer8.getText();
			if (result8.equals(answer8)) {
				jjudge8.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge8.setText("错");
				jjresult8.setText(answer8);
			}
			// 计算第九道题
			String answer9 = null;
			a9 = first9 + second9;
			answer9 = Double.toString(a9);
			String result9 = janswer9.getText();
			if (result9.equals(answer9)) {
				jjudge9.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge9.setText("错");
				jjresult9.setText(answer9);
			}
			// 计算第十道题
			String answer10 = null;
			a10 = first10 + second10;
			answer10 = Double.toString(a10);
			String result10 = janswer10.getText();
			if (result10.equals(answer10)) {
				jjudge10.setText("对");
				true1 = true1 + 1;
				jjright.setText(Integer.toString(true1));
			} else {
				jjudge10.setText("错");
				jjresult10.setText(answer10);
			}
		}
	}
}
