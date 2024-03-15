package Logic;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExceptionHandler {

    ImageIcon error = new ImageIcon(getClass().getResource("/images/IconError/Icon-Error.png"));
    ImageIcon berhasilTersimpan = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Save-Data.png"));
    ImageIcon gagalTersimpan = new ImageIcon(getClass().getResource("/images/IconError/Icon-gagal-tersimpan.png"));
    ImageIcon confirmEditData = new ImageIcon(getClass().getResource("/images/IconError/Icon-Edit-Data.png"));
    ImageIcon berhasilRegister = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Register.png"));
    ImageIcon berhasilCetak = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Cetak.png"));
    ImageIcon confirmSave = new ImageIcon(getClass().getResource("/images/IconError/Icon-Confirm-Save.png"));
    ImageIcon confirmDelete = new ImageIcon(getClass().getResource("/images/IconError/Icon-Confirm-Delete.png"));

    // pesan error
    public void getErrorKesalahan(String pesanError) {
        JOptionPane.showMessageDialog(null, pesanError, "Error", JOptionPane.ERROR_MESSAGE, error);
    }

    // pesan informasi berhasil tersimpan
    public void getSucces(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, berhasilTersimpan);
    }

    // pesan gagal tersimpan
    public void getErrorGagal(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Failed", JOptionPane.ERROR_MESSAGE, gagalTersimpan);
    }

    // pesan konfirmasi edit
    public void getEdit(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Edit", JOptionPane.QUESTION_MESSAGE, confirmEditData);
    }

    // pesan berhasil cetak
    public void succesPrint(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, berhasilCetak);
    }

    // pesan berhasil register
    public void succesRegister(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, berhasilRegister);
    }

    // pesan konfirmasi simpan
    public boolean confirmSave(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmSave) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    // pesan konfirmasi delete
    public void confirmDelete(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Confirm", JOptionPane.QUESTION_MESSAGE, confirmDelete);
    }
}
