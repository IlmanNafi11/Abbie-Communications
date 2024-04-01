package Logic;

public class TransaksiService {
    private String idTransaksi;
    private String namaProduk;
    private String kategori;
    private String keterangan;
    private int kuantitas;
    private int subTotal;
    private int total;

    public TransaksiService(String idTransaksi, String namaProduk, String kategori, String keterangan, int kuantitas, int subTotal, int total) {
        this.idTransaksi = idTransaksi;
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.keterangan = keterangan;
        this.kuantitas = kuantitas;
        this.subTotal = subTotal;
        this.total = total;
    }

    public void InsertData(){

    }
}
