 public enum TrafficLight {
        RED(5),
        YELLOW(1),
        GREEN(4);

        private final int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return this.duration;
        }
    }

