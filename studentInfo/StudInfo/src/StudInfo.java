public class StudInfo {
    
   String UniversityCollege;
   String Term;
   String Sy;
    
private String idNum;
private String lastName;
private String firstName;
private String academicProgram;
private String Track;


 
    //parameters inside the constructor should be college and term and sy;
    //set a constant value for university inside the constructor
    //for the private fields, create accessors and mutators (setter and getters)
    
        public StudInfo( String UniversityCollege, String Term,String Sy
                            )
        {
        this.UniversityCollege = UniversityCollege;
        this.Term = Term;
        this.Sy = Sy;
        

    }


    
void setidNum(String idNum){
    this.idNum = idNum;
    
}
String getidNum() {
    return idNum;
}
    void setlastName(String lastName) {
        this.lastName = lastName;
    }

    String getlastName() {
     return lastName;
    }

    void setfirstName( String firstName) {
        this.firstName  = firstName;
    }

    String getfirstName() {
        return firstName;
    }

    void setacademicProgram(String BSIT) {
         this.academicProgram = BSIT;
    }

    String getacademicProgram() {
        return academicProgram;
    }

    void setTrack(String Track) {
            this.Track = Track;
    }
    String getTrack(){
        return Track;
    }
    public void print(){
        System.out.println(UniversityCollege);
    
      System.out.println(Term +Sy);
        System.out.println(idNum);
        System.out.println(lastName + firstName);
        System.out.println(academicProgram + Track);
    }

    
   
    
}