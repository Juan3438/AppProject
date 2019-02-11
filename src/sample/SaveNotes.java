package sample;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SaveNotes {


    public static void updatePlaylist(int noteNum){
        ArrayList<String> notes = readNotes();
        for(int i=0;i<notes.size();i++){
            if(noteNum>Integer.parseInt(notes.get(i))){
                try {
                    notes.add(i,""+noteNum);
                    BufferedWriter out = new BufferedWriter(new FileWriter("src/sample/playlist.txt", false));
                    for(int j=0;j<notes.size()-1;j++) {
                        out.write(notes.get(j)+"\n");
                    }
                    out.close();
                }
                catch (IOException e) {
                    System.out.println("exception occurred" + e);
                }
                break;
            }
        }
    }
    public static ArrayList<String> readNotes(){
        Path path = Paths.get("src/sample/playlist.txt");
        ArrayList<String> notes = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                notes.add(line);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return notes;
    }



}