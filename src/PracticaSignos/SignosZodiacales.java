package PracticaSignos;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class SignosZodiacales {

	private static final String Interger = null;
	private JFrame frame;
	private JLabel lblFecha;
	private JLabel lblImagenSigno;
	private JComboBox cboDia;
	private JComboBox cboMes;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignosZodiacales window = new SignosZodiacales();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SignosZodiacales() {
		initialize();
	}
    public void fecha() {
    	int dia=Integer.parseInt(cboDia.getSelectedItem().toString());
    	String mes=cboMes.getSelectedItem().toString();
    	lblFecha.setText(dia + " de " + mes);
    	Image acuario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Acuario.png"));
    	Image aries=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Aries.jpg"));
    	Image cancer=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Cancer.jpg"));
    	Image capricornio=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Capricornio.jpg"));
    	Image escorpio=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Escorpio.jpg"));
    	Image geminis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Geminis.jpg"));
    	Image leo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Leo.jpg"));
    	Image libra=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Libra.jpg"));
    	Image piscis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Piscis.jpg"));
    	Image sagitario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Sagitario.jpg"));
    	Image tauro=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Tauro.jpg"));
    	Image virgo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/Virgo.jpg"));
    	int ancho=lblImagenSigno.getWidth();
    	int alto=lblImagenSigno.getWidth();
    	switch(mes) {
    	case "Enero":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    				
    		}
        break;
    	case "Febrero":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(piscis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;
    	case "Marzo":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(piscis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(aries.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;
    	case "Abril":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(aries.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(tauro.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Mayo":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(tauro.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Junio":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Julio":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Agosto":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Septiembre":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Octubre":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(escorpio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Noviembre":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(escorpio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	case "Diciembre":
    		if(dia<=20) {
    			lblImagenSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    		}else if(dia>=21) {
    			lblImagenSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));    			
    		}
        break;	
    	}
    }
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 494);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("SIGNOS ZODIACALES");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Día");
		lblNewLabel.setBounds(36, 22, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		cboDia = new JComboBox();
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				fecha();
			}
		});
		cboDia.setBounds(82, 18, 81, 22);
		frame.getContentPane().add(cboDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(36, 51, 46, 14);
		frame.getContentPane().add(lblMes);
		
		cboMes = new JComboBox();
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		cboMes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				fecha();
			}
		});
		cboMes.setBounds(82, 47, 81, 22);
		frame.getContentPane().add(cboMes);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(173, 26, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblFecha = new JLabel("");
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFecha.setBounds(218, 22, 143, 31);
		frame.getContentPane().add(lblFecha);
		
		lblImagenSigno = new JLabel("");
		lblImagenSigno.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImagenSigno.setBounds(89, 93, 209, 346);
		frame.getContentPane().add(lblImagenSigno);
	}

}