package Commands;

import Abstracts.Command;
import Editor.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor){
        super(editor);
    }

    public boolean execute(){
        this.editor.clipboard = this.editor.textField.getSelectedText();
        return false;
    }
}
