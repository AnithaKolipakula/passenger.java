import java.util.*;


public class passenger {

    public static void main(String[] args) {
        HashMap<String,Integer> passengers = new LinkedHashMap<>();
        passengers.put("John", 31);
        passengers.put("James", 22);
        passengers.put("Mary", 19);
        passengers.put("Srikanth", 37);

        HashMap<String,Integer> ageGroups = new LinkedHashMap<>();
        ageGroups.put("0-10", 0);
        ageGroups.put("10-20", 0);
        ageGroups.put("20-30", 0);
        ageGroups.put("30-40", 0);
        ageGroups.put("50+", 0);

        for (String passenger : passengers.keySet()) {
            int age = passengers.get(passenger);
            if (age >= 0 && age <= 10) {
                ageGroups.put("0-10", ageGroups.get("0-10") + 1);
            } else if (age >= 10 && age <= 20) {
                ageGroups.put("10-20", ageGroups.get("10-20") + 1);
            } else if (age >= 20 && age <= 30) {
                ageGroups.put("20-30", ageGroups.get("20-30") + 1);
            } else if (age >= 30 && age <= 40) {
                ageGroups.put("30-40", ageGroups.get("30-40") + 1);
            } else if (age >= 50) {
                ageGroups.put("50+", ageGroups.get("50+") + 1);
            }
        }
        
        System.out.println("Passenger age groups:");
        for (String ageGroup : ageGroups.keySet()) {
            System.out.println(ageGroup + ": " + ageGroups.get(ageGroup));
        }
        System.out.println("---------------------------");

        //To find groups with least and highest number of passengers
        int highest=0,val2,least=0;
        String group=" ",group2=" ";
        
        System.out.println("Group with highest passengers:");
        for (String key1 : ageGroups.keySet()) {
            //to store value of key in agegroup
            highest=ageGroups.get(key1);
            least=ageGroups.get(key1);
            //using for loop comparing every time with all values
            for(String key2:ageGroups.keySet()){
                val2=ageGroups.get(key2);
                if(highest<val2){
                    highest=val2;
                    group=key2;
                }
                if(least>val2){
                    least=val2;
                    group2=key2;
                }

            }
            
            
        }
        System.out.print(group+" with ");
        System.out.println(highest+" passengers");
        System.out.println("----------------------------");
        System.out.println("Group with least passengers:");
        System.out.print(group2+" with ");
        System.out.println(least+" passengers");
        System.out.println("----------------------------");


    }
}



