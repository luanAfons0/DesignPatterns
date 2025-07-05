package Editor;

import javax.swing.*;

import Abstracts.Command;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Commands.CommandsHistory;
import Commands.CopyCommand;
import Commands.CutCommand;
import Commands.PasteCommand;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandsHistory commandsHistory = new CommandsHistory();

    public void init(){
        JFrame jFrame = new JFrame("Command pattern example");

        JPanel content = new JPanel();

        jFrame.setContentPane(content);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;

        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        jFrame.setSize(450, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private void executeCommand(Command command){
        if(command != null) {
            this.commandsHistory.push(command);
        }
    }

    private void undo(){
        if(this.commandsHistory.isEmpty()) return;

        Command command = this.commandsHistory.pop();

        if(command != null) {
            command.undo();
        }
    }
}
