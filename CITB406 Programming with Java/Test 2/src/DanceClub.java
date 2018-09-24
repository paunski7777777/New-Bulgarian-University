import java.io.*;

public class DanceClub {

    private String name;
    private int numberOfParticipants;
    private int maxNumberOfParticipants;
    private boolean isForAdults;

    public DanceClub() {
    }

    public DanceClub(String name, int numberOfParticipants, int maxNumberOfParticipants, boolean isForAdults) {
        this.name = name;
        this.numberOfParticipants = numberOfParticipants;
        this.maxNumberOfParticipants = maxNumberOfParticipants;
        this.isForAdults = isForAdults;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public int getMaxNumberOfParticipants() {
        return maxNumberOfParticipants;
    }

    public boolean isIsForAdults() {
        return isForAdults;
    }

    public void setNumberOfParticipants(int numberOfParticipants) throws Exception {
        if (numberOfParticipants < 0 || this.maxNumberOfParticipants < numberOfParticipants){
            throw new IllegalNumberOfParticipantsException("Illegal number of participants!");
        }

        this.numberOfParticipants = numberOfParticipants;
    }

    public void writeDanceClubNames(String fileName){

        FileWriter fout = null;

        try {
            fout = new FileWriter(new File(fileName), true);
            if (this != null) {
                fout.append(this.toString() + " - ");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public boolean areSymbolsNeighbours(char first, char second){
        String word1 = "" + first + second;
        String word2 = "" + second + first;

        if (this.name.contains(word1) || this.name.contains(word2)){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "DanceClub{" + "name=" + name + ", numberOfParticipants=" + numberOfParticipants +
                ", maxNumberOfParticipants=" + maxNumberOfParticipants + ", isForAdults=" + isForAdults + '}';
    }

}
