
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Deshifrator.txt");
        BufferedReader br=new BufferedReader(new FileReader(f1));
        String temp = br.readLine();
        System.out.println(temp);
        Pattern pattern = Pattern.compile("\\b(?:без|в|вокруг|до|для|за|к|между|на|о|об|около|от|перед|под|по|про|с|из-за|из-под)\\b");
        System.out.println(  temp.replaceAll(String.valueOf(pattern),"Java")  );
    }
}
//Напишите шуточную программу «Дешифратор»,
// которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».