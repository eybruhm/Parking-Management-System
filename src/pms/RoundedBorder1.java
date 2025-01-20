package pms;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.border.AbstractBorder;
import javax.swing.JLabel;

public class RoundedBorder1 extends AbstractBorder {

    private int radius;
    private Color borderColor;
    private Color backgroundColor;

    public RoundedBorder1(int radius, Color borderColor, Color backgroundColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (c instanceof JLabel) {
            JLabel label = (JLabel) c;

            // Draw background
            g.setColor(backgroundColor);
            g.fillRoundRect(x, y, width - 1, height - 1, radius, radius);
            
            // Disable anti-aliasing for text
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            // Draw text
            FontMetrics metrics = g2d.getFontMetrics(label.getFont());
            int textWidth = metrics.stringWidth(label.getText());
            int textHeight = metrics.getHeight();
            int textX = x + (width - textWidth) / 2; // Center horizontally
            int textY = y + (height + textHeight) / 2 - metrics.getDescent(); // Center vertically
            g2d.setColor(label.getForeground());
            g2d.setFont(label.getFont());
            g2d.drawString(label.getText(), textX, textY);
            
            // Dispose of the Graphics2D object to release resources
            g2d.dispose();

            // Draw border
            g.setColor(borderColor);
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
}
