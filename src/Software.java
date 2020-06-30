public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

//    CONSTRUCTORS

    public Software(){  //default constructor

    }

    public Software(String programmer, String platform, String os){ //overloaded constructor
        super();
        this.programmer=programmer;
        this.platform=platform;
        this.os=os;
    }

//    SETTERS AND GETTERS
    //void set argument assign
    //type get return

    public void setProgrammer(String programmer){
        this.programmer=programmer;
    }

    public String getProgrammer(){
        return this.programmer;
    }

    public void setPlatform(String platform){
        this.platform=platform;
    }

    public String getPlatform(){
        return this.platform;
    }

    public void setOs(String os){
        this.os=os;
    }

    public String getOs(){
        return this.platform;
    }















}