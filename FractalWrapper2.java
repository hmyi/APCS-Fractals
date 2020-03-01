/* Tim Yi
 * AP Computer Science
 * 01/25/2018
 * Project Fractals - Panel Wrapper
 */

package apcsjava;

import java.awt.EventQueue;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FractalWrapper2 extends JFrame {

	public final int FRAMESIZE = 1000;
	public final int BTNSPACE = 100;
	public final int HRZSPACE = 8;
	
	public FractalWrapper2() {
        setSize(5*FRAMESIZE/4+HRZSPACE, FRAMESIZE+BTNSPACE);
		add(new JuliaSets2(FRAMESIZE, FRAMESIZE));
        setResizable(false);
        setTitle("Fractals");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FractalWrapper2 go = new FractalWrapper2();
                go.setVisible(true);
            }
        });
	}

}
