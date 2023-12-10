package com.odev;

// import java.awt.Color;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class CustomButton extends JButton{
    CustomButton(String label){
        super(label);
    }
}



public class Main implements ActionListener{
     JButton lastClickedButton;
    public Main (){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Buton Panel");
        frame.setSize(1000, 750);
        frame.setLocationRelativeTo(null);
        
        frame.setLayout(null);
        addButton(frame, null, 40, 50, 200, 120);
        addButton(frame, null, 280, 50, 200, 120);
        addButton(frame, null, 520, 50, 200, 120);
        addButton(frame, null, 760, 50, 200, 120);
        addButton(frame, null, 40, 210, 200, 120);
        addButton(frame, null, 280, 210, 200, 120);
        addButton(frame, null, 520, 210, 200, 120);
        addButton(frame, null, 760, 210, 200, 120);
        addButton(frame, null, 40, 370, 200, 120);
        addButton(frame, null, 280, 370, 200, 120);
        addButton(frame, null, 520, 370, 200, 120);
        addButton(frame, null,760, 370, 200, 120);
        addButton(frame, null, 40, 550, 200, 120);
        addButton(frame, null, 280, 550, 200, 120);
        addButton(frame, null, 520, 550, 200, 120);
        addButton(frame, null, 760, 550, 200, 120);
    
        frame.setVisible(true);

    }
    private void addButton(JFrame frame, String label, int x, int y, int width, int height){
        CustomButton button = new CustomButton(label);
        button.setBounds(x, y, width, height);
        button.setBackground(Color.BLUE);
        button.addActionListener(this);
        frame.add(button);
    }





    public static void main(String[] args) {
        new Main();
    }
    @Override
        public void actionPerformed(ActionEvent e){
            if(lastClickedButton!= null){
                lastClickedButton.setBackground(Color.BLUE);;
            }
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setBackground(Color.GREEN);
            lastClickedButton = clickedButton;
          
        }





   
}

