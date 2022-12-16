
public class Mahasiswa <T1, T2, T3> {
    private T1 NIM;
    private T2 Nama;
    private T3 clas;
    
    public void setNim(T1 NIM){
        this.NIM = NIM;
        
    }
    
    public void setNama(T2 Nama){
        this.Nama = Nama;
    }
    
    public void setClas(T3 clas){
        this.clas = clas;
    }
    
    public T1 getNim(){
        return this.NIM;
    }
    
    public T2 getNama(){
        return this.Nama;
    }
    
    public T3 getClas(){
        return this.clas;
    }
    
}
