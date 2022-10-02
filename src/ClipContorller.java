import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class ClipContorller {
    private String clipboard;

    public void setClipboard(String clipboard){
        this.clipboard = clipboard;
    }

    public String getClipboard(){
        return clipboard;
    }

    public boolean haveClip(){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(clipboard);

        try {
            //저장
            setClipboard((String)(contents.getTransferData(DataFlavor.stringFlavor)));
            return true;
        } catch (UnsupportedFlavorException | IOException e) {
            return false;
        }
    }


    public void saveClip(){
        StringSelection data = new StringSelection(clipboard);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(data, data);
    }
}
