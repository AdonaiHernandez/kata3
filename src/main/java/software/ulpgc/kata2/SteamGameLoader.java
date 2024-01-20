package software.ulpgc.kata2;

import java.util.List;

public interface SteamGameLoader {

    List<SteamGame> load() throws java.io.IOException;

}
