package GameCollab;

public class Player {
    private String Nama,Realm;
    private int Stage,Max_Stange;

    //CONSTRUCT
    public Player()
    {
        Nama = "";
        Realm = "";
        Stage = 1;
        Max_Stange = 3;
        
    }

    //ANOTHER FUNCTION
    public void TambahStage()
    {
        Stage ++;
    }

    //SET FUNCTION
    public void  setNama(String Nama)
    {
        this.Nama = Nama;
    }

    public void  setRealm(String Realm)
    {
        this.Realm = Realm;
    }

    public void setMax_Stage(int Max)
    {
        this.Max_Stange = Max;
    }


    //GET FUNCTION
    public String getNama()
    {
        return this.Nama;
    }

    public String getRealm()
    {
        return this.Realm;
    }

    public int getStage()
    {
        return this.Stage;
    }

    public int getMax_Stage()
    {
        return this.Max_Stange;
    }
}
