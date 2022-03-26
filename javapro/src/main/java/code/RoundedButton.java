package code;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RoundedButton extends JButton { 

	// color
	Color normal = new Color(253, 206, 83);
	Color over = new Color(201, 165, 124);
	Color click = new Color(190, 147, 99);
	
	public RoundedButton() { 
		super();
		decorate();
	} 
	
	public RoundedButton(String text) { 
		super(text); 
		decorate();
	} 
	
	public RoundedButton(Action action) { 
		super(action); 
		decorate();
	} 
	
	public RoundedButton(Icon icon) { 
		super(icon); 
		decorate();
	}
	
	public RoundedButton(String text, Icon icon) { 
		super(text, icon); 
		decorate();
	} 
	
	protected void decorate() { 
		setBorderPainted(false); 
		setOpaque(false); 
	}
	
	@Override 
	protected void paintComponent(Graphics g) { 
		int width = getWidth(); 
		int height = getHeight(); 
		
		Graphics2D graphics = (Graphics2D) g; 
		
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		
		if (getModel().isArmed()) { 
			graphics.setColor(normal.darker()); 
		} else if (getModel().isRollover()) {
			graphics.setColor(normal.brighter()); 
		} else { 
			graphics.setColor(normal); 
		} 
		
		graphics.fillRoundRect(0, 0, width, height, 10, 10); 
		
		FontMetrics fontMetrics = graphics.getFontMetrics(); 
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
		
		int textX = (width - stringBounds.width) / 2; 
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
		
		graphics.setColor(getForeground()); 
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY); 
		graphics.dispose(); 
		
		super.paintComponent(g); 
	}

}


