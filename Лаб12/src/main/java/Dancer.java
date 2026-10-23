import java.util.List;

public class Dancer {
    int id;
    String name;
    String style;
    int level;
    List<Integer> competitionScores;

    public Dancer(int id, String name, String style, int level, List<Integer> competitionScores) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.level = level;
        this.competitionScores = competitionScores;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int s : competitionScores) {
            sum += s;
        }
        return (double) sum / competitionScores.size();
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Dancer{id=" + id + ", name='" + name + "', style='" + style
                + "', level=" + level + ", средний балл=" + String.format("%.2f", getAverageScore()) + "}";
    }
}
