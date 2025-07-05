package Commands;

import Abstracts.Command;
import Editor.Editor;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor){
        super(editor);
    }
    
    @Override
    public boolean execute() {
        if (this.editor.clipboard == null || this.editor.clipboard.isEmpty())
            return false;

        this.backup();
        this.editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        
        return true;
    }
}
