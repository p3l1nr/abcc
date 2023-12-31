import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class welcomePage extends JFrame {
    JFrame f;

    welcomePage( ) {

        JButton b = new JButton( "click" );
        JPanel panel = new JPanel( );
        b.setBounds( 100, 100, 100, 100 );
        b.setBorderPainted( false );
        b.setFocusPainted( false );
        b.setContentAreaFilled( false );
        add( panel );
        panel.add( b );
        panel.setSize( 400, 500 );
        panel.setBackground( Color.black );
        panel.setVisible( true );
        panel.setLayout( null );


        setSize( 400, 500 );
        setLayout( null );
        setVisible( true );
        setBackground( Color.black );
        setLocationRelativeTo( null );
        panel.setFocusable( true );
        panel.requestFocusInWindow( );

        panel.addKeyListener( new KeyAdapter( ) {
            public void keyPressed( KeyEvent e ) {
                if ( e.getKeyCode( ) == KeyEvent.VK_ESCAPE ) {
                    System.out.println( "Escape key pressed" );
                    System.exit( 0 ); // terminate program
                }
            }
        } );

        b.addActionListener( e -> new GameFrame( ) );
    }

    public static void main( String[] args ) {
        new welcomePage( );
    }
}