package InClassHW2;

public abstract class File {
    abstract void Open();
    void Edit (){
        System.out.println("Editing the file");
    }
    void Close (){
        System.out.println("Closing the file");
    }
}
class JavaFiles extends File{
    @Override
    void Open(){
        System.out.println("To Open Java Files Need Notepad++");
    }
}
class WordFiles extends File{
    @Override
    void Open(){
        System.out.println("To Open Word Files Need GoogleDocs");
    }
}
class PdfFiles extends File{
    @Override
    void Open(){
        System.out.println("To Open Pdf Files Need AdobeReader");
    }
}