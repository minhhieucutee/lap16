import java.util.PriorityQueue;

public class AppointDoctor {
    public AppointDoctor() {
    }
    public static void main (String [] args) {
        PriorityQueue pq = new PriorityQueue();
        Doctor Cardiologist = new Doctor("Casuality ",1);
        Doctor Gynecologist = new Doctor("Surgery" ,2);
        Doctor Paediattric = new Doctor("Routine chek-up",3);
        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediattric);
        while (!pq.isEmpty()) {
            System.out.println("\nAppointing dotors based on their priorities :");
            System.out.println("***********************************************" );
            Doctor dotor = ((Doctor) pq.remove());
            System.out.println(dotor.toString());


        }

    }
}
