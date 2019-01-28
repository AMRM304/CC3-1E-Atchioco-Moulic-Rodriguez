public class StudentInfo {
     public static void main(String args[]){
    StudInfo student = new StudInfo  ("University  of  Cordilleras: College of Information Technology and CS"
                                     ,
                                     "2nd term", " S.Y 2018-2019");
      StudInfo student1 = new StudInfo  ("University  of  Cordilleras: College of Information Technology and CS"
                                     ,
                                     "2nd term", " S.Y 2018-2019");
        StudInfo student2 = new StudInfo  ("University  of  Cordilleras: College of Information Technology and CS"
                                     ,
                                     "2nd term", " S.Y 2018-2019");
    
    student.setidNum("18-0945-861");
    student.setlastName("Moulic,");
    student.setfirstName(" Daryl Iris");
    student.setacademicProgram("BSIT");
    student.setTrack(" Net-Sec");
   //student.Term="3rd Term";
    student.print(); 
    System.out.println();
    
    student1.setidNum("18-0314-339");
    student1.setlastName("Atchioco,");
    student1.setfirstName(" John Michael Dave");
    student1.setacademicProgram("BSIT");
    student1.setTrack(" Net-Sec");
    student1.print(); 
  //System.out.print(student1.getidNum() + student1.getlastName()); 
    System.out.println();
    
    student2.setidNum("18-1024-504");
    student2.setlastName("Rodriguez,");
    student2.setfirstName(" John Carlo");
    student2.setacademicProgram("BSIT");
    student2.setTrack(" Web-Track");
 //student2.setidNum("18-111-11");
    student2.print(); 
    System.out.println(); 
    
        

    }    
     
       
   
}
    
/*String idNum,String lastName,String firstName ,
                            String academicProgram ,String Track*


this.idNum = idNum;
        this. lastName = lastName;
        this. firstName = firstName;
        this. academicProgram = academicProgram ;
        this.Track=Track;

,
                                     " 18-7781-794"," Gonzales,"," Jepaniño", " BSIT ", "WEB-TRACK"
  */