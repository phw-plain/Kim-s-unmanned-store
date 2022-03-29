package code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Setting {
	// 기본 정보
	public int width;
	public int height;

	// color
	public Color title = new Color(0, 0, 0);
	public Color background = new Color(255, 255, 255);
	public Color header_back = new Color(254, 235, 182);
	public Color menu_back = new Color(214, 174, 242);
	
	// Font
	public Font font1 = new Font("배달의민족 주아", Font.PLAIN, 50);
	public Font font2 = new Font("배달의민족 주아", Font.PLAIN, 26);
	public Font font3 = new Font("배달의민족 주아", Font.PLAIN, 18);
	public Font font4 = new Font("배달의민족 주아", Font.PLAIN, 16);
	public Font font5 = new Font("배달의민족 주아", Font.PLAIN, 11);

	// Image
	public ImageIcon logo = new ImageIcon("src/img/logo.png");
	public ImageIcon logo_over = new ImageIcon("src/img/logo_over.png");
	public ImageIcon i;
	public Image im;
	public URL imageURL = Start.class.getClassLoader().getResource("apple.png");
	public ImageIcon img = new ImageIcon(imageURL);
	
    // 타입 체크
    final isType is = new isType();
	
	// 회원 정보
	public String name = "고고곡";
	public String id = "1";
	public String pw = "1";
	public String brand = "은행나무사거리";
	public double percent = 0;
	public int emp = 0;
	public int empsal = 0;

}