package Logic;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExceptionHandler {

    ImageIcon error = new ImageIcon(getClass().getResource("/images/IconError/Icon-Error.png"));
    ImageIcon succesSave = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Save-Data.png"));
    ImageIcon failedSave = new ImageIcon(getClass().getResource("/images/IconError/Icon-gagal-tersimpan.png"));
    ImageIcon confirmEditData = new ImageIcon(getClass().getResource("/images/IconError/Icon-Edit-Data.png"));
    ImageIcon berhasilRegister = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Register.png"));
    ImageIcon succesPrint = new ImageIcon(getClass().getResource("/images/IconError/Icon-Berhasil-Cetak.png"));
    ImageIcon confirmSave = new ImageIcon(getClass().getResource("/images/IconError/Icon-Confirm-Save.png"));
    ImageIcon confirmDelete = new ImageIcon(getClass().getResource("/images/IconError/Confirm-Delete-Data.png"));
    ImageIcon succesDelete = new ImageIcon(getClass().getResource("/images/IconError/Succes-Delete-Data.png"));
    ImageIcon succesAddPersonData = new ImageIcon(getClass().getResource("/images/IconError/Succes-Save-Person-Data.png"));
    ImageIcon confirmSaveDataPerson = new ImageIcon(getClass().getResource("/images/IconError/Confirm-Save-Person-Data.png"));
    ImageIcon confirmChangeDataPerson = new ImageIcon(getClass().getResource("/images/IconError/Confirm-Change-Data-Person.png"));
    ImageIcon confirmDiscount = new ImageIcon(getClass().getResource("/images/IconError/Icon-Discount.png"));
    ImageIcon failedDelete = new ImageIcon(getClass().getResource("/images/IconError/Icon-Failed-Delete.png"));
    ImageIcon confirmLogout = new ImageIcon(getClass().getResource("/images/IconError/icon-LogOut.png"));

    // pesan error
    public void Kesalahan(String pesanError) {
        JOptionPane.showMessageDialog(null, pesanError, "Error", JOptionPane.ERROR_MESSAGE, error);
    }
    
    public void FailedDelete(String pesanError) {
        JOptionPane.showMessageDialog(null, pesanError, "Failed", JOptionPane.ERROR_MESSAGE, failedDelete);
    }

    // pesan informasi berhasil tersimpan
    public void SuccesSaveData(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, succesSave);
    }

    // pesan gagal tersimpan
    public void GagalTersimpan(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Failed", JOptionPane.ERROR_MESSAGE, failedSave);
    }

    // pesan konfirmasi edit
    public boolean ConfirmEditData(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, confirmEditData) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    // pesan berhasil cetak
    public void SuccesPrint(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, succesPrint);
    }

    // pesan berhasil register
    public void SuccesRegister(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, berhasilRegister);
    }

    // pesan konfirmasi simpan
    public boolean ConfirmSave(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmSave) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }
    
    public boolean ConfirmSaveDataPerson(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmSaveDataPerson) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    // pesan konfirmasi delete
    public boolean ConfirmDeleteData(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmDelete) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }
    
    // sukses hapus data
    public void SuccesDeleteData(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, succesDelete);
    }
    
    // sukses simpan perubahan/data person baru 
    public void SuccesSavePersonData(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Succes", JOptionPane.INFORMATION_MESSAGE, succesAddPersonData);
    }
    
    // konfirmasi ubah data person
    public boolean ConfirmChangePerson(String pesan) {
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmChangeDataPerson) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    public boolean ConfirmDiscount(String pesan){
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmDiscount) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }
    
    public boolean ConfirmLogOut(String pesan){
        if (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confirmLogout) == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }
}
