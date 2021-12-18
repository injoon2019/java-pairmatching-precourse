package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pairmatching.domain.crew.Crew;

public class Pair {
    private List<Crew> crews = new ArrayList<>();

    public Pair() {
    }

    public Pair(List<Crew> shuffledCrews) {
        this.crews = shuffledCrews;
    }

    public void addCrew(Crew crew) {
        crews.add(crew);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String result = crews.stream().map(Crew::getName)
            .collect(Collectors.joining(" : "));
        stringBuilder.append(result);
        return stringBuilder.toString();
    }
}
