package ex_17_OOPs_Concepts;
//we can create multiple classes in same class but it should be only one public class.
//the moment you will create second class as public, application will show the error.
 class Lab0161_Constructor
    {
        public static void main(String[] args) {
            Animal dog = new Animal();//created real object
            MySQL sql= new MySQL();
            ReadExcelFile rd = new ReadExcelFile();
        }

    }
class MySQL
{
    MySQL()
    {
        System.out.println("MySQL connected");
    }
}

class ReadExcelFile
{
    ReadExcelFile()
    {
        System.out.println("Excel file is loaded");
    }
}

