public class TrafficLightsTest {
    public static void main(String[] args) {
        for(TrafficLight light: TrafficLight.values()) {
            System.out.println("COLOR: " +light);
            System.out.println("The duration of trafic light: " +light.getDuration());
        }
    }
}
