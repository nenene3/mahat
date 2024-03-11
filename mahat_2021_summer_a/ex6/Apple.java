package mahat_2021_summer_a.ex6;

public class Apple {
    private int weight;

    public Apple(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Apple other) {
        return ((other != null) &&
                (weight == other.weight));
    }
}
