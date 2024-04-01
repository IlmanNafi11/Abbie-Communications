package Logic;

import Data_Acces.DbLaporan;

public class LaporanControler {
    
    private String idUser;
    private DbLaporan dbLaporan;

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    public void InsertLaporan(){
        dbLaporan = new DbLaporan();
        dbLaporan.InsertLaporan(idUser);
    }
    
    public ConfigTable GetLaporan(){
        dbLaporan = new DbLaporan();
        return dbLaporan.GetDataLaporan();
    }
}

