public class Lesson1 {
    public static void main (String [] args) {

        String[] person0 = {"Alex", "male", "20"};
        String[] person1 = {"Gaga", "female", "30"};
        String[] person2 = {"Tea", "female", "25"};
        String[] person3 = {"Mary", "female", "21"};
        String[] person4 = {"Ker", "male", "18"};
        String[] person5 = {"Mio", "male", "40"};
        String[] person6 = {"Jen", "female", "27"};
        String[] person7 = {"Kit", "male", "39"};
        String[] person8 = {"Lora", "female", "23"};
        String[] person9 = {"Bart", "male", "22"};
        String[][] allClients = {person0, person1, person2, person3, person4, person5
        , person6, person7, person8, person9};

        for(int i = allClients.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if(Integer.parseInt(allClients[j][2]) > Integer.parseInt(allClients[j+1][2])){
                    String proxy = allClients[j][2];
                    allClients[j][2] = allClients[j+1][2];
                    allClients[j+1][2] = proxy;
                }
            }
        }
        for(int i =0; i< allClients.length; i++){
            if(allClients[i][1]=="female"){
                String pers = "";
                for(int j=0; j<allClients[i].length; j++){
                    pers= pers + allClients[i][j] + " ";
                }
                System.out.println(pers);
            }
        }
    }
}
