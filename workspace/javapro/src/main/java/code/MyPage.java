package code;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPage extends Setting {
	public JPanel panel;

	private JPanel Read;
	private JPanel Write;

	public JButton homebtn1;
	public JButton homebtn2;

	public MyPage() {
		panel = new JPanel(new CardLayout());
		panel.setBackground(background);
		Read();
		Write();
	}

	public void setVisible(boolean tf) {
		panel.setVisible(tf);
	}

	private void Read() {
		// Read ����
		Read = new JPanel();
		Read.setBackground(background);
		Read.setLayout(new BorderLayout());
		
		// navigation
		JPanel header = new JPanel(new BorderLayout());
		header.setBackground(header_back);
		
		// home ��ư ����
		homebtn1 = new JButton("", logo);
		homebtn1.setRolloverIcon(logo_over); 	// rolloverIcon�� �̹��� ���
		homebtn1.setContentAreaFilled(false); 	// ��� ä���
		homebtn1.setBorderPainted(false); 		// �ܰ���
		homebtn1.setFocusPainted(false); 		// ���� �ܰ���

		JPanel text = new JPanel(new GridLayout(2, 1, 0, -50));
		text.setBackground(header_back);
		
		JLabel title = new JLabel("����������");
		title.setFont(font2);
		JLabel subtitle = new JLabel(brand + "�� " + name + "�� ȯ���մϴ�.");
		subtitle.setFont(font3);

		text.add(title);
		text.add(subtitle);
		
		header.add(homebtn1, BorderLayout.WEST);
		header.add(text, BorderLayout.CENTER);
		
		// ���� ����
		JPanel center = new JPanel(new GridLayout(2, 1));
		center.setBackground(background);
		center.setBorder(BorderFactory.createEmptyBorder(height/7, 0, 0, 0));
		JPanel datas = new JPanel();
		datas.setBackground(background);
		JPanel data = new JPanel(new GridLayout(7, 2, 180, 27));
		data.setBackground(background);
		JPanel btn = new JPanel();
		btn.setBackground(background);

		JLabel L1 = new JLabel("�̸�");
		L1.setFont(font3);
		JLabel L2 = new JLabel("���̵�");
		L2.setFont(font3);
		JLabel L3 = new JLabel("��й�ȣ");
		L3.setFont(font3);
		JLabel L4 = new JLabel("������");
		L4.setFont(font3);
		JLabel L5 = new JLabel("���������޾�(%)");
		L5.setFont(font3);
		JLabel L6 = new JLabel("����");
		L6.setFont(font3);
		JLabel L7 = new JLabel("���� ����");
		L7.setFont(font3);
		
		JLabel R1 = new JLabel(name);
		R1.setFont(font3);
		JLabel R2 = new JLabel(id);
		R2.setFont(font3);
		JLabel R3 = new JLabel(pw);
		R3.setFont(font3);
		JLabel R4 = new JLabel(brand);
		R4.setFont(font3);
		JLabel R5 = new JLabel(Double.toString(percent));
		R5.setFont(font3);
		JLabel R6 = new JLabel((emp == 0) ? "��" : "��");
		R6.setFont(font3);
		JLabel R7 = new JLabel(Integer.toString(empsal));
		R7.setFont(font3);
		
		data.add(L1);
		data.add(R1);
		data.add(L2);
		data.add(R2);
		data.add(L3);
		data.add(R3);
		data.add(L4);
		data.add(R4);
		data.add(L5);
		data.add(R5);
		data.add(L6);
		data.add(R6);
		data.add(L7);
		data.add(R7);
		
		datas.add(data);
		
		RoundedButton change = new RoundedButton("��������");
		change.setFont(font3);
		btn.add(change);
		btn.setBorder(BorderFactory.createEmptyBorder(height/10, 0, 0, 0));
		
		// ��ư �̺�Ʈ
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Read.setVisible(false); // ȭ�� ��ȯ
				
				// reloading
				Write.setVisible(false);
				Write();

				Write.setVisible(true);
			}
		});
		
		center.add(datas, BorderLayout.CENTER);
		center.add(btn, BorderLayout.SOUTH);
		
		Read.add(header, BorderLayout.NORTH);
		Read.add(center, BorderLayout.CENTER);

		Read.setVisible(true);
		panel.add(Read);

	}

	private void Write() {
		// Write ����
		Write = new JPanel();
		Write.setBackground(background);
		Write.setLayout(new BorderLayout());
		
		// navigation
		JPanel header = new JPanel(new BorderLayout());
		header.setBackground(header_back);
		
		// home 버튼 생성
		homebtn2.setRolloverIcon(logo_over); 	// rolloverIcon용 이미지 등록
		homebtn2.setContentAreaFilled(false); 	// 배경 채우기
		homebtn2.setBorderPainted(false); 		// 외각선
		homebtn2.setFocusPainted(false); 		// 선택 외각선

		JPanel text = new JPanel(new GridLayout(2, 1, 0, -50));
		text.setBackground(header_back);
		
		JLabel title = new JLabel("����������");
		title.setFont(font2);
		JLabel subtitle = new JLabel(brand + "�� " + name + "�� ȯ���մϴ�.");
		subtitle.setFont(font3);

		text.add(title);
		text.add(subtitle);
		
		header.add(homebtn2, BorderLayout.WEST);
		header.add(text, BorderLayout.CENTER);
		
		// ���� ����
		JPanel center = new JPanel(new GridLayout(2, 1));
		center.setBackground(background);
		center.setBorder(BorderFactory.createEmptyBorder(height/7, 0, 0, 0));
		JPanel datas = new JPanel();
		datas.setBackground(background);
		JPanel data = new JPanel(new GridLayout(9, 2, 180, 15));
		data.setBackground(background);
		
		JPanel btns = new JPanel();
		btns.setBackground(background);
		JPanel btn = new JPanel(new GridLayout(1, 2, 30, 0));
		btn.setBackground(background);

		JLabel L1 = new JLabel("�̸�");
		L1.setFont(font3);
		JLabel L2 = new JLabel("���̵�");
		L2.setFont(font3);
		JLabel L3 = new JLabel("��й�ȣ");
		L3.setFont(font3);
		JLabel L4 = new JLabel("������");
		L4.setFont(font3);
		JLabel L5 = new JLabel("���������޾�(%)");
		L5.setFont(font3);
		JLabel L6 = new JLabel("����");
		L6.setFont(font3);
		JLabel L7 = new JLabel("���� ����");
		L7.setFont(font3);
		
		TextField R1 = new TextField(name);
		R1.setFont(font5);
		JLabel R2 = new JLabel(id);
		R2.setFont(font5);
		TextField R3 = new TextField(pw);
		R3.setFont(font5);
		TextField R4 = new TextField(brand);
		R4.setFont(font5);
		TextField R5 = new TextField(Double.toString(percent));
		R5.setFont(font5);
		TextField R7 = new TextField(Integer.toString(empsal));
		R7.setFont(font5);
		
		Panel staff = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		final JRadioButton ra1 = new JRadioButton("��", true);
		ra1.setFont(font5);
		ra1.setBackground(background);
		JRadioButton ra2 = new JRadioButton("��", false);
		ra2.setFont(font5);
		ra2.setBackground(background);
		ButtonGroup group = new ButtonGroup();
		
		group.add(ra1);
		group.add(ra2);
		staff.add(ra1);
		staff.add(ra2);
		
		// ���� ���� radio �̺�Ʈ
	    ra1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L7.setVisible(true);
				R7.setVisible(true);
			}
		});
		ra2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L7.setVisible(false);
				R7.setVisible(false);
			}
		});
		
		data.add(L1);
		data.add(R1);
		data.add(L2);
		data.add(R2);
		data.add(L3);
		data.add(R3);
		data.add(L4);
		data.add(R4);
		data.add(L5);
		data.add(R5);
		data.add(L6);
		data.add(staff);
		data.add(L7);
		data.add(R7);
		
		datas.add(data);
		
		RoundedButton check = new RoundedButton("Ȯ��");
		check.setFont(font3);
		RoundedButton cancel = new RoundedButton("���");
		cancel.setFont(font3);
		btn.add(check);
		btn.add(cancel);
		btn.setBorder(BorderFactory.createEmptyBorder(height/10, 0, 0, 0));
		
		btns.add(btn);
		
		// ��ư �̺�Ʈ
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(R1.getText().length() == 0) {
					JOptionPane.showMessageDialog(null
							, "�̸��� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(R3.getText().length() == 0) {
					JOptionPane.showMessageDialog(null
							, "��й�ȣ�� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(R4.getText().length() == 0) {
					JOptionPane.showMessageDialog(null
							, "�������� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(ra1.isSelected() == true && R5.getText().length() == 0) {	// ���� ó�� ���������޾�
					JOptionPane.showMessageDialog(null
							, "���������޾��� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(!is.isNum(R5.getText())) {
					JOptionPane.showMessageDialog(null
							, "���������޾��� ���ڸ� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(ra1.isSelected() && (R7.getText()).length() == 0) {		// ���� ó�� ���� ����
					JOptionPane.showMessageDialog(null
							, "���� ������ �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else if(ra1.isSelected() && !is.isNum(R7.getText())) {
					JOptionPane.showMessageDialog(null
							, "���� ������ ���ڸ� �Է����ּ���."
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.ERROR_MESSAGE
					);
				} else {
					int n = JOptionPane.showConfirmDialog(
							null
							, "��������� �����Ͻðڽ��ϱ�?"
							, "�ڸ��ٸ� ���ΰ���"
							, JOptionPane.YES_NO_OPTION
							, JOptionPane.WARNING_MESSAGE
					);
				
					if(n == 0) {
						// ���� ������ ����
						name = R1.getText();
						id = R2.getText();
						pw = R3.getText();
						brand = R4.getText();
						percent = Double.parseDouble(R5.getText());
						emp = (ra1.isSelected() == true) ? 1 : 0;
						empsal = (R7.getText().length() != 0) ? Integer.parseInt(R7.getText()) : 0;
						
						// reloading
						Read.setVisible(false);
						Read();

						JOptionPane.showMessageDialog(null
								, "���������� ���� ���� �Ϸ�!"
								, "�ڸ��ٸ� ���ΰ���"
								, JOptionPane.PLAIN_MESSAGE
						);
						
						Read.setVisible(true); // ȭ�� ��ȯ
						Write.setVisible(false);
					}
				}
			}
		});
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Read.setVisible(true); // ȭ�� ��ȯ
				Write.setVisible(false);
			}
		});

		center.add(datas, BorderLayout.CENTER);
		center.add(btns, BorderLayout.SOUTH);
		
		Write.add(header, BorderLayout.NORTH);
		Write.add(center, BorderLayout.CENTER);

		Write.setVisible(false);
		panel.add(Write);
	}
}