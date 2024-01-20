package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface SteamGameProcessor {

    Map<String, Integer> process(List<SteamGame> games);

}
