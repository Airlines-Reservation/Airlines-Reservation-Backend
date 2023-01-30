package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.Pilot;
import java.util.List;

public interface PilotDAO {
    public void savePilot(Pilot pilot);
    public void updatePilot(Pilot pilot);
    public void deletePilot(Pilot pilot);
    public List<Pilot> findPilot(String name);
}
