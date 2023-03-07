import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    // final variable with text file name
    public static final String fileName = "ContactList.txt";

    // reads text file and creates an arraylist of contacts using the text file then returns the arraylist
    public static ArrayList<Contact> printFile() throws FileNotFoundException {
        File file = new File(fileName);
        ArrayList<Contact> contactList = new ArrayList<>();
        Scanner scnr = new Scanner(file);
        while (scnr.hasNext()) {
            contactList.add(new Contact(scnr.nextLine(), scnr.nextLine(), scnr.nextLine(), scnr.nextLine(), scnr.nextLine(), scnr.nextLine(), scnr.nextLine(), scnr.nextBoolean(), scnr.nextBoolean(), scnr.nextBoolean()));
        }
        scnr.close();
        return contactList;
    }

    // deletes everything from file
    public static void clearFile() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, false);
        PrintWriter printWriter = new PrintWriter(fileWriter, false);
        printWriter.flush();
        printWriter.close();
        fileWriter.close();
    }

    // uses the given arraylist to write all contact values to text file which can be read by printFile() method
    public static void writeFileLines(ArrayList<Contact> contactsList) throws IOException {
        FileWriter file = new FileWriter(fileName);
        String writer;
        for (int i = 0; i < contactsList.size(); i++) {
            writer = contactsList.get(i).getFirstName() + "\n" + contactsList.get(i).getLastName() + "\n" + contactsList.get(i).getBirthday() + "\n" + contactsList.get(i).getCompany() + "\n" + contactsList.get(i).getPhone() + "\n" + contactsList.get(i).getEmail() + "\n" + contactsList.get(i).getAddress() + "\n" + contactsList.get(i).getIsFavorite() + "\n" + contactsList.get(i).getIsBlocked() + "\n" + contactsList.get(i).getIsEmergency() + "\n";
            file.write(writer);
        }
        file.close();
    }
}
