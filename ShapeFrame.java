/**File: ShapeFrame.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the ShapeFrame class which is responsible for displaying the shapes in the Java Swing GUI.
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class ShapeFrame extends JFrame {

	private static final long serialVersionUID = 2882035967430896080L;
	private JLabel imageLabel;
	private JPanel imagePanel;
	private JPanel propertyPanel;
	private JComboBox<String> shapesComboBox;
	private JLabel summaryLabel;

	public ShapeFrame() {
		initComponents();
	}

	private void initComponents() {

		JPanel mainPanel = new JPanel();
		shapesComboBox = new JComboBox<>();
		JLabel shapeLabel = new JLabel();
		propertyPanel = new JPanel();
		imagePanel = new JPanel();
		imageLabel = new JLabel();
		summaryLabel = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("CMSC 335 Project 2");
		setPreferredSize(new Dimension(600, 560));
		getContentPane().setLayout(new GridLayout(1, 1));

		mainPanel.setLayout(null);

		shapesComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Shape", "Circle", "Square",
				"Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" }));
		shapesComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				shapesComboBoxActionPerformed(evt);
			}
		});
		mainPanel.add(shapesComboBox);
		shapesComboBox.setBounds(190, 10, 390, 35);

		shapeLabel.setFont(new Font("Ubuntu", 1, 15));
		shapeLabel.setText("Shape");
		mainPanel.add(shapeLabel);
		shapeLabel.setBounds(10, 10, 160, 30);

		propertyPanel.setBorder(BorderFactory.createLineBorder(null));
		propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
		mainPanel.add(propertyPanel);
		propertyPanel.setBounds(0, 60, 590, 120);

		imagePanel.setLayout(new GridLayout(1, 2, 0, 10));

		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imagePanel.add(imageLabel);
		summaryLabel.setVerticalAlignment(SwingConstants.TOP);
		imagePanel.add(summaryLabel);

		mainPanel.add(imagePanel);
		imagePanel.setBounds(0, 180, 590, 270);

		getContentPane().add(mainPanel);

		pack();
	}

	private void shapesComboBoxActionPerformed(ActionEvent evt) {
		propertyPanel.removeAll();
		propertyPanel.repaint();
		propertyPanel.revalidate();
		int index = shapesComboBox.getSelectedIndex();
		NumberFormatter df = new NumberFormatter(new java.text.DecimalFormat("#0.00"));
		switch (index) {
		case 1: {
			propertyPanel.setLayout(new GridLayout(2, 2, 10, 10));
			JLabel label = new JLabel("Radius:");
			propertyPanel.add(label);
			JFormattedTextField radiusField = new JFormattedTextField();
			radiusField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(radiusField);
			JButton calculateAreaBtn = new JButton("Calculate Area");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawCircle(radiusField);
				}

			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}

		case 2: {
			propertyPanel.setLayout(new GridLayout(2, 2, 10, 10));
			JLabel label = new JLabel("Length:");
			propertyPanel.add(label);
			JFormattedTextField lengthField = new JFormattedTextField();
			lengthField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(lengthField);
			JButton calculateAreaBtn = new JButton("Calculate Area");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawSquare(lengthField);
				}

			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 3: {
			propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
			JLabel widthLabel = new JLabel("Base:");
			propertyPanel.add(widthLabel);

			JFormattedTextField baseField = new JFormattedTextField();
			baseField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(baseField);

			JLabel heightLabel = new JLabel("Height:");
			propertyPanel.add(heightLabel);

			JFormattedTextField heightField = new JFormattedTextField();
			heightField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(heightField);

			JButton calculateAreaBtn = new JButton("Calculate Area");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawTriangle(baseField, heightField);
				}
			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 4: {
			propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
			JLabel widthLabel = new JLabel("Width:");
			propertyPanel.add(widthLabel);

			JFormattedTextField widthField = new JFormattedTextField();
			widthField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(widthField);

			JLabel heightLabel = new JLabel("Height:");
			propertyPanel.add(heightLabel);

			JFormattedTextField heightField = new JFormattedTextField();
			heightField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(heightField);

			JButton calculateAreaBtn = new JButton("Calculate Area");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawReactangle(widthField, heightField);
				}
			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 5: {
			propertyPanel.setLayout(new GridLayout(2, 2, 10, 10));
			JLabel label = new JLabel("Radius:");
			propertyPanel.add(label);
			JFormattedTextField radiusField = new JFormattedTextField();
			radiusField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(radiusField);
			JButton calculateAreaBtn = new JButton("Calculate Area And Volume");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawSphere(radiusField);
				}

			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 6: {
			propertyPanel.setLayout(new GridLayout(2, 2, 10, 10));
			JLabel label = new JLabel("Edge:");
			propertyPanel.add(label);
			JFormattedTextField edgeField = new JFormattedTextField();
			edgeField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(edgeField);
			JButton calculateAreaBtn = new JButton("Calculate Area and Volume");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawCube(edgeField);
				}

			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 7: {
			propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
			JLabel radiusLabel = new JLabel("Radius:");
			propertyPanel.add(radiusLabel);

			JFormattedTextField radiusField = new JFormattedTextField();
			radiusField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(radiusField);

			JLabel heightLabel = new JLabel("Height:");
			propertyPanel.add(heightLabel);

			JFormattedTextField heightField = new JFormattedTextField();
			heightField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(heightField);

			JButton calculateAreaBtn = new JButton("Calculate Area and Volume");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawCone(radiusField, heightField);
				}
			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 8: {
			propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
			JLabel radiusLabel = new JLabel("Radius:");
			propertyPanel.add(radiusLabel);

			JFormattedTextField radiusField = new JFormattedTextField();
			radiusField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(radiusField);

			JLabel heightLabel = new JLabel("Height:");
			propertyPanel.add(heightLabel);

			JFormattedTextField heightField = new JFormattedTextField();
			heightField.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(heightField);

			JButton calculateAreaBtn = new JButton("Calculate Area and Volume");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawCylinder(radiusField, heightField);
				}
			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}
		case 9: {
			propertyPanel.setLayout(new GridLayout(3, 2, 10, 10));
			JLabel r1Label = new JLabel("Minor Radius:");
			propertyPanel.add(r1Label);

			JFormattedTextField r1Field = new JFormattedTextField();
			r1Field.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(r1Field);

			JLabel r2Label = new JLabel("Major Radius:");
			propertyPanel.add(r2Label);

			JFormattedTextField r2Field = new JFormattedTextField();
			r2Field.setFormatterFactory(new DefaultFormatterFactory(df));
			propertyPanel.add(r2Field);

			JButton calculateAreaBtn = new JButton("Calculate Area and Volume");
			calculateAreaBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					drawTorus(r1Field, r2Field);
				}
			});
			propertyPanel.add(calculateAreaBtn);
			propertyPanel.repaint();
			propertyPanel.revalidate();
			break;
		}

		default:
			JOptionPane.showMessageDialog(this, "Invalid Shape", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Draw the circle
	 * 
	 * @param radiusField
	 */
	private void drawCircle(JFormattedTextField radiusField) {
		String value = radiusField.getText();
		if (null != value && !value.trim().isEmpty()) {
			double val = Double.valueOf(value);
			if (Double.compare(val, Math.abs(val)) == 0) {
				Circle c = new Circle(1);
				c.addDimension(val);
				c.calculateArea();
				summaryLabel.setText("<html>" + c.toString() + ". Area of circle is "
						+ String.format("%.2f", c.getArea()) + "</html>");
				ImageIcon icon = new ImageIcon("circle.jpg");
				Image image = icon.getImage(); // transform it
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the Square
	 * 
	 * @param lengthField
	 */
	private void drawSquare(JFormattedTextField lengthField) {
		String value = lengthField.getText();
		if (null != value && !value.trim().isEmpty()) {
			double val = Double.valueOf(value);
			if (Double.compare(val, Math.abs(val)) == 0) {
				Square s = new Square(1);
				s.addDimension(val);
				s.calculateArea();
				summaryLabel.setText("<html>" + s.toString() + ". Area of square is "
						+ String.format("%.2f", s.getArea()) + "</html>");
				ImageIcon icon = new ImageIcon("square.jpg");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the rectangle
	 * 
	 * @param widthField
	 * @param heightField
	 */
	private void drawReactangle(JFormattedTextField widthField, JFormattedTextField heightField) {
		String w = widthField.getText();
		String h = heightField.getText();
		if (null != w && !w.trim().isEmpty() && null != h && !h.trim().isEmpty()) {
			double wval = Double.valueOf(w);
			double hval = Double.valueOf(h);
			if (Double.compare(wval, Math.abs(wval)) == 0 && Double.compare(hval, Math.abs(hval)) == 0) {
				Rectangle r = new Rectangle(2);
				r.addDimension(wval);
				r.addDimension(hval);
				r.calculateArea();
				summaryLabel.setText("<html>" + r.toString() + ". Area of rectangle is "
						+ String.format("%.2f", r.getArea()) + "</html>");
				ImageIcon icon = new ImageIcon("rectangle.jpg");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the rectangle
	 * 
	 * @param baseField
	 * @param heightField
	 */
	private void drawTriangle(JFormattedTextField baseField, JFormattedTextField heightField) {
		String b = baseField.getText();
		String h = heightField.getText();
		if (null != b && !b.trim().isEmpty() && null != h && !h.trim().isEmpty()) {
			double bval = Double.valueOf(b);
			double hval = Double.valueOf(h);
			if (Double.compare(bval, Math.abs(bval)) == 0 && Double.compare(hval, Math.abs(hval)) == 0) {
				Triangle r = new Triangle(2);
				r.addDimension(bval);
				r.addDimension(hval);
				r.calculateArea();
				summaryLabel.setText("<html>" + r.toString() + ". Area of triangle is "
						+ String.format("%.2f", r.getArea()) + "</html>");
				ImageIcon icon = new ImageIcon("triangle.png");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the sphere
	 * 
	 * @param radiusField
	 */
	private void drawSphere(JFormattedTextField radiusField) {
		String value = radiusField.getText();
		if (null != value && !value.trim().isEmpty()) {
			double val = Double.valueOf(value);
			if (Double.compare(val, Math.abs(val)) == 0) {
				Sphere s = new Sphere(1);
				s.addDimension(val);
				s.calculateArea();
				s.calculateVolume();
				summaryLabel
						.setText("<html>" + s.toString() + ". Area of sphere is " + String.format("%.2f", s.getArea())
								+ ". Volume of sphere is " + String.format("%.2f", s.getVolume()) + "</html>");
				ImageIcon icon = new ImageIcon("sphere.jpeg");
				Image image = icon.getImage(); // transform it
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the Square
	 * 
	 * @param edgeField
	 */
	private void drawCube(JFormattedTextField edgeField) {
		String value = edgeField.getText();
		if (null != value && !value.trim().isEmpty()) {
			double val = Double.valueOf(value);
			if (Double.compare(val, Math.abs(val)) == 0) {
				Cube c = new Cube(1);
				c.addDimension(val);
				c.calculateArea();
				c.calculateVolume();
				summaryLabel.setText("<html>" + c.toString() + ". Area of cube is " + String.format("%.2f", c.getArea())
						+ ". Volume of cube is " + String.format("%.2f", c.getVolume()) + "</html>");
				ImageIcon icon = new ImageIcon("cube.png");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the cone
	 * 
	 * @param radiusField
	 * @param heightField
	 */
	private void drawCone(JFormattedTextField radiusField, JFormattedTextField heightField) {
		String wr = radiusField.getText();
		String h = heightField.getText();
		if (null != wr && !wr.trim().isEmpty() && null != h && !h.trim().isEmpty()) {
			double rval = Double.valueOf(wr);
			double hval = Double.valueOf(h);
			if (Double.compare(rval, Math.abs(rval)) == 0 && Double.compare(hval, Math.abs(hval)) == 0) {
				Cone c = new Cone(2);
				c.addDimension(rval);
				c.addDimension(hval);
				c.calculateArea();
				c.calculateVolume();
				summaryLabel.setText("<html>" + c.toString() + ". Area of cone is " + String.format("%.2f", c.getArea())
						+ ". Volume of cone is " + String.format("%.2f", c.getVolume()) + "</html>");
				ImageIcon icon = new ImageIcon("cone.jpg");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the cylinder
	 * 
	 * @param radiusField
	 * @param heightField
	 */
	private void drawCylinder(JFormattedTextField radiusField, JFormattedTextField heightField) {
		String wr = radiusField.getText();
		String h = heightField.getText();
		if (null != wr && !wr.trim().isEmpty() && null != h && !h.trim().isEmpty()) {
			double rval = Double.valueOf(wr);
			double hval = Double.valueOf(h);
			if (Double.compare(rval, Math.abs(rval)) == 0 && Double.compare(hval, Math.abs(hval)) == 0) {
				Cylinder c = new Cylinder(2);
				c.addDimension(rval);
				c.addDimension(hval);
				c.calculateArea();
				c.calculateVolume();
				summaryLabel
						.setText("<html>" + c.toString() + ". Area of cylinder is " + String.format("%.2f", c.getArea())
								+ ". Volume of cylinder is " + String.format("%.2f", c.getVolume()) + "</html>");
				ImageIcon icon = new ImageIcon("cylinder.jpeg");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Draw the toeus
	 * 
	 * @param r1Field
	 * @param r2Field
	 */
	private void drawTorus(JFormattedTextField r1Field, JFormattedTextField r2Field) {
		String r1 = r1Field.getText();
		String r2 = r2Field.getText();
		if (null != r1 && !r1.trim().isEmpty() && null != r2 && !r2.trim().isEmpty()) {
			double r1Val = Double.valueOf(r1);
			double r2Val = Double.valueOf(r2);
			if (Double.compare(r1Val, Math.abs(r1Val)) == 0 && Double.compare(r2Val, Math.abs(r2Val)) == 0) {
				Torus t = new Torus(2);
				t.addDimension(r1Val);
				t.addDimension(r2Val);
				t.calculateArea();
				t.calculateVolume();
				summaryLabel
						.setText("<html>" + t.toString() + ". Area of torus is " + String.format("%.2f", t.getArea())
								+ ". Volume of torus is " + String.format("%.2f", t.getVolume()) + "</html>");
				ImageIcon icon = new ImageIcon("torus.png");
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				imageLabel.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
